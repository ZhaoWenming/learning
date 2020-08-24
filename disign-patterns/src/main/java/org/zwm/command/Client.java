package org.zwm.command;

public class Client {
    public static void main(String[] args) {
        //创建小爱同学，命令发出者invoker
        Xiaoai xiaoai = new Xiaoai();
        //创建具体的对象，相当于命令的具体接收者receiver
        Light light = new Light();
        //创建开灯的命令，你就是命令的发起者
        System.out.println("小爱同学，开灯");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        //小爱同学接受到你发出的命令，并执行命令
        xiaoai.setCommand(lightOnCommand);
        xiaoai.doCommand();
    }
}
