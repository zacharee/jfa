package dev.zwander.jfa.appkit;

import dev.zwander.jfa.ObjcToJava;

import static dev.zwander.jfa.foundation.Foundation.*;

@SuppressWarnings("unused")
public interface NSAppearance extends NSObject {
  static NSAppearance appearanceNamed(NSAppearanceName appearanceName) {
    return ObjcToJava.map(invoke(getObjcClass("NSAppearance"), "appearanceNamed:", nsString(appearanceName.name())), NSAppearance.class);
  }

  String name();

  enum NSAppearanceName {
    NSAppearanceNameAqua,
    NSAppearanceNameDarkAqua,
    NSAppearanceNameVibrantLight,
    NSAppearanceNameVibrantDark,
    NSAppearanceNameAccessibilityHighContrastAqua,
    NSAppearanceNameAccessibilityHighContrastDarkAqua,
    NSAppearanceNameAccessibilityHighContrastVibrantLight,
    NSAppearanceNameAccessibilityHighContrastVibrantDark
  }
}
