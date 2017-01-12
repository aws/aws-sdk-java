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
package com.amazonaws.services.applicationdiscovery.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.applicationdiscovery.model.*;

import com.amazonaws.protocol.json.*;

/**
 * OrderByElementMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrderByElementJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(OrderByElement orderByElement, StructuredJsonGenerator jsonGenerator) {

        if (orderByElement == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (orderByElement.getFieldName() != null) {
                jsonGenerator.writeFieldName("fieldName").writeValue(orderByElement.getFieldName());
            }
            if (orderByElement.getSortOrder() != null) {
                jsonGenerator.writeFieldName("sortOrder").writeValue(orderByElement.getSortOrder());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static OrderByElementJsonMarshaller instance;

    public static OrderByElementJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OrderByElementJsonMarshaller();
        return instance;
    }

}
