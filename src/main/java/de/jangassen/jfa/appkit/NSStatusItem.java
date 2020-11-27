package de.jangassen.jfa.appkit;

import de.jangassen.jfa.ObjcToJava;

public interface NSStatusItem extends NSObject {
  static NSStatusItem alloc() {
    return ObjcToJava.alloc(NSStatusItem.class);
  }

  NSMenu menu();

  void setMenu(NSMenu menu);

  NSStatusBarButton button();
}
