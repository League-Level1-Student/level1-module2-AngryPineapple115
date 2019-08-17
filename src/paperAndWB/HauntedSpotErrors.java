package paperAndWB;

public class HauntedSpotErrors {

	class HauntedHouse 
	 
    int skeletons; 
    int name; 

    void HauntedHouse(String name, int skeletons) { 
        name = name; 
        skeletons = skeletons; 
    } 

    void doScaryStuff(int pumpkins, String scaryPhrase) { 
        System.out.println(pumpkins  + “ pumpkins say “ + scaryPhrase) 
    } 

    void isSpooky() { 
        //Haunted houses are spooky! 
        return true;  
    } 

    { 
        HauntedHouse h =  HauntedHouse(105, SpookyZone); 
        HauntedHouse.doScaryStuff(“Boo!”, “1000000”); 
        HauntedHouse.isSpooky(666); 
    }

}
