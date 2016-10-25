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
package com.amazonaws.services.route53domains.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.route53domains.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * OperationSummaryMarshaller
 */
public class OperationSummaryJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(OperationSummary operationSummary, StructuredJsonGenerator jsonGenerator) {

        if (operationSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (operationSummary.getOperationId() != null) {
                jsonGenerator.writeFieldName("OperationId").writeValue(operationSummary.getOperationId());
            }
            if (operationSummary.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(operationSummary.getStatus());
            }
            if (operationSummary.getType() != null) {
                jsonGenerator.writeFieldName("Type").writeValue(operationSummary.getType());
            }
            if (operationSummary.getSubmittedDate() != null) {
                jsonGenerator.writeFieldName("SubmittedDate").writeValue(operationSummary.getSubmittedDate());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static OperationSummaryJsonMarshaller instance;

    public static OperationSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OperationSummaryJsonMarshaller();
        return instance;
    }

}
