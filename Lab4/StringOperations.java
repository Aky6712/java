public class StringOperations {

    public static void main(String[] args) {
      String str = "This is a string example.";

      
      String replaced = str.replace("string", "sentence");
      System.out.println(replaced); 

      
      boolean containsString = str.contains("string");
      System.out.println(containsString); 

      
      String replacedAll = str.replaceAll("\\s", "-"); 
      System.out.println(replacedAll); 

      
      int firstIndex = str.indexOf("is");
      System.out.println(firstIndex); 

      
      String subString = str.substring(8, 14); 
      System.out.println(subString); 

      
      boolean isEqual = str.equals("This is a string example.");
      System.out.println(isEqual); 

      
      int lastIndex = str.lastIndexOf(" ");
      System.out.println(lastIndex); 

      
      boolean startsWithThis = str.startsWith("This");
      System.out.println(startsWithThis); 

      
      boolean endsWithExample = str.endsWith("example.");
      System.out.println(endsWithExample); 

      
      boolean equalsIgnoreCase = str.equalsIgnoreCase("THIS IS A STRING EXAMPLE.");
      System.out.println(equalsIgnoreCase);

      
      String lowercase = str.toLowerCase();
      System.out.println(lowercase); 

      
      String uppercase = str.toUpperCase();
      System.out.println(uppercase); 

      
      boolean isEmpty = str.isEmpty();
      System.out.println(isEmpty); 

      
      int length = str.length();
      System.out.println(length);

      
      String[] words = str.split(" "); 
      for (String word : words) {
        System.out.print(word + ", ");
      }
      System.out.println(); 
    }
  }
