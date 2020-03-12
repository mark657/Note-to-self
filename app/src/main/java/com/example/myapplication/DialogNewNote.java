package com.example.myapplication;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class DialogNewNote extends DialogFragment {
    @Override
public Dialog onCreateDialog (Bundle savedInstanceState){

}
    AlertDialog.Builder builder = new AlertDialog.Builder(getAcivity());

    private Context getAcivity() {
    }

    LayoutInflater inflater = getActivity().getLayoutInflater();

    View dialogView = inflater.inflate(R.layout.dialog_new_note, null);
}
