package ru.netology.domain;

public class Manager {
    private ProductRepository repository = new ProductRepository();

    public Manager() {
    }

    public void add(Product item) {
        repository.save(item);
    }

    public Product[] findAll() {
        return repository.findAll();
    }

    public void dall(int id) {
        repository.removeById(id);
    }

    public Product[] searchBy(String text) {
        Product[] result = new Product[0];
        for (Product item : repository.findAll()) {
            if (matches(item, text)) {
                Product[] tmp = new Product[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = item;
                result = tmp;
            }
        }
        return result;
    }

    public boolean matches(Product item, String search) {
        if (item.getName().contains(search)) {
            return true;
        } else {
            return false;
        }
    }
}

