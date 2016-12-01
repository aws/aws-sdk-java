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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * S3OutputLocationMarshaller
 */
public class S3OutputLocationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(S3OutputLocation s3OutputLocation, StructuredJsonGenerator jsonGenerator) {

        if (s3OutputLocation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (s3OutputLocation.getOutputS3Region() != null) {
                jsonGenerator.writeFieldName("OutputS3Region").writeValue(s3OutputLocation.getOutputS3Region());
            }
            if (s3OutputLocation.getOutputS3BucketName() != null) {
                jsonGenerator.writeFieldName("OutputS3BucketName").writeValue(s3OutputLocation.getOutputS3BucketName());
            }
            if (s3OutputLocation.getOutputS3KeyPrefix() != null) {
                jsonGenerator.writeFieldName("OutputS3KeyPrefix").writeValue(s3OutputLocation.getOutputS3KeyPrefix());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static S3OutputLocationJsonMarshaller instance;

    public static S3OutputLocationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3OutputLocationJsonMarshaller();
        return instance;
    }

}
