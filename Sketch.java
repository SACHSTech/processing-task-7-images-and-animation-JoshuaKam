import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
	
  PImage imgBackground;
	PImage imgFish;
  PImage imgPlant;
  

  float fltFishX = -100;
  float fltFishY = 20;

   float fltPlantX = 100;
  float fltPlantY = 400;

   float fltCirX = 100;
  float fltCirY = width/10;

  float fltCirSpeedX = 2;
  float fltCirSpeedY = 1;

  
 
  public void settings() {
    size(400, 400);
  }


  public void setup() {
   
    imgPlant = loadImage("Plant.png");
  imgPlant.resize(imgPlant.width/2,imgPlant.height/2);

    imgFish = loadImage("Fish.png");
    imgFish.resize(imgPlant.width/2,imgPlant.height/2);
  
  imgBackground = loadImage("oceanbackground.jpg");


}
  

 
  public void draw() {
   
    image(imgBackground,0,0);

    image(imgFish,fltFishX,fltFishY);
    fltFishX += 0.5;
	  
      image(imgPlant, fltPlantX, fltPlantY);
    fltPlantY -= 1;

   ellipse(fltCirX,fltCirY,10,10);
    fltCirX += fltCirSpeedX;
    fltCirY += fltCirSpeedY;

    if (fltCirX < 0+10 || fltCirX > width-10) {
      fltCirSpeedX *= -1;
  }
   if (fltCirY < 0+10  || fltCirY > height-10) {
      fltCirSpeedY *= -1;
    }
  }
}
