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
package com.amazonaws.services.logs.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.logs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * DestinationMarshaller
 */
public class DestinationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Destination destination, StructuredJsonGenerator jsonGenerator) {

        if (destination == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (destination.getDestinationName() != null) {
                jsonGenerator.writeFieldName("destinationName").writeValue(destination.getDestinationName());
            }
            if (destination.getTargetArn() != null) {
                jsonGenerator.writeFieldName("targetArn").writeValue(destination.getTargetArn());
            }
            if (destination.getRoleArn() != null) {
                jsonGenerator.writeFieldName("roleArn").writeValue(destination.getRoleArn());
            }
            if (destination.getAccessPolicy() != null) {
                jsonGenerator.writeFieldName("accessPolicy").writeValue(destination.getAccessPolicy());
            }
            if (destination.getArn() != null) {
                jsonGenerator.writeFieldName("arn").writeValue(destination.getArn());
            }
            if (destination.getCreationTime() != null) {
                jsonGenerator.writeFieldName("creationTime").writeValue(destination.getCreationTime());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DestinationJsonMarshaller instance;

    public static DestinationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DestinationJsonMarshaller();
        return instance;
    }

}
