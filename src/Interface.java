import java.util.Scanner;

public class Interface {
	private Scanner get = new Scanner(System.in);
	private Operations time = new Operations();
	private double mbps, mbs, gbs, control;
	private boolean condition;
	
	public void iteration(){
		System.out.print("\nDigite a velocidade da sua internet em Mbps: ");
		mbps = get.nextDouble();
		
		System.out.print("\nQuanto ao tamanho do arquivo, você deseja digitar em GB's ou em MB's?\n[1]GB's\n[2]MB's\nDigite a opção numérica de "
				+ "acordo com os algarismos apresentados: ");
		control = get.nextDouble();
		
		validate();
		
		if(control == 1){
		System.out.print("\nDigite o tamanho do arquivo em GB's: ");
		gbs = get.nextDouble();
		time.calculateSecondsGbs(gbs, mbps);
		}
		
		if(control == 2){
		System.out.print("\nDigite o tamanho do arquivo em MB's: ");
		mbs = get.nextDouble();
		time.calculateSecondsMbs(mbs, mbps);
		}
		
		time.formatTime();
		
		System.out.print("\n"+time.toString());
		
		repeat();
	}
	
	public void repeat(){
		System.out.println("\n---------------------------------------------------------------------|");
		System.out.print("\nDeseja repetir o programa (1 to yes or 2 to not)? ");
		control = get.nextInt();
		
		validate();
		
		if(control == 1){
			iteration();
		}
		
		if(control == 2){
			System.exit(0);
		}
	}
	
	public void validate(){
		condition = false;
		while(condition == false){
			if(control == 1 || control == 2){
				condition = true;
			}else{
				condition = false;
				System.out.print("\nOpção inválida, tente novamente: ");
				control = get.nextDouble();
			}
		}
	}

}