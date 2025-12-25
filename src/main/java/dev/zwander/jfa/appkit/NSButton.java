package dev.zwander.jfa.appkit;

import com.sun.jna.Pointer;
import dev.zwander.jfa.ObjcToJava;
import dev.zwander.jfa.foundation.ID;

@SuppressWarnings("unused")
public interface NSButton extends NSObject {
  static NSButton alloc() {
    return ObjcToJava.alloc(NSButton.class);
  }

  NSImage image();

  void setImage(NSImage image);

  Pointer action();

  void setAction(Pointer selector);

  ID target();

  void setTarget(ID target);

}
