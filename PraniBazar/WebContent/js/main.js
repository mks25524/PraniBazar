(function($){
"use strict";

/*------------------------------------------------------------------------*
*                  WOW JS init                          *
*------------------------------------------------------------------------*/	
new WOW().init();

/*------------------------------------------------------------------------*
*                 Parallax BG                         *
*------------------------------------------------------------------------*/	

 $('.parallax-window').parallax({imageSrc: 'img/bg1.jpg'});
 $('.parallax-window2').parallax({imageSrc: 'img/bg2.jpeg'});
 $('.parallax-window3').parallax({imageSrc: 'img/bg.jpg'});
 $('.parallax-window4').parallax({imageSrc: 'img/bg6.jpg'});
  $('.parallax-window5').parallax({imageSrc: 'img/bg3.jpg'});
 $('.parallax-window5').parallax({imageSrc: 'img/bg3.jpg'});
 $('.parallax-window6').parallax({imageSrc: 'img/bg4.jpg'});
 $('.parallax-window7').parallax({imageSrc: 'img/bg5.jpg'});
 
/*------------------------------------------------------------------------*
*                  Owl Carousel                        *
*------------------------------------------------------------------------*/	
$('.themeix-carousel').owlCarousel({
autoplay:true,
loop:true,
smartSpeed:1000,
margin:30,
responsive:{
	0:{
		items:1,
		
	},
	450:{
		items:2,
		
	},
	600:{
		items:3,
		
	},
	1000:{
		items:4,
	}
}
});

//Owl Carousel 
$('.themeix-carousel2').owlCarousel({
autoplay:true,
loop:true,
smartSpeed:1000,
margin:30,
responsive:{
	0:{
		items:1,
		
	},
	450:{
		items:2,
		
	},
	600:{
		items:3,
		
	},
	1000:{
		items:4,
	}
}
});


/*------------------------------------------------------------------------*
*                 CounterUP                       *
*------------------------------------------------------------------------*/	
$('.counter').counterUp();


/*------------------------------------------------------------------------*
*                  Select Menu                      *
*------------------------------------------------------------------------*/	
/* ===== Logic for creating fake Select Boxes ===== */
$('.sel').each(function() {
  $(this).children('select').css('display', 'none');
  
  var $current = $(this);
  
  $(this).find('option').each(function(i) {
    if (i == 0) {
      $current.prepend($('<div>', {
        class: $current.attr('class').replace(/sel/g, 'sel__box')
      }));
      
      var placeholder = $(this).text();
      $current.prepend($('<span>', {
        class: $current.attr('class').replace(/sel/g, 'sel__placeholder'),
        text: placeholder,
        'data-placeholder': placeholder
      }));
      
      return;
    }
    
    $current.children('div').append($('<span>', {
      class: $current.attr('class').replace(/sel/g, 'sel__box__options'),
      text: $(this).text()
    }));
  });
});

// Toggling the `.active` state on the `.sel`.

  $(".sel").on("click",function() {
  $(this).toggleClass('active');
});

// Toggling the `.selected` state on the options.
$(".sel__box__options").on("click",function() {
  var txt = $(this).text();
  var index = $(this).index();
  
  $(this).siblings('.sel__box__options').removeClass('selected');
  $(this).addClass('selected');
  
  var $currentSel = $(this).closest('.sel');
  $currentSel.children('.sel__placeholder').text(txt);
  $currentSel.children('select').prop('selectedIndex', index + 1);
});

		
/*------------------------------------------------------------------------*
*                  Fade Slider                       *
*------------------------------------------------------------------------*/			
 
  var opts = {
   speed: 500            //slider speed
   ,timer: 4000          //time between animation
   ,autoSlider: true     //autoslide on/off
   ,hasNav: true         //show prev/next slider button?
   ,pauseOnHover: true   //pause when mouse over ?
   ,navLeftTxt: '<'   //prev button text
   ,navRightTxt: '>'  //next button text
   ,zIndex:20            //z-index  setting
    ,showIndicator: true  // show Indicators?
   ,callback:function() {} //callback function after every slider action
  }
  var sliderInstance = $('#fades1').fadeSlider(opts)
  
 })(jQuery);







