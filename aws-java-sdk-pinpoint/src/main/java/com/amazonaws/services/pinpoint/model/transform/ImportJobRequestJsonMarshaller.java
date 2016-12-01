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
package com.amazonaws.services.pinpoint.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ImportJobRequestMarshaller
 */
public class ImportJobRequestJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ImportJobRequest importJobRequest, StructuredJsonGenerator jsonGenerator) {

        if (importJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (importJobRequest.getDefineSegment() != null) {
                jsonGenerator.writeFieldName("DefineSegment").writeValue(importJobRequest.getDefineSegment());
            }
            if (importJobRequest.getExternalId() != null) {
                jsonGenerator.writeFieldName("ExternalId").writeValue(importJobRequest.getExternalId());
            }
            if (importJobRequest.getFormat() != null) {
                jsonGenerator.writeFieldName("Format").writeValue(importJobRequest.getFormat());
            }
            if (importJobRequest.getRegisterEndpoints() != null) {
                jsonGenerator.writeFieldName("RegisterEndpoints").writeValue(importJobRequest.getRegisterEndpoints());
            }
            if (importJobRequest.getRoleArn() != null) {
                jsonGenerator.writeFieldName("RoleArn").writeValue(importJobRequest.getRoleArn());
            }
            if (importJobRequest.getS3Url() != null) {
                jsonGenerator.writeFieldName("S3Url").writeValue(importJobRequest.getS3Url());
            }
            if (importJobRequest.getSegmentId() != null) {
                jsonGenerator.writeFieldName("SegmentId").writeValue(importJobRequest.getSegmentId());
            }
            if (importJobRequest.getSegmentName() != null) {
                jsonGenerator.writeFieldName("SegmentName").writeValue(importJobRequest.getSegmentName());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ImportJobRequestJsonMarshaller instance;

    public static ImportJobRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImportJobRequestJsonMarshaller();
        return instance;
    }

}
