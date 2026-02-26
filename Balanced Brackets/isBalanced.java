class Result {
	public static String isBalanced (Strings) {
		Stack<Character> stk=new Stack<> ;
		for (char c:s. toCharArray)){
			if (c==' ('||c=='{' ||c==' [') {
				stk. push (c) ;
			}
			else if(stk.isEmpty l|
				c==') '&& stk-pop() !='('||
				c=='} '&& stk-pop()!='{' ||
				c=='] '&& stk. pop () !='['){
				return "NO" ;
			}
		return "YES";
	}
}