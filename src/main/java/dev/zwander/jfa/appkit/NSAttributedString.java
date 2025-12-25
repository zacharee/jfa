package dev.zwander.jfa.appkit;

import dev.zwander.jfa.ObjcToJava;
import dev.zwander.jfa.annotation.NamedArg;

public interface NSAttributedString extends NSObject {
  static NSAttributedString alloc() {
    return ObjcToJava.alloc(NSAttributedString.class);
  }

  NSAttributedString initWithString(NSString str);

  NSAttributedString initWithString(NSString str, @NamedArg("attributes") NSDictionary<NSAttributedStringKey, ? extends NSObject> attrs);

  NSString string();

  int length();
}
