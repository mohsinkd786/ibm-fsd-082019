class EmpService{
    constructor(emps){
        this.emps = emps;
    }
    _all(){
        return this.emps;
    }
    _byId(_id){
        return this.emps.find(e=>{ return e.id == _id});
    }
}

module.exports = {
    EmpService
}