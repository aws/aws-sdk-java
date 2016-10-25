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
package com.amazonaws.services.lambda.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lambda.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * FunctionCodeMarshaller
 */
public class FunctionCodeJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(FunctionCode functionCode, StructuredJsonGenerator jsonGenerator) {

        if (functionCode == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (functionCode.getZipFile() != null) {
                jsonGenerator.writeFieldName("ZipFile").writeValue(functionCode.getZipFile());
            }
            if (functionCode.getS3Bucket() != null) {
                jsonGenerator.writeFieldName("S3Bucket").writeValue(functionCode.getS3Bucket());
            }
            if (functionCode.getS3Key() != null) {
                jsonGenerator.writeFieldName("S3Key").writeValue(functionCode.getS3Key());
            }
            if (functionCode.getS3ObjectVersion() != null) {
                jsonGenerator.writeFieldName("S3ObjectVersion").writeValue(functionCode.getS3ObjectVersion());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static FunctionCodeJsonMarshaller instance;

    public static FunctionCodeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FunctionCodeJsonMarshaller();
        return instance;
    }

}
