/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.s3.model;
import java.io.Serializable;

import java.security.KeyPair;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.SecretKey;

/**
 * The "key encrypting key" materials used in encrypt/decryption. These
 * materials may be either an asymmetric key pair or a symmetric key but not
 * both.
 */
public class EncryptionMaterials implements Serializable {
    private final KeyPair keyPair;
    private final SecretKey symmetricKey;
    private final Map<String, String> desc = new HashMap<String,String>();

    /**
     * Constructs a new EncryptionMaterials object, storing an asymmetric key pair.
     * 
     * @param keyPair
     *      The asymmetric key pair to be stored in this EncryptionMaterials object.
     */
    public EncryptionMaterials(KeyPair keyPair) {
        this(keyPair, null);
    }

    /**
     * Constructs a new EncryptionMaterials object, storing a symmetric key.
     * 
     * @param symmetricKey
     *      The symmetric key to be stored in this EncryptionMaterials object.
     */
    public EncryptionMaterials(SecretKey symmetricKey) {
        this(null, symmetricKey);
    }

    /**
     * Base constructor for the EncryptionMaterials object.  This is not publicly visible since
     * it should not be possible to create an EncryptionMaterials object that contains both an
     * asymmetric key pair and a symmetric key.
     */
    protected EncryptionMaterials(KeyPair keyPair, SecretKey symmetricKey) {
        this.keyPair = keyPair;        
        this.symmetricKey = symmetricKey;
    }

    /**
     * Returns the key pair stored in this EncryptionMaterials object.
     * 
     * @return the key pair stored in this EncryptionMaterials object.
     *      
     */
    public KeyPair getKeyPair() {
        return this.keyPair;
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
        return new HashMap<String, String>(desc);
    }

    /**
     * Returns null since the EncryptionMaterials base class does not have a materials accessor.
     * Subclasses may override this method.
     * 
     * @return null
     */
    public EncryptionMaterialsAccessor getAccessor() {
        return null;
    }

    /**
     * Fluent API to add material description.
     */
    public EncryptionMaterials addDescription(String name, String value) {
        desc.put(name, value);
        return this;
    }

    /**
     * Fluent API to add all the given material descriptions.
     */
    public EncryptionMaterials addDescriptions(Map<String,String> descriptions) {
        desc.putAll(descriptions);
        return this;
    }

    /**
     * Returns true if this is a KMS material description; false otherwise.
     * 
     * @return false by default
     */
    public boolean isKMSEnabled() {
        return false;
    }

    /**
     * @throws UnsupportedOperationException by default
     */
    public String getCustomerMasterKeyId() {
        throw new UnsupportedOperationException();
    }
    
    protected String getDescription(String name) {
        return desc.get(name);
    }
}
