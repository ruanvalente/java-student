package example.Main;

import example.repository.Repository;
import example.services.RepositoryInDataBase;
import example.services.RepositoryInMemory;

public class RepositoryTest {
    public static void main(String[] args) {
        Repository repository = new RepositoryInDataBase();

        repository.save();
    }
}
