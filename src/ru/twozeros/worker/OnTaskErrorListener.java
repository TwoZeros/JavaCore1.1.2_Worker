package ru.twozeros.worker;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String res);
}
