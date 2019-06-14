package techcourse.fp.mission;

@FunctionalInterface
public interface Conditional<T> {
    boolean test(T t);
}
