package pkg30.pkg1.pkg2023;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JColorChooser;

public class Main {
    
    //con la misma herarquia, crear un programa que administre n casas en colonia, para cada casa, debera programar almenos, 10
    //opciones de menu, e imprimir como va quedando la colonia

    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        ArrayList<Casa> colonia = new ArrayList();
        colonia = crear();
        System.out.println("""
                           Se creo una colonia chiquita donde en ella podemos encontrar
                           4 casas que cada una tienen diferentes caracteristicas y con
                           este programa podremos modificar ciertas de ellas""");
        int opcion;
        do{
            for (Casa a : colonia) {
                System.out.println(colonia.indexOf(a)+"- "+a);
            }
            System.out.println("4- Salir");
            System.out.print("Ingrese el numero de la casa que quiere modificar: ");
            opcion = menu.nextInt();
            switch(opcion){
                case 0:
                    colonia = modificar(colonia,opcion);
                    break;
                case 1:
                    colonia = modificar(colonia, opcion);
                    break;
                case 2:
                    colonia = modificar(colonia, opcion);
                    break;
                case 3:
                    colonia = modificar(colonia, opcion);
                    break;
                case 4:
                    System.out.println("Saliendoooooo........");
                    break;
                default:
                    System.out.println("Opcion no valida, ingrese una correcta");
            }
        }while(opcion !=4);
        System.out.println("Se ha salido correctamente");
    }
    
   

    public static ArrayList<Casa> crear(){
        ArrayList<Casa> colonia = new ArrayList();
        
        ArrayList<String> utencasa1 = new ArrayList();
        utencasa1.add("Cacerola"); utencasa1.add("Espatula"); utencasa1.add("Sarten");
        ArrayList<String> sillonescasa1 = new ArrayList();
        sillonescasa1.add("Sillon rinconero"); sillonescasa1.add("Sofa cama"); sillonescasa1.add("Sillon chester");
        ArrayList<String> cuadroscasa1 = new ArrayList();
        cuadroscasa1.add("Replica de Guernita"); cuadroscasa1.add("El beso"); cuadroscasa1.add("Retrato familiar");
        ArrayList<Dormitorio> dormicasa1 = new ArrayList();
        dormicasa1.add(new Dormitorio(new Cama("Olympia", "Queen", Color.CYAN), "Artek"));
        Sala sala1  = new Sala();
        sala1.setCuadros(cuadroscasa1); sala1.setSillones(sillonescasa1);
        Casa casa1 = new Casa(Color.RED, new Cocina(200, utencasa1, new Refri("Whirlpool", "Mabe RMA300FXMRS0", 90, Color.GRAY ), new Micro("Miele", 900)), sala1, dormicasa1);
        colonia.add(casa1);
        
        ArrayList<String> utencasa2 = new ArrayList();
        utencasa2.add("Cuchillo"); utencasa2.add("Tabla de cortar"); utencasa2.add("Abrelatas");
        ArrayList<String> sillonescasa2 = new ArrayList();
        sillonescasa2.add("Sillon longue"); sillonescasa2.add("Sillon deuna plaza"); sillonescasa2.add("Sofa cama");
        ArrayList<String> cuadroscasa2 = new ArrayList();
        cuadroscasa2.add("Retrato del padre"); cuadroscasa2.add("La vida"); cuadroscasa2.add("Foto del abuelo del padre");
        ArrayList<Dormitorio> dormicasa2 = new ArrayList();
        dormicasa2.add(new Dormitorio(new Cama("Indufoam", "King", Color.WHITE), "Firenze"));
        Sala sala2  = new Sala();
        sala2.setCuadros(cuadroscasa2); sala2.setSillones(sillonescasa2);
        Casa casa2 = new Casa(Color.BLUE, new Cocina(215, utencasa2, new Refri("LG", "Insta view", 100, Color.BLACK), new Micro("AEG", 1000)), sala2, dormicasa2);
        colonia.add(casa2);
        
        ArrayList<String> utencasa3 = new ArrayList();
        utencasa3.add("Cuchillo de chef"); utencasa3.add("Cucharon"); utencasa3.add("Olla de presion");
        ArrayList<String> sillonescasa3 = new ArrayList();
        sillonescasa3.add("Sillon modular"); sillonescasa3.add("Sillon club"); sillonescasa3.add("Sillon ergonomico");
        ArrayList<String> cuadroscasa3 = new ArrayList();
        cuadroscasa3.add("Pintura abstracta(el amor)"); cuadroscasa3.add("La escasez"); cuadroscasa3.add("Cuadro de mascotas");
        ArrayList<Dormitorio> dormicasa3 = new ArrayList();
        dormicasa3.add(new Dormitorio(new Cama("Facenco", "Full", Color.YELLOW), "ClosetMaid"));
        Sala sala3  = new Sala();
        sala3.setCuadros(cuadroscasa3); sala3.setSillones(sillonescasa3);
        Casa casa3 = new Casa(Color.WHITE, new Cocina(175, utencasa3, new Refri("Samsung", "RT6300A",80, Color.LIGHT_GRAY), new Micro("BALAY", 700)), sala3, dormicasa3);
        colonia.add(casa3);
        
        ArrayList<String> utencasa4 = new ArrayList();
        utencasa4.add("Olla grande"); utencasa4.add("Tenedores"); utencasa4.add("Platos desechables");
        ArrayList<String> sillonescasa4 = new ArrayList();
        sillonescasa4.add("Sofa modular"); sillonescasa4.add("Sofa con almacenaje"); sillonescasa4.add("Sofa chaise longue");
        ArrayList<String> cuadroscasa4 = new ArrayList();
        cuadroscasa4.add("La Guiconda"); cuadroscasa4.add("La ultima cena"); cuadroscasa4.add("Retrato de hijo (Timmy)");
        ArrayList<Dormitorio> dormicasa4 = new ArrayList();
        dormicasa4.add(new Dormitorio(new Cama("Simmons", "Full XL", Color.PINK), "&Tradition"));
        Sala sala4  = new Sala();
        sala4.setCuadros(cuadroscasa4); sala4.setSillones(sillonescasa4);
        Casa casa4 = new Casa(Color.MAGENTA, new Cocina(250, utencasa4, new Refri("Mabe", "RMS510ICMRP0", 95, Color.DARK_GRAY), new Micro("BOSCH", 750)), sala4, dormicasa4);
        colonia.add(casa4);
        
        return colonia;
    }
    
    public static ArrayList<Casa> modificar(ArrayList<Casa> colonia, int casa){
        Scanner mod = new Scanner(System.in);
        Scanner enteros = new Scanner (System.in);
        Scanner orac = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("""
                               1- Modificar la potencia de un microondas
                               2- Modificar un utensilio de la cocina
                               3- Modificar el color de la cama del dormitorio
                               4- Modificar el tamanio del refrigerador en la cocina
                               5- Modificar el color de la casa
                               6- Modificar la marca del armario en el dormitorio
                               7- Modificar un cuadro de la sala
                               8- Modificar la marca de un microondas
                               9- Modificar el tipo de un sillon
                               10- Modificar el tamanio de una cama
                               """);
            System.out.print("Ingrese que opcion quiere evaluar: ");
            opcion = mod.nextInt();
            if (opcion>10||opcion<1) {
                System.out.println("Opcion no valida, ingrese una correcta");
            }else{
                switch(opcion){
                    case 1:
                        System.out.println("La potencia actual del microondas es: "+colonia.get(casa).getCocina().getMicro().getPotencia());
                        System.out.print("Ingrese la nueva potencia: ");
                        int potencia = enteros.nextInt();
                        colonia.get(casa).getCocina().getMicro().setPotencia(potencia);
                        System.out.println("Se ha cambiado perfectamente a: "+potencia);
                        break;
                    case 2:
                        System.out.println("Estos son los utensilios disponibles");
                        for (String a : colonia.get(casa).getCocina().getUtencilios()){
                            System.out.println(colonia.get(casa).getCocina().getUtencilios().indexOf(a)+"- "+a);
                        }
                        System.out.print("Ingrese que utensilio quiere cambiar: ");
                        int uten = enteros.nextInt();
                        if (uten>=0&&uten<colonia.get(casa).getCocina().getUtencilios().size()) {
                            System.out.println("Ingrese el utensilio nuevo: ");
                            String nuevo = orac.nextLine();
                            colonia.get(casa).getCocina().getUtencilios().set(uten, nuevo);
                        }else{
                            System.out.println("Usted eligio un opcion no valida");
                        }
                        break;
                    case 3:
                        for (Dormitorio a : colonia.get(casa).getDormitorios()) {
                            System.out.println(colonia.get(casa).getDormitorios().indexOf(a)+"- "+a);
                        }
                        System.out.print("Ingrese el dormitorio: ");
                        int dorm = enteros.nextInt();
                        if (dorm>=0&&dorm<colonia.get(casa).getDormitorios().size()) {
                            Color color = JColorChooser.showDialog(null, "Eliga el nuevo color de la cama", colonia.get(casa).getDormitorios().get(0).getCama().getColor());
                            colonia.get(casa).getDormitorios().get(0).getCama().setColor(color);
                            System.out.println("Se ha cambiado el color de la cama perfectamente");
                        }else{
                            System.out.println("Usted eligio un opcion no valida");
                        }
                        
                        break;
                    case 4:
                        System.out.println("El tamanio actual del refrigerador es de: "+colonia.get(casa).getCocina().getRefri().getTamanio()+"cm");
                        System.out.print("Ingrese el nuevo tamanio del refri: ");
                        int tamanio = enteros.nextInt();
                        colonia.get(casa).getCocina().getRefri().setTamanio(tamanio);
                        System.out.println("Se ha cambiado correcta mente el tamanio a "+tamanio+"cm");
                        break;
                    case 5:
                        Color colorcasa = JColorChooser.showDialog(null, "Ingrese el nuevo color de la casa", colonia.get(casa).getColor());
                        colonia.get(casa).setColor(colorcasa);
                        System.out.println("Se ha pintado la casa correctamente");
                        break;
                    case 6:
                        for (Dormitorio a : colonia.get(casa).getDormitorios()) {
                            System.out.println(colonia.get(casa).getDormitorios().indexOf(a)+"- "+a);
                        }
                        System.out.print("Ingrese el dormitorio: ");
                        int dorm2 = enteros.nextInt();
                        if (dorm2>=0&&dorm2<colonia.get(casa).getDormitorios().size()) {
                            System.out.println("La marca del armario es: "+colonia.get(casa).getDormitorios().get(dorm2).getArmario());
                            System.out.print("Ingrese la nueva marca: ");
                            String arm = orac.nextLine();
                            colonia.get(casa).getDormitorios().get(dorm2).setArmario(arm);
                            System.out.println("Se ha cambbiado la marca del armario");
                        }else{
                            System.out.println("Usted eligio un opcion no valida");
                        }
                        break;
                    case 7:
                        for (String h : colonia.get(casa).getSala().getCuadros()) {
                            System.out.println(colonia.get(casa).getSala().getCuadros().indexOf(h)+"- "+h);
                        }
                        System.out.println("Ingrese el cuadro a cambiar: ");
                        int cual = enteros.nextInt();
                        if (cual>=0&&cual<colonia.get(casa).getSala().getCuadros().size()) {
                            System.out.print("Ingrese el nombre del nuevo cuadro: ");
                            String cuadro = orac.nextLine();
                            colonia.get(casa).getSala().getCuadros().set(cual, cuadro);
                            System.out.println("Se ha cambiado el cuadro correctamente");
                        }else{
                            System.out.println("Opcion no valida, intentelo de nuevo");
                        }
                        break;
                    case 8:
                        System.out.println("La marca actual del microondas es: "+colonia.get(casa).getCocina().getMicro().getMarca());
                        System.out.print("Ingrese la nueva marca del microondas: ");
                        String marcanueva = orac.nextLine();
                        colonia.get(casa).getCocina().getMicro().setMarca(marcanueva);
                        break;
                    case 9:
                        for (String d : colonia.get(casa).getSala().getSillones()) {
                            System.out.println(colonia.get(casa).getSala().getSillones().indexOf(d)+"- "+d);
                        }
                        System.out.println("Ingrese que sillon quiere cambiar: ");
                        int cualsi = enteros.nextInt();
                        if (cualsi>=0&&cualsi<colonia.get(casa).getSala().getSillones().size()){
                            System.out.print("Ingrese el nuevo tipo de sillon: ");
                            String tipo = orac.nextLine();
                            colonia.get(casa).getSala().getSillones().set(cualsi, tipo);
                        }else{
                            System.out.println("Opcion no valida, intentelo de nuevo");
                        }
                        break;
                    case 10:
                        for (Dormitorio a : colonia.get(casa).getDormitorios()) {
                            System.out.println(colonia.get(casa).getDormitorios().indexOf(a)+"- "+a);
                        }
                        System.out.print("Ingrese el dormitorio: ");
                        int dorm3 = enteros.nextInt();
                        if (dorm3>=0&&dorm3<colonia.get(casa).getDormitorios().size()) {
                            System.out.println("El tamanio actual de una cama es de: "+colonia.get(casa).getDormitorios().get(dorm3).getCama().getTamanio());
                            System.out.print("Ingrese el nuevo tamanio de la cama [King,queen,full,etc]: ");
                            String medida = orac.nextLine();
                            colonia.get(casa).getDormitorios().get(dorm3).getCama().setTamanio(medida);
                            System.out.println("Se ha cambiado el tamanio a "+medida);
                        }else{
                            System.out.println("Usted eligio un opcion no valida");
                        }
                        break;
                }
            }
        }while(opcion>10||opcion<1);
        return colonia;
    }
}
