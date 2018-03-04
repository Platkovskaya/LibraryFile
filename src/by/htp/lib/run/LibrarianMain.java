package by.htp.lib.run;

import by.htp.lib.bean.Book;
import by.htp.lib.bean.Catalog;
import logic.LibraryService;
import logic.impl.CityLibraryServiceImpl;

public class LibrarianMain {

	public static void main(String[] args) {

		LibraryService service = new CityLibraryServiceImpl();
		Catalog booksCatalog = service.getMainCatalog();
		viewCatalogInfo(booksCatalog);

	}

	private static void viewCatalogInfo(Catalog catalog) {
		System.out.println("Catalog Title: " + catalog.getTitle());
		System.out.println("Catalog Creation Date: " + catalog.getCreateDate());
		for (Book book : catalog.getBooks()) {
			System.out.println(book);
		}
	}
}
