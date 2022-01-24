package iterator;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
    ArrayList items;
    int position;

    public PancakeHouseMenuIterator(ArrayList items) {
        this.items = items;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public Object next() {
        Object menuItem = items.get(position);
        position = position + 1;
        return menuItem;
    }
}
