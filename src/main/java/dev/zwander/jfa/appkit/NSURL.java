package dev.zwander.jfa.appkit;

import dev.zwander.jfa.ObjcToJava;

@SuppressWarnings("unused")
public interface NSURL extends NSObject {
  static NSURL alloc() {
    return ObjcToJava.alloc(NSURL.class);
  }

  NSURL initWithString(String url);
}
