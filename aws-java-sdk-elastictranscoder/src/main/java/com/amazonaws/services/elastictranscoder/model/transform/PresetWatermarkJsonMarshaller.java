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
package com.amazonaws.services.elastictranscoder.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * PresetWatermarkMarshaller
 */
public class PresetWatermarkJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(PresetWatermark presetWatermark, StructuredJsonGenerator jsonGenerator) {

        if (presetWatermark == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (presetWatermark.getId() != null) {
                jsonGenerator.writeFieldName("Id").writeValue(presetWatermark.getId());
            }
            if (presetWatermark.getMaxWidth() != null) {
                jsonGenerator.writeFieldName("MaxWidth").writeValue(presetWatermark.getMaxWidth());
            }
            if (presetWatermark.getMaxHeight() != null) {
                jsonGenerator.writeFieldName("MaxHeight").writeValue(presetWatermark.getMaxHeight());
            }
            if (presetWatermark.getSizingPolicy() != null) {
                jsonGenerator.writeFieldName("SizingPolicy").writeValue(presetWatermark.getSizingPolicy());
            }
            if (presetWatermark.getHorizontalAlign() != null) {
                jsonGenerator.writeFieldName("HorizontalAlign").writeValue(presetWatermark.getHorizontalAlign());
            }
            if (presetWatermark.getHorizontalOffset() != null) {
                jsonGenerator.writeFieldName("HorizontalOffset").writeValue(presetWatermark.getHorizontalOffset());
            }
            if (presetWatermark.getVerticalAlign() != null) {
                jsonGenerator.writeFieldName("VerticalAlign").writeValue(presetWatermark.getVerticalAlign());
            }
            if (presetWatermark.getVerticalOffset() != null) {
                jsonGenerator.writeFieldName("VerticalOffset").writeValue(presetWatermark.getVerticalOffset());
            }
            if (presetWatermark.getOpacity() != null) {
                jsonGenerator.writeFieldName("Opacity").writeValue(presetWatermark.getOpacity());
            }
            if (presetWatermark.getTarget() != null) {
                jsonGenerator.writeFieldName("Target").writeValue(presetWatermark.getTarget());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static PresetWatermarkJsonMarshaller instance;

    public static PresetWatermarkJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PresetWatermarkJsonMarshaller();
        return instance;
    }

}
