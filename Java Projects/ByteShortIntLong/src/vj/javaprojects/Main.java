package vj.javaprojects;

public class Main {

    public static void main(String[] args) {
	    int myValue = 10000;
	    int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum value = " + myMinIntValue);
        System.out.println("Integer Maximum value = " + myMaxIntValue);
        System.out.println("Busted value " + (myMaxIntValue+1));
    /* ###
    Over flow of numbers happen when the value goes over the value of the size of the value
    Underflow of numbers also happen
    Integer Max value  = 2147483647
    Integrer Min Value = -2147483648
     */
        System.out.println("overflow value " + (myMaxIntValue+1));
        System.out.println("underflow value " + (myMinIntValue-1));
        int maxintegerval = 2_147_483_647;
        System.out.println(maxintegerval);

        byte myMinbyte = Byte.MIN_VALUE;
        byte myMAXbyte = Byte.MAX_VALUE;
        System.out.println("Byte Start" + myMinbyte +"range " + myMAXbyte);

        byte newBy = (byte) (myMAXbyte/2);

        int invaluemin = 5;
        float minfloatvalue = (float) 5.25;
        double mindoublevalue = 5.25;
        System.out.println( invaluemin + minfloatvalue + mindoublevalue);
        double inputlbs = 10;
        double inkilos = inputlbs * 0.454 ;
        System.out.println( " Input Lbs : =" +inputlbs);
        System.out.println( " is converted to Kgs= " +inkilos);
        char myunitest = '\u0905';
        System.out.println("Unico   de Value" +'\u0905');

    /* ###
    Byte  Max value  = 2147483647
    Byte Min Value = -2147483648
     */

    }
}
