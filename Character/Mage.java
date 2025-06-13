// Mage.java
package Character;

public class Mage extends Hero {
	public Mage(String name) {
		super(name);
		this.power = 10;
		this.defense = 8;
		this.hp = 90;
		this.mp = 60;
	}

	@Override
	public Hero promote() {
		return new ElementalWizard(this);
	}

	@Override
	public void printAvailableSkills() {
		System.out.println("1. 아이스볼트 (Lv3, MP10)");
		System.out.println("2. 파이어볼 (Lv5, MP15)");
		System.out.println("3. 메테오 (Lv10, MP40)");
	}

	@Override
	public boolean useSkill(int num, Monster m) {
		if (num == 1 && level >= 3 && mp >= 10) {
			System.out.println("아이스볼트 발사!");
			mp -= 10;
			m.attacked(attack() + 25);
			return true;
		} else if (num == 2 && level >= 5 && mp >= 15) {
			System.out.println("파이어볼 발사!");
			mp -= 15;
			m.attacked(attack() + 40);
			return true;
		} else if (num == 3 && level >= 10 && mp >= 40) {
			System.out.println("메테오 낙하!");
			mp -= 40;
			m.attacked(attack() + 80);
			return true;
		}
		System.out.println("스킬을 사용할 수 없습니다.");
		return false;
	}

}
