package app.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

import app.model.Book;

public class BookService {

	private static final String DATA_URL = "http://localhost:8080/books";
	private Gson gson = new Gson();

	public void save(Book book) throws IOException {
		var url = new URL(DATA_URL);

		var conn = (HttpURLConnection) url.openConnection();

		conn.setDoOutput(true);
		conn.setRequestProperty("Accept", "application/json,text/plain");
		conn.setRequestProperty("Content-Type", "application/json");
		conn.setRequestMethod("POST");
		
		String json = gson.toJson(book);
		
		conn.setFixedLengthStreamingMode(json.getBytes().length);

		conn.connect();

		try(var os = conn.getOutputStream()) {
			os.write(json.getBytes(StandardCharsets.UTF_8));
		}

		conn.disconnect();

	}

	public List<Book> getAll() throws IOException {

		var url = new URL(DATA_URL);

		var conn = (HttpURLConnection) url.openConnection();

		conn.setDoInput(true);
		conn.setRequestProperty("Accept", "application/json,text/plain");
		conn.setRequestMethod("GET");

		conn.connect();

		StringBuilder sb = new StringBuilder();

		try (var br = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
			String line = null;

			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
		}

		conn.disconnect();

		Book[] bookArray = gson.fromJson(sb.toString(), Book[].class);

		return Arrays.asList(bookArray);
	}
}
