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
package com.amazonaws.services.ecr.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ecr.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ImageIdentifierMarshaller
 */
public class ImageIdentifierJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ImageIdentifier imageIdentifier, StructuredJsonGenerator jsonGenerator) {

        if (imageIdentifier == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (imageIdentifier.getImageDigest() != null) {
                jsonGenerator.writeFieldName("imageDigest").writeValue(imageIdentifier.getImageDigest());
            }
            if (imageIdentifier.getImageTag() != null) {
                jsonGenerator.writeFieldName("imageTag").writeValue(imageIdentifier.getImageTag());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ImageIdentifierJsonMarshaller instance;

    public static ImageIdentifierJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImageIdentifierJsonMarshaller();
        return instance;
    }

}
