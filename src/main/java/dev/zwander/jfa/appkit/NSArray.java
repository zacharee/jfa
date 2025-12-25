package dev.zwander.jfa.appkit;

import dev.zwander.jfa.ObjcToJava;
import dev.zwander.jfa.foundation.ID;
import dev.zwander.jfa.foundation.VarArgs;

import java.util.Collection;

@SuppressWarnings("unused")
public interface NSArray<T> extends NSObject {
  @SuppressWarnings("unchecked")
  static <A> NSArray<A> alloc() {
    return ObjcToJava.alloc(NSArray.class);
  }

  @SuppressWarnings("unchecked")
  static <A> NSArray<A> of(A... values) {
    return NSArray.<A>alloc().initWithObjects(VarArgs.of(values));
  }

  static <A> NSArray<A> of(Collection<A> values) {
    return NSArray.<A>alloc().initWithObjects(VarArgs.of(values));
  }

  NSArray<T> initWithObjects(VarArgs<T> values);

  int count();

  ID objectAtIndex(int index);
}
