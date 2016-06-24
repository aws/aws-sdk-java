/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.elasticmapreduce.spi.security;

import java.util.HashMap;
import java.util.Map;

/**
 * Context information that can help users to determine which encryption materials
 * should return in the EncryptionMaterialsProvider.
 *
 */
public class EncryptionContext {
  private final String type;
  private final Map<String, String> context = new HashMap<String, String>();

  public EncryptionContext(String type) {
    this.type = type;
  }

  /**
   * Gets the type of the encryption context.
   * Supported value is LOCAL_DISK.
   * @return the type of encryption context.
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the encryption context key value pairs.
   * @return the key value pairs in the encryption context.
   */
  public Map<String, String> getContext() {
    return new HashMap<String, String>(context);
  }

  /**
   * Fluent API to add encryption context.
   */
  public EncryptionContext withContext(String key, String value) {
    this.context.put(key, value);
    return this;
  }

  /**
   * Fluent API to add all the given encryption context.
   */
  public EncryptionContext withContext(Map<String, String> context) {
    this.context.putAll(context);
    return this;
  }
}
