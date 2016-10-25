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
package com.amazonaws.services.devicefarm.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.devicefarm.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ArtifactMarshaller
 */
public class ArtifactJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Artifact artifact, StructuredJsonGenerator jsonGenerator) {

        if (artifact == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (artifact.getArn() != null) {
                jsonGenerator.writeFieldName("arn").writeValue(artifact.getArn());
            }
            if (artifact.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(artifact.getName());
            }
            if (artifact.getType() != null) {
                jsonGenerator.writeFieldName("type").writeValue(artifact.getType());
            }
            if (artifact.getExtension() != null) {
                jsonGenerator.writeFieldName("extension").writeValue(artifact.getExtension());
            }
            if (artifact.getUrl() != null) {
                jsonGenerator.writeFieldName("url").writeValue(artifact.getUrl());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ArtifactJsonMarshaller instance;

    public static ArtifactJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ArtifactJsonMarshaller();
        return instance;
    }

}
