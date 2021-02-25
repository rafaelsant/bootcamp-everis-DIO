import java.io.*;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.stream.Collectors;

    public class ClientHttpException {
        public static void main(String[] args) throws IOException, InterruptedException {
            connectAndPrintURLJavaOracle();
        }
        public static void  connectAndPrintURLJavaOracle() throws IOException, InterruptedException {
                HttpRequest request = HttpRequest.newBuilder()
                        .GET()
                        .uri(URI.create("https://docs.oracle.com/javase/10/language/"))
                        .build();
                HttpClient httpClient = HttpClient.newHttpClient();
                HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Status code::"+response.statusCode());
            System.out.println(response.body());
        }
    }
