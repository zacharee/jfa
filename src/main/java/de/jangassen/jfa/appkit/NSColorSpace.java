package de.jangassen.jfa.appkit;

import de.jangassen.jfa.ObjcToJava;

@SuppressWarnings("unused")
public interface NSColorSpace extends NSObject {
    static NSColorSpace genericRGBColorSpace() {
        return ObjcToJava.invokeStatic(NSColorSpace.class, "genericRGBColorSpace");
    }

    static NSColorSpace deviceRGBColorSpace() {
        return ObjcToJava.invokeStatic(NSColorSpace.class, "deviceRGBColorSpace");
    }
}
