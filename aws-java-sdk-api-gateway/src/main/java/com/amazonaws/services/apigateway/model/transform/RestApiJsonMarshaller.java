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
package com.amazonaws.services.apigateway.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * RestApiMarshaller
 */
public class RestApiJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(RestApi restApi, StructuredJsonGenerator jsonGenerator) {

        if (restApi == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (restApi.getId() != null) {
                jsonGenerator.writeFieldName("id").writeValue(restApi.getId());
            }
            if (restApi.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(restApi.getName());
            }
            if (restApi.getDescription() != null) {
                jsonGenerator.writeFieldName("description").writeValue(restApi.getDescription());
            }
            if (restApi.getCreatedDate() != null) {
                jsonGenerator.writeFieldName("createdDate").writeValue(restApi.getCreatedDate());
            }

            java.util.List<String> warningsList = restApi.getWarnings();
            if (warningsList != null) {
                jsonGenerator.writeFieldName("warnings");
                jsonGenerator.writeStartArray();
                for (String warningsListValue : warningsList) {
                    if (warningsListValue != null) {
                        jsonGenerator.writeValue(warningsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<String> binaryMediaTypesList = restApi.getBinaryMediaTypes();
            if (binaryMediaTypesList != null) {
                jsonGenerator.writeFieldName("binaryMediaTypes");
                jsonGenerator.writeStartArray();
                for (String binaryMediaTypesListValue : binaryMediaTypesList) {
                    if (binaryMediaTypesListValue != null) {
                        jsonGenerator.writeValue(binaryMediaTypesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RestApiJsonMarshaller instance;

    public static RestApiJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RestApiJsonMarshaller();
        return instance;
    }

}
