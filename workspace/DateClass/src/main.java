
public class main {
	public int month;
	public int day;
	public int year;
	
	public main(int m, int d, int y){
		month = m;
		day = d;
		year = y;
	}
	public void setmonth(int newValue){
		month = newValue;
	}
	public void setday(int newValue){
		day = newValue;
	}
	public void setyear(int newValue){
		year = newValue;
	}
	public int getmonth(){
		return month;
	}
	public int getdate(){
		return day;
	}
	public int getyear(){
		return year;
	}
}
