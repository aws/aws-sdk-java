/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.cognitoidp.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.cognitoidp.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * KeyTypeMarshaller
 */
public class KeyTypeJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(KeyType keyType, StructuredJsonGenerator jsonGenerator) {

        if (keyType == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (keyType.getKty() != null) {
                jsonGenerator.writeFieldName("kty")
                        .writeValue(keyType.getKty());
            }
            if (keyType.getAlg() != null) {
                jsonGenerator.writeFieldName("alg")
                        .writeValue(keyType.getAlg());
            }
            if (keyType.getUse() != null) {
                jsonGenerator.writeFieldName("use")
                        .writeValue(keyType.getUse());
            }
            if (keyType.getKid() != null) {
                jsonGenerator.writeFieldName("kid")
                        .writeValue(keyType.getKid());
            }
            if (keyType.getN() != null) {
                jsonGenerator.writeFieldName("n").writeValue(keyType.getN());
            }
            if (keyType.getE() != null) {
                jsonGenerator.writeFieldName("e").writeValue(keyType.getE());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static KeyTypeJsonMarshaller instance;

    public static KeyTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new KeyTypeJsonMarshaller();
        return instance;
    }

}
