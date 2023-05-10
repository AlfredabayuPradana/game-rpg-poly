public class App {
    public static void main(String[] args) {
        Character chara = new Character();
        Character hero = new Hero();
        Character enemy = new Enemy();
        Character fighter = new Fighter();
        Character witch = new Witch();

        chara.move();
        hero.move();
        ((Hero)hero).move("Tower");
        enemy.move();
        ((Enemy)enemy).move(12);
        fighter.move();
        witch.move();

        System.out.println("");
        System.out.println("=======Casting==========");
        System.out.println("");

        witch = (Fighter) fighter;
        witch.move();
    }
}