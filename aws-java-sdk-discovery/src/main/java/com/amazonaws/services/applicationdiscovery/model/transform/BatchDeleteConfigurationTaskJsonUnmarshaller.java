/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.applicationdiscovery.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.applicationdiscovery.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BatchDeleteConfigurationTask JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteConfigurationTaskJsonUnmarshaller implements Unmarshaller<BatchDeleteConfigurationTask, JsonUnmarshallerContext> {

    public BatchDeleteConfigurationTask unmarshall(JsonUnmarshallerContext context) throws Exception {
        BatchDeleteConfigurationTask batchDeleteConfigurationTask = new BatchDeleteConfigurationTask();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("taskId", targetDepth)) {
                    context.nextToken();
                    batchDeleteConfigurationTask.setTaskId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    batchDeleteConfigurationTask.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    batchDeleteConfigurationTask.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("endTime", targetDepth)) {
                    context.nextToken();
                    batchDeleteConfigurationTask.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("configurationType", targetDepth)) {
                    context.nextToken();
                    batchDeleteConfigurationTask.setConfigurationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("requestedConfigurations", targetDepth)) {
                    context.nextToken();
                    batchDeleteConfigurationTask.setRequestedConfigurations(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("deletedConfigurations", targetDepth)) {
                    context.nextToken();
                    batchDeleteConfigurationTask.setDeletedConfigurations(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("failedConfigurations", targetDepth)) {
                    context.nextToken();
                    batchDeleteConfigurationTask.setFailedConfigurations(new ListUnmarshaller<FailedConfiguration>(FailedConfigurationJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("deletionWarnings", targetDepth)) {
                    context.nextToken();
                    batchDeleteConfigurationTask.setDeletionWarnings(new ListUnmarshaller<DeletionWarning>(DeletionWarningJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return batchDeleteConfigurationTask;
    }

    private static BatchDeleteConfigurationTaskJsonUnmarshaller instance;

    public static BatchDeleteConfigurationTaskJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchDeleteConfigurationTaskJsonUnmarshaller();
        return instance;
    }
}
