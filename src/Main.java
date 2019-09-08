public class Main {



        public static void main(String[] args) {
            // System.out.println("Hello World!");

            Boss boss = new Boss();
            boss.setHealth(700);
            boss.setHits(40);
            boss.setDeffens(50);

            Warior warior = new Warior();
            warior.setHealth(700);
            warior.setHits(40);
            warior.setSuperatak(50);

            Magical mag = new Magical();
            mag.setHealth(700);
            mag.setHits(40);
            mag.setSuperatak(50);

            Mental ment = new Mental();
            ment.setHealth(700);
            ment.setHits(40);
            ment.setSupperattak(50);
            ment.setSupperattak(50);



            System.out.println("The Game");
            System.out.println("Boss health = " + boss.getHealth() +
                    "; " + "Boss Hits" + boss.getHits()+ ".");
            System.out.println("Применено способность супер удар" + "Warior health =" + warior.getHealth() +
                    ";" + "Warior Hits=" + warior.getHealth() + ".");
            System.out.println("Применено способность  волшебное палачка" + "Magical health = " + mag.getHealth() +
                    ";" + "Magical hits" + mag.getHealth() + ".") ;
            System.out.println("Применено способность мошный удар" + "Mental health = " + mag.getHealth() +
                    ";" + "Mental hits = " + mag.getHealth());
            System.out.println("");






        }
    }

