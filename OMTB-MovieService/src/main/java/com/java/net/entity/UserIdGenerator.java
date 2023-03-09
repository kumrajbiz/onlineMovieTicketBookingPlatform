package com.java.net.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicLong;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;


public class UserIdGenerator implements IdentifierGenerator {

    private static final String PREFIX = "USR";
    private static final String DATE_FORMAT = "yyMMdd";
    private static final int NUMBER_LENGTH = 5;
    private static final AtomicLong counter = new AtomicLong(0);
    
    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) {
        LocalDate today = LocalDate.now();
        String dateString = today.format(DateTimeFormatter.ofPattern(DATE_FORMAT));
        String sequenceNumber = getNextSequenceNumber(session).toString();
        String numberString = String.format("%0" + NUMBER_LENGTH + "d", Integer.parseInt(sequenceNumber));
        return PREFIX + dateString + "M" + numberString;
    }
    
    private synchronized Long getNextSequenceNumber(SharedSessionContractImplementor session) {
    	String maxId = (String) session.createQuery("SELECT MAX(m.id) FROM Movie m").uniqueResult();
    	
        long nextId = counter.incrementAndGet();
        if (maxId != null) {
           // nextId = Math.max(nextId, maxId + 1);
        }
        return nextId;
    }
    

}
    
