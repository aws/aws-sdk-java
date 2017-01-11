/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.storagegateway.model.transform;

import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.protocol.json.*;

/**
 * StorageGatewayErrorMarshaller
 */
public class StorageGatewayErrorJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(StorageGatewayError storageGatewayError, StructuredJsonGenerator jsonGenerator) {

        if (storageGatewayError == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (storageGatewayError.getErrorCode() != null) {
                jsonGenerator.writeFieldName("errorCode").writeValue(storageGatewayError.getErrorCode());
            }

            java.util.Map<String, String> errorDetailsMap = storageGatewayError.getErrorDetails();
            if (errorDetailsMap != null) {
                jsonGenerator.writeFieldName("errorDetails");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> errorDetailsMapValue : errorDetailsMap.entrySet()) {
                    if (errorDetailsMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(errorDetailsMapValue.getKey());

                        jsonGenerator.writeValue(errorDetailsMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static StorageGatewayErrorJsonMarshaller instance;

    public static StorageGatewayErrorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StorageGatewayErrorJsonMarshaller();
        return instance;
    }

}
