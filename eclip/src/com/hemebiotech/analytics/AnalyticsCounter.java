package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {
		
		//objet reader sur le fichier d'entrée
		ReadSymptomDataFromFile myReader = new ReadSymptomDataFromFile("symptoms.txt");
		
		//1. list l'ensemble des données de symptome dans la source (le fichier) et les met dans une liste Java
		List<String> listSymptoms = myReader.GetSymptoms();
		
		//2. Ce traitement retourne une map avec pour chaque symptome son nombre d'occurance dans un ordre alphabétique
		Map<String, Integer> mySymptomsOccrrenceMap = myReader.nbSymtomFromJavaList(listSymptoms);
		
		
		//4. Ecrire le dictionnaire des symptomes et les occurrence dans un fichioer de sortie
		
		myReader.writeDictionaryFile(mySymptomsOccrrenceMap, "result.txt");
		
	 
	}

}
