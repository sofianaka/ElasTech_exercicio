package aula08;

public class Utilidades {

    public static void  nome (String nome){
            System.out.println("Ola "+ nome+"! Tudo bem?");
    }

    public static int dobro(int numero){
        return numero*2;
    }

    public static double calcularMedia(double n1, double n2){
        return (n1+n2)/2;
    }

    public static boolean ehMaiorIdade(int idade){
        if(idade >=18){
            return true;
        }else{
            return false;
        }
    }

    public static int somar(int num1, int num2){
        return num1+num2;
    }

    public static int somar(int num1, int num2, int num3){
        return num1+num2+num3;
    }

    public static double somar(double num1, double num2){
        return num1+num2;
    }

    public static void ola(){
        System.out.println("Ola");
    }
    public static void olaNome(String nome){
        System.out.println("Ola "+nome);

    }
}
