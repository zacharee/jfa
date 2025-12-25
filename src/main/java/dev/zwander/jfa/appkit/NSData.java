package dev.zwander.jfa.appkit;

import com.sun.jna.Memory;
import dev.zwander.jfa.ObjcToJava;
import dev.zwander.jfa.annotation.NamedArg;

@SuppressWarnings("unused")
public interface NSData extends NSObject {
  static NSData alloc() {
    return ObjcToJava.alloc(NSData.class);
  }

  NSData initWithBytes(Memory bytes, @NamedArg("length") int length);

  NSData initWithData(NSData data);

  String base64EncodedStringWithOptions(int options);

  int length();
}
