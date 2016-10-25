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
 * ThumbnailsMarshaller
 */
public class ThumbnailsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Thumbnails thumbnails, StructuredJsonGenerator jsonGenerator) {

        if (thumbnails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (thumbnails.getFormat() != null) {
                jsonGenerator.writeFieldName("Format").writeValue(thumbnails.getFormat());
            }
            if (thumbnails.getInterval() != null) {
                jsonGenerator.writeFieldName("Interval").writeValue(thumbnails.getInterval());
            }
            if (thumbnails.getResolution() != null) {
                jsonGenerator.writeFieldName("Resolution").writeValue(thumbnails.getResolution());
            }
            if (thumbnails.getAspectRatio() != null) {
                jsonGenerator.writeFieldName("AspectRatio").writeValue(thumbnails.getAspectRatio());
            }
            if (thumbnails.getMaxWidth() != null) {
                jsonGenerator.writeFieldName("MaxWidth").writeValue(thumbnails.getMaxWidth());
            }
            if (thumbnails.getMaxHeight() != null) {
                jsonGenerator.writeFieldName("MaxHeight").writeValue(thumbnails.getMaxHeight());
            }
            if (thumbnails.getSizingPolicy() != null) {
                jsonGenerator.writeFieldName("SizingPolicy").writeValue(thumbnails.getSizingPolicy());
            }
            if (thumbnails.getPaddingPolicy() != null) {
                jsonGenerator.writeFieldName("PaddingPolicy").writeValue(thumbnails.getPaddingPolicy());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ThumbnailsJsonMarshaller instance;

    public static ThumbnailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ThumbnailsJsonMarshaller();
        return instance;
    }

}
