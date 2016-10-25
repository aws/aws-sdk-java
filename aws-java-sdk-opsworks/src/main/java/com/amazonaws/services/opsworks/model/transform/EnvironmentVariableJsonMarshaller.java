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
package com.amazonaws.services.opsworks.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * EnvironmentVariableMarshaller
 */
public class EnvironmentVariableJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(EnvironmentVariable environmentVariable, StructuredJsonGenerator jsonGenerator) {

        if (environmentVariable == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (environmentVariable.getKey() != null) {
                jsonGenerator.writeFieldName("Key").writeValue(environmentVariable.getKey());
            }
            if (environmentVariable.getValue() != null) {
                jsonGenerator.writeFieldName("Value").writeValue(environmentVariable.getValue());
            }
            if (environmentVariable.getSecure() != null) {
                jsonGenerator.writeFieldName("Secure").writeValue(environmentVariable.getSecure());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static EnvironmentVariableJsonMarshaller instance;

    public static EnvironmentVariableJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EnvironmentVariableJsonMarshaller();
        return instance;
    }

}
