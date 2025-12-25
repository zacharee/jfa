package dev.zwander.jfa.appkit;


import dev.zwander.jfa.ObjcToJava;
import dev.zwander.jfa.foundation.ID;

@SuppressWarnings("unused")
public interface NSApplication extends NSObject {
  static NSApplication sharedApplication() {
    return ObjcToJava.invokeStatic(NSApplication.class, "sharedApplication");
  }

  Object isActive();

  NSMenu mainMenu();

  void setMainMenu(NSMenu mainMenu);

  void hide(ID sender);

  void unhide(ID sender);

  NSApplicationDelegate delegate();

  void setDelegate(NSApplicationDelegate delegate);

  NSWindow keyWindow();

  NSWindow mainWindow();

  NSAppearance appearance();

  void setAppearance(NSAppearance appearance);

  void orderFrontColorPanel(ID sender);

  void orderFrontCharacterPalette(ID sender);

  void orderFrontStandardAboutPanel(ID sender);

  void orderFrontStandardAboutPanelWithOptions(NSDictionary<NSAboutPanelOptionKey, NSObject> optionsDictionary);

  NSDockTile dockTile();
}