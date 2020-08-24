package org.zwm.command;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
public class LightOnCommand implements Command {

    private Light light;

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {

    }
}
