package dev.zwander.jfa.appkit;

import dev.zwander.jfa.ObjcToJava;

@SuppressWarnings("unused")
public interface NSUserDefaults extends NSObject {
  String AppleInterfaceStyle = "AppleInterfaceStyle";

  static NSUserDefaults standardUserDefaults() {
    return ObjcToJava.invokeStatic(NSUserDefaults.class, "standardUserDefaults");
  }

  NSObject objectForKey(String key);
}
