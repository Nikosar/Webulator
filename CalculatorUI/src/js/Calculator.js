var operator = null;
var lastValue = null;

function setOperator(buttonName) {
    lastValue = document.getElementById("output").innerText;
    operator = buttonName;
    clearOutput();
}

function calcResult() {
    if (lastValue !== null && operator != null) {
        var b = document.getElementById('output').value;
        request(lastValue, b);
        operator = null;
        lastValue = null;
    }


    function request(a, b) {

        if (a === undefined) {
            document.getElementById('output').innerHTML = "0";
        }
        var request = new XMLHttpRequest();
        var dto = JSON.stringify({
            a: a,
            b: b
        });
        request.open("POST", "http://localhost:8080/" + operator, true);
        request.setRequestHeader('Content-type', 'application/json; charset=utf-8');
        request.send(dto);

        request.onreadystatechange = function () {
            var response = request.responseText;
            if (response !== "") {
                console.info(request.responseText);
                var sum = JSON.parse(request.responseText);
                document.getElementById('output').innerHTML = sum.value;
            }
        }
    }
}



