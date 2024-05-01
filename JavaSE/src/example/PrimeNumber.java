package example;

public class PrimeNumber {
    int num;

    public PrimeNumber(int num) {
        this.num = num;
    }

    public PrimeNumber() {
    }

    public void primeNumberCheck(int num){
        boolean control = false;
        if(num > 2){
        for (int i = 2; i <= num/2; i++){
            if (num%i == 0){
                control = true;
                break;
            }
        }
            if(control == true){
                System.out.println(num + " sayisi asal sayı değildir.");
            }else{
                System.out.println(num + " sayisi asal sayıdır.");
            }

        }else{
            System.out.println("Lütfen geçerli bir değer giriniz.");

        }

    }



}
