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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.clouddirectory.model.*;

import com.amazonaws.protocol.json.*;

/**
 * BatchListObjectAttributesResponseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchListObjectAttributesResponseJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(BatchListObjectAttributesResponse batchListObjectAttributesResponse, StructuredJsonGenerator jsonGenerator) {

        if (batchListObjectAttributesResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            java.util.List<AttributeKeyAndValue> attributesList = batchListObjectAttributesResponse.getAttributes();
            if (attributesList != null) {
                jsonGenerator.writeFieldName("Attributes");
                jsonGenerator.writeStartArray();
                for (AttributeKeyAndValue attributesListValue : attributesList) {
                    if (attributesListValue != null) {

                        AttributeKeyAndValueJsonMarshaller.getInstance().marshall(attributesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (batchListObjectAttributesResponse.getNextToken() != null) {
                jsonGenerator.writeFieldName("NextToken").writeValue(batchListObjectAttributesResponse.getNextToken());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static BatchListObjectAttributesResponseJsonMarshaller instance;

    public static BatchListObjectAttributesResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BatchListObjectAttributesResponseJsonMarshaller();
        return instance;
    }

}
