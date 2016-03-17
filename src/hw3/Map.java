/**
 * CS 241: Data Structures and Algorithms II
 * Professor: Lini Mestar
 *
 * Programming Assignment #3
 *
 *
 */
package hw3;

public interface Map<K,V> {
	  public void add(K key, V value);
	  public V remove(K key);
	  public V get(K key);
	  public int size();
	  public boolean isEmpty();
}