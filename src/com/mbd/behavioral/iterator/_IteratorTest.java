package com.mbd.behavioral.iterator;

public class _IteratorTest {

	public static void main(String[] args) {

		ICollection<Album> myCollection = new AlbumCollection();
		IIterator<Album> it = myCollection.iterator();

		Album curr = null;
		while (it.hasNext()) {
			curr = it.next();
			System.out.println(curr.toString());
		}

	}

}
