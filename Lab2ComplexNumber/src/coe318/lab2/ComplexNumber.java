package coe318.lab2;

/**
 * ComplexNumber models a complex number expressed in rectangular form (real and
 * imaginary parts). It is an <em>immutable</em> object.
 *
 * @author Alvi Alam
 */
public class ComplexNumber {
//Instance variable declarations
    private double real;//Real component of complex number
    private double imaginary;//Imaginary component of complex number
    
    /**
     * Construct a ComplexNumber given its real and imaginary parts.
     *
     * @param re The real component
     * @param im The imaginary component
     */
    public ComplexNumber(double re, double im) {
    //Initialize the instance variables
    this.real=re;
    this.imaginary=im;
    }

    /**
     * Returns the real component.
     *
     * @return the real
     */
    public double getReal() {
        return real;	//A stub: to be fixed
    }

    /**
     * Returns the imaginary component.
     *
     * @return the imaginary
     */
    public double getImaginary() {
        return imaginary;	//A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber number that is the negative of <em>this</em>.
     * Note: the original ComplexNumber is <b>NOT</b>
     * modified.
     *
     * @return -this
     */
    public ComplexNumber negate() {
        ComplexNumber neg = new ComplexNumber(-this.getReal(),-this.getImaginary());//(x+yi)=(-x-yi)
        return neg; //A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is the sum of <em>this</em>	and
     * <em>z</em>. Note: the	original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this + z
     */
    public ComplexNumber add(ComplexNumber z) {
        ComplexNumber addComNum = new ComplexNumber(this.getReal()+z.getReal(),this.getImaginary()+z.getImaginary());//(x1+y1i)+(x2+y2i)=(x1+x2,y1i+y2i)
        return addComNum;	//A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is the difference of <em>this</em>	and
     * <em>z</em>. Note: the	original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this + z
     */
    public ComplexNumber subtract(ComplexNumber z) {
        ComplexNumber subComNum = new ComplexNumber(this.getReal()-z.getReal(),this.getImaginary()-z.getImaginary());//(x1+y1i)-(x2+y2i)=(x1-x2,y1i-y2i)
        return subComNum;	//A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is the product of <em>this</em> and
     * <em>z</em>. Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this * z
     */
    public ComplexNumber multiply(ComplexNumber z) {
        ComplexNumber multComNum = new ComplexNumber((this.getReal()*z.getReal()-this.getImaginary()*z.getImaginary()),(this.getReal()*z.getImaginary()+z.getReal()*this.getImaginary()));//(x1+y1i)*(x2+y2i)=(x1*x2-y1i*y2i,x1*y2i+x2*y1i)
        return multComNum;	//A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is the reciprocal of <em>this</em>.
     * Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @return 1.0 / this
     */
    public ComplexNumber reciprocal() {
        ComplexNumber one = new ComplexNumber(1,0);
        ComplexNumber recipComNum = one.divide(this);//(x+yi)=1/(x+yi) using the divide method
        return recipComNum;	//A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is
     * <em>this</em> divided by <em>z</em>. Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this / z
     */
    public ComplexNumber divide(ComplexNumber z) {
        ComplexNumber conjugate = new ComplexNumber(z.getReal(),-z.getImaginary());//((x1+y1i)/(x2+y2i))*((x2-y2i)/(x2-y2i))
        ComplexNumber numer = this.multiply(conjugate);
        ComplexNumber denom = z.multiply(conjugate);
        ComplexNumber divComNum = new ComplexNumber(numer.getReal()/denom.getReal(),numer.getImaginary()/denom.getReal());
        return divComNum;	//A stub: to be fixed
    }

    /**
     * Returns a String representation of
     * <em>this</em> in the format:
     * <pre>
     *	real +-(optional) i imaginary
     * </pre> If the imaginary part is zero, only the real part is converted to
     * a String. A "+" or "-" is placed between the real and imaginary parts
     * depending on the the sign of the imagrinary part.
     * <p>
     * Examples:
     * <pre>
     *	..println(new ComplexNumber(0,0); -> "0.0"
     *	..println(new ComplexNumber(1,1); -> "1.0 + i1.0"
     *	..println(new ComplexNumber(1,-1); -> "1.0 - i1.0"
     * </pre>
     *
     * @return the String representation.
     */
    @Override
    public String toString() {
//DO NOT MODIFY THIS CODE!
        String str = "" + this.getReal();
        if (this.getImaginary() == 0.0) {
            return str;
        }
        if (this.getImaginary() > 0) {
            return str + " + i" + this.getImaginary();
        } else {
            return str + " - i" + -this.getImaginary();
        }
    }
}


