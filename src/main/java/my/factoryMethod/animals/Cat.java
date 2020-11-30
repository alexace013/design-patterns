package my.factoryMethod.animals;

import com.github.javafaker.Faker;
import lombok.Getter;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

@Getter
@Log4j
@ToString
public class Cat implements Animal<Cat>, AnimalVoices {

    private String name;
    private String breed;

    Cat() {
        log.trace(this.toString());
    }

    Cat(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    @Override
    public Cat born() {
        Cat cat = new Cat(
                Faker.instance().cat().name(),
                Faker.instance().cat().breed()
        );
        log.debug(cat.toString());
        return cat;
    }

    @Override
    public String getVoice() {
        return CAT_VOICE_CONST;
    }
}