package dev.zwander.jfa;

import dev.zwander.jfa.foundation.Foundation;
import dev.zwander.jfa.foundation.ID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JavaToObjcTest {

  @Test
  void defineClass() {
    TestClass testClass = new TestClass();
    ID instance = JavaToObjc.map(testClass);
    Foundation.invoke(instance, "testMethod");

    Assertions.assertTrue(testClass.wasInvoked);
  }

}