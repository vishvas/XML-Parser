import java.util.HashMap;
import java.util.Map;

public class StringOperations {// string operation logic, process the line , string operations
	HashMap<String, Integer> hm; // hashmap reference 
	public  StringOperations(){
	 hm = new HashMap<String, Integer>();
	}
	
	
	public void readStringOperations(String strLine){
		String toMatch= "element name=\"";
		//Read File Line By Line and Match String
		//String strLine;
		if(strLine.contains(toMatch)){
	        	
	        	int i = strLine.indexOf(toMatch)+toMatch.trim().length(); // getting initial index of the element name
	        	int j = strLine.indexOf("\"", i); // getting end index of the element name
	        	String splitedString = strLine.substring(i, j);
	        	
	        	if(!(hm.containsKey(splitedString))){
	        		hm.put(splitedString,1);
	        		//System.out.println("Key = " + splitedString + ", Value = " + hm.get(splitedString));
	        		
	        	}else{
	        		int incrementValue =(int) hm.get(splitedString)+1;
	        		hm.put(splitedString,incrementValue);
	        		//System.out.println("Key = " + splitedString + ", Value = " + hm.get(splitedString));
	        	}
	        }
	    
		
	}
	public void printFreq(){

		//Set<Entry<String, Integer>> set = hm.entrySet();
	    // Get an iterator
		//Iterator<Entry<String, Integer>> i = set.iterator();
	    // Display elements
			String tagname=null;
			int occuring=0;
			Map<String, Integer> map = new HashMap<String, Integer>(hm);
	    	for (Map.Entry<String, Integer> me : map.entrySet()) {
	    		    //System.out.println("Key = " + me.getKey() + ", Value = " + me.getValue());
	    		    if(me.getValue()>occuring){
	   	        	 tagname=me.getKey().toString();
	   	        	 occuring=(int)me.getValue();
	    		    }
	    	}
	    	System.out.println("The most frequently occurring element is "+tagname+". It appears "+occuring+" times.");
	         
	      }
	      
	
}
