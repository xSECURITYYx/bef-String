
public class Main {
    public static void main(String[] args) {
        //all about string
        //fisrt two types of printing
        //tips: write sout and hit enter it will automatically write printf text
        System.out.println("Hello world!");
        System.out.printf("Hello world!\n");
        String name1 = "saud";
        System.out.println(name1);
        //combine two strings
        String name2 = "Mr.John";
        String total = name1 + name2;
        System.out.println(total);
        //you can also write.
        String total2 = name1 + " and " + name2;
        System.out.println(total2);
        //charAt
        //this function find the digit index.
        System.out.println(name2.charAt(0));
        //length
        //this function will find the length of whole alphabet or paragraph.
        System.out.println(name1.length());
        //replace
        //this function replace a character with another
        String text = "Hey! there I am saud.";
        //text.replace('a','b');
        //the above code will replace a with b from the text String.
        //but we have to store this data in another String in order to print it So.
        String newtext = text.replace('a','b');
        System.out.println(newtext);
        //Substring
        //Note in substring the first index is taken correctly but in last index you have to add +1 index so it will work correctly.
        String text1 = "Software Engineering is best.";
        System.out.println(text1.substring(0,9));
        }
    }
