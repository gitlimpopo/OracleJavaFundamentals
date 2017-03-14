
public class Main {

    public static int typeInt = 10554555;
    public static long typeLong = 337777887;
    public static short typeShort = 32767;
    public static byte typeByte = 127;
    public static double typeDouble = 3.1416;
    public static float typeFloat = (float)3.14;
    public static boolean typeBoolean = false;

    public static void main(String []args){
        //Task1
        int typeInt = 98555452;
        long typeLong = 215478555;
        short typeShort = 32754;
        byte typeByte = 127;
        double typeDouble = 1.25478;
        float typeFloat =(float)1.5;
        boolean typeBoolean = true;

        System.out.println("Start programm " + '\n');
        System.out.println("Type int : " + typeInt);
        System.out.println("Type long : " + typeLong);
        System.out.println("Type short : " + typeShort);
        System.out.println("Type byte : " + typeByte);
        System.out.println("Type double : " + typeDouble);
        System.out.println("Type float : " + typeFloat);
        System.out.println("Type boolean : " + typeBoolean);
        System.out.println();

        System.out.println("Type int i class : " + Main.typeInt);
        System.out.println("Type long in class : " + Main.typeLong);
        System.out.println("Type short in class : " + Main.typeShort);
        System.out.println("Type byte in class : " + Main.typeByte);
        System.out.println("Type double in class : " + Main.typeDouble);
        System.out.println("Type float in class : " + Main.typeFloat);
        System.out.println("Type boolean in class : " + Main.typeBoolean);
        //Task2
        float fl = (float)1.;
        float fl1 = (float)1;
        float fl2 = (float)0x1;
        float fl3 = (float)0b1;
        float fl4 = (float)1.0e1;
        float fl5 = (float)01;

        //Task3
        short sh = 1 + 2;
        short sh1 = (short)(1.5 + 1);
        short sh2 = (short)(1.5f + 1);
        short sh3 = (short)((byte)12 + (short)5);
        short sh4 = (short)(1.24f + 3.1416);


        //Task4

        int catet1 = 3;
        int catet2 = 4;
        int gipotenyza = 5;
        boolean pifagor = ((catet1*catet1)+(catet2*catet2))==(gipotenyza*gipotenyza) ? true : false;
        System.out.println("Прямоугольный треугольник или нет ? " + pifagor);

        //Task5
        int suma = 0;
        for(int i = 1 ; i <= 20 ; i++){
            suma+=i;
        }
        System.out.println("суммa целых чисел от 1 до 20 : " + suma);

        //Task6
        suma = 0;
        for(int i = 1; i < 20 ; i++){
            if(i%2 == 0){
                suma+=i;
            }
        }
        System.out.println("суммa четных целых цисел от 1 до 20 : " + suma);

        //Task7
        suma = 0;
        for(int i = 1 ; i < 20 ; i++){
            if(i/1==i && i/i==1 && i%2!=0 && i%3!=0){
                suma+=i;
            }
        }
        System.out.println("суммa простых чисел в диапазоне от 1 до 20 :" + suma);

        //Task8
         int a = 2 ,b = 2 ,c = 4;
        System.out.println((a+b) == c);

        //Task9
        suma = 0;
        int counter = 0;
        a = 100;
        b = 9;
        for (int i=a; i > b; i--){
            suma+=i;
            counter++;
        }
        System.out.println("Среднее арифметическое " + (suma/counter));

        //Task10
        System.out.println();
        Credit cred = new Credit(1000,30,5);
        cred.credit();

    }
}
