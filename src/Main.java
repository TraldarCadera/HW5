public class Main {
    public static void main(String[] args) {
        Workers[] persArr = new Workers[5]; // Создаем товарищей во славу коммунизма
        persArr[0] = new Workers("Ulianov Vladimir", "Chairman", "true_lenin@ckkpss.ua", "89999851235", 30000, 30);
        persArr[1] = new Workers("Dzhugashvili Josef", "Generalisimuss", "stalin_the_ruler@ussr.ur", "89035212131", 45000, 43);
        persArr[2] = new Workers("Trockiy Lev", "Commisar", "lev_my_commrade@rsfsr.ru", "89345678512", 29000, 25);
        persArr[3] = new Workers("Grozniy Ivan", "Tzar", "ivan_the_terrible@russ.ru", "84952356951", 12000, 64);
        persArr[4] = new Workers("Gagarin Yuri", "Pilot", "poehali@vverh.go", "84993566503", 35000, 51);


        System.out.println(persArr[1].getFullName());   //Вызываем геттеры
        System.out.println(persArr[1].getPosition());
        System.out.println(persArr[1].getEmail());

        for (int i = 0; i < persArr.length; i++) {  //Цикл для распечатки сотрудников старше 40 лет
            if (persArr[i].getAge() > 40) {
                System.out.println(persArr[i]);
            }
        }
    }
}



