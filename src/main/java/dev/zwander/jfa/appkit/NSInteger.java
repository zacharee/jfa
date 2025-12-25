package dev.zwander.jfa.appkit;

import dev.zwander.jfa.ObjcToJava;

public interface NSInteger extends NSNumber {
  static NSInteger alloc() {
    return ObjcToJava.alloc(NSInteger.class);
  }
}
