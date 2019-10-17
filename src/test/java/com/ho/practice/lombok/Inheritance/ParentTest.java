package com.ho.practice.lombok.Inheritance;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ParentTest {

	@Test
	public void builderTest() {
		Parent child = Parent.builder()
		  .parentName("Andrea")
		  .parentAge(38)
		  .build();
		 
		assertThat(child.getParentName()).isEqualTo("Andrea");
		assertThat(child.getParentAge()).isEqualTo(38);
	}
	
}
