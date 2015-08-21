package com.amazonaws.services.simpleworkflow.flow;

import java.util.Iterator;
import java.lang.reflect.Method;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

public class JsonMethodAwareDataConverter extends JsonDataConverter implements MethodAwareDataConverter {
  public JsonMethodAwareDataConverter() {
    super();
  }
  public JsonMethodAwareDataConverter(ObjectMapper mapper) {
    super(mapper);
  }

  @Override
  public Object[] fromDataForMethod(String content, Method method) throws DataConverterException {
    ArrayNode arr = fromData(content, ArrayNode.class);
    Iterator<JsonNode> arrElements = arr.elements();
    Object[] parameters = new Object[arr.size()];
    Class<?>[] parameterTypes = method.getParameterTypes();
    try {
      for (int i=0; i < arr.size(); i++) {
        parameters[i] = mapper.treeToValue(arrElements.next(), parameterTypes[i]);
      }
    }
    catch (JsonProcessingException jsonProcessingException) {
      throwDataConverterException(jsonProcessingException, null);
    }
    return parameters;
  }

  private void throwDataConverterException(Throwable e, Object value) {
    if (value == null) {
        throw new DataConverterException("Failure serializing null value", e);
    }
    throw new DataConverterException("Failure serializing \"" + value + "\" of type \"" + value.getClass() + "\"", e);
  }
}