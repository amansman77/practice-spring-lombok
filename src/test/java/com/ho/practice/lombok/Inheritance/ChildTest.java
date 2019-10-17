package com.ho.practice.lombok.Inheritance;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.ho.practice.lombok.Inheritance.Child;

public class ChildTest {

	@Test
	public void builderTest() {
		Child child = Child.childBuilder()
		  .parentName("Andrea")
		  .parentAge(38)
		  .childName("Emma")
		  .childAge(6)
		  .build();
		 
		assertThat(child.getParentName()).isEqualTo("Andrea");
		assertThat(child.getParentAge()).isEqualTo(38);
		assertThat(child.getChildName()).isEqualTo("Emma");
		assertThat(child.getChildAge()).isEqualTo(6);
	}
	
}
