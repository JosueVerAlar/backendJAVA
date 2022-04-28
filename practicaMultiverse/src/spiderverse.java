public class spiderverse {
    public static void main(String[] args) {
        testSpiderverse();
    }

    public static void testSpiderverse() {
        Silk silk = new Silk(
                1,
                "Tierra-616",
                "Cindy Moon",
                "Silk",
                "Female",
                "Black and silver with red details\n");
        Miles miles = new Miles(
                2,
                "Tierra-1610",
                "Miles Morales",
                "Spider-boy",
                "Male",
                "Black with red details\n");
        Benjamin benjamin = new Benjamin(
                3,
                "Tierra-8351",
                "Peter Benjamin Parker",
                "Spider-man",
                "Male",
                "Half red half black with a black spider\n");

        Runnable spiderverse = new Runnable() {
            Screen screen = new Screen();
            @Override
            public void run() {
                try {
                    //Cindy Moon ------------------------------------------------------
                    silk.showInfo();
                    silk.handToHand(screen);
                    Thread.sleep(1500);

                    silk.showInfo();
                    silk.shootSpiderWeb(screen);
                    Thread.sleep(1500);

                    silk.showInfo();
                    silk.superSpeed(screen);
                    Thread.sleep(1500);

                    silk.showInfo();
                    silk.reflexes(screen);
                    Thread.sleep(1500);

                    silk.showInfo();
                    silk.superStrength(screen);
                    Thread.sleep(1500);

                    //Miles morales ------------------------------------------------------
                    miles.showInfo();
                    miles.electricThreads(screen);
                    Thread.sleep(1500);

                    miles.showInfo();
                    miles.spiderSense(screen);
                    Thread.sleep(1500);

                    miles.showInfo();
                    miles.invisible(screen);
                    Thread.sleep(1500);

                    miles.showInfo();
                    miles.venomBlast(screen);
                    Thread.sleep(1500);

                    //Benjamin ------------------------------------------------------------
                    benjamin.showInfo();
                    benjamin.cureFactor(screen);
                    Thread.sleep(1500);

                    benjamin.showInfo();
                    benjamin.perfectBalance(screen);
                    Thread.sleep(1500);

                    benjamin.showInfo();
                    benjamin.spiderWebFluid(screen);
                    Thread.sleep(1500);

                    benjamin.showInfo();
                    benjamin.superAgility(screen);
                    Thread.sleep(1500);

                    benjamin.showInfo();
                    benjamin.superjump(screen);
                    Thread.sleep(1500);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        };
        Thread spiderVerse = new Thread(spiderverse);
        spiderVerse.start();
    }
}
