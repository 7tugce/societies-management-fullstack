package com.firat.societies.core.dtoConverter;

import java.util.List;

public interface DtoconverterService {

	<S, T> List<T> dtoConverter(List<S> s, Class<T> targetClass);
	public <T> Object dtoClassConverter(Object source,Class<T> baseClass);
}
