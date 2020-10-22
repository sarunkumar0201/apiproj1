package com.test;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Task1 {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader fr = new FileReader(
				System.getProperty("user.dir") +"\\src\\test\\resources\\NewFolder\\Sample.json");

		JSONParser js = new JSONParser();

		Object ob = js.parse(fr);

		JSONObject jso = (JSONObject) ob;

		String tot = jso.get("total").toString();
		System.out.println("Total - " + tot);

		Object ob1 = jso.get("ad");

		JSONObject ad = (JSONObject) ob1;

		String company = ad.get("company").toString();
		System.out.println("Company - " + company);

		String url = ad.get("url").toString();
		System.out.println("URL - " + url);
		
		Object dataobj = jso.get("data");
		
		JSONArray dataarray=(JSONArray) dataobj;
		
		Object ob4th = dataarray.get(4);
		
		JSONObject data4th=(JSONObject) ob4th;
		
		String id = data4th.get("id").toString();
		System.out.println(id);
		
		String email = data4th.get("email").toString();
		System.out.println(email);
		
		String fname = data4th.get("first_name").toString();
		System.out.println(fname);
		
		String lname = data4th.get("last_name").toString();
		System.out.println(lname);
		
		String avatar = data4th.get("avatar").toString();
		System.out.println(avatar);
	}
}
