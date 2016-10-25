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
package com.amazonaws.services.codepipeline.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codepipeline.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ActionExecutionMarshaller
 */
public class ActionExecutionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ActionExecution actionExecution, StructuredJsonGenerator jsonGenerator) {

        if (actionExecution == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (actionExecution.getStatus() != null) {
                jsonGenerator.writeFieldName("status").writeValue(actionExecution.getStatus());
            }
            if (actionExecution.getSummary() != null) {
                jsonGenerator.writeFieldName("summary").writeValue(actionExecution.getSummary());
            }
            if (actionExecution.getLastStatusChange() != null) {
                jsonGenerator.writeFieldName("lastStatusChange").writeValue(actionExecution.getLastStatusChange());
            }
            if (actionExecution.getToken() != null) {
                jsonGenerator.writeFieldName("token").writeValue(actionExecution.getToken());
            }
            if (actionExecution.getLastUpdatedBy() != null) {
                jsonGenerator.writeFieldName("lastUpdatedBy").writeValue(actionExecution.getLastUpdatedBy());
            }
            if (actionExecution.getExternalExecutionId() != null) {
                jsonGenerator.writeFieldName("externalExecutionId").writeValue(actionExecution.getExternalExecutionId());
            }
            if (actionExecution.getExternalExecutionUrl() != null) {
                jsonGenerator.writeFieldName("externalExecutionUrl").writeValue(actionExecution.getExternalExecutionUrl());
            }
            if (actionExecution.getPercentComplete() != null) {
                jsonGenerator.writeFieldName("percentComplete").writeValue(actionExecution.getPercentComplete());
            }
            if (actionExecution.getErrorDetails() != null) {
                jsonGenerator.writeFieldName("errorDetails");
                ErrorDetailsJsonMarshaller.getInstance().marshall(actionExecution.getErrorDetails(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ActionExecutionJsonMarshaller instance;

    public static ActionExecutionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ActionExecutionJsonMarshaller();
        return instance;
    }

}
