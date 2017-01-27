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
package com.amazonaws.services.clouddirectory.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.clouddirectory.model.*;

import com.amazonaws.protocol.json.*;

/**
 * BatchListObjectChildrenResponseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchListObjectChildrenResponseJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(BatchListObjectChildrenResponse batchListObjectChildrenResponse, StructuredJsonGenerator jsonGenerator) {

        if (batchListObjectChildrenResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            java.util.Map<String, String> childrenMap = batchListObjectChildrenResponse.getChildren();
            if (childrenMap != null) {
                jsonGenerator.writeFieldName("Children");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> childrenMapValue : childrenMap.entrySet()) {
                    if (childrenMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(childrenMapValue.getKey());

                        jsonGenerator.writeValue(childrenMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (batchListObjectChildrenResponse.getNextToken() != null) {
                jsonGenerator.writeFieldName("NextToken").writeValue(batchListObjectChildrenResponse.getNextToken());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static BatchListObjectChildrenResponseJsonMarshaller instance;

    public static BatchListObjectChildrenResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BatchListObjectChildrenResponseJsonMarshaller();
        return instance;
    }

}
