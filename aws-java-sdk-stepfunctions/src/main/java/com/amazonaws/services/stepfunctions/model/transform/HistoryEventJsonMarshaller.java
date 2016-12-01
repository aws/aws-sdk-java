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
 * HistoryEventMarshaller
 */
public class HistoryEventJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(HistoryEvent historyEvent, StructuredJsonGenerator jsonGenerator) {

        if (historyEvent == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (historyEvent.getTimestamp() != null) {
                jsonGenerator.writeFieldName("timestamp").writeValue(historyEvent.getTimestamp());
            }
            if (historyEvent.getType() != null) {
                jsonGenerator.writeFieldName("type").writeValue(historyEvent.getType());
            }
            if (historyEvent.getId() != null) {
                jsonGenerator.writeFieldName("id").writeValue(historyEvent.getId());
            }
            if (historyEvent.getPreviousEventId() != null) {
                jsonGenerator.writeFieldName("previousEventId").writeValue(historyEvent.getPreviousEventId());
            }
            if (historyEvent.getActivityFailedEventDetails() != null) {
                jsonGenerator.writeFieldName("activityFailedEventDetails");
                ActivityFailedEventDetailsJsonMarshaller.getInstance().marshall(historyEvent.getActivityFailedEventDetails(), jsonGenerator);
            }
            if (historyEvent.getActivityScheduleFailedEventDetails() != null) {
                jsonGenerator.writeFieldName("activityScheduleFailedEventDetails");
                ActivityScheduleFailedEventDetailsJsonMarshaller.getInstance().marshall(historyEvent.getActivityScheduleFailedEventDetails(), jsonGenerator);
            }
            if (historyEvent.getActivityScheduledEventDetails() != null) {
                jsonGenerator.writeFieldName("activityScheduledEventDetails");
                ActivityScheduledEventDetailsJsonMarshaller.getInstance().marshall(historyEvent.getActivityScheduledEventDetails(), jsonGenerator);
            }
            if (historyEvent.getActivityStartedEventDetails() != null) {
                jsonGenerator.writeFieldName("activityStartedEventDetails");
                ActivityStartedEventDetailsJsonMarshaller.getInstance().marshall(historyEvent.getActivityStartedEventDetails(), jsonGenerator);
            }
            if (historyEvent.getActivitySucceededEventDetails() != null) {
                jsonGenerator.writeFieldName("activitySucceededEventDetails");
                ActivitySucceededEventDetailsJsonMarshaller.getInstance().marshall(historyEvent.getActivitySucceededEventDetails(), jsonGenerator);
            }
            if (historyEvent.getActivityTimedOutEventDetails() != null) {
                jsonGenerator.writeFieldName("activityTimedOutEventDetails");
                ActivityTimedOutEventDetailsJsonMarshaller.getInstance().marshall(historyEvent.getActivityTimedOutEventDetails(), jsonGenerator);
            }
            if (historyEvent.getExecutionFailedEventDetails() != null) {
                jsonGenerator.writeFieldName("executionFailedEventDetails");
                ExecutionFailedEventDetailsJsonMarshaller.getInstance().marshall(historyEvent.getExecutionFailedEventDetails(), jsonGenerator);
            }
            if (historyEvent.getExecutionStartedEventDetails() != null) {
                jsonGenerator.writeFieldName("executionStartedEventDetails");
                ExecutionStartedEventDetailsJsonMarshaller.getInstance().marshall(historyEvent.getExecutionStartedEventDetails(), jsonGenerator);
            }
            if (historyEvent.getExecutionSucceededEventDetails() != null) {
                jsonGenerator.writeFieldName("executionSucceededEventDetails");
                ExecutionSucceededEventDetailsJsonMarshaller.getInstance().marshall(historyEvent.getExecutionSucceededEventDetails(), jsonGenerator);
            }
            if (historyEvent.getExecutionAbortedEventDetails() != null) {
                jsonGenerator.writeFieldName("executionAbortedEventDetails");
                ExecutionAbortedEventDetailsJsonMarshaller.getInstance().marshall(historyEvent.getExecutionAbortedEventDetails(), jsonGenerator);
            }
            if (historyEvent.getExecutionTimedOutEventDetails() != null) {
                jsonGenerator.writeFieldName("executionTimedOutEventDetails");
                ExecutionTimedOutEventDetailsJsonMarshaller.getInstance().marshall(historyEvent.getExecutionTimedOutEventDetails(), jsonGenerator);
            }
            if (historyEvent.getLambdaFunctionFailedEventDetails() != null) {
                jsonGenerator.writeFieldName("lambdaFunctionFailedEventDetails");
                LambdaFunctionFailedEventDetailsJsonMarshaller.getInstance().marshall(historyEvent.getLambdaFunctionFailedEventDetails(), jsonGenerator);
            }
            if (historyEvent.getLambdaFunctionScheduleFailedEventDetails() != null) {
                jsonGenerator.writeFieldName("lambdaFunctionScheduleFailedEventDetails");
                LambdaFunctionScheduleFailedEventDetailsJsonMarshaller.getInstance().marshall(historyEvent.getLambdaFunctionScheduleFailedEventDetails(),
                        jsonGenerator);
            }
            if (historyEvent.getLambdaFunctionScheduledEventDetails() != null) {
                jsonGenerator.writeFieldName("lambdaFunctionScheduledEventDetails");
                LambdaFunctionScheduledEventDetailsJsonMarshaller.getInstance().marshall(historyEvent.getLambdaFunctionScheduledEventDetails(), jsonGenerator);
            }
            if (historyEvent.getLambdaFunctionStartFailedEventDetails() != null) {
                jsonGenerator.writeFieldName("lambdaFunctionStartFailedEventDetails");
                LambdaFunctionStartFailedEventDetailsJsonMarshaller.getInstance().marshall(historyEvent.getLambdaFunctionStartFailedEventDetails(),
                        jsonGenerator);
            }
            if (historyEvent.getLambdaFunctionSucceededEventDetails() != null) {
                jsonGenerator.writeFieldName("lambdaFunctionSucceededEventDetails");
                LambdaFunctionSucceededEventDetailsJsonMarshaller.getInstance().marshall(historyEvent.getLambdaFunctionSucceededEventDetails(), jsonGenerator);
            }
            if (historyEvent.getLambdaFunctionTimedOutEventDetails() != null) {
                jsonGenerator.writeFieldName("lambdaFunctionTimedOutEventDetails");
                LambdaFunctionTimedOutEventDetailsJsonMarshaller.getInstance().marshall(historyEvent.getLambdaFunctionTimedOutEventDetails(), jsonGenerator);
            }
            if (historyEvent.getStateEnteredEventDetails() != null) {
                jsonGenerator.writeFieldName("stateEnteredEventDetails");
                StateEnteredEventDetailsJsonMarshaller.getInstance().marshall(historyEvent.getStateEnteredEventDetails(), jsonGenerator);
            }
            if (historyEvent.getStateExitedEventDetails() != null) {
                jsonGenerator.writeFieldName("stateExitedEventDetails");
                StateExitedEventDetailsJsonMarshaller.getInstance().marshall(historyEvent.getStateExitedEventDetails(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static HistoryEventJsonMarshaller instance;

    public static HistoryEventJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HistoryEventJsonMarshaller();
        return instance;
    }

}
