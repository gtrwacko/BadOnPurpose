package main;

import java.util.ArrayList;
import java.util.List;

public class Primary extends SuperHero {
	public void printList(List<Thing> things) {
		StuffDoer sd = getStuff();
		sd.print(things);
	}

	public static void main(String args[]) {
		printList(new ArrayList<Thing>(20));
	}
}
