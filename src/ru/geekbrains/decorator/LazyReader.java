package ru.geekbrains.decorator;

import java.io.*;

public class LazyReader extends FilterReader {

    public LazyReader(Reader in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        System.out.println("Не буду ничего считывать!");
        return 0;
    }
}
