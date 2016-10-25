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
 * VideoParametersMarshaller
 */
public class VideoParametersJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(VideoParameters videoParameters, StructuredJsonGenerator jsonGenerator) {

        if (videoParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (videoParameters.getCodec() != null) {
                jsonGenerator.writeFieldName("Codec").writeValue(videoParameters.getCodec());
            }

            com.amazonaws.internal.SdkInternalMap<String, String> codecOptionsMap = (com.amazonaws.internal.SdkInternalMap<String, String>) videoParameters
                    .getCodecOptions();
            if (!codecOptionsMap.isEmpty() || !codecOptionsMap.isAutoConstruct()) {
                jsonGenerator.writeFieldName("CodecOptions");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> codecOptionsMapValue : codecOptionsMap.entrySet()) {
                    if (codecOptionsMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(codecOptionsMapValue.getKey());

                        jsonGenerator.writeValue(codecOptionsMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (videoParameters.getKeyframesMaxDist() != null) {
                jsonGenerator.writeFieldName("KeyframesMaxDist").writeValue(videoParameters.getKeyframesMaxDist());
            }
            if (videoParameters.getFixedGOP() != null) {
                jsonGenerator.writeFieldName("FixedGOP").writeValue(videoParameters.getFixedGOP());
            }
            if (videoParameters.getBitRate() != null) {
                jsonGenerator.writeFieldName("BitRate").writeValue(videoParameters.getBitRate());
            }
            if (videoParameters.getFrameRate() != null) {
                jsonGenerator.writeFieldName("FrameRate").writeValue(videoParameters.getFrameRate());
            }
            if (videoParameters.getMaxFrameRate() != null) {
                jsonGenerator.writeFieldName("MaxFrameRate").writeValue(videoParameters.getMaxFrameRate());
            }
            if (videoParameters.getResolution() != null) {
                jsonGenerator.writeFieldName("Resolution").writeValue(videoParameters.getResolution());
            }
            if (videoParameters.getAspectRatio() != null) {
                jsonGenerator.writeFieldName("AspectRatio").writeValue(videoParameters.getAspectRatio());
            }
            if (videoParameters.getMaxWidth() != null) {
                jsonGenerator.writeFieldName("MaxWidth").writeValue(videoParameters.getMaxWidth());
            }
            if (videoParameters.getMaxHeight() != null) {
                jsonGenerator.writeFieldName("MaxHeight").writeValue(videoParameters.getMaxHeight());
            }
            if (videoParameters.getDisplayAspectRatio() != null) {
                jsonGenerator.writeFieldName("DisplayAspectRatio").writeValue(videoParameters.getDisplayAspectRatio());
            }
            if (videoParameters.getSizingPolicy() != null) {
                jsonGenerator.writeFieldName("SizingPolicy").writeValue(videoParameters.getSizingPolicy());
            }
            if (videoParameters.getPaddingPolicy() != null) {
                jsonGenerator.writeFieldName("PaddingPolicy").writeValue(videoParameters.getPaddingPolicy());
            }

            com.amazonaws.internal.SdkInternalList<PresetWatermark> watermarksList = (com.amazonaws.internal.SdkInternalList<PresetWatermark>) videoParameters
                    .getWatermarks();
            if (!watermarksList.isEmpty() || !watermarksList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Watermarks");
                jsonGenerator.writeStartArray();
                for (PresetWatermark watermarksListValue : watermarksList) {
                    if (watermarksListValue != null) {

                        PresetWatermarkJsonMarshaller.getInstance().marshall(watermarksListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static VideoParametersJsonMarshaller instance;

    public static VideoParametersJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VideoParametersJsonMarshaller();
        return instance;
    }

}
