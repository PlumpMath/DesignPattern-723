package de.tobi.designpattern.observer.push;

class FirmaXY implements IAbonnent
{
	public void erhalteZeitung(Zeitung pZeitung)
	{
		System.out.println("Firma XY erhielt die aktuelle Zeitung: " + pZeitung.getTitel());
	}
}