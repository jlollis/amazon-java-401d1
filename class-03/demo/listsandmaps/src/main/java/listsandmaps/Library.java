/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package listsandmaps;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    public boolean someLibraryMethod() {
        ArrayList<String> peeps = new ArrayList<>();
        peeps.add("Nicholas");
        peeps.add("Merry");
        peeps.add("Ginger");
        System.out.println(peeps);
        System.out.println(new int[]{1} );

        String listStringy = peeps.toString();
        System.out.print(listStringy);

        for(String name : peeps){
            System.out.print(name);
        }

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(9);

        int removed = nums.remove(0);
        System.out.println(removed);

        // HashMap
        HashMap<String, Integer> shoeSizes = new HashMap<>();
        // Insert - put
        shoeSizes.put("Nicholas", 13);
        shoeSizes.put("Simon", 10);
        shoeSizes.put("Ranjit", 13);

        System.out.println(shoeSizes.get("Nicholas"));
        shoeSizes.put("Nicholas", 11);
        System.out.println(shoeSizes.get("Nicholas"));

        HashMap<Integer, ArrayList<String>> phoneNums = new HashMap<>();
        phoneNums.put(949, peeps);
        System.out.println(phoneNums.get(949));
        phoneNums.put(208, new ArrayList<String>(){
            {
                add("Geeks");
                add("for");
                add("Geeks");
            }
        }  );

        // Retrieve the list of keys first and then get all values stored at those keys
        for(int areaCode : phoneNums.keySet()){
            System.out.println(phoneNums.get(areaCode));
        }



        return true;
    }
}
