class CalculatorService{
    constructor(_first,_next){
        this._first = _first;
        this._next = _next;
    }
    add(){
        return this._first + this._next;
    }

    diff(){
        return this._first - this._next;
    }
    mul(){
        return this._first * this._next;
    }
    div(){
        return this._first / this._next;
    }
}

module.exports = {
    CalculatorService
}