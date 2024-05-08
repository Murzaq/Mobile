// Generated by view binder compiler. Do not edit!
package com.example.firstlab.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.firstlab.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button biometricAuthButton;

  @NonNull
  public final Button button0;

  @NonNull
  public final Button button1;

  @NonNull
  public final Button button2;

  @NonNull
  public final Button button3;

  @NonNull
  public final Button button4;

  @NonNull
  public final Button button5;

  @NonNull
  public final Button button6;

  @NonNull
  public final Button button7;

  @NonNull
  public final Button button8;

  @NonNull
  public final Button button9;

  @NonNull
  public final Button buttonClearAll;

  @NonNull
  public final Button deleteButton;

  @NonNull
  public final Button loginButton;

  @NonNull
  public final GridLayout numberPad;

  @NonNull
  public final TextView pinInputTextView;

  @NonNull
  public final LinearLayout rootLayout;

  @NonNull
  public final Button setPinButton;

  @NonNull
  public final Button showPinButton;

  private ActivityLoginBinding(@NonNull LinearLayout rootView, @NonNull Button biometricAuthButton,
      @NonNull Button button0, @NonNull Button button1, @NonNull Button button2,
      @NonNull Button button3, @NonNull Button button4, @NonNull Button button5,
      @NonNull Button button6, @NonNull Button button7, @NonNull Button button8,
      @NonNull Button button9, @NonNull Button buttonClearAll, @NonNull Button deleteButton,
      @NonNull Button loginButton, @NonNull GridLayout numberPad,
      @NonNull TextView pinInputTextView, @NonNull LinearLayout rootLayout,
      @NonNull Button setPinButton, @NonNull Button showPinButton) {
    this.rootView = rootView;
    this.biometricAuthButton = biometricAuthButton;
    this.button0 = button0;
    this.button1 = button1;
    this.button2 = button2;
    this.button3 = button3;
    this.button4 = button4;
    this.button5 = button5;
    this.button6 = button6;
    this.button7 = button7;
    this.button8 = button8;
    this.button9 = button9;
    this.buttonClearAll = buttonClearAll;
    this.deleteButton = deleteButton;
    this.loginButton = loginButton;
    this.numberPad = numberPad;
    this.pinInputTextView = pinInputTextView;
    this.rootLayout = rootLayout;
    this.setPinButton = setPinButton;
    this.showPinButton = showPinButton;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.biometricAuthButton;
      Button biometricAuthButton = ViewBindings.findChildViewById(rootView, id);
      if (biometricAuthButton == null) {
        break missingId;
      }

      id = R.id.button0;
      Button button0 = ViewBindings.findChildViewById(rootView, id);
      if (button0 == null) {
        break missingId;
      }

      id = R.id.button1;
      Button button1 = ViewBindings.findChildViewById(rootView, id);
      if (button1 == null) {
        break missingId;
      }

      id = R.id.button2;
      Button button2 = ViewBindings.findChildViewById(rootView, id);
      if (button2 == null) {
        break missingId;
      }

      id = R.id.button3;
      Button button3 = ViewBindings.findChildViewById(rootView, id);
      if (button3 == null) {
        break missingId;
      }

      id = R.id.button4;
      Button button4 = ViewBindings.findChildViewById(rootView, id);
      if (button4 == null) {
        break missingId;
      }

      id = R.id.button5;
      Button button5 = ViewBindings.findChildViewById(rootView, id);
      if (button5 == null) {
        break missingId;
      }

      id = R.id.button6;
      Button button6 = ViewBindings.findChildViewById(rootView, id);
      if (button6 == null) {
        break missingId;
      }

      id = R.id.button7;
      Button button7 = ViewBindings.findChildViewById(rootView, id);
      if (button7 == null) {
        break missingId;
      }

      id = R.id.button8;
      Button button8 = ViewBindings.findChildViewById(rootView, id);
      if (button8 == null) {
        break missingId;
      }

      id = R.id.button9;
      Button button9 = ViewBindings.findChildViewById(rootView, id);
      if (button9 == null) {
        break missingId;
      }

      id = R.id.button_clear_all;
      Button buttonClearAll = ViewBindings.findChildViewById(rootView, id);
      if (buttonClearAll == null) {
        break missingId;
      }

      id = R.id.delete_button;
      Button deleteButton = ViewBindings.findChildViewById(rootView, id);
      if (deleteButton == null) {
        break missingId;
      }

      id = R.id.loginButton;
      Button loginButton = ViewBindings.findChildViewById(rootView, id);
      if (loginButton == null) {
        break missingId;
      }

      id = R.id.numberPad;
      GridLayout numberPad = ViewBindings.findChildViewById(rootView, id);
      if (numberPad == null) {
        break missingId;
      }

      id = R.id.pinInputTextView;
      TextView pinInputTextView = ViewBindings.findChildViewById(rootView, id);
      if (pinInputTextView == null) {
        break missingId;
      }

      LinearLayout rootLayout = (LinearLayout) rootView;

      id = R.id.setPinButton;
      Button setPinButton = ViewBindings.findChildViewById(rootView, id);
      if (setPinButton == null) {
        break missingId;
      }

      id = R.id.showPinButton;
      Button showPinButton = ViewBindings.findChildViewById(rootView, id);
      if (showPinButton == null) {
        break missingId;
      }

      return new ActivityLoginBinding((LinearLayout) rootView, biometricAuthButton, button0,
          button1, button2, button3, button4, button5, button6, button7, button8, button9,
          buttonClearAll, deleteButton, loginButton, numberPad, pinInputTextView, rootLayout,
          setPinButton, showPinButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
