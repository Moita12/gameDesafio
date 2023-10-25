import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class texto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class texto extends menu
{

    /**
     * Constructor for objects of class texto.
     * 
     */
    public texto()
    {
        getBackground().drawImage(new GreenfootImage("Press 'Enter' to Start", 50, null, null), 380, 120);

        prepare();
    }
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        TrocaTela trocaTela = new TrocaTela();
        addObject(trocaTela,544,105);
    }
}
