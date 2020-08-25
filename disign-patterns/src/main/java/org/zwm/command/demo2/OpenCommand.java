package org.zwm.command.demo2;

public class OpenCommand extends DocumentCommand {
    public OpenCommand(Document doc) {
        super(doc);
    }

    @Override
    public void execute() {
        super.getDoc().open();
    }
}
