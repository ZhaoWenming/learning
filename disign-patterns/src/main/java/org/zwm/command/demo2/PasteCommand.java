package org.zwm.command.demo2;

public class PasteCommand extends DocumentCommand {
    public PasteCommand(Document doc) {
        super(doc);
    }

    @Override
    public void execute() {
        super.getDoc().paste();
    }
}
