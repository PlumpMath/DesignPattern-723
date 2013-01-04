package de.tobi.designpattern.observer.push;

public class Zeitung
{
	private final String titel;

	public Zeitung(String pTitel)
	{
		titel = pTitel;
	}

	public String getTitel()
	{
		return titel;
	}
}
