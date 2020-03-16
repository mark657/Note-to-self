package com.example.myapplication;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.DialogFragment;

public class DialogShowNote extends DialogFragment {

    private Note note;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_show_note, null);

        final TextView textImportant = (TextView) dialogView.findViewById(R.id.textViewImportant);
        final TextView textTodo = (TextView) dialogView.findViewById(R.id.textViewTodo);
        final TextView textIdea = (TextView) dialogView.findViewById(R.id.textViewIdea);
        final TextView txtTitle = (TextView) dialogView.findViewById(R.id.txtTitle);
        final TextView txtDescription = (TextView) dialogView.findViewById(R.id.txtDescription);

        final Button btnOk = (Button) dialogView.findViewById(R.id.btnOk);

        txtTitle.setText(note.getTitle());
        txtDescription.setText(note.getDescription());

        if (!note.isImportant()) {
            textImportant.setVisibility(View.GONE);
        }

        if (!note.isTodo()) {
            textTodo.setVisibility(View.GONE);
        }

        if (!note.isIdea()) {
            textIdea.setVisibility(View.GONE);
        }

        btnOk.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
               dismiss();
            }
        });

        return builder.setView(dialogView).create();

    }

    public void sendNoteSelected(Note noteSelected) {
        note = noteSelected;
    }
}


