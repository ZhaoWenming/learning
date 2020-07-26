package org.zwm.demo02;

import lombok.Setter;

@Setter
public class UserServiceProxy implements UserService {

    private UserServiceImpl userService;

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }

    //日志方法
    public void log(String msg){
        System.out.println("使用了"+ msg+ "方法");
    }
}
