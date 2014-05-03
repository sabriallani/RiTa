package rita.render.test;

import processing.core.PApplet;
import rita.*;
import rita.test.PixelCompare;

public class ColorAndFade extends PApplet {
  
	public void setup() {

		size(400, 800);
		
		// TODO: colorTo() works, but won't work for a test 
		// until I add a function to delay writing the image.

		  
		RiText.defaultFont("Times", 20);
		
		// TODO colorTo seems not working
		RiText rt = new RiText(this, "ColorTo gray in 2 sec", 100,  50);
		rt.colorTo(200, 2);
		rt.showBounds(true);

		float[] c = {0,0,255};
		RiText rt6 = new RiText(this, "ColorTo Bluein 2 sec" , 100, 100);
		rt6.colorTo(c,2);
		rt6.showBounds(true);
		new RiText(this, "ColorTo Blue 5s delay 5" , 100, 150).colorTo(c,5,2);

		RiText rt2 = new RiText(this, "fade out and in" , 100, 200);
		rt2.fadeOut(2);

		RiText rt3 = new RiText(this, "fade out delay and in" , 100, 250);
		rt3.fadeOut(2,2);
		
		
		rt2.fadeIn(2,4);
		rt3.fadeIn(2,8);
		
		
		RiText rt4 = new RiText(this, "fade out and in" , 100, 300);
		rt4.showBounds(true); //TODO crash on showBounds with fadeOut
		rt4.fadeOut(2);

		RiText rt5 = new RiText(this, "fade out delay and in" , 100, 350);
		rt5.showBounds(true);
		rt5.fadeOut(2,2);
		
		rt4.fadeIn(2,4);
		rt5.fadeIn(2,8);


		RiText rt7 = new RiText(this, "Null" , 100, 400);
		rt5.showBounds(true);
		rt7.textTo("Changed Text",3);
		
		
		RiText rt8 = new RiText(this, "Null" , 100, 450);

		rt8.textTo("Changed Text delay3s",3,5); //TODO the third parameter seems not a "startTime" and In API: textTo(newText, seconds, endAlpha)
		
		RiText rt9 = new RiText(this, "Null" , 100, 500);
		rt9.showBounds(true);
		rt9.textTo("Changed Text delay3s",3,5);	
		
		background(255);

		//RiText.drawAll();
	}
	
	public void draw() {
		
		background(255);
		//fill(0);
		//text(millis()+ "" ,10,750);
		RiText.drawAll();
	}
	

}
