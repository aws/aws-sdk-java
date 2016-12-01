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
 * ImportJobResourceMarshaller
 */
public class ImportJobResourceJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ImportJobResource importJobResource, StructuredJsonGenerator jsonGenerator) {

        if (importJobResource == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (importJobResource.getDefineSegment() != null) {
                jsonGenerator.writeFieldName("DefineSegment").writeValue(importJobResource.getDefineSegment());
            }
            if (importJobResource.getExternalId() != null) {
                jsonGenerator.writeFieldName("ExternalId").writeValue(importJobResource.getExternalId());
            }
            if (importJobResource.getFormat() != null) {
                jsonGenerator.writeFieldName("Format").writeValue(importJobResource.getFormat());
            }
            if (importJobResource.getRegisterEndpoints() != null) {
                jsonGenerator.writeFieldName("RegisterEndpoints").writeValue(importJobResource.getRegisterEndpoints());
            }
            if (importJobResource.getRoleArn() != null) {
                jsonGenerator.writeFieldName("RoleArn").writeValue(importJobResource.getRoleArn());
            }
            if (importJobResource.getS3Url() != null) {
                jsonGenerator.writeFieldName("S3Url").writeValue(importJobResource.getS3Url());
            }
            if (importJobResource.getSegmentId() != null) {
                jsonGenerator.writeFieldName("SegmentId").writeValue(importJobResource.getSegmentId());
            }
            if (importJobResource.getSegmentName() != null) {
                jsonGenerator.writeFieldName("SegmentName").writeValue(importJobResource.getSegmentName());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ImportJobResourceJsonMarshaller instance;

    public static ImportJobResourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImportJobResourceJsonMarshaller();
        return instance;
    }

}
