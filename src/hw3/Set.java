/**
 * CS 241: Data Structures and Algorithms II
 * Professor: Lini Mestar
 *
 * Programming Assignment #3
 *
 *
 */
package hw3;

public interface Set<V> {
	  public void add(V value);
	  public void remove(V value);
	  public boolean contains(V value);
	  public int size();
	  public boolean isEmpty();
	}
