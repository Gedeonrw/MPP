package lab9Part2.q10a;

import java.util.*;

public class Or {

	public static void main(String[] args) {
		List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true));
 
		System.out.println(new Or().someSimpleIsTrue(list));
		System.out.println(new Or().usingReduce(list));
	}
	
	public boolean someSimpleIsTrue(List<Simple> list) {
		boolean accum = false;
		for(Simple s: list) {
			accum = accum || s.flag;
		}
		return accum;
	}
	
	public boolean usingReduce(List<Simple> list) {
		return list.stream().map(s -> s.flag).reduce(false, (l1,l2)-> l1 || l2);
	}

}
