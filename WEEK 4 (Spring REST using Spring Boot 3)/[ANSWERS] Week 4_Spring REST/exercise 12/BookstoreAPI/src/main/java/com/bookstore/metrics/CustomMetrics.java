package com.bookstore.metrics;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class CustomMetrics {

    @Autowired
    private MeterRegistry meterRegistry;

    @PostConstruct
    public void init()
    {
        meterRegistry.gauge("custom.book.count", 100);
        meterRegistry.counter("custom.book.requests").increment();
    }
}
