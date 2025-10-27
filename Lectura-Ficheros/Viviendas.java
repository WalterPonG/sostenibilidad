import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class Viviendas {
    public static void main(String[] args) {
        


        File f = new File("viviendas-por-intensidad-de-uso-a-partir-del-consumo-electrico.-mediana-consumo-anual.csv");
        ArrayList<Territorio> lista = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(f))){
            String linea = br.readLine();
            while((linea = br.readLine()) != null){
                String [] datos = linea.split(";");
                String codigo = datos[2];
                String nombre = datos[3];
                String mediana = datos[4];
                int valor;
                if (mediana.equals("-") || mediana.isEmpty()) {
                    valor = 0;
                } else {
                    valor = Integer.parseInt(mediana);
                }
                lista.add(new Territorio(nombre, codigo, valor));


                
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Buscamos los 3 territorios con mejor mediana");
        Collections.sort(lista);
        for(int i = 0; i < 3; i++){
            System.out.println(lista.get(i));
        }

        System.out.println("------------------");
        System.out.println("Lista completamente ordenada");
        for(int j = 0; j < lista.size(); j++){
            System.out.println(lista.get(j));
        }
    }
}
