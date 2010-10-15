/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.security.KeyPair;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.SecretKey;

/**
 * Stores materials to be used in encryption.  These materials may be either an asymmetric key pair or 
 * a symmetric key but not both.
 */
public class EncryptionMaterials {
    private KeyPair keyPair;
    private SecretKey symmetricKey;

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
     * Returns an empty map since the EncryptionMaterials base class does not have extra materials information.
     * Subclasses may override this method.
     * 
     * @return an empty <String, String> map
     */
    public Map<String, String> getMaterialsDescription() {
        return new HashMap<String, String>();
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
}