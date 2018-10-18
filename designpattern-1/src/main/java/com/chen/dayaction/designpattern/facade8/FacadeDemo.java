package com.chen.dayaction.designpattern.facade8;

import com.chen.dayaction.designpattern.facade8.facade.Facade;

/**
 * 门面模式案例：
 *  门面模式类图实现案例；
 *  Facade类其实相当于A、B、C模块的外观界面，有了这个Facade类，那么客户端就不需要亲自调用子系统中的A、B、C模块了，
 *  也不需要知道系统内部的实现细节，甚至都不需要知道A、B、C模块的存在，客户端只需要跟Facade类交互就好了。
 *  从而更好地实现了客户端和子系统中A、B、C模块的解耦，让客户端更容易地使用系统。
 *
 *  门面(Facade)角色 ：客户端可以调用这个角色的方法。此角色知晓相关的（一个或者多个）子系统的功能和责任。在正常情况下，本角色会将所有从客户端发来的请求委派到相应的子系统去。
 *  子系统(SubSystem)角色 ：可以同时有一个或者多个子系统。每个子系统都不是一个单独的类，而是一个类的集合。
 *  每个子系统都可以被客户端直接调用，或者被门面角色调用。子系统并不知道门面的存在，对于子系统而言，门面仅仅是另外一个客户端而已。
 *
 *  使用门面模式还有一个附带的好处，就是能够有选择性地暴露方法。
 *  一个模块中定义的方法可以分成两部分，一部分是给子系统外部使用的，一部分是子系统内部模块之间相互调用时使用的。
 *
 *  门面模式的优点：
 * 　 松散耦合；门面模式松散了客户端与子系统的耦合关系。
 *    简单易用；门面模式让子系统更加易用，客户端不再需要了解子系统内部的实现，也不需要跟众多子系统内部的模块进行交互，只需要跟门面类交互就可以了。
 *    更好的划分访问层次；通过合理使用Facade，可以帮助我们更好地划分访问的层次。有些方法是对系统外的，有些方法是系统内部使用的。
 *    把需要暴露给外部的功能集中到门面中，这样既方便客户端使用，也很好地隐藏了内部的细节。
 *  门面模式的缺点：
 *     门面类高耦合，一旦有变更，只能对门面类进行修改。修改门面类需要非常谨慎。
 */
public class FacadeDemo {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.a1();
        facade.b1();
        facade.c1();
    }
}
