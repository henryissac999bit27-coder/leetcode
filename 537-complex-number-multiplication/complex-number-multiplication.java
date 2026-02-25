class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        String[] a=num1.split("\\+|i");
        String[] b=num2.split("\\+|i");
        int areal=Integer.parseInt(a[0]);
        int aimg=Integer.parseInt(a[1]);
        int breal=Integer.parseInt(b[0]);
        int bimg=Integer.parseInt(b[1]);
        int realpart=(areal*breal)-(aimg*bimg);
        int imgpart=(areal*bimg)+(aimg*breal);
        return realpart+"+"+imgpart+"i";
    }
}