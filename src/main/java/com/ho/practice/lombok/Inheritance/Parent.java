package com.ho.practice.lombok.Inheritance;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class Parent {
	
    private final String parentName;
    private final int parentAge;
    
}