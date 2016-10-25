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
package com.amazonaws.services.kinesisanalytics.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisanalytics.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * S3ReferenceDataSourceUpdateMarshaller
 */
public class S3ReferenceDataSourceUpdateJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(S3ReferenceDataSourceUpdate s3ReferenceDataSourceUpdate, StructuredJsonGenerator jsonGenerator) {

        if (s3ReferenceDataSourceUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (s3ReferenceDataSourceUpdate.getBucketARNUpdate() != null) {
                jsonGenerator.writeFieldName("BucketARNUpdate").writeValue(s3ReferenceDataSourceUpdate.getBucketARNUpdate());
            }
            if (s3ReferenceDataSourceUpdate.getFileKeyUpdate() != null) {
                jsonGenerator.writeFieldName("FileKeyUpdate").writeValue(s3ReferenceDataSourceUpdate.getFileKeyUpdate());
            }
            if (s3ReferenceDataSourceUpdate.getReferenceRoleARNUpdate() != null) {
                jsonGenerator.writeFieldName("ReferenceRoleARNUpdate").writeValue(s3ReferenceDataSourceUpdate.getReferenceRoleARNUpdate());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static S3ReferenceDataSourceUpdateJsonMarshaller instance;

    public static S3ReferenceDataSourceUpdateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3ReferenceDataSourceUpdateJsonMarshaller();
        return instance;
    }

}
