package lab8.composite;

import java.util.Iterator;
import java.util.ArrayList;
import lab8.Plant;

public class Forest implements Plant{
	 private ArrayList <Plant> list;
	   public Forest() {
		   list=new ArrayList <Plant>();
	   }
	   public void add (Plant e) {
		   list.add(e);
	   }
	   public void remove(Plant e) {
		   list.remove(e);
	   }
	   
	@Override
	public double getOxigenAmountPerYear() {
		// TODO Auto-generated method stub
		double s=0;
		Iterator<Plant> it=list.iterator();
		while (it.hasNext())
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
		Iterator<Plant> it=list.iterator();
		while(it.hasNext())
		{
			Plant e=it.next();
			if(e.getLifeTime()>max)
				max=e.getLifeTime();
		}
		return max;
	}
	@Override
	public String getRepresentation() {
		// TODO Auto-generated method stub
		String S="{";
		Iterator<Plant> it=list.iterator();
		while(it.hasNext())
		{
			Plant e=it.next();
			S=S+e.getRepresentation();
			S=S+',';
		}
		S=S.substring(0,S.length()-1);
		S=S+"}";
		return S;
	};
	  
	   
}
