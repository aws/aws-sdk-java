/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.kms.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kms.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * GrantConstraintsMarshaller
 */
public class GrantConstraintsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(GrantConstraints grantConstraints, StructuredJsonGenerator jsonGenerator) {

        if (grantConstraints == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            com.amazonaws.internal.SdkInternalMap<String, String> encryptionContextSubsetMap = (com.amazonaws.internal.SdkInternalMap<String, String>) grantConstraints
                    .getEncryptionContextSubset();
            if (!encryptionContextSubsetMap.isEmpty() || !encryptionContextSubsetMap.isAutoConstruct()) {
                jsonGenerator.writeFieldName("EncryptionContextSubset");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> encryptionContextSubsetMapValue : encryptionContextSubsetMap.entrySet()) {
                    if (encryptionContextSubsetMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(encryptionContextSubsetMapValue.getKey());

                        jsonGenerator.writeValue(encryptionContextSubsetMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            com.amazonaws.internal.SdkInternalMap<String, String> encryptionContextEqualsMap = (com.amazonaws.internal.SdkInternalMap<String, String>) grantConstraints
                    .getEncryptionContextEquals();
            if (!encryptionContextEqualsMap.isEmpty() || !encryptionContextEqualsMap.isAutoConstruct()) {
                jsonGenerator.writeFieldName("EncryptionContextEquals");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> encryptionContextEqualsMapValue : encryptionContextEqualsMap.entrySet()) {
                    if (encryptionContextEqualsMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(encryptionContextEqualsMapValue.getKey());

                        jsonGenerator.writeValue(encryptionContextEqualsMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static GrantConstraintsJsonMarshaller instance;

    public static GrantConstraintsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GrantConstraintsJsonMarshaller();
        return instance;
    }

}
