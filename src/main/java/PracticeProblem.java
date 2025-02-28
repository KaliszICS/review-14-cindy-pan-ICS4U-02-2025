public class PracticeProblem {
	final static int MAXIMUM = 0;
	public static int calculate(int num, int numTwo, char ops){
		int value = ops;
		int output =0;
		switch(value){
			case (43):
			 output = num+numTwo;
			 break;
			case (45):
			output = num-numTwo;
			break;
			case (42):
			output = num*numTwo;
			break;
			case(47):
			output = num/numTwo;
			break;
			case(37):
			output = num%numTwo;
			break;
			case(94):
			double help = Math.pow(num,numTwo);
			output = (int)Math.round(help);
			break;
		}
		return output;
	}


		public static boolean totalWordsChecker(String words){
		String arr[] = words.split(" ");
		String newArr[] = words.split("");
		boolean checker = false;
		if (arr.length<=10){
			checker = true;
		}
		
		if (arr[0].compareTo("Hello")!=0){
			checker = false;
			if (arr.length>1 && arr[1].compareTo("a")!=0){
				checker = false;
			}
	

		}

		if(arr[0]==""){
			checker=true;
		}

	


		return checker;
		}

		public static String minString(String fst, String sec, String thd){
			String first = fst.toLowerCase();
			String second = sec.toLowerCase();
			String third = thd.toLowerCase();
			String output = "";
			if (first.compareTo(second)<0){
				if (first.compareTo(third)<0){
					output = fst;
				}
				else {
					output = thd;
				}
			}
			else if (second.compareTo(third)<0){
				output = sec;
			}
			else {
				output = thd;
			}
			return output;

		}
}
