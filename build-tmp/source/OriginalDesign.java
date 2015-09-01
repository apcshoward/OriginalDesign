import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

int rightEyeX = 400; 

public void setup()
{
  size(700,700);
}
public void draw() 
{
 	rightEyeX = rightEyeX + 1;    
 	
  head();  
  face(); 
  hat();
  tank();
}


 

public void head()
{
  fill(139,69,9);
  ellipse(200,200,160,160); 
  
}
public void face()
{
  arc(200,230,20,20,PI/8,7*PI/8);
  fill(0,0,0); 
  ellipse(230,180,20,30);
  ellipse(170,180,20,30);  
  
}
public void hat() 
{ 
	fill(225,0,0);
	arc(200, 80, 80, 80, 0, PI+QUARTER_PI, 2);
	
 } 
public void tank() 
{  
	fill(85,107,47); 
	rect(50, 280, 300, 100); 
	rect(350,280,150,30,100);  
	fill(0,0,0,100);
	rect(50,380,300,30,100); 
	fill(255,0,0);
	ellipse(rightEyeX,295,30,30); 
  
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
