import java.util.Arrays;

public class Source {
    public static void main(String[] args) {
    String [] arr = new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"};
        System.out.println(warnTheSheep(arr).equals("Oi! Sheep number 2! You are about to be eaten by a wolf!"));
    }
    public static String warnTheSheep(String[] array) {
     int index = Arrays.asList(array).indexOf("wolf");
        return (index== array.length-1)? "Pls go away and stop eating my sheep" :
                String.format("Oi! Sheep number %s! You are about to be eaten by a wolf!",array.length-index-1);
    }
}
