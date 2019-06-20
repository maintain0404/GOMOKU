public class Board {
	public static int[][] board = new int[15][15];
	public static int Black(int x,int y){
		if (board[y][x] == 0) {
			board[y][x] = -1;
			winCheck(-1,x,y);
			return 0;
		}
		else {
			return 1;
		}			}
	public static int White(int x, int y) {
		if (board[y][x] == 0) {
			board[y][x] = 1;
			winCheck(1,x,y);
			return 0;
		}
		else {
			return 1;
		}}
	public static void winCheck(int bnw, int x, int y){
		boolean someonewin = false;
		if (N_check(x,y) + S_check(x,y) >= 6) {
			someonewin = true;
		}else if (NW_check(x,y) + SE_check(x,y) >= 6) {
			someonewin = true;
		}else if (W_check(x,y) + E_check(x,y) >= 6) {
			someonewin = true;
		}else if (SW_check(x,y) + NE_check(x,y) >= 6) {
			someonewin = true;
		}else {
			someonewin = false;
		}
		if (someonewin == true) {
			if (bnw == 1) {
				main.gameend(1);
			}
			else {
				main.gameend(-1);
			}}}
	public static int N_check(int x, int y){ 
		int i;
		for(i=0;i<5;i++){
			if (isInboard(x,y-i)!=true) {
				break;
			}
			if (board[y-i][x] != board[y][x]) {
				break;
			}}
		return i;
	}
	public static int NW_check(int x, int y) {
		int i;
		for(i=0;i<5;i++){
			if (isInboard(x-i,y-i)!=true) {
				break;
			}
			if (board[y-i][x-i] != board[y][x]) {
				break;
			}				
		}
		return i;
	}
	public static int W_check(int x, int y) {
		int i;
		for(i=0;i<5;i++){
			if (isInboard(x-i,y)!=true) {
				break;
			}
			if (board[y][x-i] != board[y][x]) {
				break;
			}				
		}
		return i;
	}
	public static int SW_check(int x, int y) {
		int i;
		for(i=0;i<5;i++){
			if (isInboard(x-i,y+i)!=true) {
				break;
			}
			if (board[y+i][x-i] != board[y][x]) {
				break;
			}				
		}
		return i;
	}
	public static int S_check(int x, int y) {
		int i;
		for(i=0;i<5;i++){
			if (isInboard(x,y+i)!=true) {
				break;
			}
			if (board[y+i][x] != board[y][x]) {
				break;
			}				
		}
		return i;
	}
	public static int SE_check(int x, int y) {
		int i;
		for(i=0;i<5;i++){
			if (isInboard(x+i,y+i)!=true) {
				break;
			}
			if (board[y+i][x+i] != board[y][x]) {
				break;
			}				
		}
		return i;
	}
	public static int E_check(int x, int y) {
		int i;
		for(i=0;i<5;i++){
			if (isInboard(x+i,y)!=true) {
				break;
			}
			if (board[y][x+i] != board[y][x]) {
				break;
			}				
		}
		return i;
	}
	public static int NE_check(int x, int y) {
		int i;
		for(i=0;i<5;i++){
			if (isInboard(x+i,y-i)!=true) {
				break;
			}
			if (board[y-i][x+i] != board[y][x]) {
				break;
			}				
		}
		return i;
	}
	public static boolean isInboard(int x, int y) {
		if (x>=0 && x<15) {
			if (y>=0 && y<15) {
				return true;
			}}
		return false;
		}}
