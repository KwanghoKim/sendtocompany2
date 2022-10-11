// Generated by view binder compiler. Do not edit!
package org.schabi.newpipe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.schabi.newpipe.R;

public final class FragmentBlankBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ErrorPanelBinding errorPanel;

  private FragmentBlankBinding(@NonNull RelativeLayout rootView,
      @NonNull ErrorPanelBinding errorPanel) {
    this.rootView = rootView;
    this.errorPanel = errorPanel;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentBlankBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentBlankBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_blank, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentBlankBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.error_panel;
      View errorPanel = ViewBindings.findChildViewById(rootView, id);
      if (errorPanel == null) {
        break missingId;
      }
      ErrorPanelBinding binding_errorPanel = ErrorPanelBinding.bind(errorPanel);

      return new FragmentBlankBinding((RelativeLayout) rootView, binding_errorPanel);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
