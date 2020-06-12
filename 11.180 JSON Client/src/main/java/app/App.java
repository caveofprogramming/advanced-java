package app;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;

import com.google.gson.Gson;

public class App {

	public static void main(String[] args) {
		
		var url = "http://localhost:8080/users/users";
		
		try {
			var json = IOUtils.toString(new URL(url), Charset.forName("UTF-8"));
			
			Gson gson = new Gson();
			
			var users = gson.fromJson(json, User[].class);
			
			for(var user: users) {
				System.out.println(user);
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
