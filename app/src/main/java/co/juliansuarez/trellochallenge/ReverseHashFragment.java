package co.juliansuarez.trellochallenge;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

/**
 * A placeholder fragment containing a simple view.
 */
public class ReverseHashFragment extends Fragment {

    public static final long HASH = 25180466553932L;
    public static final String BASE_LETTERS = "acdegilmnoprstuw";

    @InjectView(R.id.textViewHash)
    TextView mTextViewHash;
    @InjectView(R.id.textViewResult)
    TextView mTextViewResult;

    public ReverseHashFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_reverse_hash, container, false);
        ButterKnife.inject(this, rootView);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mTextViewHash.setText(
                getResources().getString(R.string.reverse_hash_value, HASH));
    }

    @OnClick(R.id.buttonGenerate)
    public void onGenerateClicked(Button buttonGenerate) {
        final HashCodeReverser
                hashCodeReverser = new HashCodeReverser(BASE_LETTERS, HASH);
        mTextViewResult.setText(hashCodeReverser.getReverseHashCode());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }
}
