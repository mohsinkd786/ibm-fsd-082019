//const operand = require('./operations');
const tryMe = require('./operations')._tryMe;
const _add =  require('./operations').myAdd;
const _diff =  require('./operations')._diff;
const _mul =  require('./operations')._mul;
const _div =  require('./operations')._div;

tryMe();

const operate = (_action,_first, _next) =>{
    switch(_action){
        case 'ADD': 
                _add(_first,_next);
                break;
        case 'DIFF': 
                _diff(_first,_next);
                break;
        case 'MUL': 
                _mul(_first,_next);
                break;
        case 'DIV': 
                _div(_first,_next);
                break;
    }
}
//
const _action = process.argv[2];
const _first = parseInt(process.argv[3] || "10" );
//console.log(process.argv[4]);
const _next = parseInt(process.argv[4] || "4");
operate(_action,_first,_next);

// nothing has been exported from this file
console.log(module.exports);

