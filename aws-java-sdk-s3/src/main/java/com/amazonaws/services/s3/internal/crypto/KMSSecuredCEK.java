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

import java.util.Map;

final class KMSSecuredCEK extends SecuredCEK {
    static final String KEY_PROTECTION_MECHANISM = "kms";

    KMSSecuredCEK(byte[] encryptedKeyBlob, Map<String, String> matdesc) {
        super(encryptedKeyBlob, KEY_PROTECTION_MECHANISM, matdesc);
    }

    /**
     * Returns true if the specified key wrapping algorithm is
     * {@value #KEY_PROTECTION_MECHANISM}; false otherwise.
     */
    public static boolean isKMSKeyWrapped(String keyWrapAlgo) {
        return KEY_PROTECTION_MECHANISM.equals(keyWrapAlgo);
    }
}
