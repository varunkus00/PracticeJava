package PrototypeDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class NotebookRegistry {
    private static final Map<NotebookType, NotebookPrototype<?>> mapNotebookRegistry = new HashMap<>();

    public static void setNotebookRegistry(NotebookType notebookType, NotebookPrototype<?> prototype) {
        mapNotebookRegistry.put(notebookType, prototype);
    }

    public static NotebookPrototype<?> getNotebookPrototype(NotebookType notebookType) {
        if( notebookType != null ) {
            return mapNotebookRegistry.get(notebookType);
        }
        throw new IllegalArgumentException("Registry does not contain notebook type");
    }
}
