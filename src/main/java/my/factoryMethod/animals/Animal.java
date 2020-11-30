package my.factoryMethod.animals;

public interface Animal<A> {
    A born();

    String getVoice();
}