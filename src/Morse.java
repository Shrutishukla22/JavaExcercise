import java.util.HashMap;

public class Morse {
  public HashMap<String,String> transCode = new HashMap<>();
  
  public Morse(){
	//initializing Transcode
	transCode.put("A",".-");
	transCode.put("B","-...");
	transCode.put("C","-.-.");
	transCode.put("D","-..");
	transCode.put("E",".");
	transCode.put("F","..-.");
	transCode.put("G","--.");
	transCode.put("H","....");
	transCode.put("I","..");
	transCode.put("J",".---");
	transCode.put("K","-.-");
	transCode.put("L",".-..");
	transCode.put("M","--");
	transCode.put("N","-.");
	transCode.put("O","---");
	transCode.put("P",".--.");
	transCode.put("Q","--.-");
	transCode.put("R",".-.");
	transCode.put("S","...");
	transCode.put("T","-");
	transCode.put("U","..-");
	transCode.put("V","...-");
	transCode.put("W",".--");
	transCode.put("X","-..-");
	transCode.put("Y","-.--");
	transCode.put("Z","--..");
	transCode.put("1",".----");
	transCode.put("2","..---");
	transCode.put("3","...--");
	transCode.put("4","....-");
	transCode.put("5",".....");
	transCode.put("6","-....");
	transCode.put("7","--...");
	transCode.put("8","---..");
	transCode.put("9","----.");
	transCode.put("0","-----");
	}
  public String encode(String str){
	  String ret ="";
	  String element ="";
	  str =str.toUpperCase();
	  for(int i =0;i<str.length();i++){
		  element =transCode.get(String.valueOf(str.charAt(i)));
			  ret += element;
			  }
	  return ret;
  }

}
