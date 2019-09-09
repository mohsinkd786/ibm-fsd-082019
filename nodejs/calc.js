'use strict';

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

const _add = (_first,_next)=>{
    const _result = _first + _next;
    console.log(`SUM is : ${_result}`);
}

const _diff = (_first,_next)=>{
    const _result = _first - _next;
    console.log(`DIFFERENCE is : ${_result}`);
}

const _mul = (_first,_next)=>{
    const _result = _first * _next;
    console.log(`PRODUCT is : ${_result}`);
}

const _div = (_first,_next)=>{
    const _result = _first / _next;
    console.log(`QUOTIENT is : ${_result}`);
}

//
const _action = process.argv[2];
const _first = parseInt(process.argv[3] || "10" );
console.log(process.argv[4]);
const _next = parseInt(process.argv[4] || "4");

//console.log(_action);
operate(_action,_first,_next);


