package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        if (partRepository.count() == 0) {

            InhousePart pearPhone13screen = new InhousePart();
            pearPhone13screen.setName("Pear Phone 13 Screen");
            pearPhone13screen.setPrice(49.99);
            pearPhone13screen.setInv(20);

            InhousePart pearPhone15screen = new InhousePart();
            pearPhone15screen.setName("Pear Phone 15 Screen");
            pearPhone15screen.setPrice(69.99);
            pearPhone15screen.setInv(20);

            InhousePart pearPhone13Camera = new InhousePart();
            pearPhone13Camera.setName("Pear Phone 13 Camera");
            pearPhone13Camera.setPrice(64.99);
            pearPhone13Camera.setInv(20);

            InhousePart pearPhone15Camera = new InhousePart();
            pearPhone15Camera.setName("Pear Phone 15 Camera");
            pearPhone15Camera.setPrice(89.99);
            pearPhone15Camera.setInv(20);

            InhousePart pearPhone16screen = new InhousePart();
            pearPhone16screen.setName("Pear Phone 16 Screen");
            pearPhone16screen.setPrice(99.99);
            pearPhone16screen.setInv(20);

            partRepository.save(pearPhone13screen);
            partRepository.save(pearPhone15screen);
            partRepository.save(pearPhone13Camera);
            partRepository.save(pearPhone15Camera);
            partRepository.save(pearPhone16screen);

        }
        if (outsourcedPartRepository.count() == 0) {
            OutsourcedPart PearPhone13battery = new OutsourcedPart();
            PearPhone13battery.setName("Pear Phone 13 battery");
            PearPhone13battery.setPrice(799.99);
            PearPhone13battery.setInv(20);
            PearPhone13battery.setCompanyName("Pear");

            OutsourcedPart PearPhone12battery = new OutsourcedPart();
            PearPhone12battery.setName("Pear Phone 12 battery");
            PearPhone12battery.setPrice(699.99);
            PearPhone12battery.setInv(20);
            PearPhone12battery.setCompanyName("Pear");

            OutsourcedPart PearPhone14battery = new OutsourcedPart();
            PearPhone14battery.setName("Pear Phone 14 battery");
            PearPhone14battery.setPrice(899.99);
            PearPhone14battery.setInv(20);
            PearPhone14battery.setCompanyName("Pear");

            OutsourcedPart PearPhone15battery = new OutsourcedPart();
            PearPhone15battery.setName("Pear Phone 15 battery");
            PearPhone15battery.setPrice(999.99);
            PearPhone15battery.setInv(20);
            PearPhone15battery.setCompanyName("Pear");

            OutsourcedPart PearPhone16battery = new OutsourcedPart();
            PearPhone16battery.setName("Pear Phone 16 battery");
            PearPhone16battery.setPrice(1499.99);
            PearPhone16battery.setInv(20);
            PearPhone16battery.setCompanyName("Pear");

            outsourcedPartRepository.save(PearPhone13battery);
            outsourcedPartRepository.save(PearPhone12battery);
            outsourcedPartRepository.save(PearPhone14battery);
            outsourcedPartRepository.save(PearPhone15battery);
            outsourcedPartRepository.save(PearPhone16battery);
        }

        if (productRepository.count() == 0) {
            Product PearPhone13 = new Product("Pear Phone 13", 799.99, 15);
            Product PearPhone12 = new Product("Pear Phone 12", 699.99, 15);
            Product PearPhone14 = new Product("Pear Phone 14", 899.99, 15);
            Product PearPhone15 = new Product("Pear Phone 15", 999.99, 15);
            Product PearPhone16 = new Product("Pear Phone 16", 1199.99, 15);

            productRepository.save(PearPhone13);
            productRepository.save(PearPhone12);
            productRepository.save(PearPhone14);
            productRepository.save(PearPhone15);
            productRepository.save(PearPhone16);
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
