package abstraction.saturdaypractice;

public class Player {

    // CHARACTER NAME MUST BE BETWEEN 4 and 100 CHARACTERS in LENGTH
    private String characterName;
    private Weapon currentWeapon;

    private int health;

    public Player(String characterName) {

        if(characterName.length() > 100 || characterName.length() < 4) {
            throw new IllegalArgumentException("Character name must be between 4 and 100 characters");
        }

        this.characterName = characterName;
        health = 100;

    }

    public static void main(String[] args) {

        // CREATED NEW PLAYER SHY
        Player currentPlayer = new Player("Current Player");
        Player deShawn = new Player("DeShawn");
        Player armani = new Player("Armani");
        // SET CURRENT WEAPON TO SWORD
        currentPlayer.setCurrentWeapon(new Sword());
        // CALLED useWeapon METHOD
        currentPlayer.useWeapon();


        deShawn.setCurrentWeapon(new Bow());
        deShawn.useWeapon();

        armani.setCurrentWeapon(new Wand());
        armani.useWeapon();

        currentPlayer.setCurrentWeapon(new Wand());
        currentPlayer.useWeapon();

        currentPlayer.setCurrentWeapon(new Dagger());
        currentPlayer.useWeapon();

        currentPlayer.setCurrentWeapon(new Club());
        currentPlayer.useWeapon();

        currentPlayer.setCurrentWeapon(new Bow());
        currentPlayer.useWeapon();


    } // TODO:END OF MAIN


    // THIS CODE WAS DUPLICATED SO WE PUT IT IN A METHOD
    private void useWeapon() {
        System.out.println(this.getCharacterName() + " attacks with a " + this.getCurrentWeapon().getClass().getSimpleName() + " and it does " + this.getCurrentWeapon().getDamage() + " damage");

    }

    //ACCESSORS

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(Weapon currentWeapon) {
        this.currentWeapon = currentWeapon;
    }
}


// This is a problem. Consider if we had 50 different types of weapons and the player
// can only ever use one them at a time
//    private Sword currentSword;
//    // Additional Weapons
//    private Club currentClub;
//    private Dagger currentDagger;
//    private Wand currentWant;
//    private Bow currentBow;