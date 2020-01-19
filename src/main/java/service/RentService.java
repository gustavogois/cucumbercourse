package service;

import model.Movie;
import model.RentNote;

import java.time.LocalDate;

public class RentService {
    public RentNote rent(Movie movie) {

        RentNote note = new RentNote();
        note.setPrice(movie.getPrice());
        note.setReturnDate(LocalDate.now().plusDays(1));

        movie.decrementStock();

        return note;
    }
}
