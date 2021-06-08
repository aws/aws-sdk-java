/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * AssessmentMetadata JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssessmentMetadataJsonUnmarshaller implements Unmarshaller<AssessmentMetadata, JsonUnmarshallerContext> {

    public AssessmentMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        AssessmentMetadata assessmentMetadata = new AssessmentMetadata();

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
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    assessmentMetadata.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    assessmentMetadata.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    assessmentMetadata.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("complianceType", targetDepth)) {
                    context.nextToken();
                    assessmentMetadata.setComplianceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    assessmentMetadata.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assessmentReportsDestination", targetDepth)) {
                    context.nextToken();
                    assessmentMetadata.setAssessmentReportsDestination(AssessmentReportsDestinationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("scope", targetDepth)) {
                    context.nextToken();
                    assessmentMetadata.setScope(ScopeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("roles", targetDepth)) {
                    context.nextToken();
                    assessmentMetadata.setRoles(new ListUnmarshaller<Role>(RoleJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("delegations", targetDepth)) {
                    context.nextToken();
                    assessmentMetadata.setDelegations(new ListUnmarshaller<Delegation>(DelegationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    assessmentMetadata.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdated", targetDepth)) {
                    context.nextToken();
                    assessmentMetadata.setLastUpdated(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return assessmentMetadata;
    }

    private static AssessmentMetadataJsonUnmarshaller instance;

    public static AssessmentMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssessmentMetadataJsonUnmarshaller();
        return instance;
    }
}
