//Project 9 Tara Cusumano
//Lobster newlobster;

float ricky,nicky,dicky;
float surface;
float shipX=0,shipDX=5;
float moonX=0,moonY=100;
float horizon;
float x,dx;
float y,dy;
int[]xpos=new int[2];
int[]ypos=new int[2];
//Lobster[] Lobsters=new Lobster[2];
void setup(){
  size(640,480);
  background(50,150,200);
  horizon=height/2;
  reset();
 // for (int i=0;i<xpos.length;i++);
   // lobster[i]=new Lobster(color(i*2),0,i*2;,i/20.0);
  }

  void reset(){
    surface= random(height/4,height/4);
    moonY=surface/2;
    moonY=random(100,surface+100);
   ricky=width/4;
   nicky=width/4;
   dicky=width/4;
  }
  void draw(){
     scene();
     //newlobster.move();
    // newlobster.display();
    fill(255,0,0);
    triangle( 550,horizon, 400,horizon-100, 700,horizon -10  ); 
    triangle( 500,horizon, 600,horizon-100, 700,horizon -10  ); 
    triangle( 500,horizon, 500,horizon-100, 700,horizon -10  );  
    triangle( 500,horizon, 400,horizon-100, 700,horizon -10  );  
    triangle( 500,horizon, 300,horizon-100, 700,horizon -10  );  
    // lobster
   ellipse(600,430,16,16);
     ellipse(500,430,56,56);
    stroke(0);
  
    
    
   
    
  }
  void scene(){
    if(moonX>width+50){
      moonX=-100;
      moonY=random(50,surface+25);
    }
    moonX+=1;
    fill(200,150,50);
    ellipse(moonX,moonY-50,40,40);
    //water
    fill(0,100,50);
    rect(0,surface,width,height-surface);
  }
