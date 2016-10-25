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
package com.amazonaws.services.cognitoidp.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cognitoidp.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * UserPoolClientTypeMarshaller
 */
public class UserPoolClientTypeJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(UserPoolClientType userPoolClientType, StructuredJsonGenerator jsonGenerator) {

        if (userPoolClientType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (userPoolClientType.getUserPoolId() != null) {
                jsonGenerator.writeFieldName("UserPoolId").writeValue(userPoolClientType.getUserPoolId());
            }
            if (userPoolClientType.getClientName() != null) {
                jsonGenerator.writeFieldName("ClientName").writeValue(userPoolClientType.getClientName());
            }
            if (userPoolClientType.getClientId() != null) {
                jsonGenerator.writeFieldName("ClientId").writeValue(userPoolClientType.getClientId());
            }
            if (userPoolClientType.getClientSecret() != null) {
                jsonGenerator.writeFieldName("ClientSecret").writeValue(userPoolClientType.getClientSecret());
            }
            if (userPoolClientType.getLastModifiedDate() != null) {
                jsonGenerator.writeFieldName("LastModifiedDate").writeValue(userPoolClientType.getLastModifiedDate());
            }
            if (userPoolClientType.getCreationDate() != null) {
                jsonGenerator.writeFieldName("CreationDate").writeValue(userPoolClientType.getCreationDate());
            }
            if (userPoolClientType.getRefreshTokenValidity() != null) {
                jsonGenerator.writeFieldName("RefreshTokenValidity").writeValue(userPoolClientType.getRefreshTokenValidity());
            }

            java.util.List<String> readAttributesList = userPoolClientType.getReadAttributes();
            if (readAttributesList != null) {
                jsonGenerator.writeFieldName("ReadAttributes");
                jsonGenerator.writeStartArray();
                for (String readAttributesListValue : readAttributesList) {
                    if (readAttributesListValue != null) {
                        jsonGenerator.writeValue(readAttributesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<String> writeAttributesList = userPoolClientType.getWriteAttributes();
            if (writeAttributesList != null) {
                jsonGenerator.writeFieldName("WriteAttributes");
                jsonGenerator.writeStartArray();
                for (String writeAttributesListValue : writeAttributesList) {
                    if (writeAttributesListValue != null) {
                        jsonGenerator.writeValue(writeAttributesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<String> explicitAuthFlowsList = userPoolClientType.getExplicitAuthFlows();
            if (explicitAuthFlowsList != null) {
                jsonGenerator.writeFieldName("ExplicitAuthFlows");
                jsonGenerator.writeStartArray();
                for (String explicitAuthFlowsListValue : explicitAuthFlowsList) {
                    if (explicitAuthFlowsListValue != null) {
                        jsonGenerator.writeValue(explicitAuthFlowsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static UserPoolClientTypeJsonMarshaller instance;

    public static UserPoolClientTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UserPoolClientTypeJsonMarshaller();
        return instance;
    }

}
