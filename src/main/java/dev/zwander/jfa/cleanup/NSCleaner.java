package dev.zwander.jfa.cleanup;

import dev.zwander.jfa.FoundationCallback;
import dev.zwander.jfa.FoundationCallbackRegistry;
import dev.zwander.jfa.ObjcToJava;
import dev.zwander.jfa.appkit.NSObject;
import dev.zwander.jfa.foundation.Foundation;
import dev.zwander.jfa.foundation.ID;

import java.lang.ref.Cleaner;

@SuppressWarnings("unused")
public final class NSCleaner {
  public static final Cleaner CLEANER = Cleaner.create();

  private NSCleaner() {
  }

  public static void register(Object obj, NSObject nsObject) {
    CLEANER.register(obj, () -> Foundation.cfRelease(ObjcToJava.toID(nsObject)));
  }

  public static void register(Object obj, ID id) {
    CLEANER.register(obj, () -> Foundation.invoke(id, "dealloc"));
  }

  public static void register(Object obj, FoundationCallback callback) {
    CLEANER.register(obj, () -> FoundationCallbackRegistry.unregister(callback));
  }

  public static void register(Object obj, Runnable runnable) {
    CLEANER.register(obj, runnable);
  }
}
