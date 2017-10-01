       class Car{
      int size;
      int carx;
      int cary;
      int speed;
     
     Car(int size, int carx, int cary, int speed){
      this.size= size;
      this.carx  = carx;
      this.cary = cary;
      this.speed = speed;
      
     }
     void display() 
  {
    fill(0,255,0);
    rect(carx , cary,  size, 50);
  }

 } 

void setup(){
  size(400,400);
  
}
int x = 200;
int y = 350;
int a = 20;
        
  Car b = new Car(100,100,40,50);
Car c = new Car(150,150,5,10);
        
  Car d = new Car(150,150,40,50);

  void draw(){
    background(255,255,255);
    fill(0,255,0);
    ellipse(x,y,50,50);
    b.display();
    c.display();
    d.display();
  } 
    void keyPressed()
{
  if(key == CODED){
      if(keyCode == UP)
      {
        y = y - a;
      //Frog Y position goes up
      }
      else if(keyCode == DOWN)
      {
        y = y + a;
        //Frog Y position goes down 
      }
      else if(keyCode == RIGHT)
      {
        x = x + a;
       //Frog X position goes right
      }
      else if(keyCode == LEFT)
      {
        x = x - a;
        //Frog X position goes left
      }
   }

   if(x>375){
     x=375;
   }
   if(x<25){
     x=25;
   }
    if(y>375){
      y=375;
    }
    if(y<25){
      y=25;
    }
    

    
    

    

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}