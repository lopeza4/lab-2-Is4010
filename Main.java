class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color counts");
    System.out.println("M&M color counts");
    int total;
    double blue, yellow, brown, green, orange, red;
    // Calculate total number of M&Ms
    total = 55 * 10;
    // Calculate for blue
    blue = total * .24;
    System.out.println("The total Number of Blue M&Ms is: " + blue);
    // Calculate For Yellow
    yellow = total * .10;
    System.out.println("The total Number of Yellow  M&Ms is: " + yellow);
    // Calculate For green
    green = total * .16;
    System.out.println("The total Number of Green M&Ms is: " + green);

    // Calculate For orange
    orange = total * .34;
    System.out.println("The total Number of Orange  M&Ms is: " + orange);
    // Calculate For red
    red = total * .10;
    System.out.println("The total Number of Red M&Ms is " + red);
    // Calculate For brown
    brown = total * .06;
    System.out.println("The total Number of Brown M&Ms is " + brown);
    // Calculate the total of M&ms
    double sum;
    sum = blue + yellow + green + orange + red + brown;
    System.out.println("the total of all the M&ms is " + sum);

    if (blue > brown & green > orange)
      System.out.println("Blue over Brown and Green over Orange");
    if (brown <= red)
      System.out.println("Brown is less than or equal to Red");
    // check if the sum equals total
    if (sum == total)
      System.out.println("Numbers match");

  }
}