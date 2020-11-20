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
  }
}
