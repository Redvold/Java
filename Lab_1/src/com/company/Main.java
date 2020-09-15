package com.company;

/**
 * This class demonstrates first java app.
 * @author Bielousov Serghii
 * @version 1.0
 * @since 2020-09-07
 */
public class Main {
    /**
     * This metod demonstrate short student information.
     * @param args Unused.
     */
    public static void main(String[] args) {
        System.out.println("Group: 535 st1");
        System.out.println("Studetn: Bielousov Serghii Serghiiovich ");
        System.out.println("Variant: 2");
        String[] inic ={
            " **********        ***********         ***********    \n",
            " **       ***     ***                 ***             \n",
            " **        **    ***                 ***              \n",
            " **       ***     ***                 ***             \n",
            " *********          **********          **********    \n",
            " **       ***       **********          **********    \n",
            " **        **               ***                 ***   \n",
            " **        **                ***                 ***  \n",
            " **       ***               ***                 ***   \n",
            " **********       ************        ************    \n"
        };
        for (int i=0; i<inic.length; i++){
            System.out.print(inic[i]);
        }
	// write your code here
    }
}
