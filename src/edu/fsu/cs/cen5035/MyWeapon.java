package edu.fsu.cs.cen5035;

/**
 * @author Ameer
 */

public class MyWeapon extends BasicWeapon implements Weapon {

	// set DAMAGE value for MyWeapon
	public MyWeapon() {
		super(60);
	}

	// getter method for DAMAGE
	@Override 
	public int hit() {
		return DAMAGE;
	}

	// damage done by MyWeapon
	@Override 
	public int hit(int armor) {
		
		// if armor can not counter at least half hit value,
		// make armor half the DAMAGE value
		if (armor < DAMAGE/2) {
			armor = DAMAGE/2;
		}
		
		int damage = DAMAGE - armor; 
		return damage;
	}
}
