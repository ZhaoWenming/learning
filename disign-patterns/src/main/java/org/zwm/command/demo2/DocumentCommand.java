package org.zwm.command.demo2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public abstract class DocumentCommand {
    private Document doc;
    public abstract void execute();
}
