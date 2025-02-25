package org.project.common;

import javafx.stage.Stage;

public class StageFactory {
	//Set stage to private specifier
	private static Stage stage;

	public static Stage getStage() {
		//Only through this stage can be accessed
		return stage;
	}

	public static void setStage(Stage tempStage) {
		//With this we can use stage instead of creating multiple time
		//Can't use this keyword because stage is private.
		stage = tempStage;
	}
}
