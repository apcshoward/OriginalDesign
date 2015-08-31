int rightEyeX = 400; 

void setup()
{
  size(700,700);
}
void draw() 
{
 	rightEyeX = rightEyeX + 1;    
 	
  head();  
  face(); 
  hat();
  tank();
}


 

void head()
{
  fill(139,69,9);
  ellipse(200,200,160,160); 
  
}
void face()
{
  arc(200,230,20,20,PI/8,7*PI/8);
  fill(0,0,0); 
  ellipse(230,180,20,30);
  ellipse(170,180,20,30);  
  
}
void hat() 
{ 
	fill(225,0,0);
	arc(200, 80, 80, 80, 0, PI+QUARTER_PI, CHORD);
	
 } 
void tank() 
{  
	fill(85,107,47); 
	rect(50, 280, 300, 100); 
	rect(350,280,150,30,100);  
	fill(0,0,0,100);
	rect(50,380,300,30,100); 
	fill(255,0,0);
	ellipse(rightEyeX,295,30,30); 
  
}