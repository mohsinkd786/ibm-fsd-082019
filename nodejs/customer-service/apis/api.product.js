const app = require('express').Router();
const PService = require('../services/service.product').ProductService;
const pService = new PService();

app.get('/status',(rq,rs)=>{
    rs.json({
        message : 'Product Service is running'
    });
});

app.get('/',(rq,rs)=>{
    rs.json({
        message : 'Products Available',
        data : pService._all()
    });
});

module.exports = {
    app
}