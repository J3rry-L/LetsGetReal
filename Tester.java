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

    //Tests divide method
    System.out.println(elevenPointOne.subtract(twentyThreePointFour));
    System.out.println(twentyThreePointFour.subtract(elevenPointOne));
  }
}
