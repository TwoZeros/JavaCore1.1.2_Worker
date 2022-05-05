package ru.twozeros.worker;
@FunctionalInterface
interface  OnTaskDoneListener {
    void onDone(String result);
}
