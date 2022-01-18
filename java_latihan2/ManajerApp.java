public class ManajerApp {
    public static void main(String[] args) {
        var manajer = new Manajer("eka","hha");
        manajer.name = "Eko";
        manajer.sayHallo("ujang");

        var vp = new VicePresident();
        vp.name = "joko";
        vp.sayHallo("Eko");
    }
}
