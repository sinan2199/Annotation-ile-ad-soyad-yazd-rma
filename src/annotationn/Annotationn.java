
package annotationn;

import java.lang.annotation.Retention;//import ettik
import java.lang.annotation.RetentionPolicy;//import ettik
import java.lang.reflect.Method;//import ettik

@Retention (RetentionPolicy.RUNTIME)
@interface Annotation1 {
    String ad(); //string değerde ad tanımladık
    String soyad(); //string değerde soyad tanımladık
}

public class Annotationn {

    
    public static void main(String[] args) {
        Annotationn annotation = new Annotationn();
        annotation.myMethod();//metodumuzu tanımladık
    }
        @Annotation1(ad = "Sinan", soyad = "OSMANOĞLU")//ad ve soyad'ı atadık
        public void myMethod() {
            try{
                Class<? extends Annotationn> reflClass = this.getClass();
                Method mth = reflClass.getMethod("myMethod");
                Annotation1 annotation = mth.getAnnotation(Annotation1.class);
                System.out.println("Ad: " + annotation.ad());//ad'ı ekrana yazdırdık
                System.out.println("Soyad: " + annotation.soyad());//soyad'ı ekrana yazdırdık
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
} 
    
    

