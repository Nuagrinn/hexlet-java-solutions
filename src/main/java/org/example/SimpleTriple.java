package org.example;

public class SimpleTriple<L, M, R>  implements Triple<L, M, R> {

    private L left;
    private M middle;
    private R right;

    SimpleTriple(L left, M middle, R right) {
        this.left = left;
        this.middle = middle;
        this.right = right;
    }

    public L getLeft() {
        return left;
    }

    public M getMiddle() {
        return middle;
    }

    public R getRight() {
        return right;
    }

    public void setLeft(L left) {
        this.left = left;
    }

    public void setMiddle(M middle) {
        this.middle = middle;
    }

    public void setRight(R right) {
        this.right = right;
    }

    // BEGIN (write your solution here)
    public SimpleTriple<R, M, L> reverse(SimpleTriple<L, M, R> st) {

        SimpleTriple<R, M, L>newST = new SimpleTriple<>(st.getRight(), st.getMiddle(), st.getLeft());

        return newST;

    }
    public boolean isEqualTo(SimpleTriple<L, M, R> st){
        if(this.left.equals(st.getLeft())&& this.right.equals(st.getRight()) && this.middle.equals(st.getMiddle())){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        var triple = new SimpleTriple("str", 1, true);

        var reversed = triple.reverse(triple);

        reversed.getLeft(); // true
        reversed.getMiddle(); // 1
        reversed.getRight(); // str
    }
    // END
}
