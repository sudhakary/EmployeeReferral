package com.nisum.employee.ref.domain;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "Skills")
public class SkillsEntity {
	
	List<String> Designations;
	List<String> DeveloperSkills;
	List<String> ExperienceRequired;
	List<String> QESkills;
	List<String> Skills;
	List<String> Locations;
	List<String> Positions;
	List<String> UserRoles;
	
}
