package org.zwm.command.demo2;

public class CloseCommand extends DocumentCommand {
    public CloseCommand(Document doc) {
        super(doc);
    }

    @Override
    public void execute() {
        super.getDoc().close();
    }
}
