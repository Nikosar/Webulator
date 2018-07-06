const http = require('http');

let server = new http.Server(function (req, res) {
    var jsonString = '';
    res.setHeader('Content-Type', 'application/json');
    req.on('data', (data) => {
        jsonString += data;
    });

    req.on('end', () => {
        res.end('q');
    });
});
server.listen(3000, 'localhost')