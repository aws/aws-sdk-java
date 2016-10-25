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
package com.amazonaws.services.cognitoidentity.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cognitoidentity.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * IdentityDescriptionMarshaller
 */
public class IdentityDescriptionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(IdentityDescription identityDescription, StructuredJsonGenerator jsonGenerator) {

        if (identityDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (identityDescription.getIdentityId() != null) {
                jsonGenerator.writeFieldName("IdentityId").writeValue(identityDescription.getIdentityId());
            }

            java.util.List<String> loginsList = identityDescription.getLogins();
            if (loginsList != null) {
                jsonGenerator.writeFieldName("Logins");
                jsonGenerator.writeStartArray();
                for (String loginsListValue : loginsList) {
                    if (loginsListValue != null) {
                        jsonGenerator.writeValue(loginsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (identityDescription.getCreationDate() != null) {
                jsonGenerator.writeFieldName("CreationDate").writeValue(identityDescription.getCreationDate());
            }
            if (identityDescription.getLastModifiedDate() != null) {
                jsonGenerator.writeFieldName("LastModifiedDate").writeValue(identityDescription.getLastModifiedDate());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static IdentityDescriptionJsonMarshaller instance;

    public static IdentityDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IdentityDescriptionJsonMarshaller();
        return instance;
    }

}
