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
package com.amazonaws.services.codedeploy.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * EC2TagFilterMarshaller
 */
public class EC2TagFilterJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(EC2TagFilter eC2TagFilter, StructuredJsonGenerator jsonGenerator) {

        if (eC2TagFilter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (eC2TagFilter.getKey() != null) {
                jsonGenerator.writeFieldName("Key").writeValue(eC2TagFilter.getKey());
            }
            if (eC2TagFilter.getValue() != null) {
                jsonGenerator.writeFieldName("Value").writeValue(eC2TagFilter.getValue());
            }
            if (eC2TagFilter.getType() != null) {
                jsonGenerator.writeFieldName("Type").writeValue(eC2TagFilter.getType());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static EC2TagFilterJsonMarshaller instance;

    public static EC2TagFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EC2TagFilterJsonMarshaller();
        return instance;
    }

}
