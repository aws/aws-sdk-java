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
package com.amazonaws.services.gamelift.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.gamelift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * S3LocationMarshaller
 */
public class S3LocationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(S3Location s3Location, StructuredJsonGenerator jsonGenerator) {

        if (s3Location == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (s3Location.getBucket() != null) {
                jsonGenerator.writeFieldName("Bucket").writeValue(s3Location.getBucket());
            }
            if (s3Location.getKey() != null) {
                jsonGenerator.writeFieldName("Key").writeValue(s3Location.getKey());
            }
            if (s3Location.getRoleArn() != null) {
                jsonGenerator.writeFieldName("RoleArn").writeValue(s3Location.getRoleArn());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static S3LocationJsonMarshaller instance;

    public static S3LocationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3LocationJsonMarshaller();
        return instance;
    }

}
