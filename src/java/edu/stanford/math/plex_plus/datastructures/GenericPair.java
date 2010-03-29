package edu.stanford.math.plex_plus.datastructures;

import edu.stanford.math.plex_plus.utility.ExceptionUtility;

/**
 * This class implements a pair of elements.
 * 
 * @author Andrew Tausz
 *
 * @param <T> the type of the first component
 * @param <U> the type of the second component
 */
public class GenericPair<T, U> {
	protected final T first;
	protected final U second;
	
	public GenericPair(T first, U second) {
		ExceptionUtility.verifyNonNull(first);
		ExceptionUtility.verifyNonNull(second);
		this.first = first;
		this.second = second;
	}
	
	public GenericPair(GenericPair<T, U> pair) {
		ExceptionUtility.verifyNonNull(pair);
		this.first = pair.first;
		this.second = pair.second;
	}
	
	public T getFirst() {
		return this.first;
	}
	
	public U getSecond() {
		return this.second;
	}
	
	@Override
	public String toString() {
		return ("(" + first.toString() + ", " + second.toString() + ")");
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + ((second == null) ? 0 : second.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof GenericPair))
			return false;
		GenericPair<?,?> other = (GenericPair<?,?>) obj;
		if (first == null) {
			if (other.first != null)
				return false;
		} else if (!first.equals(other.first))
			return false;
		if (second == null) {
			if (other.second != null)
				return false;
		} else if (!second.equals(other.second))
			return false;
		return true;
	}
}
