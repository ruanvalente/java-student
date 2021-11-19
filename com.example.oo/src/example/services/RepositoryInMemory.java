package example.services;

import example.repository.Repository;

public class RepositoryInMemory implements Repository {
    @Override
    public void save() {
        System.out.println("Salvando em memória");
    }
}
