/**
 * CS 241: Data Structures and Algorithms II
 * Professor: Lini Mestar
 *
 * Programming Assignment #3
 *
 *
 */
package hw3;

import java.util.ArrayList;

class Maping <K,V> implements Map<K,V>{
	ArrayList<K> keys = new ArrayList<K>();
	ArrayList<V> values = new ArrayList<V>();

	public void add(K key, V value) {
		if(keys.contains(key)==false) {
			keys.add(key);
			values.add(value);
		}
	}//add(K key, V value)

	public V remove(K key) {
		V tmp = null;
		if(keys.contains(key)==true){
			tmp=values.get(keys.indexOf(key));
			values.remove(keys.indexOf(key));
		}
		return tmp;
	}//remove(K key)

	public V get(K key) {
		if(keys.contains(key)==true) {
			return values.get(keys.indexOf(key));
		}
		return null;
	}//get(K key) 

	public int size() {
		return keys.size();
	}//size()

	public boolean isEmpty() {
		return keys.isEmpty();
	}//isEmpty()

}
