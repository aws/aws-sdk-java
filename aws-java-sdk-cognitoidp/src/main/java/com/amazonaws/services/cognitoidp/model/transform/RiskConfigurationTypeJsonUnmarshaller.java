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
package com.amazonaws.services.cognitoidp.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cognitoidp.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RiskConfigurationType JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RiskConfigurationTypeJsonUnmarshaller implements Unmarshaller<RiskConfigurationType, JsonUnmarshallerContext> {

    public RiskConfigurationType unmarshall(JsonUnmarshallerContext context) throws Exception {
        RiskConfigurationType riskConfigurationType = new RiskConfigurationType();

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
                if (context.testExpression("UserPoolId", targetDepth)) {
                    context.nextToken();
                    riskConfigurationType.setUserPoolId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClientId", targetDepth)) {
                    context.nextToken();
                    riskConfigurationType.setClientId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CompromisedCredentialsRiskConfiguration", targetDepth)) {
                    context.nextToken();
                    riskConfigurationType.setCompromisedCredentialsRiskConfiguration(CompromisedCredentialsRiskConfigurationTypeJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("AccountTakeoverRiskConfiguration", targetDepth)) {
                    context.nextToken();
                    riskConfigurationType.setAccountTakeoverRiskConfiguration(AccountTakeoverRiskConfigurationTypeJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("RiskExceptionConfiguration", targetDepth)) {
                    context.nextToken();
                    riskConfigurationType.setRiskExceptionConfiguration(RiskExceptionConfigurationTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastModifiedDate", targetDepth)) {
                    context.nextToken();
                    riskConfigurationType.setLastModifiedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return riskConfigurationType;
    }

    private static RiskConfigurationTypeJsonUnmarshaller instance;

    public static RiskConfigurationTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RiskConfigurationTypeJsonUnmarshaller();
        return instance;
    }
}
