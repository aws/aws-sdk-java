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
 * S3ActionMarshaller
 */
public class S3ActionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(S3Action s3Action, StructuredJsonGenerator jsonGenerator) {

        if (s3Action == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (s3Action.getRoleArn() != null) {
                jsonGenerator.writeFieldName("roleArn").writeValue(s3Action.getRoleArn());
            }
            if (s3Action.getBucketName() != null) {
                jsonGenerator.writeFieldName("bucketName").writeValue(s3Action.getBucketName());
            }
            if (s3Action.getKey() != null) {
                jsonGenerator.writeFieldName("key").writeValue(s3Action.getKey());
            }
            if (s3Action.getCannedAcl() != null) {
                jsonGenerator.writeFieldName("cannedAcl").writeValue(s3Action.getCannedAcl());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static S3ActionJsonMarshaller instance;

    public static S3ActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3ActionJsonMarshaller();
        return instance;
    }

}
