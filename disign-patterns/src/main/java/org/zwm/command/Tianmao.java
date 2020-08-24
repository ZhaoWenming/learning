package org.zwm.command;

import lombok.Setter;

@Setter
public class Tianmao {
    private Command command;
    public void doCommand(){
        command.execute();
    }
}
