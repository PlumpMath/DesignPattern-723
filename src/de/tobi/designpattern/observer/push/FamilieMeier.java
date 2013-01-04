package de.tobi.designpattern.observer.push;

class FamilieMeier implements IAbonnent
{
	public void erhalteZeitung(Zeitung pZeitung)
	{
		System.out.println("Familie Meier erhielt die aktuelle Zeitung: " + pZeitung.getTitel());
	}
}
