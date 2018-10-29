package org.pattern.lhf.prototype;

import org.pattern.lhf.prototype.framework.Product;

public class UnderlinePen implements Product {
    private char decochar;
    public UnderlinePen(char decochar){
        this.decochar=decochar;
    }
    @Override
    public void use(String s) {
        int length=s.getBytes().length;
        System.out.println("\" "+s+" \"");
        for(int i=0;i<length;i++){
            System.out.print(decochar);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product product=null;
        try{
            product=(Product)clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return product;
    }
}
