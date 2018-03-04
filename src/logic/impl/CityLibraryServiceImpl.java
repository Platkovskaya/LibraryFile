package logic.impl;

import java.util.Date;

import by.htp.lib.bean.Book;
import by.htp.lib.bean.Catalog;
import by.htp.lib.dao.BookDao;
import by.htp.lib.dao.impl.FileBookDaoImpl;
import logic.LibraryService;

public class CityLibraryServiceImpl implements LibraryService {

	private BookDao dao = new FileBookDaoImpl();

	@Override
	public Catalog getMainCatalog() {

		Catalog catalog = new Catalog();

		Book[] books = dao.readAll();
		catalog.setBooks(books);
		
		catalog.setTitle("HTP_TAT_7_BOOK_CATALOG");
		catalog.setCreateDate(new Date());
		return catalog;
	}
}
