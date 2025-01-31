public class MixMatch {
    public static void main(String[] args) {
        String varString =  "Hello World";
        char varChar = 'H';
        short varShort = 10;
        int varInt = 1;
        long varLong = 10000000;
        float varFloat = 1.10f;
        double varDouble = 1.00000;
        boolean varBoolean = true;

        System.out.println(varString + " <- String, stores multiple characters ");
        System.out.println(varChar + " <- Char, stores a single character ");
        System.out.println(varShort + " <- Short, stores numbers from -32,768 to 32,767 "); 
        System.out.println(varInt + " <- Integer, stores whole numbers from -2,147,483,648 to 2,147,483,647 ");
        System.out.println(varLong + " <- Long, an integer between -263 and +263 – 1 ");
        System.out.println(varFloat + " <- Float, a number between ±3.4 * 10-38 and ±3.4 * 1038 and is accurate to 7 decimal places. Must end with an f ");
        System.out.println(varDouble + " <- Double, a number between ±1.7 * 10-308 and ±1.7 * 10308 and is accurate to 15 decimal places ");
        System.out.println(varBoolean + " <- Boolean, can only be true or false ");
        System.out.println("Mix & Match: " + varString + ", " + varChar + ", " + varShort + ", " + varInt + ", " + varLong + ", " + varFloat + ", " + varDouble + ", " + varBoolean );
    }
	
}