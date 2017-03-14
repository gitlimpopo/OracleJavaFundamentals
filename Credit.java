
public class Credit {
    private int sumaCredita;
    private double procent;
    private int srok;

    public void credit(){
        for(int i = 0; i < srok; i++){
            double sumaMonth = sumaCredita/srok;
            double procentMoth = (sumaMonth*procent)/100;
            System.out.println("Сума платежа в месяц : " + sumaMonth + " Сума процентов в месяц : " + procentMoth);
        }
        System.out.println("Прцентов за срок кредитования :" + (sumaCredita*procent)/100);
    }

    public Credit(int sumaCredita, double procent, int srok) {
        this.sumaCredita = sumaCredita;
        this.procent = procent;
        this.srok = srok;
    }
}
