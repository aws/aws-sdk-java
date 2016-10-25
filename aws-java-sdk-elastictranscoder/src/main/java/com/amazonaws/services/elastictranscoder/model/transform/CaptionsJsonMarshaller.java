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
 * CaptionsMarshaller
 */
public class CaptionsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Captions captions, StructuredJsonGenerator jsonGenerator) {

        if (captions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (captions.getMergePolicy() != null) {
                jsonGenerator.writeFieldName("MergePolicy").writeValue(captions.getMergePolicy());
            }

            com.amazonaws.internal.SdkInternalList<CaptionSource> captionSourcesList = (com.amazonaws.internal.SdkInternalList<CaptionSource>) captions
                    .getCaptionSources();
            if (!captionSourcesList.isEmpty() || !captionSourcesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("CaptionSources");
                jsonGenerator.writeStartArray();
                for (CaptionSource captionSourcesListValue : captionSourcesList) {
                    if (captionSourcesListValue != null) {

                        CaptionSourceJsonMarshaller.getInstance().marshall(captionSourcesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<CaptionFormat> captionFormatsList = (com.amazonaws.internal.SdkInternalList<CaptionFormat>) captions
                    .getCaptionFormats();
            if (!captionFormatsList.isEmpty() || !captionFormatsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("CaptionFormats");
                jsonGenerator.writeStartArray();
                for (CaptionFormat captionFormatsListValue : captionFormatsList) {
                    if (captionFormatsListValue != null) {

                        CaptionFormatJsonMarshaller.getInstance().marshall(captionFormatsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static CaptionsJsonMarshaller instance;

    public static CaptionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CaptionsJsonMarshaller();
        return instance;
    }

}
