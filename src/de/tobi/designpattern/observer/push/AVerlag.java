package de.tobi.designpattern.observer.push;

import java.util.ArrayList;

public abstract class AVerlag
{
	private ArrayList<IAbonnent> abonnentenList = new ArrayList<IAbonnent>();

	public void aboHinzufuegen(IAbonnent pIAbonnent)
	{
		abonnentenList.add(pIAbonnent);
	}

	public void aboEntfernen(IAbonnent pIAbonnent)
	{
		abonnentenList.remove(pIAbonnent);
	}

	protected void verteileZeitung(Zeitung pZeitung)
	{
		for (IAbonnent abonnent : abonnentenList)
		{
			abonnent.erhalteZeitung(pZeitung);
		}
	}
}