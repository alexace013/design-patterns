package my.factoryMethod.animals;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatTests {

    @Test
    public void check_cat_characteristics_is_null() {
        Cat cat = new Cat();
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(cat.getName()).isNull();
        softly.assertThat(cat.getBreed()).isNull();
        softly.assertAll();
    }

    @Test
    public void check_cat_voice() {
        Cat cat = new Cat();
        Assertions.assertEquals("Meow!", cat.getVoice());
    }

    @Test
    public void check_cat_born() {
        Cat cat = new Cat().born();
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(cat).isNotNull();
        softly.assertThat(cat.getName()).as(String.format("name <%s>", cat.getName())).isNotNull();
        softly.assertThat(cat.getBreed()).as(String.format("breed <%s>", cat.getBreed())).isNotNull();
        softly.assertAll();
    }
}