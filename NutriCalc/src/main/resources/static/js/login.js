$('.message a').click(function(){
   $('form').animate({height: "toggle", opacity: "toggle"}, "slow");
});


 function redirect(){
    window.location.href="/home";
}