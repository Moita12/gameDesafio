import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TrocaTela here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrocaTela extends Actor
{
    /**
     * Act - do whatever the TrocaTela wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        public int timer = 0;
        public int entercounter=0;
        public boolean diag = true;
    public void act()
    {
                if(Greenfoot.isKeyDown("enter") && timer == 0){
            timer = 2;
            entercounter++;
            diag = true;

        }
        else{
        if(!Greenfoot.isKeyDown("enter")){
            timer = 0;
        }
        }
        if(entercounter==1 && diag){
            diag = false;
            cena1 cena1 = new cena1();
            getWorld().addObject(cena1,400,225);
           
        }

        if(entercounter==2 && diag){
            diag = false;
         cena2 cena2 = new cena2();
         getWorld().addObject(cena2,400,225);
        }
        if(entercounter==3 && diag){
            diag = false;
         cena3 cena3 = new cena3();
         getWorld().addObject(cena3,400,225);
        }
            if(entercounter==4){
            MyWorld mundo = new MyWorld();
            Greenfoot.setWorld(mundo);
        }
       
    }
    }

