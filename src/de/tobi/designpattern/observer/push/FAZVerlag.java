package de.tobi.designpattern.observer.push;

public class FAZVerlag extends AVerlag
{
	private Zeitung aktuelleZeitung;

	public void setAktuelleZeitung(Zeitung pAktuelleZeitung)
	{
		aktuelleZeitung = pAktuelleZeitung;
		verteileZeitung(aktuelleZeitung);
	}

	public Zeitung getAktuelleZeitung()
	{
		return aktuelleZeitung;
	}
}
