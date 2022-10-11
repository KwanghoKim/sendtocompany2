// Generated by view binder compiler. Do not edit!
package org.schabi.newpipe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.schabi.newpipe.R;
import org.schabi.newpipe.views.NewPipeTextView;

public final class SelectKioskItemBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView itemThumbnailView;

  @NonNull
  public final NewPipeTextView itemTitleView;

  private SelectKioskItemBinding(@NonNull RelativeLayout rootView,
      @NonNull ImageView itemThumbnailView, @NonNull NewPipeTextView itemTitleView) {
    this.rootView = rootView;
    this.itemThumbnailView = itemThumbnailView;
    this.itemTitleView = itemTitleView;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SelectKioskItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SelectKioskItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.select_kiosk_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SelectKioskItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.itemThumbnailView;
      ImageView itemThumbnailView = ViewBindings.findChildViewById(rootView, id);
      if (itemThumbnailView == null) {
        break missingId;
      }

      id = R.id.itemTitleView;
      NewPipeTextView itemTitleView = ViewBindings.findChildViewById(rootView, id);
      if (itemTitleView == null) {
        break missingId;
      }

      return new SelectKioskItemBinding((RelativeLayout) rootView, itemThumbnailView,
          itemTitleView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}