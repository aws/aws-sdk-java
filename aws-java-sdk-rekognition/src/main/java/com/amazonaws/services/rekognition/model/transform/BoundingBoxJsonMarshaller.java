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
package com.amazonaws.services.rekognition.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * BoundingBoxMarshaller
 */
public class BoundingBoxJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(BoundingBox boundingBox, StructuredJsonGenerator jsonGenerator) {

        if (boundingBox == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (boundingBox.getWidth() != null) {
                jsonGenerator.writeFieldName("Width").writeValue(boundingBox.getWidth());
            }
            if (boundingBox.getHeight() != null) {
                jsonGenerator.writeFieldName("Height").writeValue(boundingBox.getHeight());
            }
            if (boundingBox.getLeft() != null) {
                jsonGenerator.writeFieldName("Left").writeValue(boundingBox.getLeft());
            }
            if (boundingBox.getTop() != null) {
                jsonGenerator.writeFieldName("Top").writeValue(boundingBox.getTop());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static BoundingBoxJsonMarshaller instance;

    public static BoundingBoxJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BoundingBoxJsonMarshaller();
        return instance;
    }

}
