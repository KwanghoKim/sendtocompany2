// Generated by view binder compiler. Do not edit!
package org.schabi.newpipe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.schabi.newpipe.R;
import org.schabi.newpipe.views.NewPipeTextView;

public final class DrawerHeaderBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView drawerArrow;

  @NonNull
  public final Button drawerHeaderActionButton;

  @NonNull
  public final NewPipeTextView drawerHeaderNewpipeTitle;

  @NonNull
  public final ImageView drawerHeaderServiceIcon;

  @NonNull
  public final NewPipeTextView drawerHeaderServiceView;

  private DrawerHeaderBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView drawerArrow,
      @NonNull Button drawerHeaderActionButton, @NonNull NewPipeTextView drawerHeaderNewpipeTitle,
      @NonNull ImageView drawerHeaderServiceIcon,
      @NonNull NewPipeTextView drawerHeaderServiceView) {
    this.rootView = rootView;
    this.drawerArrow = drawerArrow;
    this.drawerHeaderActionButton = drawerHeaderActionButton;
    this.drawerHeaderNewpipeTitle = drawerHeaderNewpipeTitle;
    this.drawerHeaderServiceIcon = drawerHeaderServiceIcon;
    this.drawerHeaderServiceView = drawerHeaderServiceView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DrawerHeaderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DrawerHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.drawer_header, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DrawerHeaderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.drawer_arrow;
      ImageView drawerArrow = ViewBindings.findChildViewById(rootView, id);
      if (drawerArrow == null) {
        break missingId;
      }

      id = R.id.drawer_header_action_button;
      Button drawerHeaderActionButton = ViewBindings.findChildViewById(rootView, id);
      if (drawerHeaderActionButton == null) {
        break missingId;
      }

      id = R.id.drawer_header_newpipe_title;
      NewPipeTextView drawerHeaderNewpipeTitle = ViewBindings.findChildViewById(rootView, id);
      if (drawerHeaderNewpipeTitle == null) {
        break missingId;
      }

      id = R.id.drawer_header_service_icon;
      ImageView drawerHeaderServiceIcon = ViewBindings.findChildViewById(rootView, id);
      if (drawerHeaderServiceIcon == null) {
        break missingId;
      }

      id = R.id.drawer_header_service_view;
      NewPipeTextView drawerHeaderServiceView = ViewBindings.findChildViewById(rootView, id);
      if (drawerHeaderServiceView == null) {
        break missingId;
      }

      return new DrawerHeaderBinding((ConstraintLayout) rootView, drawerArrow,
          drawerHeaderActionButton, drawerHeaderNewpipeTitle, drawerHeaderServiceIcon,
          drawerHeaderServiceView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
