using { my } from '../db/sample';

service BookService {

    entity AuthorSrv as projection on my.Authors;
    entity BookSrv as select from my.Books { * };

}