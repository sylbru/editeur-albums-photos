package interfaceUtilisateur;

import structure.*;
import java.awt.*;
import javax.swing.*;

public class EditeurAlbums
{
	public static FenetrePrincipale F;
	public static Album sAlbum;
	
	public static void main(String[] args)
	{
		// Point d’entrée
		F = new FenetrePrincipale();
		sAlbum = new Album();
	}

}