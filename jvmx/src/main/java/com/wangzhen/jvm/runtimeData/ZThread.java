package com.wangzhen.jvm.runtimeData;

import com.wangzhen.jvm.runtimeData.helap.ZMethod;

/**
 *
 * 自定义线程：
 *      线程私有的区域包含：1.程序计数器，
 *                         2.java 虚拟机栈
 *                         3.本地方法栈
 */
public class ZThread {
    // 程序计数器
    int pc;
    //Stack 结构体（Java 虚拟机栈）的引用;
    ZStack jstack;

    public ZThread() {
        jstack = new ZStack(1024);
    }

    public int getPc() {
        return pc;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }

    public void pushFrame(ZFrame frame) {
        jstack.push(frame);
    }

    public ZFrame popFrame() {
        return jstack.pop();
    }

    public ZFrame createFrame(ZMethod method){
        return  new ZFrame(this,method);
    }


    public ZFrame getCurrentFrame() {
        return jstack.top();
    }
}
