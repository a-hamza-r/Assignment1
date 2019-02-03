package edu.fsu.cs.cen5035;

import java.util.Random;

/** 
 * @author Ameer
 */

public class CrazyRandomSword extends BasicWeapon implements Weapon {
	
	// set DAMAGE value for CrazyRandomSword
	public CrazyRandomSword() {
		super((new Random()).nextInt(96)+4);		
	}

	// getter method for DAMAGE
	@Override
	public int hit() {
		return DAMAGE;
	}

	// damage done by CrazyRandomSword
	@Override
	public int hit (int armor) {
		
		int maxArmorToIgnore = (int) armor/3;

		Random rand = new Random();
		int randNum = rand.nextInt(maxArmorToIgnore-2)+3;
		
		System.out.println("rand num is " + randNum);		
		// the value 'randNum' ignored from armor
		int damage = DAMAGE - (armor - randNum);
		return damage;
	}
}
