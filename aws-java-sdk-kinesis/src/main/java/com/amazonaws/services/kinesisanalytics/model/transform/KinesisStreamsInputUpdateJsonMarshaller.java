/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisanalytics.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisanalytics.model.*;

import com.amazonaws.protocol.json.*;

/**
 * KinesisStreamsInputUpdateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KinesisStreamsInputUpdateJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(KinesisStreamsInputUpdate kinesisStreamsInputUpdate, StructuredJsonGenerator jsonGenerator) {

        if (kinesisStreamsInputUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (kinesisStreamsInputUpdate.getResourceARNUpdate() != null) {
                jsonGenerator.writeFieldName("ResourceARNUpdate").writeValue(kinesisStreamsInputUpdate.getResourceARNUpdate());
            }
            if (kinesisStreamsInputUpdate.getRoleARNUpdate() != null) {
                jsonGenerator.writeFieldName("RoleARNUpdate").writeValue(kinesisStreamsInputUpdate.getRoleARNUpdate());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static KinesisStreamsInputUpdateJsonMarshaller instance;

    public static KinesisStreamsInputUpdateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new KinesisStreamsInputUpdateJsonMarshaller();
        return instance;
    }

}
