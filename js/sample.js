let users = [
    {
        id: 1,
        name : 'Bob',
        salary: 1000,
        organization: 'IBM'
    },
    {
        id: 2,
        name : 'John',
        salary: 500,
        organization : 'IBM'
    },
    {
        id: 3,
        name : 'Steve',
        salary: 700,
        organization : 'CTS'
    }
];

const user = {
    id : 1,
    name: 'Bob',
    salary : 1000
};

const callMe = () => {
    //console.log("Call Me");
    document.getElementById('txt').value = "Call Me";
}

const findByOrganization = ()=>{
    let organization = 'IBM';
    users.filter(u =>{
        return u.organization == organization; 
    }).forEach(u=>console.log( JSON.stringify(u)));
}
// list all users
const getAllUsers = () =>{
    let rows = '';
    // create records
    users.forEach(u =>{
        rows += `<tr>
                    <td>${u.id}</td>
                    <td>${u.name}</td>
                    <td>${u.organization}</td>
                    <td>
                    <a href="#" onclick='removeUser(${u.id})'>Remove</a>
                    <a href="#" onclick='editUser(${u.id})'>Edit</a>
                    </td>
                </tr>`;
    });

    let table = `<table>
                    <tr>
                        <th>S.no</th>
                        <th>Name</th>
                        <th>Organization</th>
                        <th></th>
                    </tr>
                        ${rows}
                </table>`;
    
    document.getElementById('dv-users').innerHTML = table; 
}
// add a new user
const addUser = () =>{
    const user = {
        id: getMaxId(),
        name: document.getElementById('name').value,
        organization: document.getElementById('org').value,
        salary: parseInt(document.getElementById('salary').value)
    };
    users.push(user); // add the user to user array
    getAllUsers(); // reload user table
}

// remove a user
const removeUser = (uId)=>{
    let _index= -1;

    users.find((u,index)=>{
        if(u.id == uId){
            _index = index;
            return u;
        }
    });
    users.splice(_index,1);

    getAllUsers();
}

//edit a user
const editUser = (uId) =>{

}
const getMaxId = () =>{
    const lastId = users.sort((a,b)=>{
        return b.id - a.id;
    }).map(u=> {return u.id})[0];
    const maxId = lastId + 1;
    return maxId;
}

let nums = [19,12,-9,8,9];

// sort numbers
nums.sort((el1,el2)=>{
    return el2 - el1;
});

console.log(nums);

let msgs = [ "Hello","Hi","Welcome","Adamant"];
// sort strings
msgs.sort((m1,m2)=>{
    if(m1 > m2){
        return 1;
    }else if(m1 < m2){
        return -1;
    }else{
        return 0;
    }
});

console.log(msgs);

// sort objects
users.sort((a,b)=>{
    return b.salary - a.salary;
});

console.log(users);

let userNames = users.map(u=> {return u.name; });

console.log(userNames);


let userNameAcc = userNames.reduce((prev, curr)=>{
    return prev + curr;
});

console.log(userNameAcc);



let totalSalary = users.reduce((acc,u)=>{
    if(acc instanceof Object){
        return acc.salary + u.salary;
    }else{
        return acc + u.salary;
    }
});

console.log(totalSalary);

//prev curr
//u1    u2
//1500  u3

//return prev.salary + curr.salary
//    prev = u1.salary + u2.salary;
//return prev;
//return prev + curr.salary;

const groupUserByOrg = users.reduce((acc,usr)=>{
    let groupByKey = usr['organization'];
    if(!acc[groupByKey]){
        //create array
        acc[groupByKey] = [];
    }
    acc[groupByKey].push(usr);
    return acc;

},{});

console.log(groupUserByOrg);


let userNameAccRight = userNames.reduceRight((prev, curr)=>{
    return prev + curr;
});

console.log(userNameAccRight);

//


const getEmployees = ()=>{
    const _url = 'http://dummy.restapiexample.com/api/v1/employees';
    fetch(_url)
    .then(res => res.json())
    .then(body=> {
        //let emps = body.slice(0,10);
        let emps = body;
        console.log(emps);
        renderEmpTable(emps);
    })
    .catch(e=> console.error(e));
}

const renderEmpTable = (emps)=>{
    let rows = '';
    emps.forEach(e=>{
        rows += `<tr>
                    <td> =><i> NAME :${e.employee_name}, SALARY : ${e.employee_salary}, AGE : ${e.employee_age} </i>
                    <a href="#" onclick='deleteEmployee(${e.id})'>Delete Me!</a>
                    <a href="#" onclick='findEmployeeById(${e.id})'>Find Me!</a>
                    </td>
                </tr>`;
    });
    document.getElementById('emps').innerHTML = `<table>
                                                    <tr>
                                                        <th>Employee Details</th>
                                                    </tr>
                                                    ${rows}
                                               </table>`;
}

const saveEmployee = () =>{
    const url = 'http://dummy.restapiexample.com/api/v1/create';
    const emp =JSON.stringify({
        name : document.getElementById('name').value,
        salary : parseInt(document.getElementById('salary').value),
        age : parseInt(document.getElementById('age').value)
    });
    console.log(emp);

    fetch(url,
        {
        method : 'POST',
        body : emp // this is the request body
    })
    .then(res=>res.json())
    .then(body=>{
        console.log('Employee Added successfully');
    }).catch(e=>{
        console.error('Error Occurred '+e);
    });
}

const deleteEmployee = (eId)=>{
    const url = `http://dummy.restapiexample.com/api/v1/delete/${eId}`;
    fetch(url,{
        method : 'DELETE'
    })
    .then(res=>res.json())
    .then(body=>{
        console.log('Employee Deleted Successfully');
    })
    .catch(e=>{
        console.error('Error Occurred '+e);
    });
}

const findEmployeeById = (eId) =>{
    
    const url = `http://dummy.restapiexample.com/api/v1/employee/${eId}`;
    fetch(url)
    .then(res=>res.json())
    .then(body=>{
        console.log('BODY '+JSON.parse(body));
        document.getElementById('name').value = body.employee_name;
        document.getElementById('salary').value = body.employee_salary;
        document.getElementById('age').value = body.employee_age;
    })
    .catch(e=>{
        console.error('Error Occurred '+e);
    });
}