const express = require('express'); // loads 
const server = express();   
// consumer apis
const calcRoute = require('./apis/api.calc').server;
const orderRoute = require('./apis/api.order').app;
const productRoute = require('./apis/api.product').app;
const authenticate = require('./services/service.security').authenticate;

const parser = require('body-parser');
// apply parser to express
server.use(parser.json());

server.get('/status',(req,res)=>{
    res.send("Hello");
});

// path params
server.get('/message/:msg',(rq,rs)=>{
    //rq.param('msg');
    const _msg = rq.params.msg;
    //rs.send(" Message API "+_msg);
    /*rs.send(JSON.stringify({
        msg : _msg,
        status : 'Message API'
    })); */
    if(_msg == 'error'){
        rs.status(403).json({
            msg : _msg,
            status : 'Invalid Message'
        });
    }
    rs.json({
        msg : _msg,
        status : 'Message API'
    });
});

server.get('/unauthorize',(rq,rs)=>{
    rs.status(401).json({
        message : 'Insufficient access found'
    });
});
server.use('/orders',(rq,rs,next)=>{
    authenticate(rq,rs,next);
});
server.use('/products',(rq,rs,next)=>{
    authenticate(rq,rs,next);
});

// bind routes from apis in here
server.use('/calculator',calcRoute);
server.use('/orders',orderRoute);
server.use('/products',productRoute);

const PORT = 1190;

server.listen(PORT,()=>{
    console.log(`Server Started at ${PORT}`);
});