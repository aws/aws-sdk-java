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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InstanceAssociationStatusInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceAssociationStatusInfoJsonUnmarshaller implements Unmarshaller<InstanceAssociationStatusInfo, JsonUnmarshallerContext> {

    public InstanceAssociationStatusInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        InstanceAssociationStatusInfo instanceAssociationStatusInfo = new InstanceAssociationStatusInfo();

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
                if (context.testExpression("AssociationId", targetDepth)) {
                    context.nextToken();
                    instanceAssociationStatusInfo.setAssociationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    instanceAssociationStatusInfo.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DocumentVersion", targetDepth)) {
                    context.nextToken();
                    instanceAssociationStatusInfo.setDocumentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AssociationVersion", targetDepth)) {
                    context.nextToken();
                    instanceAssociationStatusInfo.setAssociationVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceId", targetDepth)) {
                    context.nextToken();
                    instanceAssociationStatusInfo.setInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExecutionDate", targetDepth)) {
                    context.nextToken();
                    instanceAssociationStatusInfo.setExecutionDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    instanceAssociationStatusInfo.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DetailedStatus", targetDepth)) {
                    context.nextToken();
                    instanceAssociationStatusInfo.setDetailedStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExecutionSummary", targetDepth)) {
                    context.nextToken();
                    instanceAssociationStatusInfo.setExecutionSummary(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ErrorCode", targetDepth)) {
                    context.nextToken();
                    instanceAssociationStatusInfo.setErrorCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutputUrl", targetDepth)) {
                    context.nextToken();
                    instanceAssociationStatusInfo.setOutputUrl(InstanceAssociationOutputUrlJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AssociationName", targetDepth)) {
                    context.nextToken();
                    instanceAssociationStatusInfo.setAssociationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return instanceAssociationStatusInfo;
    }

    private static InstanceAssociationStatusInfoJsonUnmarshaller instance;

    public static InstanceAssociationStatusInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceAssociationStatusInfoJsonUnmarshaller();
        return instance;
    }
}
