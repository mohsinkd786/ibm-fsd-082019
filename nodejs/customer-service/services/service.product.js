let products = require('../db/products').products;

class ProductService{
    constructor(){

    }
    _all(){
        return products;
    }
    _byId(pId){
        return products.find(p=>{
            return p.id == pId;
        });
    }
}

module.exports = {
    ProductService
}