package com.example.myapplication.ui.contacto;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.ui.dashboard.DashboardViewModel;

public class ContactoFragment extends Fragment {

    private ContactoViewModel contactoViewModel;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        contactoViewModel =
                ViewModelProviders.of(this).get(ContactoViewModel.class);
        View root = inflater.inflate(R.layout.contacto_fragment, container, false);
        return root;
    }

}
