// Warrior.java
package Character;

public class Warrior extends Hero {
	public Warrior(String name) {
		super(name);
		this.power = 15;
		this.defense = 25;
		this.hp = 120;
		this.mp = 30;
	}

	@Override
	public Hero promote() {
		return new Paladin(this);
	}

	@Override
	public void printAvailableSkills() {
		System.out.println("1. 배쉬 (Lv3, MP10)");
		System.out.println("2. 더블 슬래쉬 (Lv5, MP15)");
		System.out.println("3. 파워 스트라이크 (Lv10, MP40)");
	}

	@Override
	public boolean useSkill(int num, Monster m) {
		if (num == 1 && level >= 3 && mp >= 10) {
			System.out.println("배쉬 사용!");
			mp -= 10;
			m.attacked(attack() + 20);
			return true;
		} else if (num == 2 && level >= 5 && mp >= 15) {
			System.out.println("더블 슬래쉬 사용!");
			mp -= 15;
			m.attacked(attack() + 35);
			return true;
		} else if (num == 3 && level >= 10 && mp >= 40) {
			System.out.println("파워 스트라이크 사용!");
			mp -= 40;
			m.attacked(attack() + 60);
			return true;
		}
		System.out.println("스킬을 사용할 수 없습니다.");
		return false;
	}
}
