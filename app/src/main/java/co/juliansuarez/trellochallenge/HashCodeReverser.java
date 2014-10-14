package co.juliansuarez.trellochallenge;

import java.util.ArrayList;

/**
* Created by julian on 14/10/14.
*/
public class HashCodeReverser {
    private String mBaseLetters;
    private long mHash;

    public HashCodeReverser(String baseLetters, long hash) {
        mBaseLetters = baseLetters;
        mHash = hash;
    }

    public String getReverseHashCode() {
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        int baseLettersLength = mBaseLetters.length();
        long hash = mHash;
        while (hash > 37) {
            for (int i = 0; i < baseLettersLength; i++) {
                if ((hash - i) % 37L == 0) {
                    indexes.add(i);
                    hash = (hash - i) / 37L;
                    break;
                }
            }
        }

        return getRightString(indexes);
    }

    private String getRightString(ArrayList<Integer> indexes) {
        StringBuilder string = new StringBuilder();
        for (int i = indexes.size() - 1; i >= 0; i--) {
            if (i < mBaseLetters.length()) {
                string.append(mBaseLetters.charAt(indexes.get(i)));
            }
        }

        return string.toString();
    }
}
