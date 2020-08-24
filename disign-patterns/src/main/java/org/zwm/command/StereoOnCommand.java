package org.zwm.command;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class StereoOnCommand implements Command {
    private Stereo stereo;
    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
    }

    @Override
    public void undo() {

    }
}
