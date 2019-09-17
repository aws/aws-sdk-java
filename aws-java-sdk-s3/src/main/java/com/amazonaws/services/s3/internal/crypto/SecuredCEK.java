/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Portions copyright 2006-2009 James Murty. Please see LICENSE.txt
 * for applicable license terms and NOTICE.txt for applicable notices.
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
package com.amazonaws.services.s3.internal.crypto;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 * Internal class used to carry both the secured CEK and the key wrapping
 * algorithm, if any. Byte array cloning is intentionally skipped for
 * performance reasons.
 */
class SecuredCEK {
    /**
     * The encrypted CEK either via key wrapping or simple encryption.
     */
    private final byte[] encrypted;
    /**
     * The key wrapping algorithm used, or null if the CEK is not secured via
     * key wrapping.
     */
    private final String keyWrapAlgorithm;

    /** Unmodifiable material description. */
    private final Map<String,String> matdesc;

    SecuredCEK(byte[] encryptedKey, String keyWrapAlgorithm, Map<String,String> matdesc) {
        this.encrypted = encryptedKey;
        this.keyWrapAlgorithm = keyWrapAlgorithm;
        this.matdesc = Collections.unmodifiableMap(new TreeMap<String, String>(matdesc));
    }

    byte[] getEncrypted() {
        return encrypted;
    }

    String getKeyWrapAlgorithm() {
        return keyWrapAlgorithm;
    }

    /**
     * Returns an unmodifable material description of this secured CEK.
     */
    Map<String, String> getMaterialDescription() {
        return matdesc;
    }
}
