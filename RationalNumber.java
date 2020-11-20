public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
    if (deno == 0){
      numerator = 0;
      denominator = 1;
    }
    else{
      numerator = nume;
      denominator = deno;
      reduce();
    }
  }

  public double getValue(){
    return ((double) getNumerator() / (double) getDenominator());
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    RationalNumber rec = new RationalNumber(getDenominator(), getNumerator());
    return rec;
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    return (getNumerator() == other.getNumerator() && getDenominator() == other.getDenominator());
  }

  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    return (getNumerator() + "/" + getDenominator());
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
    /*use euclids method or a better one*/
    //http://sites.math.rutgers.edu/~greenfie/gs2004/euclid.html
    int rem;
    int aPos = Math.max(Math.abs(a), Math.abs(b));
    int bPos = Math.min(Math.abs(a), Math.abs(b));
    while (bPos != 0){
      rem = aPos % bPos;
      aPos = bPos;
      bPos = rem;
    }
    return aPos;
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    int tempNume = numerator;
    int tempDeno = denominator;
    if (tempNume * tempDeno >= 0){
      numerator = Math.abs(tempNume / gcd(tempNume, tempDeno));
      denominator = Math.abs(tempDeno / gcd(tempNume, tempDeno));
    }
    else{
      numerator = -1 * Math.abs(tempNume / gcd(tempNume, tempDeno));
      denominator = Math.abs(tempDeno / gcd(tempNume, tempDeno));
    }
  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    return null;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    return null;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    return null;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    return null;
  }
}
