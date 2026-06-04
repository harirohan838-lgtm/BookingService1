package com.example.demo.controller;

import com.example.demo.entity.Booking;
import com.example.demo.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController1 {

    @Autowired
    private BookingService service;

    // CREATE
    @PostMapping
    public Booking createBooking(@RequestBody Booking booking) {
        return service.saveBooking(booking);
    }

    // GET ALL
    @GetMapping
    public List<Booking> getAllBookings() {
        return service.getAllBookings();
    }

    // GET BY ID
    @GetMapping("/{id}")
    public Booking getBooking(@PathVariable Long id) {
        return service.getById(id);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteBooking(@PathVariable Long id) {
        service.deleteBooking(id);
        return "Deleted booking id: " + id;
    }
}