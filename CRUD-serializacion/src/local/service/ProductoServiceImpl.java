package local.service;


import local.dto.ToyDTO;
import local.interfaces.IProducto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductoServiceImpl implements IProducto {
    private List<ToyDTO> productos;

    public ProductoServiceImpl() throws IOException, ClassNotFoundException {
        productos = new ArrayList<>();
    }

    @Override
    public ToyDTO findById(int id) {
        return productos.stream()
                .filter(producto -> producto.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<ToyDTO> findAll() throws IOException, ClassNotFoundException {
        productos = (List<ToyDTO>) ObjectSerializer.readObjectFromFile("productos.ax");
       return productos;
    }

    @Override
    public void save(ToyDTO producto) throws IOException {
        productos.add(producto);
        ObjectSerializer.writeObjectToFile(productos, "productos.ax");
    }

    @Override
    public void update(ToyDTO producto) throws IOException {
        ToyDTO oldProducto = findById(producto.getId());
        if (oldProducto != null) {
            productos.remove(oldProducto);
            productos.add(producto);
            ObjectSerializer.writeObjectToFile(productos, "productos.ax");
        }
    }

    @Override
    public void delete(ToyDTO producto) throws IOException {
        productos.remove(producto);
        ObjectSerializer.writeObjectToFile(productos, "productos.ax");
    }
}

