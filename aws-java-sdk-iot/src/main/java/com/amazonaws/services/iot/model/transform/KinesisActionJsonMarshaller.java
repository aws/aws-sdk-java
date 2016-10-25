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
package com.amazonaws.services.iot.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * KinesisActionMarshaller
 */
public class KinesisActionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(KinesisAction kinesisAction, StructuredJsonGenerator jsonGenerator) {

        if (kinesisAction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (kinesisAction.getRoleArn() != null) {
                jsonGenerator.writeFieldName("roleArn").writeValue(kinesisAction.getRoleArn());
            }
            if (kinesisAction.getStreamName() != null) {
                jsonGenerator.writeFieldName("streamName").writeValue(kinesisAction.getStreamName());
            }
            if (kinesisAction.getPartitionKey() != null) {
                jsonGenerator.writeFieldName("partitionKey").writeValue(kinesisAction.getPartitionKey());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static KinesisActionJsonMarshaller instance;

    public static KinesisActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new KinesisActionJsonMarshaller();
        return instance;
    }

}
