package ninethTask;

import static ninethTask.boys.BoyListGenerator.getBoysList;
import static ninethTask.boys.BoysFilter.getFilteredBoys;

final class Main {

    public static void main(final String[] args) {
        System.out.println(getFilteredBoys(getBoysList()));
    }
}