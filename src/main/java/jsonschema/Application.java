package jsonschema;

import org.apache.commons.io.IOUtils;
import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@SpringBootApplication
@PropertySource("classpath:/property/application-${spring.profiles.active}.properties")
public class Application {
    public static void main(String ...args){
        SpringApplication.run(Application.class).close();
    }


    @Component
    public class SchemaTestRunner implements CommandLineRunner {

        @Override
        public void run(String... args) throws Exception {
            Schema schema = SchemaLoader.builder()
                    .resolutionScope("classpath:///schema/")
                    .schemaJson(new JSONObject(new JSONTokener(IOUtils.toString(getClass().getResourceAsStream(
                            "/schema/main.json")))))
                    .build().load().build();

            JSONObject jsonObject = new JSONObject(new JSONTokener(IOUtils.toString(getClass().getResourceAsStream(
                    "/schema/rectangle.json"))));
            schema.validate(jsonObject);
        }
    }
}
