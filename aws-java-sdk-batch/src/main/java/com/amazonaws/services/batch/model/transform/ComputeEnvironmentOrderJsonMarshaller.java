/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.SdkClientException;
import com.amazonaws.services.batch.model.*;
import com.amazonaws.protocol.json.*;

/**
 * ComputeEnvironmentOrderMarshaller
 */
public class ComputeEnvironmentOrderJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ComputeEnvironmentOrder computeEnvironmentOrder, StructuredJsonGenerator jsonGenerator) {

        if (computeEnvironmentOrder == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (computeEnvironmentOrder.getOrder() != null) {
                jsonGenerator.writeFieldName("order").writeValue(computeEnvironmentOrder.getOrder());
            }
            if (computeEnvironmentOrder.getComputeEnvironment() != null) {
                jsonGenerator.writeFieldName("computeEnvironment").writeValue(computeEnvironmentOrder.getComputeEnvironment());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ComputeEnvironmentOrderJsonMarshaller instance;

    public static ComputeEnvironmentOrderJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ComputeEnvironmentOrderJsonMarshaller();
        return instance;
    }

}
