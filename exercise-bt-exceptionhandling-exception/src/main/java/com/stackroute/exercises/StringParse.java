package com.stackroute.exercises;
public class StringParse {
    //Write logic to find the character from the sentence at specified location
    public char characterLocator(String sentence, String location) {
    	try {
            int index = Integer.parseInt(location);
           
            if (index < 0 || index >= sentence.length()) {
                throw new StringIndexOutOfBoundsException("Index is out of bounds");
            }
            
            return sentence.charAt(index);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Parsing String with characters to int is not possible");
        } catch (StringIndexOutOfBoundsException e) {
            throw new StringIndexOutOfBoundsException("When the number given is out of range, an out of bound exception is thrown");
        }
    }
        public static void main(String[] args) {
        	StringParse parser = new StringParse();
    		char result1 = parser.characterLocator("This is a demo sentence", "8");
            System.out.println("Character at location 8: " + result1);
    	}
}