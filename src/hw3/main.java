/**
 * CS 241: Data Structures and Algorithms II
 * Professor: Lini Mestar
 *
 * Programming Assignment #3
 *
 *
 */
package hw3;
import java.util.*;
public class main {
	public static void main(String[] args) {
		int number=1000000;
		long start,end;
		/*System.out.println("fsaf");
		ArrayList<String> Set = new ArrayList<String>();
		Set.add("jhk");
		System.out.println(Set.isEmpty() );
		Set<Integer> blah = new Seting<Integer>();
		start = System.currentTimeMillis();
		for (int i = 0; i < number; i++) blah.add(i);
		end = System.currentTimeMillis();
		System.out.print("Set time: " + (end - start) +"");
		start=0;end=0;
		HashSet<Integer> blah_java = new HashSet<Integer>();
		start = System.currentTimeMillis();
		for (int i = 0; i < number; i++) blah_java.add(i);
		end = System.currentTimeMillis();
		System.out.print("\nJAVA Set time: " + (end - start) +"\n");
		start=0;end=0;
		Map<Integer, String> mapy = new Maping<Integer, String>();
		start = System.currentTimeMillis();
		for (int i = 0; i < number; i++) mapy.add(i, null);
		end = System.currentTimeMillis();
		System.out.print("\nmapy time: " + (end - start) +"");
		start=0;end=0;
		HashMap<Integer, String> map_java = new HashMap<Integer, String>();
		start = System.currentTimeMillis();
		for (int i = 0; i < number; i++) map_java.put(i, null);
		end = System.currentTimeMillis();
		System.out.print("\nmapy time: " + (end - start) +"\n");
		*/
		Random rnd = new Random();
		Map<Integer, String> map = new Maping<Integer, String>();
		Set<Integer> set = new Seting<Integer>();
		start=0;end=0;
		long total = 0;
		long setfirsttime = System.currentTimeMillis();
		for (int a = 0; a < 100000; a++) {
			long setlasttime = System.currentTimeMillis();
			a = rnd.nextInt(100000);
			set.contains(a);
			total += (setlasttime - setfirsttime);
		}
		System.out.println("The time for the lookup option in the Set is: " + (total ));

		long time = 0;
		Random rd = new Random();

		long mapfirsttime = System.currentTimeMillis();
		for (int b = 0; b < 100000; b++) {
			long maplasttime = System.currentTimeMillis();
			map.get(rd.nextInt(100000));
			time += (maplasttime - mapfirsttime);
		}
		System.out.println("The time for the lookup option in the Map is: " + (time ));
	
	}
}
