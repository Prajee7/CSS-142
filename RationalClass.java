import java.nio.file.NotLinkException;

import javax.swing.JSpinner.NumberEditor;

public class RationalClass {
  private int numerator;
  private int denominator;

  public Rational(int n, int d) {
    numerator = n;
    denominator = d;
  }
  public String toString() {
    return numerator + "/" + denominator;
  }
  public void simplify() {
    int small = Math.min(numerator, denominator);
    for(int i = small; i > 1 i--) {
      if(numerator % i == 0) {
        if(numerator % 1 == 0 && denominator % i ==0) {
          numerator = numerator / i;
          denominator = denominator / i;
        }
      }

    }
  }
  public Rational add(Rational other) {
     int d = denominator * other.denominator;
     int n = numerator * other.denominator + other.numerator * denominator;
     Rational r = new Rational (n, d);
     return r;

  }
  
}
