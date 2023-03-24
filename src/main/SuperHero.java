package main;

public class SuperHero {
	StuffDoer sd;

	public SuperHero(StuffDoer sd) {
		this.sd = sd;
	}

	public SuperHero() {
		this(null);
	}

	public void createStuff() {
		this.sd = new StuffDoer();
	}

	public StuffDoer getStuff() {
		return this.sd;
	}
}
