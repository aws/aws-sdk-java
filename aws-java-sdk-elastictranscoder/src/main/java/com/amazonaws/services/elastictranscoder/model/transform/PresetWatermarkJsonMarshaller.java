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
 * PresetWatermarkMarshaller
 */
public class PresetWatermarkJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(PresetWatermark presetWatermark, JSONWriter jsonWriter) {
        if (presetWatermark == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (presetWatermark.getId() != null) {
                jsonWriter.key("Id").value(presetWatermark.getId());
            }

            if (presetWatermark.getMaxWidth() != null) {
                jsonWriter.key("MaxWidth").value(presetWatermark.getMaxWidth());
            }

            if (presetWatermark.getMaxHeight() != null) {
                jsonWriter.key("MaxHeight").value(
                        presetWatermark.getMaxHeight());
            }

            if (presetWatermark.getSizingPolicy() != null) {
                jsonWriter.key("SizingPolicy").value(
                        presetWatermark.getSizingPolicy());
            }

            if (presetWatermark.getHorizontalAlign() != null) {
                jsonWriter.key("HorizontalAlign").value(
                        presetWatermark.getHorizontalAlign());
            }

            if (presetWatermark.getHorizontalOffset() != null) {
                jsonWriter.key("HorizontalOffset").value(
                        presetWatermark.getHorizontalOffset());
            }

            if (presetWatermark.getVerticalAlign() != null) {
                jsonWriter.key("VerticalAlign").value(
                        presetWatermark.getVerticalAlign());
            }

            if (presetWatermark.getVerticalOffset() != null) {
                jsonWriter.key("VerticalOffset").value(
                        presetWatermark.getVerticalOffset());
            }

            if (presetWatermark.getOpacity() != null) {
                jsonWriter.key("Opacity").value(presetWatermark.getOpacity());
            }

            if (presetWatermark.getTarget() != null) {
                jsonWriter.key("Target").value(presetWatermark.getTarget());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static PresetWatermarkJsonMarshaller instance;

    public static PresetWatermarkJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PresetWatermarkJsonMarshaller();
        return instance;
    }

}
