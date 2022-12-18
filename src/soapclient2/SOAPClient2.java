/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soapclient2;

import util.Covidproject;

/**
 *
 * @author Piyaporn
 */
public class SOAPClient2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print(findByYear(2022));
    }

    private static Covidproject findByYear(int year) {
        util.SoapClass_Service service = new util.SoapClass_Service();
        util.SoapClass port = service.getSoapClassPort();
        return port.findByYear(year);
    }
    
}
