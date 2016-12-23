package com.marktony.zhihudaily.bookmarks;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.marktony.zhihudaily.R;
import com.marktony.zhihudaily.SearchActivity;

/**
 * Created by lizhaotailang on 2016/12/20.
 */

public class BookmarksFragment extends Fragment
        implements BookmarksContract.View{

    private RecyclerView recyclerView;

    public BookmarksFragment() {}

    public static BookmarksFragment newInstance() {
        return new BookmarksFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bookmarks, container, false);

        initViews(view);

        setHasOptionsMenu(true);

        return view;
    }

    @Override
    public void setPresenter(BookmarksContract.Presenter presenter) {

    }

    @Override
    public void initViews(View view) {

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_bookmarks, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_search) {
            startActivity(new Intent(getActivity(), SearchActivity.class));
        }
        return true;
    }
}