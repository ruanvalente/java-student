package example.services;

import example.repository.Repository;

public class RepositoryInDataBase implements Repository {
    @Override
    public void save() {
        System.out.println("Salvando em banco de dados");
    }
}
