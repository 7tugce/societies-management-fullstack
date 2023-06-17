package com.firat.societies.core.dtoConverter;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class DtoConverterImpl implements DtoconverterService{

	private final ModelMapper modelMapper;
	
	public DtoConverterImpl(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

	@Override
	public <S, T> List<T> dtoConverter(List<S> s, Class<T> targetClass) {
		return s.stream().map(element -> modelMapper.map(element, targetClass)).collect(Collectors.toList());
	}

	@Override
	public <T> Object dtoClassConverter(Object source, Class<T> baseClass) {
		return modelMapper.map(source,baseClass);
	}
}
