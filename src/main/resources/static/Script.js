var inter = window.setInterval(function() {
    var width = window.innerWidth;
    console.log(width)
    var elements = document.getElementsByClassName("center")
    for (var i = 0; elements.length; i ++) {
        elements[i].style.width = width.toString() + "px"
    }
}, 100)