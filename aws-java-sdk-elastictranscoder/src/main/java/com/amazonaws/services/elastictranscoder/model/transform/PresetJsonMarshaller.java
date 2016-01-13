/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.elastictranscoder.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * PresetMarshaller
 */
public class PresetJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Preset preset, JSONWriter jsonWriter) {
        if (preset == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (preset.getId() != null) {
                jsonWriter.key("Id").value(preset.getId());
            }

            if (preset.getArn() != null) {
                jsonWriter.key("Arn").value(preset.getArn());
            }

            if (preset.getName() != null) {
                jsonWriter.key("Name").value(preset.getName());
            }

            if (preset.getDescription() != null) {
                jsonWriter.key("Description").value(preset.getDescription());
            }

            if (preset.getContainer() != null) {
                jsonWriter.key("Container").value(preset.getContainer());
            }

            if (preset.getAudio() != null) {
                jsonWriter.key("Audio");
                AudioParametersJsonMarshaller.getInstance().marshall(
                        preset.getAudio(), jsonWriter);
            }

            if (preset.getVideo() != null) {
                jsonWriter.key("Video");
                VideoParametersJsonMarshaller.getInstance().marshall(
                        preset.getVideo(), jsonWriter);
            }

            if (preset.getThumbnails() != null) {
                jsonWriter.key("Thumbnails");
                ThumbnailsJsonMarshaller.getInstance().marshall(
                        preset.getThumbnails(), jsonWriter);
            }

            if (preset.getType() != null) {
                jsonWriter.key("Type").value(preset.getType());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static PresetJsonMarshaller instance;

    public static PresetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PresetJsonMarshaller();
        return instance;
    }

}
