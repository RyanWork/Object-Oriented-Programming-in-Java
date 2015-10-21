/**
 * A class to represent complex numbers.
 * @author alan
 * @version jan 25
 */
public class Complex
{
    private double real, imag;

    public Complex()
    { 
        real = 0.0; 
        imag = 0.0; 
    }

    public Complex(double r)
    { 
        real = r; 
        imag = 0.0; 
    }

    public Complex(double r, double i)
    { 
        real = r; 
        imag = i; 
    }

    public double getReal()
    { 
        return real; 
    }

    public double getImag()
    { 
        return imag; 
    }

    public void setReal(double rp)
    {  
        real = rp; 
    }

    public void setImag(double ip)
    { 
        imag = ip;  
    }
    
    public boolean isEqual(Complex c)
    {
        if (this.real == c.real && this.imag == c.imag)
        {
            return true;
        }
        
        else{
            return false;
        }
        
    }
    
    /**
     * Plus version 1: sum = this + c
     * @param c a complex number, the input of the sum 
     * @param sum a complex number where the sum will be stored
     */
    public void plus1(Complex c, Complex sum)
    {
        sum.setReal(real + c.real);
        sum.setImag(imag + c.imag);
    }

    
    /**
     * Plus version 1: sum = this + c
     * @param a complex number c
     * @param a complex number sum where the sum will be stored
     */
    public void plus2(Complex c, Complex sum)
    {
        sum = new Complex();
        sum.setReal(real + c.real);
        sum.setImag(imag + c.imag);
    }


    /**
     * Plus v.3: return a  new complex which is the sum of this + c
     * @param a complex number c
     * @return the sum of this and c
     */
    public Complex plus3 (Complex c)
    {
        Complex sum = new Complex();

        sum.setReal(real+c.real);
        sum.setImag(imag+c.imag);

        return sum;
    }

    
    public String toString(){
        return real + " + i * "+ imag;
    }
    
}


 