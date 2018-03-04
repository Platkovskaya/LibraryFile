package by.htp.lib.dao.impl;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import by.htp.lib.bean.Author;
import by.htp.lib.bean.Book;
import by.htp.lib.dao.BookDao;

public class FileBookDaoImpl implements BookDao {

	public static final String filePath = "resources/file";

	@Override
	public Book[] readAll() {

		int countOfBooks = 0;

		try (BufferedReader reader = new BufferedReader(
				new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8))) {
			while (reader.readLine() != null) {
				countOfBooks++;
			}
		} catch (Exception e) {
			System.out.println("Can't open file: " + filePath);
		}

		Book[] books = new Book[countOfBooks];

		try (BufferedReader reader = new BufferedReader(
				new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8))) {
			String line;
			int index = 0;
			while ((line = reader.readLine()) != null) {

				String[] array = line.split("[;]");

				int id = Integer.valueOf(array[0]);
				String title = array[1];
				int year = Integer.valueOf(array[2]);

				String authorFirstName = array[3];
				String authorLastName = array[4];

				Author author = new Author(id, authorFirstName, authorLastName);
				Book book = new Book(id, title, year, author);

				books[index] = book;
				index++;
			}
		} catch (Exception e) {
			System.out.println("Can't open file: " + filePath);
		}

		return books;
	}

}
