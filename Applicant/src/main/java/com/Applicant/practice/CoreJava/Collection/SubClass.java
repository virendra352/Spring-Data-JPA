package com.Applicant.practice.CoreJava.Collection;

class SuperClass
{
    void anyMethod() throws CarException
    {
        System.out.println("Super Class Method");
    }
}
public class SubClass extends SuperClass
{
    @Override
    void anyMethod() throws VehicleException
    {
        System.out.println("Sub CLass Method");
    }

    public static void main(String[] args) {
        SubClass testException = new SubClass();
        try
        {
            testException.anyMethod();
            System.out.println("Inside Try");
            return;
        }
        catch (Exception e)
        {
            System.out.println("Inside Catch");
            return;
        }
        finally
        {
            System.out.println("Inside Finaly");
        }
    }
}

class VehicleException extends RuntimeException {

    public VehicleException (String str)
    {
        System.out.println("Thrown Vehicle Exception For : "+str);
    }
}

class CarException extends VehicleException {
    public CarException (String str)
    {
        super(str);
        System.out.println("Thrown Car Exception For : "+str);
    }
}
