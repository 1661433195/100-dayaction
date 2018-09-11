package com.chen.dayaction.designpattern.factory4.factorypizza;

import com.chen.dayaction.designpattern.factory4.simplepizza.Pizza;

/**
 * 芝加哥风味蛤蜊披萨
 */
public class ChicagoStyleClamPizza extends Pizza {
    public void prepare(){
        System.out.println("制作芝加哥风味蛤蜊披萨准备中：面皮、酱料、蛤蜊");
    }

    public void bake(){
        System.out.println("芝加哥风味蛤蜊披萨烘烤中。。。");
    }

    public void cut(){
        System.out.println("芝加哥风味蛤蜊披萨切片");
    }

    public void box(){
        System.out.println("芝加哥风味蛤蜊披萨装盒");
    }
}
