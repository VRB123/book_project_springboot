package com.assesment.bookproject.bookservicetest;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.web.client.RestTemplate;

import com.assesment.bookproject.books;
import com.assesment.bookproject.service.bookService;

@RunWith(MockitoJUnitRunner.class)
public class bookserviceTest {

	@Mock
	private RestTemplate restTemplate;

	@Mock
	bookService bookSevice;

	@Test
    public void givenMockingIsDoneByMockito_whenGetIsCalled_shouldReturnMockedObject() {
        books book = new books(1,"DisruptiveThinking","John C Wright",2016);
        Mockito.when(restTemplate.getForEntity("“http://localhost:8080/getAllBooks”", books.class));
        List<books> books_service = (List<books>) bookSevice.getAllBooks();
        Assert.assertEquals(books_service, book);
    }
}
