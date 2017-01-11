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
 * ComputeResourceUpdateMarshaller
 */
public class ComputeResourceUpdateJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ComputeResourceUpdate computeResourceUpdate, StructuredJsonGenerator jsonGenerator) {

        if (computeResourceUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (computeResourceUpdate.getMinvCpus() != null) {
                jsonGenerator.writeFieldName("minvCpus").writeValue(computeResourceUpdate.getMinvCpus());
            }
            if (computeResourceUpdate.getMaxvCpus() != null) {
                jsonGenerator.writeFieldName("maxvCpus").writeValue(computeResourceUpdate.getMaxvCpus());
            }
            if (computeResourceUpdate.getDesiredvCpus() != null) {
                jsonGenerator.writeFieldName("desiredvCpus").writeValue(computeResourceUpdate.getDesiredvCpus());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ComputeResourceUpdateJsonMarshaller instance;

    public static ComputeResourceUpdateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ComputeResourceUpdateJsonMarshaller();
        return instance;
    }

}
