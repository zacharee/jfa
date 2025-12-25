package dev.zwander.jfa.appkit;

import dev.zwander.jfa.ObjcToJava;

@SuppressWarnings("unused")
public interface NSView extends NSObject {
  static NSView alloc() {
    return ObjcToJava.alloc(NSView.class);
  }

}
