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
package com.amazonaws.services.appstream.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appstream.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ComputeCapacityStatusMarshaller
 */
public class ComputeCapacityStatusJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ComputeCapacityStatus computeCapacityStatus, StructuredJsonGenerator jsonGenerator) {

        if (computeCapacityStatus == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (computeCapacityStatus.getDesired() != null) {
                jsonGenerator.writeFieldName("Desired").writeValue(computeCapacityStatus.getDesired());
            }
            if (computeCapacityStatus.getRunning() != null) {
                jsonGenerator.writeFieldName("Running").writeValue(computeCapacityStatus.getRunning());
            }
            if (computeCapacityStatus.getInUse() != null) {
                jsonGenerator.writeFieldName("InUse").writeValue(computeCapacityStatus.getInUse());
            }
            if (computeCapacityStatus.getAvailable() != null) {
                jsonGenerator.writeFieldName("Available").writeValue(computeCapacityStatus.getAvailable());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ComputeCapacityStatusJsonMarshaller instance;

    public static ComputeCapacityStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ComputeCapacityStatusJsonMarshaller();
        return instance;
    }

}
