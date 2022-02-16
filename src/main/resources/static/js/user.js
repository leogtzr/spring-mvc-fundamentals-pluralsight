$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/api/user"
    }).then(function(data) {
        $('.firstName').append(data.firstName);
        $('.lastName').append(data.lastName);
        $('.age').append(data.age);
    });
});