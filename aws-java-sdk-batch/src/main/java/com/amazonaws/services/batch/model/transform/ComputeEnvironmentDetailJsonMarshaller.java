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
package com.amazonaws.services.batch.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.batch.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ComputeEnvironmentDetailMarshaller
 */
public class ComputeEnvironmentDetailJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ComputeEnvironmentDetail computeEnvironmentDetail, StructuredJsonGenerator jsonGenerator) {

        if (computeEnvironmentDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (computeEnvironmentDetail.getComputeEnvironmentName() != null) {
                jsonGenerator.writeFieldName("computeEnvironmentName").writeValue(computeEnvironmentDetail.getComputeEnvironmentName());
            }
            if (computeEnvironmentDetail.getComputeEnvironmentArn() != null) {
                jsonGenerator.writeFieldName("computeEnvironmentArn").writeValue(computeEnvironmentDetail.getComputeEnvironmentArn());
            }
            if (computeEnvironmentDetail.getEcsClusterArn() != null) {
                jsonGenerator.writeFieldName("ecsClusterArn").writeValue(computeEnvironmentDetail.getEcsClusterArn());
            }
            if (computeEnvironmentDetail.getType() != null) {
                jsonGenerator.writeFieldName("type").writeValue(computeEnvironmentDetail.getType());
            }
            if (computeEnvironmentDetail.getState() != null) {
                jsonGenerator.writeFieldName("state").writeValue(computeEnvironmentDetail.getState());
            }
            if (computeEnvironmentDetail.getStatus() != null) {
                jsonGenerator.writeFieldName("status").writeValue(computeEnvironmentDetail.getStatus());
            }
            if (computeEnvironmentDetail.getStatusReason() != null) {
                jsonGenerator.writeFieldName("statusReason").writeValue(computeEnvironmentDetail.getStatusReason());
            }
            if (computeEnvironmentDetail.getComputeResources() != null) {
                jsonGenerator.writeFieldName("computeResources");
                ComputeResourceJsonMarshaller.getInstance().marshall(computeEnvironmentDetail.getComputeResources(), jsonGenerator);
            }
            if (computeEnvironmentDetail.getServiceRole() != null) {
                jsonGenerator.writeFieldName("serviceRole").writeValue(computeEnvironmentDetail.getServiceRole());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ComputeEnvironmentDetailJsonMarshaller instance;

    public static ComputeEnvironmentDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ComputeEnvironmentDetailJsonMarshaller();
        return instance;
    }

}
