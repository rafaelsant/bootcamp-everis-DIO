package Aula5;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

public class InferenciaExemplo {
    public static void main(String[] args) throws IOException {
        connectAndPrintURLJavaOracle();
    }
    public static void  connectAndPrintURLJavaOracle(){
        try{
            var url = new URL("http://docs.oracle.com/javase/10/language/");
            var urlConnection = url.openConnection();
            try(var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))){
                System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">",">/n"));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
