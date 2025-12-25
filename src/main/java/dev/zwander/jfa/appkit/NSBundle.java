package dev.zwander.jfa.appkit;

import dev.zwander.jfa.ObjcToJava;
import dev.zwander.jfa.foundation.Foundation;
import dev.zwander.jfa.foundation.ID;

public interface NSBundle extends NSObject {
  static NSBundle mainBundle() {
    return ObjcToJava.invokeStatic(NSBundle.class, "mainBundle");
  }

  static NSBundle bundleWithPath(String path) {
    return ObjcToJava.invokeStatic(NSBundle.class, "bundleWithPath:", Foundation.nsString(path));
  }

  NSString bundleIdentifier();

  NSBundle initWithURL(NSURL url);

  NSBundle initWithPath(String url);

  NSURL bundleURL();

  String bundlePath();

  ID classNamed(String className);

  boolean load();
}
