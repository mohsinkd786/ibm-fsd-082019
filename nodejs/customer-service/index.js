const express = require('express'); // loads 
const server = express();   
// consumer apis
const calcRoute = require('./apis/api.calc').server;

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

// bind routes from apis in here
server.use('/calculator',calcRoute);

const PORT = 1190;

server.listen(PORT,()=>{
    console.log(`Server Started at ${PORT}`);
});