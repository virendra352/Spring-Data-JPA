package com.Applicant.practice.CoreJava.java11;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8TimeDate {
    public static void main(String[] args) {
        //before java 8 we had java.util.date, java.util.calendar,java.sql.timestamp
        //issue was mutable object. not thread safe,api confusion,
        //java 8
        //java.time
        //localtime
        LocalTime localTime=LocalTime.now();
        LocalTime localTime1=LocalTime.of(10,15,45);
        System.out.println(localTime);
        System.out.println(localTime1);

        //localDate
        LocalDate localDate=LocalDate.now();
        LocalDate localDate1=LocalDate.of(2025,3,31);
        System.out.println(localDate);
        System.out.println(localDate1);

        //localDatetime
        LocalDateTime localDateTime=LocalDateTime.now();
        LocalDateTime localDateTime1=LocalDateTime.of(2025,3,31,10,15,45);
        System.out.println(localDateTime);
        System.out.println(localDateTime1);

        //ZoneDateTime
        ZonedDateTime zonedDateTime=ZonedDateTime.now();
        System.out.println(zonedDateTime);
        ZonedDateTime nowInUTC = ZonedDateTime.now(ZoneId.of("UTC"));
        ZonedDateTime nowInIndia = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(nowInUTC);
        System.out.println(nowInIndia);
        //Instant
        Instant instant=Instant.now();
        System.out.println(instant);

        //Duration
        LocalTime time=LocalTime.of(10,10);
        LocalTime time1=LocalTime.of(10,20);
        Duration duration=Duration.between(time,time1);
        System.out.println(duration.toMinutes());

        //DateTimeformatter
        LocalDate date=LocalDate.of(2015,5,15);
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd:MM:yyyy");
        String format = date.format(dateTimeFormatter);
        System.out.println(format);
        int[] a={1,2,3,1};
        int[] b={3,4,5,1};
        IntStream concat = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).distinct().sorted();
        concat.forEach(System.out::println);
        String[] aa={"1","2","3","1"};
        String[] bb={"3","4","5","1"};
        String[] array = Stream.concat(Arrays.stream(aa), Arrays.stream(bb)).toArray(String[]::new);
        System.out.println(Arrays.toString(array));


    }
}
