// Generated by view binder compiler. Do not edit!
package com.example.firstlab.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.firstlab.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityHistoryBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button btnClearHistory;

  @NonNull
  public final ImageButton btnClose;

  @NonNull
  public final ScrollView historyScrollView;

  @NonNull
  public final TextView historyTextView;

  private ActivityHistoryBinding(@NonNull ScrollView rootView, @NonNull Button btnClearHistory,
      @NonNull ImageButton btnClose, @NonNull ScrollView historyScrollView,
      @NonNull TextView historyTextView) {
    this.rootView = rootView;
    this.btnClearHistory = btnClearHistory;
    this.btnClose = btnClose;
    this.historyScrollView = historyScrollView;
    this.historyTextView = historyTextView;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHistoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHistoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_history, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHistoryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnClearHistory;
      Button btnClearHistory = ViewBindings.findChildViewById(rootView, id);
      if (btnClearHistory == null) {
        break missingId;
      }

      id = R.id.btnClose;
      ImageButton btnClose = ViewBindings.findChildViewById(rootView, id);
      if (btnClose == null) {
        break missingId;
      }

      ScrollView historyScrollView = (ScrollView) rootView;

      id = R.id.historyTextView;
      TextView historyTextView = ViewBindings.findChildViewById(rootView, id);
      if (historyTextView == null) {
        break missingId;
      }

      return new ActivityHistoryBinding((ScrollView) rootView, btnClearHistory, btnClose,
          historyScrollView, historyTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
