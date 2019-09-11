let orders = require('../db/orders').orders;
let products = require('../db/products').products;

const PService = require('./service.product').ProductService;
const pService = new PService();

class OrderService {
    constructor(){
    }
    _all(){
        return orders;
    }
    _byCustomerId(custId){
        if(orders != undefined && orders.length > 0 ){
            return orders.filter(o=> { return o.cId == custId; });
        }else{
            return undefined;
        }
    }
    _purchase(order){
        // find product by Id
        let productFound = pService._byId(order.pId);
        if(productFound !=undefined){
            if(productFound.quantity == 0 ){
                return "Out of Stock";
                
            }else if(productFound.quantity >= order.quantity){
                // make the order
                orders.push(order);
                // locate the index for the item
                const pIndex = products.indexOf(productFound);
                // update quantity
                productFound.quantity = productFound.quantity - order.quantity;
                products[pIndex] = productFound;

                return "Item Purchased successfully";
            }else{
                return "The Item seems to be either out of stock or Invalid";
            }
        }
    }
}

module.exports = {
    OrderService
}