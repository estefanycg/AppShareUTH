package com.example.appshareuth;

import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ChatGrupo extends Fragment {

        private FloatingActionButton btnCrearGrupo;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_chat_grupo, container, false);

            btnCrearGrupo = view.findViewById(R.id.btnCrearGrupo);

            btnCrearGrupo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                    CrearGrupoFragment crearGrupoFragment = new CrearGrupoFragment();
                    crearGrupoFragment.setStyle(DialogFragment.STYLE_NORMAL, R.style.BottomSheetDialogTheme);
                    crearGrupoFragment.show(fragmentManager, "crear_grupo_dialog");
                }
            });


            return view;
        }
    }
