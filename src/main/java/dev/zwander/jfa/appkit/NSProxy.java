package dev.zwander.jfa.appkit;

import dev.zwander.jfa.ObjcToJava;
import dev.zwander.jfa.foundation.ID;

@SuppressWarnings("unused")
public interface NSProxy extends NSObject {
  static NSProxy alloc() {
    return ObjcToJava.alloc(NSProxy.class);
  }

  void forwardInvocation(NSInvocation invocation);

  NSMethodSignature methodSignatureForSelector(ID sel);
}
