import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class Consumer {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        /*GET запрос*/
        String url = "https://reqres.in/api/users/2";
        String response = restTemplate.getForObject(url, String.class);

        System.out.println(response);

        /*--------------------------------*/
        System.out.println("---------------------");
        /*POST запрос*/
        Map<String,String> jsonToSend  = new HashMap<>();

        jsonToSend.put("name", "Test name");
        jsonToSend.put("job", "Test job");

        HttpEntity<Map<String, String>> request = new HttpEntity<>(jsonToSend);

        String url1 = "https://reqres.in/api/user/";
        String response1 = restTemplate.postForObject(url, request, String.class);

        System.out.println(response1);
    }
}
