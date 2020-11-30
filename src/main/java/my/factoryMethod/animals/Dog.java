package my.factoryMethod.animals;

import com.github.javafaker.Faker;
import lombok.Getter;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

@Getter
@Log4j
@ToString
public class Dog implements Animal<Dog>, AnimalVoices {

    private String name;
    private String breed;

    Dog() {
        log.trace(this.toString());
    }

    Dog(String name, String breed) {
        this.name = name;
        this.breed =breed;
    }

    @Override
    public Dog born() {
        Dog dog = new Dog(
                Faker.instance().name().firstName(),
                Faker.instance().cat().breed()
        );
        log.debug(dog.toString());
        return dog;
    }

    @Override
    public String getVoice() {
        return DOG_VOICE_CONST;
    }
}
