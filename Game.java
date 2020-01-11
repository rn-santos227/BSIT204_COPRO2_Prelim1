import java.util.Scanner;
import java.util.Random;

class Pokemon {
	private String name;
	private int health;
	private int damage;
	
	public Pokemon(String name, int health, int damage) {
		this.name = name;
		this.health = health;
		this.damage = damage;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public int getDamage() {
		return this.damage;
	}
		
	public void setHealth(int health) {
		this.health = health;
	}
	
	public void setDamage(int damage) {
		this.damage = damage;
	}	
}

class Test {
	public static void main(String[] args) {
		Random rand = new Random();
		
		Pokemon[] enemies = {
			new Pokemon("Squirtle", 100, 0), 
			new Pokemon("Bulbasaur", 300, 0), 
			new Pokemon("Charmander", 500, 0), 
			new Pokemon("Metapod", 1000, 0), 
		};
		Pokemon player = new Pokemon("Pikachu", 100, 0);
		
		while(enemy.getHealth() > 0 && player.getHealth() > 0) {
			System.out.println(player.getName() + "'s Health: " + player.getHealth());
			System.out.println(enemy.getName() + "'s Health: " + enemy.getHealth());
			char command = getCommand();
			player.setDamage(computeDamage(command));
			enemy.setHealth(enemy.getHealth() - player.getDamage());
			
			System.out.println(enemy.getName() + " recieved " +  player.getDamage() + " damage.");
			
			char e_command = "abcd".charAt(rand.nextInt(3));			
			enemy.setDamage(computeDamage(e_command));
			player.setHealth(player.getHealth() - enemy.getDamage());
			System.out.println(player.getName() + " recieved " +  enemy.getDamage() + " damage.");	
		}
		
			
		String fainted = player.getHealth() > 0 ? enemy.getName() : player.getName();
		System.out.println(fainted + " has fainted");
	}
	
	public static char getCommand() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose Move");
		System.out.println("A. Thunderbolt");
		System.out.println("B. Tackle");
		System.out.print("Choose: ");
		return scan.nextLine().charAt(0);
	}
	
	public static int computeDamage(char move) {
		switch(move) {
			case 'A': case 'a': return 30;
			case 'B': case 'b': return 20;
			case 'C': case 'c': return 15;
			case 'D': case 'd': return 10;
			default: return 0;
		}
	}
}

