package de.tobi.designpattern.observer.push;

public class Beispielclient
{
	public static void main(String[] args)
	{
		FamilieFischer ff = new FamilieFischer();
		FamilieMeier fm = new FamilieMeier();
		FirmaXY firma = new FirmaXY();		
	
		FAZVerlag verlag = new FAZVerlag();

		verlag.aboHinzufuegen(ff);
		verlag.aboHinzufuegen(fm);
		verlag.aboHinzufuegen(firma);
		verlag.setAktuelleZeitung(new Zeitung("Skandal!"));

		verlag.aboEntfernen(ff);	
		verlag.setAktuelleZeitung(new Zeitung("Doch alles halb so wild!"));
	}
}
