import java.util.List;

public class Main {
	
	public int a(List<List<Integer>> arr) {
		
		int line1 = 0;	// 对角线1，左上角到右下角
		int line2 = 0; 	// 对角线2，右上角到左下角
		
		for (int i = 0; i < arr.size(); i++) {
			
			line1 += arr.get(i).get(i);
			
		}
		int index = 0;
		for (int i = arr.size(); i >= 0; i--) {
			
			line2 += arr.get(index++).get(i);
			
		}
		
		return Math.abs(line1 - line2);
	}
	
}
