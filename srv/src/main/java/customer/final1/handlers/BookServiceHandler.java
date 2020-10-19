package customer.final1.handlers;

import java.util.stream.Stream;

import com.sap.cds.services.handler.EventHandler;
import com.sap.cds.services.handler.annotations.After;
import com.sap.cds.services.handler.annotations.ServiceName;

import org.springframework.stereotype.Component;

import cds.gen.bookservice.BookService_;
import cds.gen.bookservice.BookSrv;
import cds.gen.bookservice.BookSrv_;
import com.sap.cds.services.cds.CdsService;

@Component
@ServiceName(BookService_.CDS_NAME)
public class BookServiceHandler implements EventHandler {
    @After(event = CdsService.EVENT_READ, entity = {BookSrv_.CDS_NAME})
    public void discount(Stream<BookSrv> books){
        books.filter( b-> b.getStock() > 20)
            .forEach(b -> b.setTitle(b.getTitle() + "(over stock)"));
    }
}
