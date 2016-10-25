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
 * PresetMarshaller
 */
public class PresetJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Preset preset, StructuredJsonGenerator jsonGenerator) {

        if (preset == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (preset.getId() != null) {
                jsonGenerator.writeFieldName("Id").writeValue(preset.getId());
            }
            if (preset.getArn() != null) {
                jsonGenerator.writeFieldName("Arn").writeValue(preset.getArn());
            }
            if (preset.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(preset.getName());
            }
            if (preset.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(preset.getDescription());
            }
            if (preset.getContainer() != null) {
                jsonGenerator.writeFieldName("Container").writeValue(preset.getContainer());
            }
            if (preset.getAudio() != null) {
                jsonGenerator.writeFieldName("Audio");
                AudioParametersJsonMarshaller.getInstance().marshall(preset.getAudio(), jsonGenerator);
            }
            if (preset.getVideo() != null) {
                jsonGenerator.writeFieldName("Video");
                VideoParametersJsonMarshaller.getInstance().marshall(preset.getVideo(), jsonGenerator);
            }
            if (preset.getThumbnails() != null) {
                jsonGenerator.writeFieldName("Thumbnails");
                ThumbnailsJsonMarshaller.getInstance().marshall(preset.getThumbnails(), jsonGenerator);
            }
            if (preset.getType() != null) {
                jsonGenerator.writeFieldName("Type").writeValue(preset.getType());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static PresetJsonMarshaller instance;

    public static PresetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PresetJsonMarshaller();
        return instance;
    }

}
