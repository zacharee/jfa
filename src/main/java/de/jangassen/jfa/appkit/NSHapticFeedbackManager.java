package de.jangassen.jfa.appkit;

import de.jangassen.jfa.ObjcToJava;

@SuppressWarnings("unused")
public interface NSHapticFeedbackManager extends NSObject {
    static NSHapticFeedbackPerformer defaultPerformer() {
        return ObjcToJava.invokeStatic(NSHapticFeedbackManager.class, NSHapticFeedbackPerformer.class, "defaultPerformer");
    }
}
