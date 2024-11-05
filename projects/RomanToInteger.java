class RomanNumeralConverter {
    
    public static void main(String[] args) {
        RomanNumeralConverter solution = new RomanNumeralConverter();
        // Test cases
        System.out.println(solution.converter("III"));      // Output: 3
        System.out.println(solution.converter("LVIII"));    // Output: 58
        System.out.println(solution.converter("MCMXCIV"));  // Output: 1994
    }
    
    public int converter(String s){

        int total = 0;  //This is the end result of the method
        int i = s.length() - 1; // This is a counter
        int currVal, prevVal = 0;
        

        while ( i >= 0){ // This while loop will go backwards from the end of the string
            currVal = getValue(s.charAt(i));
            
            if(currVal < prevVal) total -= currVal;
            else total += currVal;

            prevVal = currVal;
            i--;
        }

        return total;
    }

    static int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return -1;  //For a more robust program receiving this -1 would throw an error code
    }
}