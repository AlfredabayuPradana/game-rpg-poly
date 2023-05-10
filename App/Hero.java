public class Hero extends Character {
    public void move(){
        System.out.println("Hero bergerak");
    }
    public void move(String dir){
        System.out.println("Hero bergerak sampai "+ dir);
    }
}