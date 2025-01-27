/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bot1Apuestas;

/**
 *
 * @author raul.de1
 */
/*public class Apuestas {
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import org.json.JSONObject;

public class BettingBot {

    private static final String API_BASE_URL = "https://api.fakebetting.com"; // Cambiar por la URL real
    private static final String API_KEY = "TU_API_KEY"; // Clave de API proporcionada por la plataforma
    private static final double MAX_BET_AMOUNT = 100.0; // Límite de apuesta por evento

    public static void main(String[] args) {
        try {
            // Autenticación
            String authToken = authenticate("tu_usuario", "tu_contraseña");

            // Obtener eventos deportivos
            String eventsJson = getUpcomingEvents(authToken);

            // Análisis básico de eventos
            JSONObject eventToBet = analyzeEvents(eventsJson);

            // Colocar una apuesta
            if (eventToBet != null) {
                placeBet(authToken, eventToBet, 50.0); // Apuesta 50 unidades
            } else {
                System.out.println("No se encontró un evento adecuado para apostar.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Método para autenticarse y obtener un token
    public static String authenticate(String username, String password) throws Exception {
        String endpoint = API_BASE_URL + "/auth/login";
        JSONObject payload = new JSONObject();
        payload.put("username", username);
        payload.put("password", password);

        String response = sendPostRequest(endpoint, payload.toString());
        JSONObject jsonResponse = new JSONObject(response);

        if (jsonResponse.getBoolean("success")) {
            System.out.println("Autenticación exitosa.");
            return jsonResponse.getString("token");
        } else {
            throw new Exception("Fallo en la autenticación: " + jsonResponse.getString("message"));
        }
    }

    // Método para obtener eventos próximos
    public static String getUpcomingEvents(String authToken) throws Exception {
        String endpoint = API_BASE_URL + "/events/upcoming";
        return sendGetRequest(endpoint, authToken);
    }

    // Método para analizar eventos y elegir uno para apostar
    public static JSONObject analyzeEvents(String eventsJson) {
        JSONObject events = new JSONObject(eventsJson);
        for (Object event : events.getJSONArray("data")) {
            JSONObject eventObj = (JSONObject) event;
            // Ejemplo: Si el favorito tiene una cuota menor a 1.5, apostamos
            double odds = eventObj.getJSONObject("odds").getDouble("favorite");
            if (odds < 1.5) {
                System.out.println("Evento seleccionado para apostar: " + eventObj.getString("name"));
                return eventObj;
            }
        }
        return null;
    }

    // Método para colocar una apuesta
    public static void placeBet(String authToken, JSONObject event, double amount) throws Exception {
        if (amount > MAX_BET_AMOUNT) {
            System.out.println("Monto de apuesta excede el límite permitido.");
            return;
        }

        String endpoint = API_BASE_URL + "/bets/place";
        JSONObject payload = new JSONObject();
        payload.put("event_id", event.getString("id"));
        payload.put("amount", amount);
        payload.put("bet_type", "win"); // Tipo de apuesta, por ejemplo "win"

        String response = sendPostRequest(endpoint, payload.toString(), authToken);
        JSONObject jsonResponse = new JSONObject(response);

        if (jsonResponse.getBoolean("success")) {
            System.out.println("Apuesta realizada con éxito.");
        } else {
            System.out.println("Error al realizar la apuesta: " + jsonResponse.getString("message"));
        }
    }

    // Método genérico para enviar una solicitud GET
    public static String sendGetRequest(String endpoint, String authToken) throws Exception {
        URL url = new URL(endpoint);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Authorization", "Bearer " + authToken);

        int responseCode = conn.getResponseCode();
        if (responseCode == 200) {
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            return response.toString();
        } else {
            throw new Exception("GET request failed: " + responseCode);
        }
    }

    // Método genérico para enviar una solicitud POST
    public static String sendPostRequest(String endpoint, String payload) throws Exception {
        return sendPostRequest(endpoint, payload, null);
    }

    public static String sendPostRequest(String endpoint, String payload, String authToken) throws Exception {
        URL url = new URL(endpoint);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");
        if (authToken != null) {
            conn.setRequestProperty("Authorization", "Bearer " + authToken);
        }
        conn.setDoOutput(true);

        try (OutputStream os = conn.getOutputStream()) {
            os.write(payload.getBytes());
            os.flush();
        }

        int responseCode = conn.getResponseCode();
        if (responseCode == 200 || responseCode == 201) {
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            return response.toString();
        } else {
            throw new Exception("POST request failed: " + responseCode);
        }
    }
}
}*/
