package main;

/**
 * Created by Do Minh Toan on 6/4/2016.
 */
public class Adder {
    public	Object	add(Number	a,	Number	b)	{
        return	a.doubleValue()+b.doubleValue();
    }

    public	Object	add(String	a,	String	b)	{
        return	a+b;
    }
}
