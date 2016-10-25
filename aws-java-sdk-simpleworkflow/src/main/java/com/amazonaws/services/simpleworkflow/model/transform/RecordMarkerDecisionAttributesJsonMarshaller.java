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
package com.amazonaws.services.simpleworkflow.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simpleworkflow.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * RecordMarkerDecisionAttributesMarshaller
 */
public class RecordMarkerDecisionAttributesJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(RecordMarkerDecisionAttributes recordMarkerDecisionAttributes, StructuredJsonGenerator jsonGenerator) {

        if (recordMarkerDecisionAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (recordMarkerDecisionAttributes.getMarkerName() != null) {
                jsonGenerator.writeFieldName("markerName").writeValue(recordMarkerDecisionAttributes.getMarkerName());
            }
            if (recordMarkerDecisionAttributes.getDetails() != null) {
                jsonGenerator.writeFieldName("details").writeValue(recordMarkerDecisionAttributes.getDetails());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RecordMarkerDecisionAttributesJsonMarshaller instance;

    public static RecordMarkerDecisionAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RecordMarkerDecisionAttributesJsonMarshaller();
        return instance;
    }

}
