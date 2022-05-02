package project;

import java.util.*;
abstract class Sprite {
	int x=3, y=3;
	abstract void move(char c);
}
class Main extends Sprite {
	void move(char c) {
		if( c=='h') --x;
		else if(c=='j') --y;
		else if(c=='k') ++y;
		else if(c=='l') ++x;
	}
}

class Monster extends Sprite {
	public Monster() {
		x = y =7;
	}
	void move(char c) {
		x += (Math.random()-0.5)>0 ? 1: -1;
		y += (Math.random()-0.5)>0 ? 1: -1;
	}
}

public class TEST {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] gameroom = new String[10][17];
		for(int i=0;i<10;i++) {
			for(int j=0;j<17;j++) {
				gameroom[i][j] = " ";
			}
		}
		gameroom[7][2] = "G"; 
		Main me = new Main();
		Monster m = new Monster();
		gameroom[me.y][me.x] = "@"; 
		gameroom[m.y][m.x] = "M";
		while(true) {
			try {
			System.out.print("###################\n");
			for(int i=0;i<10;i++) {
				System.out.print("#");
				for(int j=0;j<17;j++) {
					System.out.print(gameroom[i][j]);
				}
				System.out.print("#\n");
			}
			System.out.print("###################\n");
			System.out.print("왼쪽(h), 위쪽(j), 아래쪽(k), 오른쪽(l): ");
			char input = sc.next().charAt(0);
			gameroom[me.y][me.x] = " ";
			me.move(input);
			gameroom[m.y][m.x] = " ";
			int my= m.y, mx = m.x;
			m.move(input);
			if(m.y<10 && m.x<17) {			
				gameroom[me.y][me.x] = "@";
				gameroom[m.y][m.x] = "M";
			}else {
				gameroom[me.y][me.x] = "@";
				gameroom[my][mx] = "M";
			}
			if(me.y == 7 && me.x ==2) {
				System.out.println("골드를 획득하셨습니다.");
				break;
			}
			if(me.y == m.y && me.x == m.x) {
				System.out.println("몬스터에게 잡혔습니다.");
				break;
			}
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("몬스터가 경기장 밖으로 나갔습니다."); //몬스터가 경기장 밖으로 나갈경우 오류가 발생하여 예외처리했습니다.
				break; 
			}
		}
	}
}