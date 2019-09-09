class Super{
    
    constructor(_msg){
        console.log('Super Class constructor '+_msg);
        this._msg = _msg;
    }
    getDetails(){
        console.log('getDetails() '+this._msg);
    }
    static getMessage(){
        console.log('Super getMessage() called ');
    }
}

//const sup = new Super("Super Class");
//sup.getDetails();
// static method
//Super.getMessage();

class Sub extends Super{
    constructor(_msg){
        super(" Super ");
        console.log('Sub Class constructor');
        //this._msg = _msg;
    }
    getDetails(){
        // access parent class attributes via super keyword
        //super._msg;
        console.log('getDetails() Sub Class - '+this._msg);
        super.getDetails();
    }
}
const sub = new Sub("Sub Class");
//sub.getDetails();

// static method inherited from Super class
//Sub.getMessage();

const add = (_first,_next) => {
    return _first + _next;
}

//add(10,3);

const _addClosure = (_first) =>{
    console.log(_first);
    return (_next) =>{
        console.log(_next);
        return _first + _next;
    }
}

//const _calc = _addClosure(11);
//const result = _calc(5);

//console.log(result);

const _res = _addClosure(9)(18);
console.log(`SUM IS : ${_res}`);

const calculator = (_operand) =>{
    return (_first)=>{
        switch(_operand){
            case 'ADD':
                        return (_next)=>{
                            return _first + _next;
                        }
            case 'DIFF':
                        return (_next)=>{
                            return _first - _next;
                        }
            case 'MUL':
                        return (_next)=>{
                            return _first * _next;
                        }
            case 'DIV':
                        return (_next)=>{
                            return _first / _next;
                        }
        }
    }
}

const _operand = 'DIV';
//const _response = calculator(_operand)(18)(6);

const _operate = calculator(_operand); // first function call
const _intermediate = _operate(10); // second function call
const _response = _intermediate(2); // final final call - from within switch statement

console.log(`${_operand} is ${_response}`);


