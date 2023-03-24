package main;

public class Thing implements Comparable<Thing> {

	Integer name;

	@Override
	public int compareTo(Thing o) {
		return 0;
	}

}
