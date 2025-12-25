package dev.zwander.jfa.appkit;

import dev.zwander.jfa.ObjcToJava;

@SuppressWarnings("unused")
public interface NSNotification extends NSObject {
  static NSNotification alloc() {
    return ObjcToJava.alloc(NSNotification.class);
  }

  String name();
}
