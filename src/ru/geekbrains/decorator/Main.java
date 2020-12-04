package ru.geekbrains.decorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {
    public static void main(String[] args) throws IOException {
        Reader inputStream = new BufferedReader(new LazyReader(new InputStreamReader(System.in)));
        inputStream.read();
    }
}
