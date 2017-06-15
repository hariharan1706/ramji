class simple{
   public static void main(String[] args) {
      String string = "malayalam";
      String reverse = new StringBuffer(string).reverse().toString();
      System.out.println("\nString before reverse: "+string);
      System.out.println("String after reverse: "+reverse);
   }
}
