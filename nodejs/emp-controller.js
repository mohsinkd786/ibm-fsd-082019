const emps = require('./data').employees;
const Service = require('./emp-service').EmpService;

const empService = new Service(emps);

console.log('FETCH ALL EMPS ---');
// fetch all employees
empService._all().forEach(e => {
    console.log(e);
});
console.log('FIND EMP BY ID ---');
// search employee by its Id
const empFound = empService._byId(1);
console.log(empFound);

