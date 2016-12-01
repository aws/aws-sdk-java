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
package com.amazonaws.services.stepfunctions.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.stepfunctions.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ExecutionListItemMarshaller
 */
public class ExecutionListItemJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ExecutionListItem executionListItem, StructuredJsonGenerator jsonGenerator) {

        if (executionListItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (executionListItem.getExecutionArn() != null) {
                jsonGenerator.writeFieldName("executionArn").writeValue(executionListItem.getExecutionArn());
            }
            if (executionListItem.getStateMachineArn() != null) {
                jsonGenerator.writeFieldName("stateMachineArn").writeValue(executionListItem.getStateMachineArn());
            }
            if (executionListItem.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(executionListItem.getName());
            }
            if (executionListItem.getStatus() != null) {
                jsonGenerator.writeFieldName("status").writeValue(executionListItem.getStatus());
            }
            if (executionListItem.getStartDate() != null) {
                jsonGenerator.writeFieldName("startDate").writeValue(executionListItem.getStartDate());
            }
            if (executionListItem.getStopDate() != null) {
                jsonGenerator.writeFieldName("stopDate").writeValue(executionListItem.getStopDate());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ExecutionListItemJsonMarshaller instance;

    public static ExecutionListItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExecutionListItemJsonMarshaller();
        return instance;
    }

}
