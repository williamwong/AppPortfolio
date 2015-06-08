package org.williamwong.myappportfolio;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A fragment containing a list of launchers.
 */
public class MainActivityFragment extends Fragment {

  public MainActivityFragment() {
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_main, container, false);

    Button btn_spotify = (Button) view.findViewById(R.id.button_spotify);
    Button btn_scores = (Button) view.findViewById(R.id.button_scores);
    Button btn_library = (Button) view.findViewById(R.id.button_library);
    Button btn_build_it = (Button) view.findViewById(R.id.button_build_it);
    Button btn_xyz = (Button) view.findViewById(R.id.button_xyz);
    Button btn_capstone = (Button) view.findViewById(R.id.button_capstone);

    btn_spotify.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Toast.makeText(getActivity(), getString(R.string.toast_spotify), Toast.LENGTH_SHORT)
            .show();
      }
    });

    btn_scores.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Toast.makeText(getActivity(), getString(R.string.toast_scores), Toast.LENGTH_SHORT)
            .show();
      }
    });

    btn_library.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Toast.makeText(getActivity(), getString(R.string.toast_library), Toast.LENGTH_SHORT)
            .show();
      }
    });

    btn_build_it.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Toast.makeText(getActivity(), getString(R.string.toast_build_it), Toast.LENGTH_SHORT)
            .show();
      }
    });

    btn_xyz.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Toast.makeText(getActivity(), getString(R.string.toast_xyz), Toast.LENGTH_SHORT)
            .show();
      }
    });

    btn_capstone.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Toast.makeText(getActivity(), getString(R.string.toast_capstone), Toast.LENGTH_SHORT)
            .show();
      }
    });

    return view;
  }
}
