package dev.zwander.jfa.appkit;

import dev.zwander.jfa.ObjcToJava;

@SuppressWarnings("unused")
public interface NSStatusBarButton extends NSButton {
  static NSStatusBarButton alloc() {
    return ObjcToJava.alloc(NSStatusBarButton.class);
  }
}
