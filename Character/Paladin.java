package Character;

public class Paladin extends Warrior {
	public Paladin(Hero original) {
		super(original.name);
		this.level = original.level;
		this.hp = original.hp;
		this.mp = original.mp;
		this.power = original.power;
		this.defense = original.defense;
		this.experience = original.experience;
		this.money = original.money;
		this.weapon = original.weapon;
		this.weaponPower = original.weaponPower;
		this.isAdvanced = true;

		System.out.println("[전직 완료] 팔라딘으로 전직했습니다! 방어력을 기반으로 추가 피해를 입힙니다.");
	}

	@Override
	public int attack() {
		return super.attack() + (defense / 2);
	}
}
