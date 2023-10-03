package local;

import local.dto.ToyDTO;
import local.interfaces.IProducto;
import local.service.ProductoServiceImpl;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class PrincipalProducto {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String opc = "1";
        IProducto repo = new ProductoServiceImpl();
        do {
            Scanner s = new Scanner(System.in);
            System.out.print("Menu \n 1. Add  \n 2. Get \n 3. Update " +
                    "\n 4. Delete  \n 5. exit \n =>");
            opc = s.next();
            switch (opc) {
                case "1": {
                    System.out.println("Id toy: ");
                    Integer id = s.nextInt();
                    System.out.println("Toy name: ");
                    String nam = s.next();
                    System.out.println("category: ");
                    String cat = s.next();
                    System.out.println("price: ");
                    String pri = s.next();
                    System.out.println("quantities: ");
                    double qu = s.nextDouble();
                    repo.save(new ToyDTO(id,nam, cat, pri, qu));
                    break;
                }
                case "2": {
                    List<ToyDTO> productos = repo.findAll();
                    if(!productos.isEmpty()){
                        productos.forEach(System.out::println);
                    }else{
                        System.out.println("No hay registros");
                    }
                    break;
                }
                case "3": {
                    System.out.println("===== update ====");
                    System.out.print("id  toy: ");
                    Integer idp = s.nextInt();
                    System.out.print("enter name: ");
                    String nom = s.next();
                    System.out.print("enter category: ");
                    String cat = s.next();
                    System.out.print("enter price:");
                    String pri = s.next();
                    System.out.print("enter quantities: ");
                    double qu = s.nextDouble();
                    ToyDTO beaActualizar = new ToyDTO(idp, nom, cat, pri, qu);
                    repo.update(beaActualizar);
                    break;
                }
                case "4": {
                    System.out.println("===== delete ======");
                    System.out.print("enter id of the register: ");
                    Integer id = s.nextInt();
                    repo.delete(repo.findById(id));
                    repo.findAll().forEach(System.out::println);
                    break;
                }
                case "5": {
                    opc = "5";
                    break;
                }
            }
        } while (opc != "5");
    }
    }

