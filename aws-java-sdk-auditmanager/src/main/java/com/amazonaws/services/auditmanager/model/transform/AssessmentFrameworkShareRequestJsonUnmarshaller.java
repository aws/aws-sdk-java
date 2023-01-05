/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.auditmanager.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.auditmanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AssessmentFrameworkShareRequest JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssessmentFrameworkShareRequestJsonUnmarshaller implements Unmarshaller<AssessmentFrameworkShareRequest, JsonUnmarshallerContext> {

    public AssessmentFrameworkShareRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        AssessmentFrameworkShareRequest assessmentFrameworkShareRequest = new AssessmentFrameworkShareRequest();

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
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    assessmentFrameworkShareRequest.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("frameworkId", targetDepth)) {
                    context.nextToken();
                    assessmentFrameworkShareRequest.setFrameworkId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("frameworkName", targetDepth)) {
                    context.nextToken();
                    assessmentFrameworkShareRequest.setFrameworkName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("frameworkDescription", targetDepth)) {
                    context.nextToken();
                    assessmentFrameworkShareRequest.setFrameworkDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    assessmentFrameworkShareRequest.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceAccount", targetDepth)) {
                    context.nextToken();
                    assessmentFrameworkShareRequest.setSourceAccount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("destinationAccount", targetDepth)) {
                    context.nextToken();
                    assessmentFrameworkShareRequest.setDestinationAccount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("destinationRegion", targetDepth)) {
                    context.nextToken();
                    assessmentFrameworkShareRequest.setDestinationRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("expirationTime", targetDepth)) {
                    context.nextToken();
                    assessmentFrameworkShareRequest.setExpirationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    assessmentFrameworkShareRequest.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdated", targetDepth)) {
                    context.nextToken();
                    assessmentFrameworkShareRequest.setLastUpdated(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("comment", targetDepth)) {
                    context.nextToken();
                    assessmentFrameworkShareRequest.setComment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("standardControlsCount", targetDepth)) {
                    context.nextToken();
                    assessmentFrameworkShareRequest.setStandardControlsCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("customControlsCount", targetDepth)) {
                    context.nextToken();
                    assessmentFrameworkShareRequest.setCustomControlsCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("complianceType", targetDepth)) {
                    context.nextToken();
                    assessmentFrameworkShareRequest.setComplianceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return assessmentFrameworkShareRequest;
    }

    private static AssessmentFrameworkShareRequestJsonUnmarshaller instance;

    public static AssessmentFrameworkShareRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssessmentFrameworkShareRequestJsonUnmarshaller();
        return instance;
    }
}
