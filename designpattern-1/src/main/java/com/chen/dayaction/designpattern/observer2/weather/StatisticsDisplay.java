package com.chen.dayaction.designpattern.observer2.weather;

/**
 * 天气统计布告板
 */
public class StatisticsDisplay implements Observer,DisplayElement {
    private Subject subject;
    private float temperature;
    private float humidity;
    private float pressure;
    public static final String NAME  = "【气象统计】";

    public StatisticsDisplay(Subject subject){
        this.subject = subject;
    }

    public void registerToObservers(){
        this.subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(NAME+"气象布告板：");
        System.out.println(NAME+"温度："+temperature);
        System.out.println(NAME+"温度："+humidity);
        System.out.println(NAME+"气压："+pressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println(NAME+"气象布告板数据通知更新...");
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.display();
    }
}
