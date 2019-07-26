

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class SetHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Map<Integer, Teams> hashmap = new HashMap<Integer, Teams>();
		Hashtable<Integer,Teams> hashmap=new Hashtable<Integer,Teams>();  

		Teams teams1 = new Teams(1, "Seahawks", "Seattle");
		Teams teams2 = new Teams(2, "Panthers", "Carolina");
		Teams teams3 = new Teams(3, "Falcons", "Atlanta");
		
		hashmap.put(teams1.getId(), teams1);
		hashmap.put(teams2.getId(), teams2);
		hashmap.put(teams3.getId(), teams3);
		
		Set<Map.Entry<Integer, Teams>> entries = hashmap.entrySet();
		for(Map.Entry<Integer, Teams> teams : entries) {
			System.out.println(teams.getKey());
			Teams team = teams.getValue();
			System.out.println(teams.getValue());
			//team.toString();
		}

		System.out.println("Done");
	}

}
