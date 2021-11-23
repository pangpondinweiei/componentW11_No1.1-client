/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework13_Ex1_1_client;
public class homework13_Ex1_1_client {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(calArea(10));
        System.out.print(String.format("%.2f", calRound(10)));
    }
    private static double calArea(double r){
        servicesclient.CalAreaCiecle_Service service = new servicesclient.CalAreaCiecle_Service();
        servicesclient.CalAreaCiecle port = service.getCalAreaCieclePort();
        return port.calArea(r);
    }
    private static double calRound(double r){
        services.CalRoundCircle_Service service = new services.CalRoundCircle_Service();
        services.CalRoundCircle port = service.getCalRoundCirclePort();
        return port.calRound(r);
    }
}
