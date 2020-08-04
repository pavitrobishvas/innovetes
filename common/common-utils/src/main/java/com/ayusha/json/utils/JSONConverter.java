package com.ayusha.json.utils;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;

/**
* This is JSON message formmater
*
* @author  Nagendra Kumar
* @version 1.0
* @since   2019-05-03 
*/
public class JSONConverter {
	
	
	/**
	 * string to object
	 */
	public static Object convertStringToPOJO(String message, Class classRef) {
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.readValue(message, classRef);
		} catch (JsonGenerationException e) { 
			e.printStackTrace(); 
		} catch (JsonMappingException e) { 
			e.printStackTrace(); 
		}catch (IOException e) {
			e.printStackTrace(); 
		}
		return null;
	}
	
	/**
	 * string to object
	 */
	@SuppressWarnings("deprecation")
	public static String convertPOJOToString(Object pojo) {
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			System.out.println("Default JSON String:" + mapper.writeValueAsString(pojo)); 
			System.out.println("formatted JSON String \n" + mapper.defaultPrettyPrintingWriter().writeValueAsString(pojo)); 
			mapper.enable(SerializationConfig.Feature.INDENT_OUTPUT);
			return mapper.writeValueAsString(pojo);
		} catch (JsonGenerationException e) { 
			e.printStackTrace(); 
		} catch (JsonMappingException e) { 
			e.printStackTrace(); 
		}catch (IOException e) {
			e.printStackTrace(); 
		}
		return "";
	}
	
	 public static String mapToJson(Object obj) throws IOException {
	      ObjectMapper objectMapper = new ObjectMapper();
	      return objectMapper.writeValueAsString(obj);
	   }
	   public static  <T> T mapFromJson(String json, Class<T> clazz)
	      throws JsonParseException, JsonMappingException, IOException {
	      
	      ObjectMapper objectMapper = new ObjectMapper();
	      return objectMapper.readValue(json, clazz);
	   }
	
	

}
