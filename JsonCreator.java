package json;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JsonCreator {
	@SuppressWarnings({ "deprecation" })
	public static void main(String []args) throws JsonGenerationException, JsonMappingException, IOException {		
		ObjectMapper mapper = new ObjectMapper();
		//student1
		ObjectNode obj = mapper.createObjectNode();
		ArrayNode arr = mapper.createArrayNode();
		
		obj.put("id", 570);
		obj.put("name", "hobi");
		obj.put("gender", "m");
		obj.put("dept", "cse");
		arr.add("java");
		arr.add("python");
		arr.add(".net");
		ObjectNode score= mapper.createObjectNode();
		score.put("percentage",95);
		score.put("cGpa", 9.3);
		score.put("sGpa", 9.8);
		
		obj.put("score", score);
		obj.put("skills",arr);
		
		//student2
		ObjectNode obj1 = mapper.createObjectNode();
		ArrayNode arr1 = mapper.createArrayNode();
		
		obj1.put("id", 571);
		obj1.put("name", "jk");
		obj1.put("gender", "m");
		obj1.put("dept", "cse");
		arr1.add("java");
		arr1.add("python");
		arr1.add("js");
		ObjectNode score1= mapper.createObjectNode();
		score1.put("percentage",98);
		score1.put("cGpa", 9.5);
		score1.put("sGpa", 9.8);
		
		obj1.put("score", score1);
		obj1.put("skills",arr1);
		
		//student3
		ObjectNode obj2 = mapper.createObjectNode();
		ArrayNode arr2 = mapper.createArrayNode();
		
		obj2.put("id", 572);
		obj2.put("name", "lisa");
		obj2.put("gender", "f");
		obj2.put("dept", "cse");
		arr2.add("java");
		arr2.add("python");
		arr2.add("ajs");
		ObjectNode score2= mapper.createObjectNode();
		score2.put("percentage",82);
		score2.put("cGpa", 8.5);
		score2.put("sGpa", 9.0);
		
		obj2.put("score", score2);
		obj2.put("skills",arr2);
		
		ObjectNode robj= mapper.createObjectNode();
		robj.put("student1",obj);
		robj.put("student2",obj1);
		robj.put("student3",obj2);
		mapper.writerWithDefaultPrettyPrinter().writeValue(System.out, robj);
		
	}

}
