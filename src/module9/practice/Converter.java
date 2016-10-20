package module9.practice;

@FunctionalInterface
public interface Converter <F, T, K> {
    T converter(F from, K anotherFrom);
}
