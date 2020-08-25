package org.zwm.command.demo2;

public class CopyCommand extends DocumentCommand {
    public CopyCommand(Document doc) {
        super(doc);
    }

    @Override
    public void execute() {
        super.getDoc().copy();
    }
}
