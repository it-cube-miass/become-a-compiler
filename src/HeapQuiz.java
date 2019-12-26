class HeapQuiz {
    int id;
}


class HeapQuizTest {
    public static void main (String[] args) {
        HeapQuiz[] hq = new HeapQuiz[5];

        for (int i = 0; i < 3; i++) {
            hq[i] = new HeapQuiz();
            hq[i].id = i;
        }

        hq[3] = hq[1];
        hq[4] = hq[1];
        hq[3] = null;
        hq[4] = hq[0];
        hq[0] = hq[3];
        hq[3] = hq[2];
        hq[2] = hq[0];
    }
}
