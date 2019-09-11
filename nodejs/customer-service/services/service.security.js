const users = require('../db/users').users;

const basicAuth = (rq,rs,next)=>{
    // get the auth header
    const basicHeader = rq.headers.authorization;
    if(basicHeader !=undefined ){
        // parse the header value
        const base64Token = basicHeader.split(' ')[1];
        // parse token
        const [user,pass] = Buffer.from(base64Token,'base64').toString().split(':');
        if(validate(user,pass)){
            // if valid credentials allow pass via
            next();
        }else{
            // if invalid credentials redirect
            rs.redirect('/unauthorize');
        }
    }else{
        // if invalid credentials redirect
        rs.redirect('/unauthorize');
    }
}
const authenticate = (rq,rs,next)=>{
    if(validate(rq.headers.user,rq.headers.pass)){
        // if valid credentials allow pass via
        next();
    }else{
        // if invalid credentials redirect
        rs.redirect('/unauthorize');
    }
}

const validate= (user,pass)=>{
    const userFound = users.find(u=>{
        return u.user == user && u.pass == pass;
    });

    if(userFound){
        return true;
    }else{
        return false;
    }
}

module.exports = {
    authenticate,
    basicAuth
}