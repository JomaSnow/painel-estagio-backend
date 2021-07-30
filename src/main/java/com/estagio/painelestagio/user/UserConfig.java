package com.estagio.painelestagio.user;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository) {
        return args -> {
            User joma = new User("Joma", "150132131", "fonetico", "Vendas", "044.407.721-96", "Joma Enterprises",
                    LocalDate.of(2021, Month.FEBRUARY, 28), 1);
            User mary = new User("Mary", "180138967", "fonetica", "Saúde", "044.407.721-96", "Mary Enterprises",
                    LocalDate.of(2021, Month.DECEMBER, 28), 1);

            repository.saveAll(List.of(joma, mary));

        };
    }
}
