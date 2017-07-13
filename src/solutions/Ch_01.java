package solutions;
import java.util.Arrays;

public class Ch_01 {
	
	// 1.1
	
	public boolean isAllUnique(String w){ // without any additional datastructure
		for(int i=0; i<w.length(); i++) for(int j=i+1; j<w.length(); j++)
			if(w.charAt(i) == w.charAt(j))
				return false;
		return true;
	}

	public boolean isAllUnique2(String w){ // with an additional datastructure // assuming it consists only of the 26 lower letter
		int checker = 0;
		for(int i=0; i<w.length(); i++){
			int val = w.charAt(i) - 'a';
			if((checker & (1<<val)) > 0)
				return false;
			checker |= (1<<val);
		}
		return true;
	}
	
	// 1.2
	
	public boolean checkPermutation(String a, String b){ // O( nlog(n) )
		if(a.length() != b.length()) 
			return false;
		char[] ac = a.toCharArray();
		char[] bc = b.toCharArray();
		Arrays.sort(ac);
		Arrays.sort(bc);
		for(int i=0; i<ac.length; i++) if(ac[i] != bc[i]) return false;
		return true;
	}
	
	public boolean checkPermutation2(String a, String b){ // O( n )
		if(a.length() != b.length()) 
			return false;
		
		int[] letters = new int[256]; // Assumption
		
		char[] ac = a.toCharArray();
		for(char c : ac) letters[c]++;

		for(int i=0; i<b.length(); i++){
			int c = (int) b.charAt(i);
			letters[c]--;
			if(letters[c] < 0)
				return false;
		}
		return true;
	}
	
	// 1.3 (to be coded)
	
	// 1.4
	
	public boolean palindromePermutation(String s){
		int[] letters = new int[26];
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)==' ') continue;
			int x = Character.toLowerCase(s.charAt(i)) - 'a';
			letters[x]++;
		}
		int one = 0;
		for(int i=0; i<26; i++){
			if(letters[i]%2==1){
				if(one==0) one = 1;
				else return false;
			}
		}
		return true;
	}
	
	// 1.5 (to be coded)
	
	// 1.6
	
	public String stringCompression(String s){
		StringBuilder res = new StringBuilder();
		boolean f = false;
		for(int i=0; i<s.length(); i++){
			int j=0;
			char x = s.charAt(i);
			for(; i+j<s.length() && s.charAt(i+j)==x; j++);
			if(j>1) f = true;
			res.append(x);
			res.append(Integer.toString(j));
			i += j-1;
		}
		return f ? res.toString() : s;
	}
	
	// 1.7
	
	public int[][] rotateMatrix(int[][] mat){ // Assuming it's required to rotate by +90 degrees // using new array
		if(mat.length==0) throw new RuntimeException("Zero Rows");
		if(mat[0].length==0) throw new RuntimeException("Zero Cols");
		int[][] res = new int[mat.length][mat[0].length];
		int n = mat.length;
		for(int i=0; i<n; i++) for(int j=0; j<n; j++) res[n-1-i][j] = mat[j][i]; // rotate = transpose and reverse rows
		return res;
	}
	
	public int[][] rotateMatrixInPlace(int[][] mat){ // in place  // time: O( n^2 ), memory: O( n^2 )
		if(mat.length==0) throw new RuntimeException("Zero Rows");
		if(mat[0].length==0) throw new RuntimeException("Zero Cols");
		int n = mat.length;
		boolean[][] used = new boolean[n][n];
		for(int i=0; i<n; i++) for(int j=0; j<n; j++){ // transpose in place
			if(used[j][i]) continue;
			int tmp = mat[j][i];
			mat[j][i] = mat[i][j];
			mat[i][j] = tmp;
			used[i][j] = true;
		}
		for(int i=0; i<n/2; i++) for(int j=0; j<n; j++){ // rotate in place
			int tmp = mat[i][j];
			mat[i][j] = mat[n-1-i][j];
			mat[n-1-i][j] = tmp;
		}
		return mat;
	}
	
	// 1.8 (to be coded)
	
	// 1.9 (to be coded)
	
	// Additional methods Section

	public void print2DIntArray(int[][] a) {
		for(int i=0; i<a.length; i++) {for(int j=0; j<a[0].length; j++)
			System.out.print(a[i][j] + " ");
			System.out.println();}
	}
}
