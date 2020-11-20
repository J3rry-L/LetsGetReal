public class Tester{
  public static void main(String[] args){
    // Tests zero special case for equals
    RealNumber zero = new RealNumber(0.0);
    RealNumber notZero = new RealNumber(0.00000000001);
    System.out.println(zero.equals(notZero));
    System.out.println(notZero.equals(zero));

    //Tests error bound for equals
    RealNumber num = new RealNumber(100000);
    RealNumber approxNum = new RealNumber(99999.0000001);
    System.out.println(num.equals(approxNum));
    System.out.println(approxNum.equals(num));

    //Tests add method
    RealNumber elevenPointOne = new RealNumber(11.1);
    RealNumber twentyThreePointFour = new RealNumber(23.4);
    System.out.println(elevenPointOne.add(twentyThreePointFour));
    System.out.println(twentyThreePointFour.add(elevenPointOne));

    //Tests multiply method
    System.out.println(elevenPointOne.multiply(twentyThreePointFour));
    System.out.println(twentyThreePointFour.multiply(elevenPointOne));
    System.out.println(twentyThreePointFour.multiply(zero));
    System.out.println(twentyThreePointFour.multiply(notZero));

    //Tests divide method
    System.out.println(elevenPointOne.divide(twentyThreePointFour));
    System.out.println(twentyThreePointFour.divide(elevenPointOne));
    System.out.println(twentyThreePointFour.divide(zero));
    System.out.println(twentyThreePointFour.divide(notZero));
    System.out.println(zero.divide(zero));

    //Tests subtract method
    System.out.println(elevenPointOne.subtract(twentyThreePointFour));
    System.out.println(twentyThreePointFour.subtract(elevenPointOne));

    //Tests RationalNumber constructor
    RationalNumber invalid = new RationalNumber(20,0);
    RationalNumber threeFifth = new RationalNumber(3,5);
    System.out.println(invalid.getNumerator());
    System.out.println(invalid.getDenominator());
    System.out.println(invalid);
    System.out.println(threeFifth.getNumerator());
    System.out.println(threeFifth.getDenominator());
    System.out.println(threeFifth);

    //Tests getValue method
    System.out.println(invalid.getValue());
    System.out.println(threeFifth.getValue());

    //Tests reciprocal method
    System.out.println(invalid.reciprocal().getNumerator());
    System.out.println(invalid.reciprocal().getDenominator());
    System.out.println(invalid.reciprocal());
    System.out.println(threeFifth.reciprocal().getNumerator());
    System.out.println(threeFifth.reciprocal().getDenominator());
    System.out.println(threeFifth.reciprocal());
    System.out.println(invalid.reciprocal().getValue());
    System.out.println(threeFifth.reciprocal().getValue());

    //Tests equals method
    RationalNumber sixTenth = new RationalNumber(6,10);
    RationalNumber fiveThird = new RationalNumber(5,3);
    System.out.println(sixTenth.equals(threeFifth));
    System.out.println(threeFifth.equals(sixTenth));
    System.out.println(fiveThird.equals(threeFifth));
    System.out.println(threeFifth.equals(fiveThird));
    System.out.println(threeFifth.equals(threeFifth));
    System.out.println(threeFifth.equals(fiveThird.reciprocal()));

    //Tests GCD method
    /*
    System.out.println(RationalNumber.gcd(-102,221));
    System.out.println(RationalNumber.gcd(-102,-102));
    System.out.println(RationalNumber.gcd(-37,-102));
    System.out.println(RationalNumber.gcd(0,221));
    System.out.println(RationalNumber.gcd(221,0));
    System.out.println(RationalNumber.gcd(624129, 2061517));
    */

    //Tests reduce method
    RationalNumber posSixTenth = new RationalNumber(-6,-10);
    RationalNumber negSixTenth = new RationalNumber(6,-10);
    System.out.println(sixTenth);
    System.out.println(zero);
    System.out.println(posSixTenth);
    System.out.println(negSixTenth);
  }
}
