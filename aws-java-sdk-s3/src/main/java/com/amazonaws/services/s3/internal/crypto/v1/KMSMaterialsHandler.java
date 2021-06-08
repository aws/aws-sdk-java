/*
 * Copyright 2020-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.internal.crypto.v1;

import static com.amazonaws.services.s3.internal.crypto.CryptoUtils.normalizeContentAlgorithmForValidation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.model.KMSEncryptionMaterials;
import com.amazonaws.services.s3.model.MaterialsDescriptionProvider;

public class KMSMaterialsHandler {

    public static Map<String, String> createKMSContextMaterialsDescription(Map<String, String> matdesc, String cekAlgo) {
        matdesc.put(Headers.AWS_CRYPTO_CEK_ALGORITHM, normalizeContentAlgorithmForValidation(cekAlgo));
        matdesc.remove(KMSEncryptionMaterials.CUSTOMER_MASTER_KEY_ID);
        return Collections.unmodifiableMap(matdesc);
    }
}
