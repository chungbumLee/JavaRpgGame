package Character;

public class Archer extends Hero {
	public boolean criticalFirstHit = false;

	public Archer(String name) {
		super(name);
		this.power = 13;
		this.defense = 10;
		this.hp = 100;
		this.mp = 40;
	}

	@Override
	public void printAvailableSkills() {
		System.out.println("1. 파워 샷 (Lv3, MP10)");
		System.out.println("2. 멀티 샷 (Lv5, MP15)");
		System.out.println("3. 피니쉬 샷 (Lv10, MP40)");
	}

	@Override
	public boolean useSkill(int num, Monster m) {
		if (num == 1 && level >= 3 && mp >= 10) {
			System.out.println("파워 샷 발사!");
			mp -= 10;
			m.attacked(attack() + 20);
			return true;
		} else if (num == 2 && level >= 5 && mp >= 15) {
			System.out.println("멀티 샷 발사!");
			mp -= 15;
			m.attacked(attack() + 30);
			return true;
		} else if (num == 3 && level >= 10 && mp >= 40) {
			System.out.println("피니쉬 샷 발사!");
			mp -= 40;
			m.attacked(attack() + 60);
			return true;
		}
		System.out.println("스킬을 사용할 수 없습니다.");
		return false;
	}

	@Override
	public Hero promote() {
		return new Sniper(this);
	}
}
