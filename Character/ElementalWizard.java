package Character;

public class ElementalWizard extends Mage {
	public ElementalWizard(Hero original) {
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

		System.out.println("[전직 완료] 엘레멘탈 위자드로 전직했습니다! MP에 비례해 추가 마법 피해를 줍니다.");
	}

	@Override
	public int attack() {
		return super.attack() + (mp / 4);
	}
}
