/**
 * Created by dev-manojkumar007 on 05 Jan, 2022
 * Maximum Nesting Depth of the Parentheses
 *
 **/
public class NestingDepth {

    public int maxDepth(String s) {

        int depth = 0;
        int counter = 0;
        String push = "(";
        String pop = ")";

        for(int i=0;i<s.length();i++) {

            String str = Character.toString(s.charAt(i));


            if(str.equals(push)) {
                counter++;

                if(counter>depth)
                    depth = counter;
            }
            else if(str.equals(pop))
                counter--;

        }

        return depth;

    }
}
