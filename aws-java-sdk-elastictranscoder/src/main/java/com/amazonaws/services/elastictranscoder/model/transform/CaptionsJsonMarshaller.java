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
 * CaptionsMarshaller
 */
public class CaptionsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Captions captions, JSONWriter jsonWriter) {
        if (captions == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (captions.getMergePolicy() != null) {
                jsonWriter.key("MergePolicy").value(captions.getMergePolicy());
            }

            com.amazonaws.internal.SdkInternalList<CaptionSource> captionSourcesList = (com.amazonaws.internal.SdkInternalList<CaptionSource>) captions
                    .getCaptionSources();
            if (!captionSourcesList.isEmpty()
                    || !captionSourcesList.isAutoConstruct()) {
                jsonWriter.key("CaptionSources");
                jsonWriter.array();
                for (CaptionSource captionSourcesListValue : captionSourcesList) {
                    if (captionSourcesListValue != null) {

                        CaptionSourceJsonMarshaller.getInstance().marshall(
                                captionSourcesListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<CaptionFormat> captionFormatsList = (com.amazonaws.internal.SdkInternalList<CaptionFormat>) captions
                    .getCaptionFormats();
            if (!captionFormatsList.isEmpty()
                    || !captionFormatsList.isAutoConstruct()) {
                jsonWriter.key("CaptionFormats");
                jsonWriter.array();
                for (CaptionFormat captionFormatsListValue : captionFormatsList) {
                    if (captionFormatsListValue != null) {

                        CaptionFormatJsonMarshaller.getInstance().marshall(
                                captionFormatsListValue, jsonWriter);
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

    private static CaptionsJsonMarshaller instance;

    public static CaptionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CaptionsJsonMarshaller();
        return instance;
    }

}
