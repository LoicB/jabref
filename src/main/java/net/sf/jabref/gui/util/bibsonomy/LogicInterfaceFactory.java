package net.sf.jabref.gui.util.bibsonomy;

import net.sf.jabref.bibsonomy.BibSonomyProperties;
import net.sf.jabref.model.database.BibDatabaseContext;

import org.bibsonomy.model.logic.LogicInterface;
import org.bibsonomy.rest.client.RestLogicFactory;

public class LogicInterfaceFactory {

    public static LogicInterface getLogic(BibDatabaseContext context) {
        return new RestLogicFactory(
                BibSonomyProperties.getApiUrl(),
                RestLogicFactory.DEFAULT_RENDERING_FORMAT,
                RestLogicFactory.DEFAULT_CALLBACK_FACTORY,
                new JabRefFileFactory(context))
                .getLogicAccess(
                        BibSonomyProperties.getUsername(),
                        BibSonomyProperties.getApiKey());
    }

}