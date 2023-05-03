package test;

//Math类包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数
public class MathTest {
    //Math类
    public static void mathClassTest(){
        System.out.println("Math类字段：---------------------------------------------");
        System.out.println("E(比任何其他值都更接近e（即自然对数的底数）的double值):"+Math.E);
        System.out.println("PI(比任何其他值都更接近pi（即圆的周长与直径之比）的double值):"+Math.PI);
        System.out.println("Math类静态方法：---------------------------------------------");
        System.out.println("abs(返回对应的绝对值):"+Math.abs(-12));
        System.out.println("ceil(返回最小的（最接近负无穷大）double值，该值大于等于参数，并等于某个整数):"+Math.ceil(0.75));
        System.out.println("floor(返回最大的（最接近正无穷大）double值，该值小于等于参数，并等于某个整数):"+Math.floor(0.75));
        System.out.println("pow(返回第一个参数的第二个参数次幂的值):"+Math.pow(10,2));
        System.out.println("random(返回带正号的double值，该值大于等于0.0且小于1.0):"+Math.random());
        System.out.println("round(返回最接近参数的long值):"+Math.round(0.735));
        System.out.println("sqrt(返回正确舍入的double值的正平方根):"+Math.sqrt(0.25));
        System.out.println("log(返回double值的自然对数（底数是 e）):"+Math.log(0.125));
        System.out.println("log10(返回double值的底数为10的对数):"+Math.log10(0.25));
        System.out.println("max(返回两个值中较大的一个):"+Math.max(10,26));
        System.out.println("min(返回两个值中较小的一个):"+Math.min(10,26));
        System.out.println("sin(返回角的三角正弦):"+Math.sin(0.25));
        System.out.println("cos(返回角的三角余弦):"+Math.cos(0.25));
        System.out.println("tan(返回角的三角正切):"+Math.tan(0.25));
        System.out.println("exp(返回欧拉数e的double次幂的值):"+Math.exp(0.25));
        System.out.println("signum(返回参数的符号函数):"+Math.signum(0.25));
        System.out.println("toDegrees(将用弧度表示的角转换为近似相等的用角度表示的角):"+Math.toDegrees(0.25));
        System.out.println("toRadians(将用角度表示的角转换为近似相等的用弧度表示的角):"+Math.toRadians(0.25));
        System.out.println("ulp(返回参数的ulp大小):"+Math.ulp(0.25));
        System.out.println("nextAfter(返回第一个参数和第二个参数之间与第一个参数相邻的浮点数):"+Math.nextAfter(0.735,2.365));
        System.out.println("nextUp(返回参数值值和正无穷大之间与参数值相邻的浮点值):"+Math.nextUp(0.735));
        System.out.println("nextDown(返回参数值值和正无穷大之间与参数值相邻的浮点值):"+Math.nextDown(0.735));
        System.out.println("rint(返回最接近参数并等于某一整数的double值):"+Math.rint(0.735));
        System.out.println("getExponent(返回double表示形式中使用的无偏指数):"+Math.getExponent(1.75));
        System.out.println("expm1(返回e^x -1):"+Math.expm1(0.25));
        System.out.println("cbrt(返回double值的立方根):"+Math.cbrt(0.25));
        System.out.println("copySign(返回带有第二个浮点参数符号的第一个浮点参数):"+Math.copySign(0.25,0.75));
        System.out.println("atan2(将矩形坐标(x, y)转换成极坐标(r, theta)，返回所得角theta):"+Math.atan2(1,4));
        System.out.println("sinh(返回double值的双曲线正弦):"+Math.sinh(0.25));
        System.out.println("cosh(返回double值的双曲线余弦):"+Math.cosh(0.25));
        System.out.println("tanh(返回double值的双曲线余弦):"+Math.tanh(0.25));
        System.out.println("asin(返回一个值的反正弦；返回的角度范围在-pi/2到pi/2之间):"+Math.asin(0.25));
        System.out.println("acos(返回一个值的反余弦；返回的角度范围在0.0到pi之间):"+Math.acos(0.25));
        System.out.println("atan(返回一个值的反正切；返回的角度范围在-pi/2到pi/2之间):"+Math.atan(0.25));
    }
    //主类
    public static void main(String[] args){
        mathClassTest();
    }
}
