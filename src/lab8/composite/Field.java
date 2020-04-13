package lab8.composite;
import java.util.HashSet;
import java.util.Iterator;

import lab8.Plant;

public class Field implements Plant {
   private HashSet<Plant> p;
   public Field()
   {
	   p=new HashSet<Plant>();
   }
   public void add(Plant e)
   {
	   p.add(e);
   }
   public void remove(Plant e)
   {
	   p.remove(e);
   }
	@Override
	public double getOxigenAmountPerYear() {
	   Iterator<Plant> it=p.iterator();
	   double s=0;
	   while(it.hasNext())
	   {
		   Plant e=it.next();
		   s+=e.getOxigenAmountPerYear();
	   }
		return s;
	}

	@Override
	public int getLifeTime() {
		// TODO Auto-generated method stub
		int max=0;
		Iterator<Plant> it=p.iterator();
		while(it.hasNext())
		{
			Plant e=it.next();
			if (e.getLifeTime()>max)
			{
				max=e.getLifeTime();
			}
		}
		return max;
	}

	@Override
	public String getRepresentation() {
		// TODO Auto-generated method stub
		String S="[";
		Iterator<Plant> it=p.iterator();
		while(it.hasNext())
		{
		  Plant e=it.next();
		  S=S+e.getRepresentation();
		  S=S+",";
		}
		S=S.substring(0,S.length()-1);
		S=S+"]";
		return S;
	}
  
   
   
}
