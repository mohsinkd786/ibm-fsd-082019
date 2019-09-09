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

module.exports = {
    myAdd : _add,
    _diff,
    _mul,
    _div,
    _tryMe : (_msg)=>{
        console.log(_msg);
    }
}


console.log(module.exports);