package org.zwm.command.demo2;

public class Application {
    public static void main(String[] args) {
        Document document = new Document();
        Macro macro = new Macro();
        macro.addCommand(new OpenCommand(document));
        macro.addCommand(new CopyCommand(document));
        macro.addCommand(new PasteCommand(document));
        CloseCommand closeCommand = new CloseCommand(document);
        macro.addCommand(closeCommand);
        macro.execute();
        System.out.println("---------------------------------");
        macro.removeCommand(closeCommand);
        macro.execute();
    }
}
