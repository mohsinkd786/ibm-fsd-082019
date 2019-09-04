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
    /*const uIds = users.sort((a,b)=>{
        return a.id > b.id;
    }).map(u=> {return u.id});
    console.log(uIds);
    */
    const maxId = 3;
    return maxId + 1;
}