package book;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookTitleAsc implements Book {

	@Override
	public void execute(List<BookDTO> list) {
		Comparator<BookDTO> com = new Comparator<BookDTO>() {
			@Override
			public int compare(BookDTO b1, BookDTO b2) {
				return b1.getTitle().compareTo(b2.getTitle());
			}
		};
		
		//Collections.sort(list, com);
		list.sort(com);
	}

}
