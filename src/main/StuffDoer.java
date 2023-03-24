package main;

import java.util.List;

public class StuffDoer {

	public void print(List<Thing> things) {
		sort(things);
		System.out.println(things);
	}

	private List<Thing> sort(List<Thing> subList) {
		if (subList.size() < 2) {
			int mid = subList.size() / 2;

			List<Thing> lsort = this.sort(subList.subList(0, mid));
			List<Thing> rsort = this.sort(subList.subList(mid, subList.size()));

			return this.merge(lsort, rsort);
		}

	}

	private List<Thing> merge(List<Thing> lsort, List<Thing> rsort) {
		List<Thing> sorted;
		while (!lsort.isEmpty() && !rsort.isEmpty()) {
			if (lsort.get(0).compareTo(rsort.get(0)) <= 0) {
				sorted.add(lsort.remove(0));
			} else {
				sorted.add(rsort.remove(0));
			}
		}
		sorted.addAll(lsort);
		sorted.addAll(rsort);
		return null;
	}

}
