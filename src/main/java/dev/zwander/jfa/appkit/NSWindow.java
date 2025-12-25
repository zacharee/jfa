package dev.zwander.jfa.appkit;

import dev.zwander.jfa.ObjcToJava;

@SuppressWarnings("unused")
public interface NSWindow extends NSObject {
  static NSWindow alloc() {
    return ObjcToJava.alloc(NSWindow.class);
  }

  NSView contentView();

  NSAppearance appearance();

  void setAppearance(NSAppearance appearance);
}
