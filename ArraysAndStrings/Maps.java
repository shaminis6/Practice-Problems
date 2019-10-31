package ArraysAndStrings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set=new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		Iterator<Integer> it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "shamini");
		map.put(2,"swathi");
		
		
		
		for(Map.Entry mp :  map.entrySet())
		{
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		
		

	}

}
