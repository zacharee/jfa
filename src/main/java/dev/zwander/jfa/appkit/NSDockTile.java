package dev.zwander.jfa.appkit;

@SuppressWarnings("unused")
public interface NSDockTile extends NSObject {
  String badgeLabel();

  void setBadgeLabel(String value);

  boolean showsApplicationBadge();
}
