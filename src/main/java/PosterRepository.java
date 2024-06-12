public class PosterRepository {
    private String[] items = new String[0];

    public void save(String item) {
        String[] tmp = new String[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public String[] getItems() {
        return items;
    }
}
