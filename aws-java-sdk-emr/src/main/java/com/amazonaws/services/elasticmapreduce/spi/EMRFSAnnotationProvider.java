package com.amazonaws.services.elasticmapreduce.spi;

import java.util.Map;

public abstract class EMRFSAnnotationProvider {
  public abstract Map<String, String> getAnnotations();
}
