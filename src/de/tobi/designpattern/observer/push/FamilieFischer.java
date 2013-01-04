package de.tobi.designpattern.observer.push;

class FamilieFischer implements IAbonnent
{
	public void erhalteZeitung(Zeitung pZeitung)
	{
		System.out.println("Familie Fischer erhielt die aktuelle Zeitung: "	+ pZeitung.getTitel());
	}
}
