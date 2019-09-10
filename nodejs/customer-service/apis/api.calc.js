const express = require('express');
const server = express.Router();
const Calc = require('../services/service.calc').CalculatorService;

server.get('/diff/:first/:next',(rq,rs)=>{
    const calcService = new Calc(parseInt(rq.params.first),parseInt(rq.params.next));
    rs.json({
        result :  calcService.diff() 
    });
});

server.get('/mul/:first/:next',(rq,rs)=>{
    const calcService = new Calc(parseInt(rq.params.first),parseInt(rq.params.next));
    rs.json({
        result :  calcService.mul() 
    });
});

server.get('/div/:first/:next',(rq,rs)=>{
    const calcService = new Calc(parseInt(rq.params.first),parseInt(rq.params.next));
    rs.json({
        result :  calcService.div() 
    });
});

server.get('/add/:first/:next',(rq,rs)=>{
    const calcService = new Calc(parseInt(rq.params.first),parseInt(rq.params.next));
    rs.json({
        result :  calcService.add() 
    });
});

module.exports = {
    server
}