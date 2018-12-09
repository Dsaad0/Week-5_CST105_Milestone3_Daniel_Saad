/* Program:  NFL Manager Class
  * File:     NFLManager.java
  * Summary:  NFL Manager class with properties and getters and setters
  * Author:   Daniel Saad
  * Date:     12/06/18
 */
import java.io.FileNotFoundException;
//Import java scanner
import java.util.Scanner;
import java.util.Arrays;

//Initiate NFL Player Class
import java.util.*;
public class NFLManager 
{
	//Initialize Array list for NFL Players
	static ArrayList<NFLPlayer> list = new ArrayList<NFLPlayer>();  
	//NFL Manager Constuctor
        public NFLManager(ArrayList<NFLPlayer> Teamlist) 
        {  
            createNFLPlayers(); 
            Teamlist = list;
        }
        
        //Create NFL Players Method
        private static void createNFLPlayers() 
        {  
            NFLPlayer Brown = new NFLPlayer("John Brown", "Denver Broncos", "QB", 40, 76, 70, 290, 10, 550, 10);
            NFLPlayer Saad = new NFLPlayer("Daniel Saad", "LA Rams", "Running Back", 35, 80, 54, 205, 6, 399, 5);
            NFLPlayer Brees = new NFLPlayer("Drew Brees", "Steelers", "Wide Reciever", 25, 68, 45, 230, 7, 450, 7);
            NFLPlayer Curry = new NFLPlayer("Stephen Curru", "Seahawks", "Center", 35, 74, 49, 245, 6, 499, 8);
            NFLPlayer Lange = new NFLPlayer("David Lange", "Penguins", "Right Gaurd", 23, 84, 55, 300, 5, 599, 6);
            NFLPlayer Johnson = new NFLPlayer("Jerry Johnson", "Patriots", "Left Gaurd", 22, 79, 45, 299, 4, 375, 4);
            list.add(Brown);
            list.add(Saad);
            list.add(Brees);
            list.add(Curry);
            list.add(Lange);
            list.add(Johnson);
        }
        //To String method
        public String toString() 
        { 
            String teamList = list.toString();
            return teamList;
	}
        //Driver Method for testing
	public static void Driver() 
        {
            { 
		NFLManager NFLManager = new NFLManager(list);
		System.out.println( (list.get(0)).getPlayerAge() ); 
		(list.get(0)).setPlayerAge(25); 
		System.out.println( (list.get(2)).getPlayerAge() ); 
		System.out.println( (list.get(0)).getPlayerPosition() ); 
		System.out.println( (list.get(5)).getPlayersAverageYards() );  
            }
        }
        //Main Method call Driver
        public static void main(String[] args) 
        {
            Driver();
        }
}
