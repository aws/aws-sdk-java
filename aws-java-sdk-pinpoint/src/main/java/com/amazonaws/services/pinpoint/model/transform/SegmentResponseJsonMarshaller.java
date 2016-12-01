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
 * SegmentResponseMarshaller
 */
public class SegmentResponseJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(SegmentResponse segmentResponse, StructuredJsonGenerator jsonGenerator) {

        if (segmentResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (segmentResponse.getApplicationId() != null) {
                jsonGenerator.writeFieldName("ApplicationId").writeValue(segmentResponse.getApplicationId());
            }
            if (segmentResponse.getCreationDate() != null) {
                jsonGenerator.writeFieldName("CreationDate").writeValue(segmentResponse.getCreationDate());
            }
            if (segmentResponse.getDimensions() != null) {
                jsonGenerator.writeFieldName("Dimensions");
                SegmentDimensionsJsonMarshaller.getInstance().marshall(segmentResponse.getDimensions(), jsonGenerator);
            }
            if (segmentResponse.getId() != null) {
                jsonGenerator.writeFieldName("Id").writeValue(segmentResponse.getId());
            }
            if (segmentResponse.getImportDefinition() != null) {
                jsonGenerator.writeFieldName("ImportDefinition");
                SegmentImportResourceJsonMarshaller.getInstance().marshall(segmentResponse.getImportDefinition(), jsonGenerator);
            }
            if (segmentResponse.getLastModifiedDate() != null) {
                jsonGenerator.writeFieldName("LastModifiedDate").writeValue(segmentResponse.getLastModifiedDate());
            }
            if (segmentResponse.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(segmentResponse.getName());
            }
            if (segmentResponse.getSegmentType() != null) {
                jsonGenerator.writeFieldName("SegmentType").writeValue(segmentResponse.getSegmentType());
            }
            if (segmentResponse.getVersion() != null) {
                jsonGenerator.writeFieldName("Version").writeValue(segmentResponse.getVersion());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static SegmentResponseJsonMarshaller instance;

    public static SegmentResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SegmentResponseJsonMarshaller();
        return instance;
    }

}
