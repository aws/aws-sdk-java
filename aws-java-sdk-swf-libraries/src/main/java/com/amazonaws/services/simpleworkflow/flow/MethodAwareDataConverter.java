package com.amazonaws.services.simpleworkflow.flow;

import java.lang.reflect.Method;

public interface MethodAwareDataConverter {
  public Object[] fromDataForMethod(String content, Method method) throws DataConverterException;
}