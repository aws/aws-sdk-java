package com.amazonaws.util.json;

import java.io.StringWriter;

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
