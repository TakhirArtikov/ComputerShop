package com.example.shop.enums;

public enum LaptopScreenSize {
    THIRTEEN(13),
    FOURTEEN(14),
    FIFTEEN(15),
    SEVENTEEN(17);

    private final int size;

    LaptopScreenSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
