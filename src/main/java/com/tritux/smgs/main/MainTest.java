package com.tritux.smgs.main;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.tritux.smgs.entities.SMGSError;
import com.tritux.smgs.entities.SMGSResponse;

/**
 * <h2>Main test : Test class of SMGS API.</h2>
 *
 * @author
 *         <h4>mazemzemi.</h4>
 * @since 25/11/2016.
 *
 */
public class MainTest {

	/**
	 * Main method.
	 * 
	 * @param args
	 *            Unnecessary.
	 */
	public static void main(String[] args) {

		HttpResponse<String> httpResponse = null;

		ObjectMapper mapper = new ObjectMapper();

		try {
			httpResponse = Unirest
					.get("http://sms.tritux.com/v1/send?destination=21655123456&username=user&password=pwd&origin=toto&text=hello%20smgs4%20Tritux%202016")
					.header("cache-control", "no-cache").header("postman-token", "7fd43f4d-9876-2637-d15b-ae626eb0fabc")
					.asString();

			SMGSResponse response = mapper.readValue(httpResponse.getBody(), SMGSResponse.class);
			System.out.println(response.toString());

		} catch (UnirestException e) {
			e.printStackTrace();
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			SMGSError error;
			try {
				error = mapper.readValue(httpResponse.getBody(), SMGSError.class);
				System.out.println(error.toString());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
