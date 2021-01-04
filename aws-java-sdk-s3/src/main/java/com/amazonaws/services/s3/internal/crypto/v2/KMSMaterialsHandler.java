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
package com.amazonaws.services.s3.internal.crypto.v2;

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
        if (matdesc.containsKey(Headers.AWS_CRYPTO_CEK_ALGORITHM)) {
            throw new SecurityException("Conflict in reserved KMS Encryption Context key " +
                                            Headers.AWS_CRYPTO_CEK_ALGORITHM + ". This value " +
                                            "is reserved for the S3 Encryption Client and cannot be set by the user.");
        }

        matdesc.put(Headers.AWS_CRYPTO_CEK_ALGORITHM, cekAlgo);
        matdesc.remove(KMSEncryptionMaterials.CUSTOMER_MASTER_KEY_ID);
        return Collections.unmodifiableMap(matdesc);
    }


    public static Map<String, String> mergeMaterialsDescription(KMSEncryptionMaterials materials,
                                                         AmazonWebServiceRequest req) {
        Map<String,String> matdesc = materials.getMaterialsDescription();
        if (req instanceof MaterialsDescriptionProvider) {
            MaterialsDescriptionProvider mdp = (MaterialsDescriptionProvider) req;
            Map<String, String> matdesc_req = mdp.getMaterialsDescription();
            if (matdesc_req != null) {
                matdesc = new TreeMap<>(matdesc);
                matdesc.putAll(matdesc_req);    // request takes precedence
            }
        }
        return matdesc;
    }

    public static boolean isValidV2Description(Map<String, String> configuredMatDesc, Map<String, String> kmsMatDesc) {
        Map<String, String> configuredMatDescCopy = new HashMap<>(configuredMatDesc);
        Map<String, String> kmsMatDescCopy = new HashMap<>(kmsMatDesc);
        configuredMatDescCopy.remove(KMSEncryptionMaterials.CUSTOMER_MASTER_KEY_ID);
        kmsMatDescCopy.remove(Headers.AWS_CRYPTO_CEK_ALGORITHM);
        return configuredMatDescCopy.equals(kmsMatDescCopy);
    }

    public static boolean isValidV1Description(Map<String, String> configuredMatDesc, Map<String, String> kmsMatDesc) {
        return configuredMatDesc.equals(kmsMatDesc);
    }

}
