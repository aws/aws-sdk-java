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
package com.amazonaws.services.pinpoint.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * SegmentDimensionsMarshaller
 */
public class SegmentDimensionsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(SegmentDimensions segmentDimensions, StructuredJsonGenerator jsonGenerator) {

        if (segmentDimensions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            java.util.Map<String, AttributeDimension> attributesMap = segmentDimensions.getAttributes();
            if (attributesMap != null) {
                jsonGenerator.writeFieldName("Attributes");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, AttributeDimension> attributesMapValue : attributesMap.entrySet()) {
                    if (attributesMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(attributesMapValue.getKey());

                        AttributeDimensionJsonMarshaller.getInstance().marshall(attributesMapValue.getValue(), jsonGenerator);
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (segmentDimensions.getBehavior() != null) {
                jsonGenerator.writeFieldName("Behavior");
                SegmentBehaviorsJsonMarshaller.getInstance().marshall(segmentDimensions.getBehavior(), jsonGenerator);
            }
            if (segmentDimensions.getDemographic() != null) {
                jsonGenerator.writeFieldName("Demographic");
                SegmentDemographicsJsonMarshaller.getInstance().marshall(segmentDimensions.getDemographic(), jsonGenerator);
            }
            if (segmentDimensions.getLocation() != null) {
                jsonGenerator.writeFieldName("Location");
                SegmentLocationJsonMarshaller.getInstance().marshall(segmentDimensions.getLocation(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static SegmentDimensionsJsonMarshaller instance;

    public static SegmentDimensionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SegmentDimensionsJsonMarshaller();
        return instance;
    }

}
