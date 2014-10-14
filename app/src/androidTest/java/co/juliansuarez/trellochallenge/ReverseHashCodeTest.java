package co.juliansuarez.trellochallenge;

import junit.framework.TestCase;

/**
 * Created by julian on 14/10/14.
 */
public class ReverseHashCodeTest extends TestCase {

    public void testHashCodeReverser(){
        final HashCodeReverser hashCodeReverser =
                new HashCodeReverser(ReverseHashFragment.BASE_LETTERS, ReverseHashFragment.HASH);
        String result = hashCodeReverser.getReverseHashCode();
        long expectedHash = 25180466553932L;
        assertEquals( "Hash doesn't match expected result",expectedHash,hash(result));

    }

    public long hash(String s) {
        long h = 7;
        String letters = "acdegilmnoprstuw";
        for (int i = 0; i < s.length(); i++) {
            h = h * 37 + letters.indexOf(s.charAt(i));
        }
        return h;
    }
}
