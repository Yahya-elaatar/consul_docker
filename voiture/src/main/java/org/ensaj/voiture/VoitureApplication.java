package org.ensaj.voiture;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class VoitureApplication {

    public static void main(String[] args) {
        SpringApplication.run(VoitureApplication.class, args);
    }
    @Bean
    public RestTemplate restTemplate(){
        RestTemplate restTemplate= new RestTemplate();
        SimpleClientHttpRequestFactory requestFactory=new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(5000);
        requestFactory.setReadTimeout(5000);
        restTemplate.setRequestFactory(requestFactory);

        return restTemplate;
    }
    /*@Bean
    CommandLineRunner commandLineRunner(CarRepository carRepository){
        return args ->{

            carRepository.save(Car.builder()
                    .brand("Peugeot")
                    .model("308")
                    .matricule("28891|d|26")
                    .client_id(1L)
                    .build());
            carRepository.save(Car.builder()
                    .brand("Cetroen")
                    .model("C3")
                    .matricule("3322|d|26")
                    .client_id(2L)
                    .build());
            carRepository.save(Car.builder()
                    .brand("Mercedes")
                    .model("AMG")
                    .matricule("55555|a|1")
                    .client_id(3L)
                    .build());

        };
    }*/
}
