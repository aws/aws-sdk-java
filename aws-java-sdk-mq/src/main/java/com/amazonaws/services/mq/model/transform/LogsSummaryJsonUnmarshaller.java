/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mq.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mq.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * LogsSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogsSummaryJsonUnmarshaller implements Unmarshaller<LogsSummary, JsonUnmarshallerContext> {

    public LogsSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        LogsSummary logsSummary = new LogsSummary();

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
                if (context.testExpression("audit", targetDepth)) {
                    context.nextToken();
                    logsSummary.setAudit(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("auditLogGroup", targetDepth)) {
                    context.nextToken();
                    logsSummary.setAuditLogGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("general", targetDepth)) {
                    context.nextToken();
                    logsSummary.setGeneral(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("generalLogGroup", targetDepth)) {
                    context.nextToken();
                    logsSummary.setGeneralLogGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pending", targetDepth)) {
                    context.nextToken();
                    logsSummary.setPending(PendingLogsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return logsSummary;
    }

    private static LogsSummaryJsonUnmarshaller instance;

    public static LogsSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LogsSummaryJsonUnmarshaller();
        return instance;
    }
}
