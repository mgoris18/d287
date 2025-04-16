<h3> Michell Goris</h3>
<h3> D287 - Java Frameworks </h3>
<h3> Assessment </h3>


<h3> Part C </h3>
<pre>
<p> CHANGE - mainscreen.html</p>
<p> Line 14 to - < title > Michell's cell phone shop < / title > </p>
<p> Line 19 to - < h1 > Shop Cell Phone Parts < / h1 > </p>
</pre>
<h3> Part D</h3>
<pre>
    &lt Create - <b>about.html</b> &gt
    &lt ! Doctype html  &gt
    &lt html lang = "en"  &gt
    &lt head &gt
    &lt meta chatset="UTF-8" &gt
    &lt title &gt About Us&lt /title  &gt
    &lt /head &gt
        &lt body  &gt
    &lt p &gt Michell's Cell Phone Supply Store is the best spot for your cell phone essentials. You won't find a better variety of products with the same deal. &lt /p &gt

&lt a href="mainscreen.html" &gt Main Screen&lt /a &gt
&lt /body &gt
&lt /html &gt

<p> INSERT - mainscreen.html</p>

line 89 - &lt a href="about.html" &gt About Us&lt /a &gt

</pre>
<h3> Part E </h3>
<pre>
Insert - BootStrapData.java. 
lines 71-155

if (partRepository.count() == 0 {

            inHousePart pearPhone13screen = new InhousePart();
            pearPhone13screen.setName("Pear Phone 13 Screen");
            pearPhone13screen.setPrice(49.99);
            pearPhone13screen.setInv(20);

            inHousePart pearPhone15screen = new InhousePart();
            pearPhone15screen.setName("Pear Phone 15 Screen");
            pearPhone15screen.setPrice(69.99);
            pearPhone15screen.setInv(20);

            inHousePart pearPhone13Camera = new InhousePart();
            pearPhone13Camera.setName("Pear Phone 13 Camera");
            pearPhone13Camera.setPrice(64.99);
            pearPhone13Camera.setInv(20);

            inHousePart pearPhone15Camera = new InhousePart();
            pearPhone15Camera.setName("Pear Phone 15 Camera");
            pearPhone15Camera.setPrice(89.99);
            pearPhone15Camera.setInv(20);

            inHousePart pearPhone16screen = new InhousePart();
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

</pre>

<h3> Part F </h3>
<pre>
CREATE - productpurchaseconfirmation.html
< !Doctype html>
< html lang = "en">
 <head>
    < meta chatset="UTF-8">
    < itle>Product Purchase Confirmation</title>
< /head>
< body>
< h1> You're product has been succesfully purchased</h1>

a href="mainscreen.html"> Main Screen</a
< /body>
< /html>



CREATE - productpurchaseerror.html

<!Doctype html>
< html lang = "en">
 < head>
    < meta chatset="UTF-8">
    < title>Product Purchase Confirmation</title>
< /head>
< body>
< h1> You're product has been succesfully purchased< /h1>

< a href="mainscreen.html"> Main Screen</a>
< /body>
< /html>


INSERT - mainscreen.html
line 85-86
< a th:hreg="@{/buyproduct(productID=${tempProduct.id})}" class="btn btn-primary btn-sm mb-3"
onclick="if(!(confirm('Are you sure you want to purchase this product?')))return false">Buy</a>
</


INSERT - product.java
lines 109-117

//test to ensure product is in existence before decrementing
public boolean buyProduct() {
if ( this.inv >= 1) {
this.inv--;
return true;
} else {
return false;
}
}




INSERT - ADDProductController.Java
lines 175-187
@ GetMapping("/buyproduct")
public String buyproduct(@RequestParam("productID") int theID, Model theModel){
ProductService productService = context.getBean(ProductServiceImpl.class);
Product product2 = productService.findById(theID);

        boolean productPurchaseConfirmation = product2.buyProduct();
        if ( productPurchaseConfirmation ) {
            productService.save(product2);
            return "productpurchaseconfirmation";
        }

        return "productpurchaseerror";
    }
</pre>

<h3> Part G </h3>

<pre>
INSERT - Mainscreen.html
lines 38-39
< th>Minimum /th >
< th>MaximuM /th >           

lines 48-49
 td th:text="${tempPart.minimum}">1</td>
 td th:text="${tempPart.maximum}">1</td>

INSERT - Part.java
lines 32-34

  @Min (value = 0, message = "Minimum inventory must be at least 1")
    int minimum;
    int maximum;

lines 97-101
 public void setMinimum(int minimum) { this.minimum = minimum; }
    public int getMinimum() { return this.minimum; }
    
    public void setMaximum(int maximum) { this.maximum = maximum; }
    public int getMaximum() { return this.maximum; }

INSERT - INhousePart and OurSourcePart
lines 18-20
this.minimum = 0; this.maximum = 100;

lines 24-24
 <p>< nput type ="text" th:field="*{minimum}" placeholder="Minimum" class="form-control mb-4 col-4"/></p>

    <p> input type ="text" th:field="*{maximum}" placeholder="Maximum" class="form-control mb-4 col-4"/></p>
    
    <p> input type="text" th:field="*{partId}" placeholder="Part ID" class="form-control mb-4 col-4"/></p>
    
    <p>
    <div th:if="${#fields.hasAnyErrors()}">
        <ul> <li th:each="err: ${#fields.alErrors()}" th:text="${err}"></li></ul>
    </div>
    </p>
    
CHANGE - application.properties
line 16
spring.datasource.url=jdbc:h2:file:~/src/main.resources/spring-boot-h2-db102

INSERT - part.java
line 89-95
 public void validateLimits() {
        if (this.inv < this.minimum ) {
            this.inv = this.minimum;
        } else if (this.inv > this.maximum) {
            this.inv = this.maximum;
        }
    }

INSERT - Inhousepartserviceimpl.java and outourcedpartserviceimpl.java
line 54

thePart.validateLimits();
</pre>
<h3> Part H </h3>
<pre>

INSERT - Part.java
lines 19-20
@ValidPartInventory
@ValidPartInventoryMin

CREATE - PartInventoryMinValidator.java
package com.example.demo.validators;

import com.example.demo.domain.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PartInventoryMinimumValidator implements ConstraintValidator <ValidPartInventoryMinimum, Part> {
@Autowired
private ApplicationContext context;

    public static ApplicationContext myContext;

    @Override
    @public void initialize(ValidPartInventoryMinimum constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
        
    }
    
    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        return part.getInv() > part.getMinimum();
    }
}

CREATE Validpartinventoryminimum.java

package com.example.demo.validators;

import javax.validation.Constraint;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import java.lang.annotation.RetentionPolicy;

@Constraint(validatedBy = {PartInventoryMinimumValidator.class})
@Target({ElementType.Type})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPartInventoryMinimum {
String message() default "Inventory cannt be lower than the minimum";
Class<?>[] groups() default {};
Class<? extends Payload>[] payload() default {};

}

CREATE- PartInventoryValidator.java

package com.example.demo.validators;

import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PartInventoryValidator implements ConstraintValidator<ValidPartInventory, Part> {
@Autowired
private ApplicationContext context;
public static ApplicationContext myContext;

    @Override
    public void initialize(ValidPartInventory constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        return part.getInv() <= part.getMaximum();
}
}

CREATE - ValidPartInventory.java
package com.example.demo.validators;

import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Constraint(validateBy = {PartInventoryValidator.class})
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPartInventory {
String message() default "Inventory cannot exceed maximum number of parts";
Class<?>[] groups() default {};
Class<? extends Payload>[] payload() default {};
}
