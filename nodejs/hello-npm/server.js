const http = require('http');

const server = http.createServer((request,response)=>{ 
    if(request.url == '/status' && request.method == 'GET'){
        response.end(JSON.stringify({
            message : 'Server is up & running'
        }));
    }else if (request.url == '/users' && request.method == 'POST'){
        // enable cors
        response.setHeader('Access-Control-Allow-Origin','*');
        response.end(JSON.stringify({
            users : [
                {
                    id : 1,
                    name : 'John'
                },
                {
                    id : 2,
                    name : 'Bob'
                }
            ]
        }));
    }else{
        response.end('Invalid request');
    }
});
// bind port
server.listen(1200);