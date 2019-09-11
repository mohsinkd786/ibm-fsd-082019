const app = require('express').Router();
const OService = require('../services/service.order').OrderService;
const oService = new OService();

app.get('/status',(rq,rs)=>{
    rs.json({
        message : 'Order Service is running'
    });
});

app.get('/',(rq,rs)=>{
    rs.json({
        message : 'Orders',
        data : oService._all()
    });
});

// purchase an Item
app.post('/purchase',(rq,rs)=>{
    // get request body
    const _order = rq.body;
    const response = oService._purchase(_order);
    rs.json({
        message : response
    }); 
});

module.exports = {
    app
}