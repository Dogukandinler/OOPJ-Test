/* Ch 14
 * FindDuplicates.java
 */

package javaOOFP.ch10.set;

import java.util.Set;

import javaOOFP.ch10.util.CollectionUtil;

public class FindDuplicates {
	public static void main(String args[]) {

		Set set = CollectionUtil.getEmptySet(); // zeynep ali mahmut zeynep tansu ali ahmet nuri elif zeynep
		
		for (int i = 0; i < args.length; i++) {
			CollectionUtil.listElements(set);
			if (!set.add(args[i]))
				System.out.println("=> Duplicate detected: " + args[i]);
		}

		System.out.println(set.size() + " distinct words detected: " + set);
		CollectionUtil.listElements(set);
	}	
}
