package oopsConcepts;
class Addum
{
	void add(int i, int j) 
	{
		int sum=i+j;
		System.out.println("Addition of two integer val "+i+" and "+j+" is "+sum);
	}
	void add(float i,float j)
	{
		float sum=i+j;
		System.out.println("Addition of two float val "+i+" and "+j+" is "+sum);
	}
	void add(double i,double j)
	{
		double sum=i+j;
		System.out.println("Addition of two double val "+i+" and "+j+" is "+sum);
	}
	void add(byte i,byte j)
	{
		byte sum=(byte)(i+j);
		System.out.println("Addition of two byte val "+i+" and "+j+" is "+sum);
	}
	void add(long i,long j)
	{
		long sum=i+j;
		System.out.println("Addition of two long val "+i+" and "+j+" is "+sum);
	}
	void add(short i,short j)
	{
		short sum=(short)(i+j);
		System.out.println("Addition of two byte val "+i+" and "+j+" is "+sum);
	}
	
}

public class Addition {

	public static void main(String[] args) 
	{
		Addum ob=new Addum();
		ob.add(450, 720);
		ob.add(76.4f, 65.6f);
        ob.add(76.4, 54.3);
        ob.add((byte)3, (byte)6);
        ob.add((short)97, (short)7);
        ob.add(183l,1540l);

        
	}

}
