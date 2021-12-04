package com.mirea.kuznetsov.mireaproject.ui.browser;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import com.mirea.kuznetsov.mireaproject.R;
import com.mirea.kuznetsov.mireaproject.databinding.FragmentBrowserBinding;
import com.mirea.kuznetsov.mireaproject.databinding.FragmentGalleryBinding;
import com.mirea.kuznetsov.mireaproject.ui.gallery.GalleryViewModel;

public class BrowserFragment extends Fragment {

    private BrowserViewModel browserViewModel;
    private FragmentBrowserBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                            ViewGroup container, Bundle savedInstanceState) {
        Log.e("BrowserFragment", "#onCreateView()");
        browserViewModel =
                new ViewModelProvider(this).get(BrowserViewModel.class);
        binding = FragmentBrowserBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        final WebView webView = binding.webView;
        browserViewModel.getCurrentPage().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String url) {
                webView.loadUrl(url);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}