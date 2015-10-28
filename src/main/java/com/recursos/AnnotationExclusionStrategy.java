package com.recursos;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;

public class AnnotationExclusionStrategy implements ExclusionStrategy {

	@Override
	public boolean shouldSkipClass(Class<?> arg0) {
		return false;
	}

	@Override
	public boolean shouldSkipField(FieldAttributes f) {
        return f.getAnnotation(Exclude.class) != null;
	}

}
