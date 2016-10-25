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
 * SqsActionMarshaller
 */
public class SqsActionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(SqsAction sqsAction, StructuredJsonGenerator jsonGenerator) {

        if (sqsAction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (sqsAction.getRoleArn() != null) {
                jsonGenerator.writeFieldName("roleArn").writeValue(sqsAction.getRoleArn());
            }
            if (sqsAction.getQueueUrl() != null) {
                jsonGenerator.writeFieldName("queueUrl").writeValue(sqsAction.getQueueUrl());
            }
            if (sqsAction.getUseBase64() != null) {
                jsonGenerator.writeFieldName("useBase64").writeValue(sqsAction.getUseBase64());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static SqsActionJsonMarshaller instance;

    public static SqsActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SqsActionJsonMarshaller();
        return instance;
    }

}
