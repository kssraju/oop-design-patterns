package com.mbd.behavioral.iterator;

public class AlbumCollection implements ICollection<Album> {

	private Album[] myAlbumCollection = {
			new Album("Pink Floyd", "The Dark Side of the Moon", 1973),
			new Album("Eagles", "Their Greatest Hits (1971–1975)", 1976),
			new Album("Fleetwood Mac", "Rumours", 1977),
			new Album("Bee Gees", "Saturday Night Fever", 1977),
			new Album("AC/DC", "Back in Black", 1980),
			new Album("Michael Jackson", "Thriller", 1982),
			new Album("Whitney Houston", "The Bodyguard", 1992),

	};

	@Override
	public IIterator<Album> iterator() {
		return new AlbumIterator();
	}

	private class AlbumIterator implements IIterator<Album> {

		private int index = 0;

		@Override
		public boolean hasNext() {
			return this.index < myAlbumCollection.length;
		}

		@Override
		public Album next() {
			if (this.index < myAlbumCollection.length) {
				//returns the album and increases current index by 1
				return myAlbumCollection[this.index ++];
			}
			return null;
		}
	}
}
