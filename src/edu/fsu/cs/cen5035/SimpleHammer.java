package edu.fsu.cs.cen5035;

/**
 * @author Ameer
 */

public class SimpleHammer extends BasicWeapon implements Weapon {
	
	// set DAMAGE value for SimpleHammer
	public SimpleHammer() {
		super(35);
	}

	// getter method for DAMAGE
	@Override 
	public int hit() {
		return DAMAGE;
	}

	// damage done by SimpleHammer
	@Override
	public int hit(int armor) {
		int damage;
		if (armor >= 30) {
			damage = DAMAGE - armor;
		}
		else {
			// ignore armor points if armor < 30
			damage = DAMAGE;
		}
		return damage;
	}
}
