package com.lilithsthrone.game.sex;

import java.util.List;

import com.lilithsthrone.utils.Util;
import com.lilithsthrone.utils.Util.ListValue;

/**
 * @since 0.1.97
 * @version 0.2.0
 * @author Innoxia
 */
public enum SexPositionSlot {

	/* Doggy-style */
	
	/**The partner who's on all fours, being fucked doggy-style.*/
	DOGGY_ON_ALL_FOURS("On all fours",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.FLOOR))),
	
	/**The partner who's on all fours, being fucked doggy-style.*/
	DOGGY_ON_ALL_FOURS_SECOND("On all fours",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.FLOOR))),
	
	/**The partner who's behind the doggy-style target. They are kneeling, and can perform vaginal or anal penetration.*/
	DOGGY_BEHIND("Kneeling behind",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.BACK),
					new ListValue<>(OrgasmCumTarget.ASS),
					new ListValue<>(OrgasmCumTarget.GROIN),
					new ListValue<>(OrgasmCumTarget.LEGS))),

	/**The partner who's behind the doggy-style target. They are also on all fours, and can perform oral on the doggy-style target.*/
	DOGGY_BEHIND_ORAL("On all fours behind",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.FLOOR))),

	/**The partner who's in front of the doggy-style target. They can receive oral from the doggy-style target.*/
	DOGGY_INFRONT("Kneeling infront",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.FACE),
					new ListValue<>(OrgasmCumTarget.FLOOR))),

	/**The partner who's in front of the doggy-style target. They are turned around, and can receive anilingus from the doggy-style target.*/
	DOGGY_INFRONT_ANAL("Kneeling infront (anal)",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.FLOOR))),
	
	
	/* Back to wall */
	
	BACK_TO_WALL_AGAINST_WALL("Back against wall",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.FLOOR),
					new ListValue<>(OrgasmCumTarget.GROIN),
					new ListValue<>(OrgasmCumTarget.STOMACH),
					new ListValue<>(OrgasmCumTarget.LEGS))),
	
	BACK_TO_WALL_FACING_TARGET("Pinning against wall",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.FLOOR),
					new ListValue<>(OrgasmCumTarget.GROIN),
					new ListValue<>(OrgasmCumTarget.STOMACH),
					new ListValue<>(OrgasmCumTarget.LEGS))),


	/* Face to wall */
	
	FACE_TO_WALL_AGAINST_WALL("Facing wall",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.WALL))),
	
	FACE_TO_WALL_FACING_TARGET("Pinning against wall",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.ASS),
					new ListValue<>(OrgasmCumTarget.GROIN),
					new ListValue<>(OrgasmCumTarget.LEGS),
					new ListValue<>(OrgasmCumTarget.BACK),
					new ListValue<>(OrgasmCumTarget.FLOOR))),
	
	
	/* Cowgirl */
	
	COWGIRL_ON_BACK("Cowgirl (on back)",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.SELF_STOMACH),
					new ListValue<>(OrgasmCumTarget.SELF_BREASTS),
					new ListValue<>(OrgasmCumTarget.SELF_FACE),
					new ListValue<>(OrgasmCumTarget.GROIN),
					new ListValue<>(OrgasmCumTarget.FLOOR))),
	
	COWGIRL_RIDING("Cowgirl (riding)",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.STOMACH),
					new ListValue<>(OrgasmCumTarget.BREASTS),
					new ListValue<>(OrgasmCumTarget.FACE),
					new ListValue<>(OrgasmCumTarget.HAIR))),
	
	/* Sixty-nine */
	
	SIXTY_NINE_TOP("Sixty-nine (top)",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.FACE),
					new ListValue<>(OrgasmCumTarget.BREASTS),
					new ListValue<>(OrgasmCumTarget.HAIR),
					new ListValue<>(OrgasmCumTarget.FLOOR))),
	
	SIXTY_NINE_BOTTOM("Sixty-nine (bottom)",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.SELF_STOMACH),
					new ListValue<>(OrgasmCumTarget.SELF_BREASTS),
					new ListValue<>(OrgasmCumTarget.FACE),
					new ListValue<>(OrgasmCumTarget.BREASTS),
					new ListValue<>(OrgasmCumTarget.HAIR),
					new ListValue<>(OrgasmCumTarget.FLOOR))),
	
	/* Kneeling oral */
	
	KNEELING_RECEIVING_ORAL("Standing",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.FACE),
					new ListValue<>(OrgasmCumTarget.BREASTS),
					new ListValue<>(OrgasmCumTarget.HAIR),
					new ListValue<>(OrgasmCumTarget.FLOOR))),
	
	KNEELING_PERFORMING_ORAL("Kneeling",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.SELF_STOMACH),
					new ListValue<>(OrgasmCumTarget.SELF_GROIN),
					new ListValue<>(OrgasmCumTarget.SELF_LEGS),
					new ListValue<>(OrgasmCumTarget.FLOOR))),
	
	/* Standing */
	
	STANDING_DOMINANT("Standing",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.STOMACH),
					new ListValue<>(OrgasmCumTarget.GROIN),
					new ListValue<>(OrgasmCumTarget.LEGS),
					new ListValue<>(OrgasmCumTarget.FLOOR))),
	
	STANDING_SUBMISSIVE("Standing",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.STOMACH),
					new ListValue<>(OrgasmCumTarget.GROIN),
					new ListValue<>(OrgasmCumTarget.LEGS),
					new ListValue<>(OrgasmCumTarget.FLOOR))),
	
	MASTURBATING_KNEELING("Kneeling",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.SELF_STOMACH),
					new ListValue<>(OrgasmCumTarget.SELF_GROIN),
					new ListValue<>(OrgasmCumTarget.SELF_LEGS),
					new ListValue<>(OrgasmCumTarget.FLOOR))),
	
	/* Chair */
	
	CHAIR_TOP("Standing",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.HAIR),
					new ListValue<>(OrgasmCumTarget.FACE),
					new ListValue<>(OrgasmCumTarget.BREASTS),
					new ListValue<>(OrgasmCumTarget.STOMACH),
					new ListValue<>(OrgasmCumTarget.GROIN))),
	
	CHAIR_BOTTOM("Sitting",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.SELF_STOMACH),
					new ListValue<>(OrgasmCumTarget.SELF_BREASTS),
					new ListValue<>(OrgasmCumTarget.SELF_FACE),
					new ListValue<>(OrgasmCumTarget.STOMACH),
					new ListValue<>(OrgasmCumTarget.GROIN),
					new ListValue<>(OrgasmCumTarget.FLOOR))),
	
	/* Stocks */
	
	STOCKS_LOCKED_IN_STOCKS("Locked in stocks",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.FLOOR))),
	
	STOCKS_RECEIVING_ORAL("Receiving oral",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.FACE),
					new ListValue<>(OrgasmCumTarget.HAIR),
					new ListValue<>(OrgasmCumTarget.FLOOR))),
	
	STOCKS_PERFORMING_ORAL("Performing oral",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.FLOOR))),
	
	STOCKS_FUCKING("Standing behind",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.ASS),
					new ListValue<>(OrgasmCumTarget.BACK),
					new ListValue<>(OrgasmCumTarget.GROIN),
					new ListValue<>(OrgasmCumTarget.LEGS),
					new ListValue<>(OrgasmCumTarget.FLOOR))),

	/* Milking Stall */
	
	MILKING_STALL_LOCKED_IN_MILKING_STALL("Locked in milking stall",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.FLOOR))),
	
	MILKING_STALL_RECEIVING_ORAL("Receiving oral",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.FACE),
					new ListValue<>(OrgasmCumTarget.HAIR),
					new ListValue<>(OrgasmCumTarget.FLOOR))),
	
	MILKING_STALL_PERFORMING_ORAL("Performing oral",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.FLOOR))),
	
	MILKING_STALL_FUCKING("Standing behind",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.ASS),
					new ListValue<>(OrgasmCumTarget.BACK),
					new ListValue<>(OrgasmCumTarget.GROIN),
					new ListValue<>(OrgasmCumTarget.LEGS),
					new ListValue<>(OrgasmCumTarget.FLOOR))),
	
	/* Missionary */
	
	MISSIONARY_ON_BACK("Lying on back",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.SELF_STOMACH),
					new ListValue<>(OrgasmCumTarget.SELF_BREASTS),
					new ListValue<>(OrgasmCumTarget.SELF_FACE),
					new ListValue<>(OrgasmCumTarget.GROIN),
					new ListValue<>(OrgasmCumTarget.STOMACH),
					new ListValue<>(OrgasmCumTarget.FLOOR))),
	
	MISSIONARY_KNEELING_BETWEEN_LEGS("Kneeling between legs",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.HAIR),
					new ListValue<>(OrgasmCumTarget.FACE),
					new ListValue<>(OrgasmCumTarget.BREASTS),
					new ListValue<>(OrgasmCumTarget.STOMACH),
					new ListValue<>(OrgasmCumTarget.GROIN),
					new ListValue<>(OrgasmCumTarget.LEGS),
					new ListValue<>(OrgasmCumTarget.FLOOR))),
	
	/* UNIQUE SEX SCENES */
	
	CHAIR_TOP_LILAYA("Standing",
			CHAIR_TOP.getAvailableCumTargets()),
	
	CHAIR_BOTTOM_LILAYA("Sitting",
			CHAIR_BOTTOM.getAvailableCumTargets()),
	
	DOGGY_ON_ALL_FOURS_AMBER("On all fours",
			DOGGY_ON_ALL_FOURS.getAvailableCumTargets()),
	
	DOGGY_BEHIND_AMBER("Kneeling behind",
			DOGGY_BEHIND.getAvailableCumTargets()),
	
	PET_MOUNTING_ON_ALL_FOURS("On all fours",
			DOGGY_ON_ALL_FOURS.getAvailableCumTargets()),
	
	PET_MOUNTING_HUMPING("Mounting",
			DOGGY_BEHIND.getAvailableCumTargets()),
	
	PET_ORAL_ON_ALL_FOURS("On all fours",
			KNEELING_PERFORMING_ORAL.getAvailableCumTargets()),
	
	PET_ORAL_COCKED_LEG("Cocked leg",
			KNEELING_RECEIVING_ORAL.getAvailableCumTargets()),
	
	KNEELING_RECEIVING_ORAL_ZARANIX("Sitting",
			KNEELING_RECEIVING_ORAL.getAvailableCumTargets()),
	
	KNEELING_PERFORMING_ORAL_ZARANIX("Kneeling",
			KNEELING_PERFORMING_ORAL.getAvailableCumTargets()),
	
	KNEELING_RECEIVING_ORAL_RALPH("Standing",
			KNEELING_RECEIVING_ORAL.getAvailableCumTargets()),
	
	KNEELING_PERFORMING_ORAL_RALPH("Kneeling",
			KNEELING_PERFORMING_ORAL.getAvailableCumTargets()),
	
	
	FACE_TO_WALL_AGAINST_WALL_SHOWER_PIX("Facing wall",
			FACE_TO_WALL_AGAINST_WALL.getAvailableCumTargets()),
	
	FACE_TO_WALL_FACING_TARGET_SHOWER_PIX("Pinning against wall",
			FACE_TO_WALL_FACING_TARGET.getAvailableCumTargets()),
	
	
	HAND_SEX_DOM_ROSE("Standing",
			STANDING_DOMINANT.getAvailableCumTargets()),
	
	HAND_SEX_SUB_ROSE("Standing",
			STANDING_SUBMISSIVE.getAvailableCumTargets()),
	
	
	MISSIONARY_DESK_SUB_VICKY("Lying on counter",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.SELF_STOMACH),
					new ListValue<>(OrgasmCumTarget.SELF_BREASTS),
					new ListValue<>(OrgasmCumTarget.SELF_FACE),
					new ListValue<>(OrgasmCumTarget.GROIN),
					new ListValue<>(OrgasmCumTarget.LEGS),
					new ListValue<>(OrgasmCumTarget.FLOOR))),
	
	MISSIONARY_DESK_DOM_VICKY("Standing between legs",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.HAIR),
					new ListValue<>(OrgasmCumTarget.FACE),
					new ListValue<>(OrgasmCumTarget.BREASTS),
					new ListValue<>(OrgasmCumTarget.STOMACH),
					new ListValue<>(OrgasmCumTarget.GROIN),
					new ListValue<>(OrgasmCumTarget.LEGS),
					new ListValue<>(OrgasmCumTarget.FLOOR))),
	

	KNEELING_RECEIVING_ORAL_CULTIST("Standing",
			KNEELING_RECEIVING_ORAL.getAvailableCumTargets()),
	
	KNEELING_PERFORMING_ORAL_CULTIST("Kneeling",
			KNEELING_PERFORMING_ORAL.getAvailableCumTargets()),
	
	MISSIONARY_ALTAR_LYING_ON_ALTAR("Lying on altar",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.SELF_STOMACH),
					new ListValue<>(OrgasmCumTarget.SELF_BREASTS),
					new ListValue<>(OrgasmCumTarget.SELF_FACE),
					new ListValue<>(OrgasmCumTarget.GROIN),
					new ListValue<>(OrgasmCumTarget.LEGS),
					new ListValue<>(OrgasmCumTarget.FLOOR))),

	MISSIONARY_ALTAR_STANDING_BETWEEN_LEGS("Between legs",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.HAIR),
					new ListValue<>(OrgasmCumTarget.FACE),
					new ListValue<>(OrgasmCumTarget.BREASTS),
					new ListValue<>(OrgasmCumTarget.STOMACH),
					new ListValue<>(OrgasmCumTarget.GROIN),
					new ListValue<>(OrgasmCumTarget.LEGS),
					new ListValue<>(OrgasmCumTarget.FLOOR))),

	MISSIONARY_ALTAR_KNEELING_BETWEEN_LEGS("Between legs (oral)",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.FLOOR))),
	
	MISSIONARY_ALTAR_SEALED_LYING_ON_ALTAR("Lying on altar",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.SELF_STOMACH),
					new ListValue<>(OrgasmCumTarget.SELF_BREASTS),
					new ListValue<>(OrgasmCumTarget.SELF_FACE),
					new ListValue<>(OrgasmCumTarget.GROIN),
					new ListValue<>(OrgasmCumTarget.LEGS),
					new ListValue<>(OrgasmCumTarget.FLOOR))),

	MISSIONARY_ALTAR_SEALED_STANDING_BETWEEN_LEGS("Between legs",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.HAIR),
					new ListValue<>(OrgasmCumTarget.FACE),
					new ListValue<>(OrgasmCumTarget.BREASTS),
					new ListValue<>(OrgasmCumTarget.STOMACH),
					new ListValue<>(OrgasmCumTarget.GROIN),
					new ListValue<>(OrgasmCumTarget.LEGS),
					new ListValue<>(OrgasmCumTarget.FLOOR))),

	MISSIONARY_ALTAR_SEALED_KNEELING_BETWEEN_LEGS("Between legs (oral)",
			Util.newArrayListOfValues(
					new ListValue<>(OrgasmCumTarget.FLOOR)));
	
	
	private String name;
	
	private List<OrgasmCumTarget> availableCumTargets;
	
	private SexPositionSlot(String name,
			List<OrgasmCumTarget> availableCumTargets) {
		this.name = name;
		
		this.availableCumTargets = availableCumTargets;
	}

	public String getName() {
		return name;
	}

	public List<OrgasmCumTarget> getAvailableCumTargets() {
		return availableCumTargets;
	}

}
