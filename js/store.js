
const saveUser = ()=>{
    const userObj = {
        id: 1,
        name: document.getElementById('name').value,
        age: parseInt(document.getElementById('age').value),
        salary: parseInt(document.getElementById('salary').value)
    };
    // save string object in store
    
    // available with in a tab
    // sessionStorage.setItem(user.id, JSON.stringify(user));

    // available across all the tabs in a browser till the lifecycle

    //console.log(localStorage.getItem('users'));
    let users = [];
    
    let result = `${getMessage()}`;
    console.log(result);

    if(localStorage.getItem('users') != null){
        // append to the existing array
        users = JSON.parse(localStorage.getItem('users'));
        users.push(userObj);
        localStorage.setItem('users',JSON.stringify(users));
    }else{
        // create the array
        // add a new object
        users.push(userObj); 
        localStorage.setItem('users',JSON.stringify(users));  
    }
}

const getAll = () =>{
    let users = [];
    if(localStorage.getItem('users') !=null){
        users = JSON.parse(localStorage.getItem('users'));
        renderTable(users);
    }else{
        document.getElementById('emps').innerHTML = '<strong>No Records Found</strong>';
    }
}

const renderTable = (users)=>{
    const rows = renderRows(users);
    document.getElementById('emps').innerHTML = `<table>
                                                    <tr>
                                                        <th>Employee Details</th>
                                                    </tr>
                                                    ${rows}
                                               </table>`;
}

const renderRows = (users) =>{
    let rows = '';
    users.forEach(e=>{
        rows += `<tr>
                    <td> =><i> NAME :${e.name}, SALARY : ${e.salary}, AGE : ${e.age} </i>
                    <a href="#" onclick='del(${e.id})'>Delete Me!</a>
                    <a href="#" onclick='findById(${e.id})'>Find Me!</a>
                    </td>
                </tr>`;
    });
    return rows;
}
const getMessage = () =>{
    return "Hello";
}