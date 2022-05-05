package ru.twozeros.worker;

public class Worker {

    private final OnTaskDoneListener callback;
    private final OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33)
                errorCallback.onError("Error " + i + " is not done");
            else
                callback.onDone("Task " + i + " is done");
        }
    }
}
