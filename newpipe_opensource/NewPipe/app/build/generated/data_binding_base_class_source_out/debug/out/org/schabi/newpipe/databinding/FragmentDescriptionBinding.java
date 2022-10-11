// Generated by view binder compiler. Do not edit!
package org.schabi.newpipe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.schabi.newpipe.R;
import org.schabi.newpipe.views.NewPipeTextView;

public final class FragmentDescriptionBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final Barrier barrier;

  @NonNull
  public final NewPipeTextView detailDescriptionNoteView;

  @NonNull
  public final NewPipeTextView detailDescriptionView;

  @NonNull
  public final LinearLayout detailMetadataLayout;

  @NonNull
  public final ImageView detailSelectDescriptionButton;

  @NonNull
  public final NewPipeTextView detailUploadDateView;

  private FragmentDescriptionBinding(@NonNull NestedScrollView rootView, @NonNull Barrier barrier,
      @NonNull NewPipeTextView detailDescriptionNoteView,
      @NonNull NewPipeTextView detailDescriptionView, @NonNull LinearLayout detailMetadataLayout,
      @NonNull ImageView detailSelectDescriptionButton,
      @NonNull NewPipeTextView detailUploadDateView) {
    this.rootView = rootView;
    this.barrier = barrier;
    this.detailDescriptionNoteView = detailDescriptionNoteView;
    this.detailDescriptionView = detailDescriptionView;
    this.detailMetadataLayout = detailMetadataLayout;
    this.detailSelectDescriptionButton = detailSelectDescriptionButton;
    this.detailUploadDateView = detailUploadDateView;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDescriptionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDescriptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_description, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDescriptionBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.barrier;
      Barrier barrier = ViewBindings.findChildViewById(rootView, id);
      if (barrier == null) {
        break missingId;
      }

      id = R.id.detail_description_note_view;
      NewPipeTextView detailDescriptionNoteView = ViewBindings.findChildViewById(rootView, id);
      if (detailDescriptionNoteView == null) {
        break missingId;
      }

      id = R.id.detail_description_view;
      NewPipeTextView detailDescriptionView = ViewBindings.findChildViewById(rootView, id);
      if (detailDescriptionView == null) {
        break missingId;
      }

      id = R.id.detail_metadata_layout;
      LinearLayout detailMetadataLayout = ViewBindings.findChildViewById(rootView, id);
      if (detailMetadataLayout == null) {
        break missingId;
      }

      id = R.id.detail_select_description_button;
      ImageView detailSelectDescriptionButton = ViewBindings.findChildViewById(rootView, id);
      if (detailSelectDescriptionButton == null) {
        break missingId;
      }

      id = R.id.detail_upload_date_view;
      NewPipeTextView detailUploadDateView = ViewBindings.findChildViewById(rootView, id);
      if (detailUploadDateView == null) {
        break missingId;
      }

      return new FragmentDescriptionBinding((NestedScrollView) rootView, barrier,
          detailDescriptionNoteView, detailDescriptionView, detailMetadataLayout,
          detailSelectDescriptionButton, detailUploadDateView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
