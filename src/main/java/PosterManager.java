public class PosterManager {
    private PosterRepository repo;
    private int countRecords = 10;

    public PosterManager(PosterRepository repo) {
        this.repo = repo;
    }

    public PosterManager(PosterRepository repo, int countRecords) {
        this.repo = repo;
        this.countRecords = countRecords;
    }

    public void add(String item) {
        repo.save(item);
    }

    public String[] findAll() {
        return repo.getItems();
    }

    public String[] findLast() {
        int resultLength;
        String[] items = findAll();
        if (items.length > countRecords) {
            resultLength = countRecords;
        } else {
            resultLength = items.length;
        }
        String[] reversed = new String[resultLength];

        for (int i = 0; i < resultLength; i++) {
            reversed[i] = items[items.length - 1 - i];
        }

        return reversed;
    }
}
