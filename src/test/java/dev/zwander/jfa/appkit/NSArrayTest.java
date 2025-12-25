package dev.zwander.jfa.appkit;

import dev.zwander.jfa.ObjcToJava;
import dev.zwander.jfa.foundation.ID;
import dev.zwander.jfa.foundation.VarArgs;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;

class NSArrayTest {

  @Test
  void testNSArray() {
    NSString test = NSString.alloc().initWithString("test");

    NSArray<NSString> nsObjectNSArray = NSArray.<NSString>alloc().initWithObjects(VarArgs.of(test));
    ID id = nsObjectNSArray.objectAtIndex(0);

    NSString nsString = ObjcToJava.map(id, NSString.class);
    Assertions.assertEquals("test", NSString.toString(nsString));
    Assertions.assertEquals(1, nsObjectNSArray.count());
  }

  @Test
  void testNSArrayWithPrimitives() {
    NSArray<Integer> nsObjectNSArray = NSArray.<Integer>alloc().initWithObjects(VarArgs.of(1));
    ID id = nsObjectNSArray.objectAtIndex(0);

    Assertions.assertEquals(1, id.intValue());
    Assertions.assertEquals(1, nsObjectNSArray.count());
  }

  @Test
  void testNSArrayForList() {
    NSString test = NSString.alloc().initWithString("test");

    NSArray<NSString> nsObjectNSArray = NSArray.of(Collections.singletonList(test));
    ID id = nsObjectNSArray.objectAtIndex(0);

    NSString nsString = ObjcToJava.map(id, NSString.class);
    Assertions.assertEquals("test", NSString.toString(nsString));
    Assertions.assertEquals(1, nsObjectNSArray.count());
  }
}