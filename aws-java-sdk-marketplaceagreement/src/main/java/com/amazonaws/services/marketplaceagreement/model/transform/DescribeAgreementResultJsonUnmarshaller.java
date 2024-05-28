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
package com.amazonaws.services.marketplaceagreement.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.marketplaceagreement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeAgreementResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAgreementResultJsonUnmarshaller implements Unmarshaller<DescribeAgreementResult, JsonUnmarshallerContext> {

    public DescribeAgreementResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeAgreementResult describeAgreementResult = new DescribeAgreementResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeAgreementResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("acceptanceTime", targetDepth)) {
                    context.nextToken();
                    describeAgreementResult.setAcceptanceTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("acceptor", targetDepth)) {
                    context.nextToken();
                    describeAgreementResult.setAcceptor(AcceptorJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("agreementId", targetDepth)) {
                    context.nextToken();
                    describeAgreementResult.setAgreementId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("agreementType", targetDepth)) {
                    context.nextToken();
                    describeAgreementResult.setAgreementType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("endTime", targetDepth)) {
                    context.nextToken();
                    describeAgreementResult.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("estimatedCharges", targetDepth)) {
                    context.nextToken();
                    describeAgreementResult.setEstimatedCharges(EstimatedChargesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("proposalSummary", targetDepth)) {
                    context.nextToken();
                    describeAgreementResult.setProposalSummary(ProposalSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("proposer", targetDepth)) {
                    context.nextToken();
                    describeAgreementResult.setProposer(ProposerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    describeAgreementResult.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    describeAgreementResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeAgreementResult;
    }

    private static DescribeAgreementResultJsonUnmarshaller instance;

    public static DescribeAgreementResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeAgreementResultJsonUnmarshaller();
        return instance;
    }
}
