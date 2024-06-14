package com.example.assignment1bscaffold;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class VendorList implements Iterable<Vendor> {
    private List<Vendor> vendors = new ArrayList<>();

    public void addVendor(Vendor vendor) {
        vendors.add(vendor);
    }

    @Override
    public Iterator<Vendor> iterator() {
        return new Iterator<Vendor>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < vendors.size();
            }

            @Override
            public Vendor next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("No more vendors.");
                }
                return vendors.get(currentIndex++);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Remove operation is not supported.");
            }
        };
    }
}
