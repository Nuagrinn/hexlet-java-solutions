package org.example.classes;

// BEGIN (write your solution here)
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ProductsStorage {

    private int goodsQuantity;
    private final int maxCapacity;

    public void placeProducts(int goodsToReplace) {
        if((goodsQuantity + goodsToReplace) <= maxCapacity){
            goodsQuantity = goodsQuantity + goodsToReplace;
        }
        System.out.println("На складе недостаточно места для размещения товара, количество превышает допустимое значение на " + ((goodsQuantity + goodsToReplace) - maxCapacity));
    }

    public void takeProducts(int goodsToTake){
        if(goodsToTake <= goodsQuantity ){
            goodsQuantity = goodsQuantity - goodsToTake;
        }
        System.out.println("Количество товара на складе меньше на " + (goodsToTake - goodsQuantity));

    }

    public static void main(String[] args) {

        ProductsStorage storage = new ProductsStorage(20, 50);

        storage.takeProducts(30);
        storage.placeProducts(1);

    }

}
