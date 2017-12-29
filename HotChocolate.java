/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotchocolate;

/**
 *
 * @author Bilakhiya
 */
public class HotChocolate {

    /**
     * @param args the command line arguments
     */
    public static final double tooHot=185;
    public static final double tooCold=165;
    
    public static void drink_choco(double cocoatemp)throws TohotException,ToocoldException
    {
        if(cocoatemp>=tooHot)
        {
            throw new TohotException();
        }
        else if(cocoatemp<=tooCold)
        {
            throw new ToocoldException();
            
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        double coco=184;
        try
        {
            drink_choco(coco);
            System.out.println("coco is good!");
            
        }
        catch(TohotException e)
        {
            System.out.println("tohot");
        }
        catch(ToocoldException e)
        {
            System.out.println("tocold");
        }
    }
    
}
