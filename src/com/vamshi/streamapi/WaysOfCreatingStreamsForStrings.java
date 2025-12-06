package com.vamshi.streamapi;

import java.util.Arrays;
import java.util.stream.Stream;
/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 06-12-2025
 */
public class WaysOfCreatingStreamsForStrings {

    private static final String STREAM_STRING = "This is a sample string to convert into stream";
    private static final int REQ_STRING_LENGTH = 4;

    // target: Ways of creating streams
    public static void main(String[] args) {
        streamsFromStringUsingArraysUtil();

        System.out.println("\n" + "-".repeat(40));
        streamsFromStringUsingStreamUtil();

        System.out.println("\n" + "_".repeat(40));
        streamsFromStringUsingStreamBuilderUtil();
    }

    // Convert String to Streams using Arrays.stream()
    private static void streamsFromStringUsingArraysUtil() {
        Stream<String> stream = Arrays.stream(STREAM_STRING.split(" "));

        System.out.println("streamsFromStringUsingArraysUtil: ");
        stream.filter(curStr -> curStr.length() == REQ_STRING_LENGTH)
                .forEach(System.out::println);
    }

    private static void streamsFromStringUsingStreamUtil() {
        Stream<String> stream = Stream.of(STREAM_STRING.split(" "));

        System.out.println("streamsFromStringUsingStreamUtil: ");
        stream.filter(curStr -> curStr.length() > REQ_STRING_LENGTH)
                .forEach(System.out::println);
    }

    private static void streamsFromStringUsingStreamBuilderUtil() {
        Stream.Builder<String> stream = Stream.builder();

        for (String curStr : STREAM_STRING.split(" ")) {
            stream.add(curStr);
        }

        stream.build()
                .filter(curStr -> curStr.length() < REQ_STRING_LENGTH)
                .forEach(System.out::println);
    }
}
