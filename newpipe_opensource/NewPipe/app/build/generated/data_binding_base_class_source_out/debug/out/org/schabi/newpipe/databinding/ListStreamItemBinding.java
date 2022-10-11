// Generated by view binder compiler. Do not edit!
package org.schabi.newpipe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import org.schabi.newpipe.views.AnimatedProgressBar;
import org.schabi.newpipe.views.NewPipeTextView;

public final class ListStreamItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final NewPipeTextView itemAdditionalDetails;

  @NonNull
  public final NewPipeTextView itemDurationView;

  @NonNull
  public final AnimatedProgressBar itemProgressView;

  @NonNull
  public final ConstraintLayout itemRoot;

  @NonNull
  public final ImageView itemThumbnailView;

  @NonNull
  public final NewPipeTextView itemUploaderView;

  @NonNull
  public final NewPipeTextView itemVideoTitleView;

  private ListStreamItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull NewPipeTextView itemAdditionalDetails, @NonNull NewPipeTextView itemDurationView,
      @NonNull AnimatedProgressBar itemProgressView, @NonNull ConstraintLayout itemRoot,
      @NonNull ImageView itemThumbnailView, @NonNull NewPipeTextView itemUploaderView,
      @NonNull NewPipeTextView itemVideoTitleView) {
    this.rootView = rootView;
    this.itemAdditionalDetails = itemAdditionalDetails;
    this.itemDurationView = itemDurationView;
    this.itemProgressView = itemProgressView;
    this.itemRoot = itemRoot;
    this.itemThumbnailView = itemThumbnailView;
    this.itemUploaderView = itemUploaderView;
    this.itemVideoTitleView = itemVideoTitleView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ListStreamItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListStreamItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.list_stream_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListStreamItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.itemAdditionalDetails;
      NewPipeTextView itemAdditionalDetails = ViewBindings.findChildViewById(rootView, id);
      if (itemAdditionalDetails == null) {
        break missingId;
      }

      id = R.id.itemDurationView;
      NewPipeTextView itemDurationView = ViewBindings.findChildViewById(rootView, id);
      if (itemDurationView == null) {
        break missingId;
      }

      id = R.id.itemProgressView;
      AnimatedProgressBar itemProgressView = ViewBindings.findChildViewById(rootView, id);
      if (itemProgressView == null) {
        break missingId;
      }

      ConstraintLayout itemRoot = (ConstraintLayout) rootView;

      id = R.id.itemThumbnailView;
      ImageView itemThumbnailView = ViewBindings.findChildViewById(rootView, id);
      if (itemThumbnailView == null) {
        break missingId;
      }

      id = R.id.itemUploaderView;
      NewPipeTextView itemUploaderView = ViewBindings.findChildViewById(rootView, id);
      if (itemUploaderView == null) {
        break missingId;
      }

      id = R.id.itemVideoTitleView;
      NewPipeTextView itemVideoTitleView = ViewBindings.findChildViewById(rootView, id);
      if (itemVideoTitleView == null) {
        break missingId;
      }

      return new ListStreamItemBinding((ConstraintLayout) rootView, itemAdditionalDetails,
          itemDurationView, itemProgressView, itemRoot, itemThumbnailView, itemUploaderView,
          itemVideoTitleView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
