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
 * Evidence JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvidenceJsonUnmarshaller implements Unmarshaller<Evidence, JsonUnmarshallerContext> {

    public Evidence unmarshall(JsonUnmarshallerContext context) throws Exception {
        Evidence evidence = new Evidence();

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
                if (context.testExpression("dataSource", targetDepth)) {
                    context.nextToken();
                    evidence.setDataSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("evidenceAwsAccountId", targetDepth)) {
                    context.nextToken();
                    evidence.setEvidenceAwsAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("time", targetDepth)) {
                    context.nextToken();
                    evidence.setTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("eventSource", targetDepth)) {
                    context.nextToken();
                    evidence.setEventSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eventName", targetDepth)) {
                    context.nextToken();
                    evidence.setEventName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("evidenceByType", targetDepth)) {
                    context.nextToken();
                    evidence.setEvidenceByType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourcesIncluded", targetDepth)) {
                    context.nextToken();
                    evidence.setResourcesIncluded(new ListUnmarshaller<Resource>(ResourceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("attributes", targetDepth)) {
                    context.nextToken();
                    evidence.setAttributes(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("iamId", targetDepth)) {
                    context.nextToken();
                    evidence.setIamId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("complianceCheck", targetDepth)) {
                    context.nextToken();
                    evidence.setComplianceCheck(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("awsOrganization", targetDepth)) {
                    context.nextToken();
                    evidence.setAwsOrganization(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("awsAccountId", targetDepth)) {
                    context.nextToken();
                    evidence.setAwsAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("evidenceFolderId", targetDepth)) {
                    context.nextToken();
                    evidence.setEvidenceFolderId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    evidence.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assessmentReportSelection", targetDepth)) {
                    context.nextToken();
                    evidence.setAssessmentReportSelection(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return evidence;
    }

    private static EvidenceJsonUnmarshaller instance;

    public static EvidenceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EvidenceJsonUnmarshaller();
        return instance;
    }
}
