package com.amazonaws.util.json;

import java.io.IOException;
import java.io.Writer;
import java.util.Stack;

/**
 * Created by ethomas on 9/12/14.
 */
public class JSONWriter {
/*
 * Copyright (C) 2010 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Note: this class was written without inspecting the non-free org.json sourcecode.

  Writer writer;
  protected Writer getWriter() {return writer;}

  enum StackItems {ARRAY, OBJECT}

  Stack<StackItems> stack = new Stack<StackItems>();
  InternalJSONStringer internalJSONStringer = new InternalJSONStringer();
  boolean done = false;
  protected boolean isDone() {return done;}
  public JSONWriter(Writer writer) {
    this.writer = writer;
  }

  public JSONWriter array() throws JSONException {
    if (done) throw new JSONException("Nested error");
    stack.push(StackItems.ARRAY);
    internalJSONStringer.array();
    return this;
  }

  public JSONWriter endArray() throws JSONException {
    if (done) throw new JSONException("Nested error");
    if (stack.isEmpty()) throw new JSONException("Nested error");
    StackItems popItem = stack.pop();
    if (popItem != StackItems.ARRAY) throw new JSONException("Nested error");
    internalJSONStringer.endArray();
    if (stack.isEmpty()) {
      done = true;
      String result = internalJSONStringer.toString();
      if (result != null) {
        try {
          writer.write(result);
        } catch (IOException e) {
          throw new JSONException(e.getMessage());
        }
      }
    }
    return this;
  }

  public JSONWriter object() throws JSONException {
    if (done) throw new JSONException("Nested error");
    stack.push(StackItems.OBJECT);
    internalJSONStringer.object();
    return this;
  }

  public JSONWriter endObject() throws JSONException {
    if (done) throw new JSONException("Nested error");
    if (stack.isEmpty()) throw new JSONException("Nested error");
    StackItems popItem = stack.pop();
    if (popItem != StackItems.OBJECT) throw new JSONException("Nested error");
    internalJSONStringer.endObject();
    if (stack.isEmpty()) {
      done = true;
      String result = internalJSONStringer.toString();
      if (result != null) {
        try {
          writer.write(result);
        } catch (IOException e) {
          throw new JSONException(e.getMessage());
        }
      }
    }
    return this;
  }

  public JSONWriter value(Object value) throws JSONException {
    if (done) throw new JSONException("Nested error");
    internalJSONStringer.value(value);
    return this;
  }

  public JSONWriter value(boolean value) throws JSONException {
    if (done) throw new JSONException("Nested error");
    internalJSONStringer.value(value);
    return this;
  }

  public JSONWriter value(double value) throws JSONException {
    if (done) throw new JSONException("Nested error");
    internalJSONStringer.value(value);
    return this;
  }

  public JSONWriter value(long value) throws JSONException {
    if (done) throw new JSONException("Nested error");
    internalJSONStringer.value(value);
    return this;
  }

  public JSONWriter key(String name) throws JSONException {
    if (done) throw new JSONException("Nested error");
    internalJSONStringer.key(name);
    return this;
  }


}
