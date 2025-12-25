package dev.zwander.jfa.appkit;


import dev.zwander.jfa.ObjcToJava;

@SuppressWarnings("unused")
public interface NSWorkspace extends NSObject {
  static NSWorkspace sharedWorkspace() {
    return ObjcToJava.invokeStatic(NSWorkspace.class, "sharedWorkspace");
  }

  void hideOtherApplications();
}