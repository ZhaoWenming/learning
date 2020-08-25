package org.zwm.command.demo2;

import java.util.ArrayList;
import java.util.List;

public class Macro {
    private List<DocumentCommand> myCommands;
    public Macro(){
        myCommands = new ArrayList<DocumentCommand>();
    }

    public void addCommand(DocumentCommand d){
        myCommands.add(d);
    }

    public void removeCommand(DocumentCommand d){
        myCommands.remove(d);
    }

    public void execute(){
        for (DocumentCommand c : myCommands) {
            c.execute();
        }
    }
}
