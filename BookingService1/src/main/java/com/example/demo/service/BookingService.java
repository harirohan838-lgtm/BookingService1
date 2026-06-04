package com.example.demo.service;

import com.example.demo.entity.Booking;
import com.example.demo.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository repo;

    public Booking saveBooking(Booking booking) {
        return repo.save(booking);
    }

    public List<Booking> getAllBookings() {
        return repo.findAll();
    }

    public Booking getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void deleteBooking(Long id) {
        repo.deleteById(id);
    }
}