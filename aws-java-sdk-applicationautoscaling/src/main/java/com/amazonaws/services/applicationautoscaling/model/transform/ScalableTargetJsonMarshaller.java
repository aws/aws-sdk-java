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
package com.amazonaws.services.applicationautoscaling.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.applicationautoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ScalableTargetMarshaller
 */
public class ScalableTargetJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ScalableTarget scalableTarget, StructuredJsonGenerator jsonGenerator) {

        if (scalableTarget == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (scalableTarget.getServiceNamespace() != null) {
                jsonGenerator.writeFieldName("ServiceNamespace").writeValue(scalableTarget.getServiceNamespace());
            }
            if (scalableTarget.getResourceId() != null) {
                jsonGenerator.writeFieldName("ResourceId").writeValue(scalableTarget.getResourceId());
            }
            if (scalableTarget.getScalableDimension() != null) {
                jsonGenerator.writeFieldName("ScalableDimension").writeValue(scalableTarget.getScalableDimension());
            }
            if (scalableTarget.getMinCapacity() != null) {
                jsonGenerator.writeFieldName("MinCapacity").writeValue(scalableTarget.getMinCapacity());
            }
            if (scalableTarget.getMaxCapacity() != null) {
                jsonGenerator.writeFieldName("MaxCapacity").writeValue(scalableTarget.getMaxCapacity());
            }
            if (scalableTarget.getRoleARN() != null) {
                jsonGenerator.writeFieldName("RoleARN").writeValue(scalableTarget.getRoleARN());
            }
            if (scalableTarget.getCreationTime() != null) {
                jsonGenerator.writeFieldName("CreationTime").writeValue(scalableTarget.getCreationTime());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ScalableTargetJsonMarshaller instance;

    public static ScalableTargetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ScalableTargetJsonMarshaller();
        return instance;
    }

}
