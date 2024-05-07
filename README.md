array list use .add to add items to list
use .remove to remove items on list 
use .clear to clear the list 
for hashMap use .put to add items to map 
use .replace to remove items from hashmap

test casing is used to test if your code is working the way that its supposed too.

a unit test only test a specific method or class not the whole project 

you need to add a Junit to your pom folder to import the testing 

your tests will always be in a package named test will not appear in the package you are working in 

have to use the @Test command to specify its a test

Try and be very specific in naming your test to avoid confusions later on 

You should have your test fail and pass to insure it works properly. 

This will help in the event that you have a test that adds two numbers but if you accidently messed up your code and used a multiplication symbol and still get the same answer your test will work in theory but is technically wrong example 2+2=4/2*2=4.

 <dependencies>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <version>5.10.2</version>
        <scope>test</scope>
    </dependency>
</dependencies>

this is what you will have to add in the pom file at the end to bring in the Junit test 

a test has three main parts
1. Given-arrange-setup= setting up your test adding the expected result 
2. when-act-execute= including the values you want testet exm in a calculator that adds you would include the numbers too add here 
3. then-assert-verify= this is where you use an assertion command to verify results
