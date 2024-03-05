package org.example.generics.simpletriple;

//Создайте в классе метод reverse(), который переворачивает тройку. Метод должен вернуть новую тройку, в который элементы
// расположены в обратном порядке

//Создайте в классе метод isEqualTo(), который принимает в качестве параметра другую тройку и сравнивает их.
// Если они идентичны, метод должен вернуть true, в ином случае false
public class SimpleTriple<L, M, R> implements Triple<L, M, R> {

    private  L left;
    private M middle;
    private R right;

    public SimpleTriple(L left, M middle, R right) {
        this.left = left;
        this.middle = middle;
        this.right = right;
    }

    public Triple<R, M, L> reverse() {
        return new SimpleTriple<>(getRight(), getMiddle(), getLeft());
    }

    public boolean isEqualTo(Triple<L, M, R> triple2) {
        return getLeft().equals(triple2.getLeft()) && getMiddle().equals(triple2.getMiddle())
                && getRight().equals(triple2.getRight());
    }

    @Override
    public L getLeft() {
        return left;
    }

    @Override
    public M getMiddle() {
        return middle;
    }

    @Override
    public R getRight() {
        return right;
    }

    @Override
    public void setLeft(L left) {
        this.left = left;
    }

    @Override
    public void setMiddle(M middle) {
        this.middle = middle;
    }

    @Override
    public void setRight(R right) {
        this.right = right;
    }

}
