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
class Seting<V> implements Set<V>{
	ArrayList<V> obj = new ArrayList<V>();
	public void add(V string) {
		if(obj.contains(string)==false) obj.add(string);
		//else System.out.print("0"); //the element is there already
	}

	public void remove(V value) {
		if(obj.contains(value)==true) obj.remove(value);
		//else System.out.print("1"); //the element is not there
	}//remove(V value)

	public boolean contains(V value) {
		return obj.contains(value);
	}//contains(V value)

	public int size() {
		return obj.size();
	}//size()

	public boolean isEmpty() {
		return obj.isEmpty();
	}//isEmpty()

}
