package Archivo;

import Clases.Arido;
import Clases.AuxiliarMaquinaria;
import Clases.Cliente;
import Clases.Compra;
import Clases.Empleado;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ManejadorDeArchivo {
    private File archivo;
    private String nombreArchivo;
    private FileReader lector;
    private FileWriter escritor;
    private BufferedWriter escritorBuffer;
    private BufferedReader lectorBuffer;
    
    public ManejadorDeArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public void abrirArchivo() {
        try {
            lectorBuffer = new BufferedReader(new FileReader(nombreArchivo));
            escritorBuffer = new BufferedWriter(new FileWriter(nombreArchivo, true));
        }
        catch (IOException e) {
            System.out.println("No se pudo abrir el archivo");
        }
    }
    
    public void escribirEnArchivo(String texto) {
        try {
            escritorBuffer.write(texto);
            escritorBuffer.newLine();
        }
        catch (IOException e) {
            System.out.println("No se pudo escribir en el archivo");
        }
    }
    
    public void borrarContenidoArchivo(String rutaArchivo) {
        try {
            File archivo = new File(rutaArchivo);
            if (archivo.exists()) {
                RandomAccessFile raf = new RandomAccessFile(archivo, "rw");
                raf.setLength(0);
                raf.close();
            } else {
                System.out.println("El archivo no existe.");
            }
        } catch (IOException e) {
            System.out.println("Error al intentar borrar el contenido del archivo: " + e.getMessage());
        }
    }
    
    public void cerrarArchivo() {
        try {
            if (lectorBuffer != null) {
                lectorBuffer.close();
            }
            if (escritorBuffer != null) {
                escritorBuffer.close();
            }
        }
        catch (IOException e) {
            System.out.println("No se pudo cerrar el archivo");
        }
    }
    
        public void leerDatosClientes(ArrayList<Cliente> lista) {
        try {
            File f = new File("clientes.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String[] datos = new String[6];
                datos[0] = sc.nextLine();
                datos[1] = sc.nextLine();
                datos[2] = sc.nextLine();
                datos[3] = sc.nextLine();
                datos[4] = sc.nextLine();
                datos[5] = sc.nextLine();
                Cliente c = new Cliente(Integer.parseInt(datos[2]), datos[3], datos[0], datos[1], datos[4], datos[5]);
                lista.add(c);
            }
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo: " + archivo);
        }
    }
        public void leerDatosEmpleados(ArrayList<Empleado> lista) {
        try {
            File f = new File("empleados.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String[] datos = new String[7];
                datos[0] = sc.nextLine();
                datos[1] = sc.nextLine();
                datos[2] = sc.nextLine();
                datos[3] = sc.nextLine();
                datos[4] = sc.nextLine();
                datos[5] = sc.nextLine();
                datos[6] = sc.nextLine();
                Empleado e = new Empleado(Integer.parseInt(datos[5]), datos[6], Integer.parseInt(datos[2]), datos[3], datos[0], datos[1], datos[4]);
                lista.add(e);
            }
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo: " + archivo);
        }
    }
        
        
        public void leerDatosAridos(ArrayList<Arido> lista) {
        try {
            File f = new File("aridos.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String[] datos = new String[4];
                datos[0] = sc.nextLine();
                datos[1] = sc.nextLine();
                datos[2] = sc.nextLine();
                datos[3] = sc.nextLine();
                Arido a = new Arido(datos[0], datos[3], Double.parseDouble(datos[1]), Double.parseDouble(datos[2]));
                lista.add(a);
            }
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo: " + archivo);
        }
    }
        
        public void leerDatosMaquinaria(ArrayList<AuxiliarMaquinaria> lista) {
        try {
            File f = new File("maquinaria.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String[] datos = new String[9];
                datos[0] = sc.nextLine();
                datos[1] = sc.nextLine();
                datos[2] = sc.nextLine();
                datos[3] = sc.nextLine();
                datos[4] = sc.nextLine();
                datos[5] = sc.nextLine();
                datos[6] = sc.nextLine();
                datos[7] = sc.nextLine();
                datos[8] = sc.nextLine();
                AuxiliarMaquinaria aM = new AuxiliarMaquinaria(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6], datos[7], datos[8]);
                lista.add(aM);
            }
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo: " + archivo);
        }
    }
        
        public void leerDatosCompras(ArrayList<Compra> lista) {
        try {
            File f = new File("compras.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String[] datos = new String[9];
                datos[0] = sc.nextLine();
                datos[1] = sc.nextLine();
                datos[2] = sc.nextLine();
                datos[3] = sc.nextLine();
                datos[4] = sc.nextLine();
                datos[5] = sc.nextLine();
                datos[6] = sc.nextLine();
                datos[7] = sc.nextLine();
                datos[8] = sc.nextLine();
                Compra c = new Compra(Double.parseDouble(datos[0]), Double.parseDouble(datos[1]), datos[2], datos[3], datos[4], datos[5], datos[6], datos[7], datos[8]);
                lista.add(c);
            }
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo: " + archivo);
        }
    }
}
