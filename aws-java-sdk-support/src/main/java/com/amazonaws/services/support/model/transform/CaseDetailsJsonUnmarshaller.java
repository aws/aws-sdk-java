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
package com.amazonaws.services.support.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.support.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CaseDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CaseDetailsJsonUnmarshaller implements Unmarshaller<CaseDetails, JsonUnmarshallerContext> {

    public CaseDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        CaseDetails caseDetails = new CaseDetails();

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
                if (context.testExpression("caseId", targetDepth)) {
                    context.nextToken();
                    caseDetails.setCaseId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("displayId", targetDepth)) {
                    context.nextToken();
                    caseDetails.setDisplayId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("subject", targetDepth)) {
                    context.nextToken();
                    caseDetails.setSubject(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    caseDetails.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serviceCode", targetDepth)) {
                    context.nextToken();
                    caseDetails.setServiceCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("categoryCode", targetDepth)) {
                    context.nextToken();
                    caseDetails.setCategoryCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("severityCode", targetDepth)) {
                    context.nextToken();
                    caseDetails.setSeverityCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("submittedBy", targetDepth)) {
                    context.nextToken();
                    caseDetails.setSubmittedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("timeCreated", targetDepth)) {
                    context.nextToken();
                    caseDetails.setTimeCreated(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("recentCommunications", targetDepth)) {
                    context.nextToken();
                    caseDetails.setRecentCommunications(RecentCaseCommunicationsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ccEmailAddresses", targetDepth)) {
                    context.nextToken();
                    caseDetails.setCcEmailAddresses(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("language", targetDepth)) {
                    context.nextToken();
                    caseDetails.setLanguage(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return caseDetails;
    }

    private static CaseDetailsJsonUnmarshaller instance;

    public static CaseDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CaseDetailsJsonUnmarshaller();
        return instance;
    }
}
