package Character;

import java.util.Random;

public class Sniper extends Archer {
	public Sniper(Hero original) {
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

		System.out.println("[전직 완료] 스나이퍼로 전직했습니다! 일정 확률로 적을 즉사시킵니다.");
	}

	@Override
	public void attackEffect(Monster m) {
		Random rand = new Random();
		int chance = Math.min(30, level * 2);
		if (rand.nextInt(100) < chance) {
			System.out.println("🎯 스나이퍼 패시브 발동! 적을 즉사시켰습니다!");
			m.hp = 0;
		}
	}
}
