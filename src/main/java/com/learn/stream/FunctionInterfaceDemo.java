package com.learn.stream;

import java.util.function.*;

public class FunctionInterfaceDemo {

    public static void main(String[] args) {

        System.out.println("**************Predicate**************");
        //Predicate
        //Method :: boolean test(T t);

        //Example
        Predicate<Integer> isEven = a -> a % 2 == 0 ;
        System.out.println("Is Odd :: "+isEven.negate().test(5));
        System.out.println("Is Even :: "+isEven.test(52));

        //Example
        Predicate<String> wordStartsWithA = x -> x.toLowerCase().startsWith("a");
        Predicate<String> wordEndsWithA = x -> x.toLowerCase().endsWith("a");
        Predicate<String> andPredicate = wordStartsWithA.and(wordEndsWithA);
        System.out.println("wordStartsAndEndsWithA :: "+andPredicate.test("Asha"));

        System.out.println("**************Function**************");
        //Function
        //Method :: R apply(T t);

        //Example
        Function<Integer, Integer> doubleIt = x -> x*2;
        Function<Integer, Integer> tripleIt = x -> x*3;
        System.out.println("DoubleIt :: "+doubleIt.apply(20));
        System.out.println("DoubleIt andThen TripleIt :: "+doubleIt.andThen(tripleIt).apply(30));
        System.out.println("TripleIt then DoubleIt :: "+doubleIt.compose(tripleIt).apply(30));

        Function<Integer, Integer> identityEx = Function.identity();
        System.out.println("Function.Identity :: "+identityEx.apply(5));

        System.out.println("**************UnaryOperator and BinaryOperator Function**************");
        //accept Integer, returns Integer
        UnaryOperator<Integer> sq = x -> x*x;
        //accept 2 Integer, returns Integer
        BinaryOperator<Integer> mul = (x , y) -> x*y;


        System.out.println("**************Consumer**************");
        //Consumer
        //Method :: void accept(T t);

        //Example
        Consumer<Integer> printIt = x -> System.out.println("printIt :: "+x);
        printIt.accept(5);


        System.out.println("**************Supplier**************");
        //Supplier
        //Method :: R get();

        //Example
        Supplier<Integer> getNumber = () -> 100;
        Integer i = getNumber.get();

        //BiPredicate, BiFunction, BiConsumer

        BiPredicate<Integer, Integer> isSumEven = (x,y) -> (x+y) % 2 == 0;
        System.out.println("isSumEven :: " + isSumEven.test(20,30));

        BiConsumer<Integer, Integer> printSum = (x, y) -> System.out.println("Sum :: "+ (x+y));
        printSum.accept(20,10);

        BiFunction<String, String, Integer> getLengthSum = (x, y) -> (x + y).length();
        System.out.println("getLengthSum :: "+getLengthSum.apply("Suraj","Bobe"));

    }
}
