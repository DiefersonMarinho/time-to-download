
public class Operations {
	private double timeSeconds;
	private int hours, minutes, seconds;
	private String timeFormat;
	
	public void calculateSecondsMbs(double mbs, double mbps){
		timeSeconds = (mbs * 1024) / (mbps * 128);
	}
	
	public void calculateSecondsGbs(double gbs, double mbps){
		timeSeconds = ((gbs * 1024) * 1024) / (mbps * 128);
	}
	
	public void formatTime(){
		seconds = (int)(timeSeconds % 60);
		minutes = (int)((timeSeconds / 60) % 60);
		hours = (int)(((timeSeconds / 60) / 60) % 60); 
	}
	
	public String toString(){
		timeFormat = "O tempo do download será de aproximadamente (para mais): \n"+hours+" Hora(s) "+minutes+" Minuto(s) e "+seconds+" Segundo(s).";
		return timeFormat;
	}
	
}