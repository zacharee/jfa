package dev.zwander.jfa.appkit;

import dev.zwander.jfa.ObjcToJava;

@SuppressWarnings("unused")
public interface NSStatusItem extends NSObject {
  static NSStatusItem alloc() {
    return ObjcToJava.alloc(NSStatusItem.class);
  }

  NSMenu menu();

  void setMenu(NSMenu menu);

  NSStatusBarButton button();
}
