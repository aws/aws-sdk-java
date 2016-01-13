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

package com.amazonaws.services.kms.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.kms.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * GrantConstraintsMarshaller
 */
public class GrantConstraintsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(GrantConstraints grantConstraints,
            JSONWriter jsonWriter) {
        if (grantConstraints == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            com.amazonaws.internal.SdkInternalMap<String, String> encryptionContextSubsetMap = (com.amazonaws.internal.SdkInternalMap<String, String>) grantConstraints
                    .getEncryptionContextSubset();
            if (!encryptionContextSubsetMap.isEmpty()
                    || !encryptionContextSubsetMap.isAutoConstruct()) {
                jsonWriter.key("EncryptionContextSubset");
                jsonWriter.object();

                for (Map.Entry<String, String> encryptionContextSubsetMapValue : encryptionContextSubsetMap
                        .entrySet()) {
                    if (encryptionContextSubsetMapValue.getValue() != null) {
                        jsonWriter
                                .key(encryptionContextSubsetMapValue.getKey());

                        jsonWriter.value(encryptionContextSubsetMapValue
                                .getValue());
                    }
                }
                jsonWriter.endObject();
            }

            com.amazonaws.internal.SdkInternalMap<String, String> encryptionContextEqualsMap = (com.amazonaws.internal.SdkInternalMap<String, String>) grantConstraints
                    .getEncryptionContextEquals();
            if (!encryptionContextEqualsMap.isEmpty()
                    || !encryptionContextEqualsMap.isAutoConstruct()) {
                jsonWriter.key("EncryptionContextEquals");
                jsonWriter.object();

                for (Map.Entry<String, String> encryptionContextEqualsMapValue : encryptionContextEqualsMap
                        .entrySet()) {
                    if (encryptionContextEqualsMapValue.getValue() != null) {
                        jsonWriter
                                .key(encryptionContextEqualsMapValue.getKey());

                        jsonWriter.value(encryptionContextEqualsMapValue
                                .getValue());
                    }
                }
                jsonWriter.endObject();
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static GrantConstraintsJsonMarshaller instance;

    public static GrantConstraintsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GrantConstraintsJsonMarshaller();
        return instance;
    }

}
