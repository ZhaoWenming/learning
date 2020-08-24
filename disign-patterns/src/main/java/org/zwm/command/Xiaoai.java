package org.zwm.command;

import lombok.Setter;

@Setter
public class Xiaoai {
    private Command command;
    public void doCommand(){
        command.execute();
    }
}
