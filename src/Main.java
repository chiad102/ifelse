public class Main {
    public static void main(String[] args) {
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать.");
        }


        int t = 5;
        if (t >= 5) {
            System.out.println("На улице " + t + " градусов. Можно идти без шапки.");
        } else {
            System.out.println("На улице " + t + " градусов. Нужно надеть шапку.");
        }


        int speed = 60;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно.");
        }


        int humanAge = 18;
        if ((humanAge >= 2) && (humanAge <= 6)) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в детский сад.");
        } else {
            if ((humanAge >= 7) && (humanAge <= 18)) {
                System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в школу");
            } else {
                if ((humanAge > 18) && (humanAge <= 24)) {
                    System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в университет");
                } else {
                    if (humanAge > 24) {
                        System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить на работу.");
                    }
                }
            }
        }


        int ageControl = 15;
        if (ageControl < 5) {
            System.out.println("Если возраст ребенка равен " + ageControl + ", то ему нельзя кататься на аттракционе.");
        } else {
            if ((ageControl >= 5) && (ageControl < 14)) {
                System.out.println("Если возраст ребенка равен " + ageControl + ", то ему можно кататься на аттракционе в сопровождении.");
            } else {
                if (ageControl >= 14) {
                    System.out.println("Если возраст ребенка равен " + ageControl + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
                }
            }
        }

        int sittingPlace = 60;
        int allPlace = 102;
        int standingPlace = allPlace - sittingPlace;
        int busySittingPlace = 34;
        int busyStandingPlace = 42;
        if ((sittingPlace > busySittingPlace) && (standingPlace > busyStandingPlace)) {
            System.out.println("В вагоне есть свободные сидячие и стоячие места." + (sittingPlace -busySittingPlace) + " сидячих места и " + (standingPlace - busyStandingPlace) + " стоячих.");
        } else {
            if ((sittingPlace > busySittingPlace) && (standingPlace == busyStandingPlace)) {
                System.out.println("В вагоне остались только " + (sittingPlace - busySittingPlace) + " сидячиx мест.");
            } else {
                if ((sittingPlace == busySittingPlace) && (standingPlace > busyStandingPlace)) {
                    System.out.println("В вагоне остались только " + (standingPlace - busySittingPlace) + " стоячих мест.");
                } else {
                    System.out.println("В вагоне нет мест!");
                }
            }
        }

        int one = 28;
        int two = 28;
        int three = 9;
        if ((one > two) && (one > three)) {
            System.out.println("Наибольшее число " + one);
        } else {
            if ((two > one) && (two > three)) {
                System.out.println("Наибольшее число " + two);
            } else {
                if ((three > one) && (three > two)) {
                    System.out.println("Наибольшее число " + three);
                } else {
                    System.out.println("Найдено два или более одинаковых числа.");
                }
            }
        }

    }
}