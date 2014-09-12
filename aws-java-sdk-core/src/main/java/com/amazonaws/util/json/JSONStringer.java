package com.amazonaws.util.json;

import java.io.StringWriter;

/*
 * Copyright 2011-2014 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Created by ethomas on 9/12/14.
 */
public class JSONStringer extends JSONWriter {
  public JSONStringer() {
    super(new StringWriter());
  }

  @Override
  public String toString() {
    if (!isDone()) return null;
    return ((StringWriter) getWriter()).toString();
  }
}
