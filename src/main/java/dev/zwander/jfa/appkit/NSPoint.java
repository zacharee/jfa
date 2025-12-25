package dev.zwander.jfa.appkit;

import com.sun.jna.Structure;
import dev.zwander.jfa.foundation.Foundation;

@Structure.FieldOrder({"x", "y"})
@SuppressWarnings("unused")
public class NSPoint extends Structure implements Structure.ByValue {
  public Foundation.CGFloat x;
  public Foundation.CGFloat y;
}
