var app = (function() {
    const numbers = (error, data) => {
            $("#mean").text(data.mean);
            $("#stdDev").text(data.stdDev);
    }

    const send = () => {
        var data = $("#list").val();
        var listNum = data.split(",");
        postMethod(listNum, numbers);
    }

    const postMethod = (listNum,numbers) => {
        var promise = $.post({
            url: "/calculate",
            data: JSON.stringify(listNum),
            contentType: "application/json"
        });
        promise.then((data) => {
            numbers(null, JSON.parse(data));
        },(error) => {
            numbers(error, null);
        });
    }

    return {
        send: function() {
            send();
        }
    }
})();