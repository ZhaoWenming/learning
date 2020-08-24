package org.zwm.command;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class LightOffCommand implements Command {
    private Light light;

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {

    }
}
