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

    //Tests multiply method
    System.out.println(sixTenth.multiply(sixTenth));
    System.out.println(sixTenth.multiply(negSixTenth));
    System.out.println(sixTenth.multiply(fiveThird));
    System.out.println(threeFifth.multiply(invalid));

    //Tests divide method
    System.out.println(sixTenth.divide(sixTenth));
    System.out.println(sixTenth.divide(negSixTenth));
    System.out.println(sixTenth.divide(fiveThird));
    System.out.println(threeFifth.divide(invalid));

    //Tests add method
    System.out.println(sixTenth.add(sixTenth));
    System.out.println(sixTenth.add(negSixTenth));
    System.out.println(sixTenth.add(fiveThird));
    System.out.println(threeFifth.add(invalid));

    //Tests subtract method
    System.out.println(sixTenth.subtract(sixTenth));
    System.out.println(sixTenth.subtract(negSixTenth));
    System.out.println(sixTenth.subtract(fiveThird));
    System.out.println(threeFifth.subtract(invalid));
  }
}

/*
Expected output:
false
false
true
false
34.5
34.5
259.73999999999995
259.73999999999995
0.0
2.3399999999999997E-10
0.4743589743589744
2.108108108108108
Infinity
2.34E12
NaN
-12.299999999999999
12.299999999999999
0
1
0/1
3
5
3/5
0.0
0.6
0
1
0/1
5
3
5/3
0.0
1.6666666666666667
true
true
false
false
true
true
3/5
0.0
3/5
-3/5
9/25
-9/25
1/1
0/1
1/1
-1/1
9/25
0/1
6/5
0/1
34/15
3/5
0/1
6/5
-16/15
3/5
*/
