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
 * VideoParametersMarshaller
 */
public class VideoParametersJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(VideoParameters videoParameters, JSONWriter jsonWriter) {
        if (videoParameters == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (videoParameters.getCodec() != null) {
                jsonWriter.key("Codec").value(videoParameters.getCodec());
            }

            com.amazonaws.internal.SdkInternalMap<String, String> codecOptionsMap = (com.amazonaws.internal.SdkInternalMap<String, String>) videoParameters
                    .getCodecOptions();
            if (!codecOptionsMap.isEmpty()
                    || !codecOptionsMap.isAutoConstruct()) {
                jsonWriter.key("CodecOptions");
                jsonWriter.object();

                for (Map.Entry<String, String> codecOptionsMapValue : codecOptionsMap
                        .entrySet()) {
                    if (codecOptionsMapValue.getValue() != null) {
                        jsonWriter.key(codecOptionsMapValue.getKey());

                        jsonWriter.value(codecOptionsMapValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }

            if (videoParameters.getKeyframesMaxDist() != null) {
                jsonWriter.key("KeyframesMaxDist").value(
                        videoParameters.getKeyframesMaxDist());
            }

            if (videoParameters.getFixedGOP() != null) {
                jsonWriter.key("FixedGOP").value(videoParameters.getFixedGOP());
            }

            if (videoParameters.getBitRate() != null) {
                jsonWriter.key("BitRate").value(videoParameters.getBitRate());
            }

            if (videoParameters.getFrameRate() != null) {
                jsonWriter.key("FrameRate").value(
                        videoParameters.getFrameRate());
            }

            if (videoParameters.getMaxFrameRate() != null) {
                jsonWriter.key("MaxFrameRate").value(
                        videoParameters.getMaxFrameRate());
            }

            if (videoParameters.getResolution() != null) {
                jsonWriter.key("Resolution").value(
                        videoParameters.getResolution());
            }

            if (videoParameters.getAspectRatio() != null) {
                jsonWriter.key("AspectRatio").value(
                        videoParameters.getAspectRatio());
            }

            if (videoParameters.getMaxWidth() != null) {
                jsonWriter.key("MaxWidth").value(videoParameters.getMaxWidth());
            }

            if (videoParameters.getMaxHeight() != null) {
                jsonWriter.key("MaxHeight").value(
                        videoParameters.getMaxHeight());
            }

            if (videoParameters.getDisplayAspectRatio() != null) {
                jsonWriter.key("DisplayAspectRatio").value(
                        videoParameters.getDisplayAspectRatio());
            }

            if (videoParameters.getSizingPolicy() != null) {
                jsonWriter.key("SizingPolicy").value(
                        videoParameters.getSizingPolicy());
            }

            if (videoParameters.getPaddingPolicy() != null) {
                jsonWriter.key("PaddingPolicy").value(
                        videoParameters.getPaddingPolicy());
            }

            com.amazonaws.internal.SdkInternalList<PresetWatermark> watermarksList = (com.amazonaws.internal.SdkInternalList<PresetWatermark>) videoParameters
                    .getWatermarks();
            if (!watermarksList.isEmpty() || !watermarksList.isAutoConstruct()) {
                jsonWriter.key("Watermarks");
                jsonWriter.array();
                for (PresetWatermark watermarksListValue : watermarksList) {
                    if (watermarksListValue != null) {

                        PresetWatermarkJsonMarshaller.getInstance().marshall(
                                watermarksListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static VideoParametersJsonMarshaller instance;

    public static VideoParametersJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VideoParametersJsonMarshaller();
        return instance;
    }

}
