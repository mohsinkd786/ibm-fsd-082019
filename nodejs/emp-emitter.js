const emps = require('./data').employees;
const Service = require('./emp-service').EmpService;
const EventEmitter = require('events').EventEmitter;
// define objects
const emitter = new EventEmitter();

// our get all listener
const getAllEmpsListener = (emps)=>{
    if(emps== undefined){
        console.log('Oops I need the emps');
    }else{
        const empService = new Service(emps);
        empService._all().forEach(e=>{
            console.log(e);
        });
    }
}

// bind the listener
// 1. name of listener
// 2. actual implementation for the listener

emitter.on('getAllEmps',getAllEmpsListener);

// send the event to the listener
emitter.emit('getAllEmps',emps);

// turn the listener off for now
//emitter.off('getAllEmps',getAllEmpsListener);

emitter.emit('getAllEmps',[
    {
        id: 9,
        name : 'Marcius'
    }
]);

// specify the maximum number of listeners 
// that can be defined
emitter.setMaxListeners(2);

// total number of listeners
emitter.listenerCount();

console.log(module);
