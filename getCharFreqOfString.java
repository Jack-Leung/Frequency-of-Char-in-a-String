package testing;

public class getCharFreqOfString {
	
	public static void getFreq(String s){
		int[] freq = new int[256];
		
		for (char a : s.toCharArray())
			freq[a]++;
		
		char[] c = new char[s.length()];
		char[] charac = new char[s.length()];
		
		for (int i=0; i<c.length; i++){
			c[i] = s.charAt(i);
			int checked = 0;
			
			for (int j=0; j<=i; j++)
				if (s.charAt(i) == c[j])
					checked++;
			
			if (checked == 1){
				System.out.println("Occurence of " + s.charAt(i) + " is: " + freq[s.charAt(i)]);
				charac[i] = s.charAt(i);
			}
			
		}
	}
	
	public static void main(String[] args){
		String s = "'twas brillig, and the slithy toves  did gyre and gimble in the wabe:  all mimsy were the borogoves,  and the mome raths outgrabe.  \"beware the jabberwock, my son!  the jaws that bite, the claws that catch!  beware the jubjub bird, and shun  the frumious bandersnatch!\"  he took his vorpal sword in hand:  long time the manxome foe he sought --  so rested he by the tumtum tree,  and stood awhile in thought.  and, as in uffish thought he stood,  the jabberwock, with eyes of flame,  came whiffling through the tulgey wood,  and burbled as it came!  one, two! one, two! and through and through  the vorpal blade went snicker-snack!  he left it dead, and with its head  he went galumphing back.  \"and, has thou slain the jabberwock?  come to my arms, my beamish boy!  o frabjous day! callooh! callay!\"  he chortled in his joy.  'twas brillig, and the slithy toves  did gyre and gimble in the wabe;  all mimsy were the borogoves,  and the mome raths outgrabe.";
		System.out.println(s.length());
		System.out.println(s+"\n");
		
		getFreq(s);
		
		
	}
		/*	OUTPUT
		 * 
		 *  957
			'twas brillig, and the slithy toves  did gyre and gimble in the wabe:  all mimsy were the borogoves,  and the mome raths outgrabe.  "beware the jabberwock, my son!  the jaws that bite, the claws that catch!  beware the jubjub bird, and shun  the frumious bandersnatch!"  he took his vorpal sword in hand:  long time the manxome foe he sought --  so rested he by the tumtum tree,  and stood awhile in thought.  and, as in uffish thought he stood,  the jabberwock, with eyes of flame,  came whiffling through the tulgey wood,  and burbled as it came!  one, two! one, two! and through and through  the vorpal blade went snicker-snack!  he left it dead, and with its head  he went galumphing back.  "and, has thou slain the jabberwock?  come to my arms, my beamish boy!  o frabjous day! callooh! callay!"  he chortled in his joy.  'twas brillig, and the slithy toves  did gyre and gimble in the wabe;  all mimsy were the borogoves,  and the mome raths outgrabe.
			
			Occurence of ' is: 2
			Occurence of t is: 66
			Occurence of w is: 23
			Occurence of a is: 61
			Occurence of s is: 38
			Occurence of   is: 193
			Occurence of b is: 31
			Occurence of r is: 33
			Occurence of i is: 37
			Occurence of l is: 30
			Occurence of g is: 21
			Occurence of , is: 18
			Occurence of n is: 36
			Occurence of d is: 33
			Occurence of h is: 61
			Occurence of e is: 80
			Occurence of y is: 16
			Occurence of o is: 53
			Occurence of v is: 6
			Occurence of m is: 26
			Occurence of : is: 2
			Occurence of u is: 21
			Occurence of . is: 5
			Occurence of " is: 4
			Occurence of j is: 8
			Occurence of c is: 16
			Occurence of k is: 7
			Occurence of ! is: 11
			Occurence of f is: 10
			Occurence of p is: 3
			Occurence of x is: 1
			Occurence of - is: 3
			Occurence of ? is: 1
			Occurence of ; is: 1
		 */
}
