$(document).ready(function () {
    var tableHidden = false;
    $("#hideButton").click(function () {
        if (tableHidden) {
            $(".waterTable").fadeIn(1000);
            $("#hideButton").animate({
                opacity: '1'
            }, 300);
        } else {
            $(".waterTable").fadeOut(1000);
            $("#hideButton").animate({
                opacity: '0.4'
            }, 300);
        }
        tableHidden = !tableHidden;

    });

    $(".greeting").mouseenter(function () {
        var newColor = '#' + (0x1000000 + (Math.random())
                * 0xffffff).toString(16).substr(1, 6);
        $(this).animate({
            color: newColor
        });
    });

    $(".greeting").mouseleave(function () {
        $(this).animate({
            color: "#ff9933"
        });
    });

    $("tbody").mouseenter(function () {
        $(this).animate({
            backgroundColor: '#444444'
        }, 100);
    });
    $("tbody").mouseleave(function () {
        $(this).animate({
            backgroundColor: 'black'
        }, 100);
    });
});



