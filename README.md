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