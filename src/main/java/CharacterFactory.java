import lotr.Noble;
import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import java.util.Set;

import static org.reflections.scanners.Scanners.SubTypes;

public class CharacterFactory {
    Character createCharacter() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Reflections reflections = new Reflections("lotr");
        Set<Class<?>> subTypes = reflections.get(SubTypes.of(Character.class).asClass());
        subTypes.remove(Noble.class);
        Object[] classes = subTypes.toArray();
        int num = new Random().nextInt(classes.length);
        Character newCharacter = (Character) classes[num].getClass().getConstructor().newInstance();
        return newCharacter;
    }
}
