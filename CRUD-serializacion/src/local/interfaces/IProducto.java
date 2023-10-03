package local.interfaces;

import local.dto.ToyDTO;

import java.io.IOException;
import java.util.List;

public interface IProducto {
    ToyDTO findById(int id);
    List<ToyDTO> findAll() throws IOException, ClassNotFoundException;
    void save(ToyDTO producto) throws IOException;
    void update(ToyDTO producto) throws IOException;
    void delete(ToyDTO producto) throws IOException;
}
