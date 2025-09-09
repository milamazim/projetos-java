package util;

public class Bill {

  public static char gender;
  public static int beer;
  public static int softDrink;
  public static int barbecue;

  public static double feeding() {    
    return (beer * 5.00) + (softDrink * 3.00) + (barbecue * 7.00);
  }

  public static double cover() {
    if (feeding() > 30.00) {
      return 0.00;
    }
    else {
      return 4.00;
    }    
  }

  public static double ticket() {
    if (gender == 'F' || gender == 'f') {
      return 8.00;
    }
    else if (gender == 'M' || gender == 'm') {
      return 10.00;
    }
    else {
      return 0;
    }
  }

  public static double total() {
    return feeding() + cover() + ticket();
  }


}
