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

import java.util.Map;


/**
 * Interface for providing encryption materials.
 * Implementations are free to use any strategy for providing encryption materials,
 * such as simply providing static material that doesn't change,
 * or more complicated implementations, such as integrating with existing key management systems.
 */
public abstract class EncryptionMaterialsProvider {
  /**
   * Gets encryption materials by encryption context.
   * This is used when EMR fetches encryption materials to do encryption.
   * EMR will populate encryption context information at runtime to help users to determine
   * which encryption materials to return.
   * @param encryptionContext
   * @return EncryptionMaterials which caller can use to encrypt or decrypt data
   */
  public abstract EncryptionMaterials getEncryptionMaterials(EncryptionContext encryptionContext);

  /**
   * Gets encryption materials by material description.
   * This is used when EMR fetches encryption materials to do decryption.
   * The material description can be any information defined by users that uniquely identifies
   * a encryption material in user's system.
   * @param materialDescription
   * @return EncryptionMaterials which caller can use to encrypt or decrypt data
   */
  public abstract EncryptionMaterials getEncryptionMaterials(Map<String, String> materialDescription);
}
