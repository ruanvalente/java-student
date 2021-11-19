package example.services;

import example.repository.Repository;

public class RepositoryInArchive implements Repository {
    @Override
    public void save() {
        System.out.println("Salvando em Arquivo");
    }
}
