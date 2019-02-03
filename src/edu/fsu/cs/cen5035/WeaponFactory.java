package edu.fsu.cs.cen5035;

/**
 *
 * @author Javier
 */
public class WeaponFactory {

    public static Weapon getWeapon(String type) {
        switch (type) {
            case "sword":
                return new Sword();
            case "spear":
            	return new Spear();
	    case "hammer":
		return new SimpleHammer();
	    case "crazysword":
		return new CrazyRandomSword();
	    case "myweapon":
		return new MyWeapon();
            default:
                throw new IllegalArgumentException("Invalid type");
        }
    }

}
