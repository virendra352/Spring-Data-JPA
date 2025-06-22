package com.medium.java.sftp.Thread;

import java.util.Enumeration;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Completable {
    public static void main(String[] args) {
        //Basic
        //Consumer Interface - > has void accept(T t) method
        //Predicate Interface-> has boolean test() method
        //supplier Interface-> has T get()
        //Function Interface- > R apply(T t)
        //supplyAsync
        CompletableFuture<Integer> completableFuture=CompletableFuture.supplyAsync(()->100);
        System.out.println(completableFuture.isCompletedExceptionally());
        System.out.println("Result: "+completableFuture.join());
        System.out.println(completableFuture);
        System.out.println(completableFuture.isDone());
        System.out.println(completableFuture.isCompletedExceptionally());
        //runAsync()
        CompletableFuture<Void> completableFutureRun=CompletableFuture
                .runAsync(()->System.out.println("RunAsync method"));

        //thenApply()
        CompletableFuture<Integer> completableFuture2 = CompletableFuture.supplyAsync(() -> 36)
                .thenApply(num -> num * 2)
                .thenApply(num -> num + 10);
        System.out.println(completableFuture2.join());
        //thenAccept
        CompletableFuture<Void> voidCompletableFuture = completableFuture.thenAccept((s) -> System.out.println(s * 100));
        System.out.println(voidCompletableFuture.join()); //null

        //thenCompose
        CompletableFuture<Integer> completableFuture1 = CompletableFuture.supplyAsync(() -> 100)
                .thenCompose(num -> CompletableFuture.supplyAsync(() -> num / 2));
        System.out.println(completableFuture1.join());


    }
}
