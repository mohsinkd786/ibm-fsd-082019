const users = require('../db/users').users;

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
    authenticate
}