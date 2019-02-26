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

import javax.crypto.SecretKey;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * The "key encrypting key" materials used in encrypt/decryption.
 * Only symmetric key is supported for now.
 */
public class EncryptionMaterials implements Serializable {
  private final SecretKey symmetricKey;
  private final Map<String, String> description = new HashMap<String, String>();


  /**
   * Constructs a new EncryptionMaterials object, storing a symmetric key.
   *
   * @param symmetricKey The symmetric key to be stored in this EncryptionMaterials object.
   */
  public EncryptionMaterials(SecretKey symmetricKey) {
    this.symmetricKey = symmetricKey;
  }

  /**
   * Returns the symmetric key stored in this EncryptionMaterials object.
   *
   * @return the symmetric key stored in this EncryptionMaterials object.
   */
  public SecretKey getSymmetricKey() {
    return this.symmetricKey;
  }

  /**
   * Returns a snapshot of the current material description; never null.
   */
  public Map<String, String> getMaterialsDescription() {
    return new HashMap<String, String>(description);
  }

  /**
   * Fluent API to add material description.
   */
  public EncryptionMaterials withDescription(String name, String value) {
    description.put(name, value);
    return this;
  }

  /**
   * Fluent API to add all the given material descriptions.
   */
  public EncryptionMaterials withDescriptions(Map<String, String> descriptions) {
    description.putAll(descriptions);
    return this;
  }
}

