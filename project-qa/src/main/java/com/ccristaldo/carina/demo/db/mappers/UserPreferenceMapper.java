package com.ccristaldo.carina.demo.db.mappers;

import com.ccristaldo.carina.demo.db.models.UserPreference;

public interface UserPreferenceMapper {

	void create(UserPreference userPreference);

	UserPreference findById(Long id);

}
