package de.jangassen.jfa.appkit;

import de.jangassen.jfa.annotation.NamedArg;

@SuppressWarnings("unused")
public interface NSHapticFeedbackPerformer extends NSObject {
    void performFeedbackPattern(int pattern,
            @NamedArg("performanceTime") int performanceTime
    );
}
