package dev.zwander.jfa;

import dev.zwander.jfa.appkit.NSImage;
import dev.zwander.jfa.foundation.Foundation;
import dev.zwander.jfa.foundation.ID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

class ObjcToJavaTest {

  @Test
  void testMapToObject() {
    ID instance = Foundation.invoke(Foundation.getObjcClass("NSImage"), "alloc");

    Optional<Class<?>> javaClass = ObjcToJava.getJavaClass(instance);

    Assertions.assertTrue(javaClass.isPresent());
    Assertions.assertEquals(NSImage.class, javaClass.get());
  }
}