/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AuditMitigationActionExecutionMetadata JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuditMitigationActionExecutionMetadataJsonUnmarshaller implements Unmarshaller<AuditMitigationActionExecutionMetadata, JsonUnmarshallerContext> {

    public AuditMitigationActionExecutionMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        AuditMitigationActionExecutionMetadata auditMitigationActionExecutionMetadata = new AuditMitigationActionExecutionMetadata();

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
                    auditMitigationActionExecutionMetadata.setTaskId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("findingId", targetDepth)) {
                    context.nextToken();
                    auditMitigationActionExecutionMetadata.setFindingId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("actionName", targetDepth)) {
                    context.nextToken();
                    auditMitigationActionExecutionMetadata.setActionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("actionId", targetDepth)) {
                    context.nextToken();
                    auditMitigationActionExecutionMetadata.setActionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    auditMitigationActionExecutionMetadata.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    auditMitigationActionExecutionMetadata.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("endTime", targetDepth)) {
                    context.nextToken();
                    auditMitigationActionExecutionMetadata.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("errorCode", targetDepth)) {
                    context.nextToken();
                    auditMitigationActionExecutionMetadata.setErrorCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("message", targetDepth)) {
                    context.nextToken();
                    auditMitigationActionExecutionMetadata.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return auditMitigationActionExecutionMetadata;
    }

    private static AuditMitigationActionExecutionMetadataJsonUnmarshaller instance;

    public static AuditMitigationActionExecutionMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AuditMitigationActionExecutionMetadataJsonUnmarshaller();
        return instance;
    }
}
