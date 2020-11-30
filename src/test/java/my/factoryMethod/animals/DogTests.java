package my.factoryMethod.animals;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DogTests {

    @Test
    public void check_dog_characteristics_is_null() {
        Dog dog = new Dog();
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(dog.getName()).isNull();
        softly.assertThat(dog.getBreed()).isNull();
        softly.assertAll();
    }

    @Test
    public void check_dog_voice() {
        Dog dog = new Dog();
        Assertions.assertEquals("Wow!", dog.getVoice());
    }

    @Test
    public void check_dog_born() {
        Dog dog = new Dog().born();
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(dog).isNotNull();
        softly.assertThat(dog.getName()).as(String.format("name <%s>", dog.getName())).isNotNull();
        softly.assertThat(dog.getBreed()).as(String.format("breed <%s>", dog.getBreed())).isNotNull();
        softly.assertAll();
    }
}