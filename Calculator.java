public class Calculator{
	private int result;
	
	public  int getResult(){
		return result;
	}
	
	public void add(int ... params){
		for(int param:params)
		result += param;
	}
	
	public void cleanResult(){
		result = 0;
	}
}