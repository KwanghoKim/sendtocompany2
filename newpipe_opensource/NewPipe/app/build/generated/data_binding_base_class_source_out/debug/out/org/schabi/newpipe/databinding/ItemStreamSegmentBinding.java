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
import org.schabi.newpipe.views.NewPipeTextView;

public final class ItemStreamSegmentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView previewImage;

  @NonNull
  public final NewPipeTextView textViewChannel;

  @NonNull
  public final NewPipeTextView textViewStartSeconds;

  @NonNull
  public final NewPipeTextView textViewTitle;

  private ItemStreamSegmentBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView previewImage, @NonNull NewPipeTextView textViewChannel,
      @NonNull NewPipeTextView textViewStartSeconds, @NonNull NewPipeTextView textViewTitle) {
    this.rootView = rootView;
    this.previewImage = previewImage;
    this.textViewChannel = textViewChannel;
    this.textViewStartSeconds = textViewStartSeconds;
    this.textViewTitle = textViewTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemStreamSegmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemStreamSegmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_stream_segment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemStreamSegmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.previewImage;
      ImageView previewImage = ViewBindings.findChildViewById(rootView, id);
      if (previewImage == null) {
        break missingId;
      }

      id = R.id.textViewChannel;
      NewPipeTextView textViewChannel = ViewBindings.findChildViewById(rootView, id);
      if (textViewChannel == null) {
        break missingId;
      }

      id = R.id.textViewStartSeconds;
      NewPipeTextView textViewStartSeconds = ViewBindings.findChildViewById(rootView, id);
      if (textViewStartSeconds == null) {
        break missingId;
      }

      id = R.id.textViewTitle;
      NewPipeTextView textViewTitle = ViewBindings.findChildViewById(rootView, id);
      if (textViewTitle == null) {
        break missingId;
      }

      return new ItemStreamSegmentBinding((ConstraintLayout) rootView, previewImage,
          textViewChannel, textViewStartSeconds, textViewTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
