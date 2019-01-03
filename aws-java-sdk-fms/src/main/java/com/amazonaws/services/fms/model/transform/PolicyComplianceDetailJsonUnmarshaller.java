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
package com.amazonaws.services.fms.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.fms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PolicyComplianceDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicyComplianceDetailJsonUnmarshaller implements Unmarshaller<PolicyComplianceDetail, JsonUnmarshallerContext> {

    public PolicyComplianceDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        PolicyComplianceDetail policyComplianceDetail = new PolicyComplianceDetail();

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
                if (context.testExpression("PolicyOwner", targetDepth)) {
                    context.nextToken();
                    policyComplianceDetail.setPolicyOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PolicyId", targetDepth)) {
                    context.nextToken();
                    policyComplianceDetail.setPolicyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MemberAccount", targetDepth)) {
                    context.nextToken();
                    policyComplianceDetail.setMemberAccount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Violators", targetDepth)) {
                    context.nextToken();
                    policyComplianceDetail.setViolators(new ListUnmarshaller<ComplianceViolator>(ComplianceViolatorJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("EvaluationLimitExceeded", targetDepth)) {
                    context.nextToken();
                    policyComplianceDetail.setEvaluationLimitExceeded(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ExpiredAt", targetDepth)) {
                    context.nextToken();
                    policyComplianceDetail.setExpiredAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("IssueInfoMap", targetDepth)) {
                    context.nextToken();
                    policyComplianceDetail.setIssueInfoMap(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return policyComplianceDetail;
    }

    private static PolicyComplianceDetailJsonUnmarshaller instance;

    public static PolicyComplianceDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PolicyComplianceDetailJsonUnmarshaller();
        return instance;
    }
}
