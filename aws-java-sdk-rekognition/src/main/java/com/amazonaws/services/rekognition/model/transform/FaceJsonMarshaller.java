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
 * FaceMarshaller
 */
public class FaceJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Face face, StructuredJsonGenerator jsonGenerator) {

        if (face == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (face.getFaceId() != null) {
                jsonGenerator.writeFieldName("FaceId").writeValue(face.getFaceId());
            }
            if (face.getBoundingBox() != null) {
                jsonGenerator.writeFieldName("BoundingBox");
                BoundingBoxJsonMarshaller.getInstance().marshall(face.getBoundingBox(), jsonGenerator);
            }
            if (face.getImageId() != null) {
                jsonGenerator.writeFieldName("ImageId").writeValue(face.getImageId());
            }
            if (face.getExternalImageId() != null) {
                jsonGenerator.writeFieldName("ExternalImageId").writeValue(face.getExternalImageId());
            }
            if (face.getConfidence() != null) {
                jsonGenerator.writeFieldName("Confidence").writeValue(face.getConfidence());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static FaceJsonMarshaller instance;

    public static FaceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FaceJsonMarshaller();
        return instance;
    }

}
