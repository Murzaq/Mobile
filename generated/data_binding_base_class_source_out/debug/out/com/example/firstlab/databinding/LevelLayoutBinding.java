// Generated by view binder compiler. Do not edit!
package com.example.firstlab.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.firstlab.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LevelLayoutBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btnAddToCalc;

  @NonNull
  public final Button btnChangeAccuracy;

  @NonNull
  public final ImageButton btnClose;

  @NonNull
  public final ImageButton btnInfo;

  @NonNull
  public final RelativeLayout levelLayout;

  @NonNull
  public final TextView tvAccuracyMode;

  @NonNull
  public final TextView tvAngle;

  private LevelLayoutBinding(@NonNull RelativeLayout rootView, @NonNull Button btnAddToCalc,
      @NonNull Button btnChangeAccuracy, @NonNull ImageButton btnClose,
      @NonNull ImageButton btnInfo, @NonNull RelativeLayout levelLayout,
      @NonNull TextView tvAccuracyMode, @NonNull TextView tvAngle) {
    this.rootView = rootView;
    this.btnAddToCalc = btnAddToCalc;
    this.btnChangeAccuracy = btnChangeAccuracy;
    this.btnClose = btnClose;
    this.btnInfo = btnInfo;
    this.levelLayout = levelLayout;
    this.tvAccuracyMode = tvAccuracyMode;
    this.tvAngle = tvAngle;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LevelLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LevelLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.level_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LevelLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnAddToCalc;
      Button btnAddToCalc = ViewBindings.findChildViewById(rootView, id);
      if (btnAddToCalc == null) {
        break missingId;
      }

      id = R.id.btnChangeAccuracy;
      Button btnChangeAccuracy = ViewBindings.findChildViewById(rootView, id);
      if (btnChangeAccuracy == null) {
        break missingId;
      }

      id = R.id.btnClose;
      ImageButton btnClose = ViewBindings.findChildViewById(rootView, id);
      if (btnClose == null) {
        break missingId;
      }

      id = R.id.btnInfo;
      ImageButton btnInfo = ViewBindings.findChildViewById(rootView, id);
      if (btnInfo == null) {
        break missingId;
      }

      RelativeLayout levelLayout = (RelativeLayout) rootView;

      id = R.id.tvAccuracyMode;
      TextView tvAccuracyMode = ViewBindings.findChildViewById(rootView, id);
      if (tvAccuracyMode == null) {
        break missingId;
      }

      id = R.id.tvAngle;
      TextView tvAngle = ViewBindings.findChildViewById(rootView, id);
      if (tvAngle == null) {
        break missingId;
      }

      return new LevelLayoutBinding((RelativeLayout) rootView, btnAddToCalc, btnChangeAccuracy,
          btnClose, btnInfo, levelLayout, tvAccuracyMode, tvAngle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
