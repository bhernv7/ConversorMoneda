import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMonedas {
    public Monedas conversionMonedas (String par1, String par2, double monto){
        String apiKey="20c32d86ca20642117ac5c7a";
        URI address = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/"+par1+"/"+par2+"/"+monto);
        System.out.println(address);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(address)
                .build();
        try{
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);
        } catch (Exception e){
            throw new RuntimeException("Something went wrong!");
        }

    }
}