import java.util.Scanner;

public class Ex71_1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float num1 = 0;
		float num2 = 0;
		float num3 = 0;
		
		Scanner entrada =  new Scanner(System.in);
		System.out.println("Introdueix la primera nota: ");
		num1 = entrada.nextFloat();
		System.out.println("Introdueix la segona nota: ");
		num2 = entrada.nextFloat();
		System.out.println("Introdueix la tercera nota: ");
		num3 = entrada.nextFloat();
		
		//System.out.println(mitja(num1,num2,num3)); Para comprobaciones
		
	
		if(mitja(num1,num2,num3) < 5) {
			System.out.println("Insuficient, no has superat el curs");
				
		}else if (mitja(num1,num2,num3) >=5 && mitja(num1,num2,num3) <= 7) {
			System.out.println("Enhorabona, has aprovat però hauries de continuar practicant");
			
		}else if (mitja(num1,num2,num3) > 7) {
			System.out.println("Enhorabona, has aprovat el curs i estas preparat per el següent nivell!");
			
		}
		
		}
	
	public static float mitja(float num1,float num2,float num3) {
		
		return  (num1 + num2 + num3)/3;
		
	}
	
	}

