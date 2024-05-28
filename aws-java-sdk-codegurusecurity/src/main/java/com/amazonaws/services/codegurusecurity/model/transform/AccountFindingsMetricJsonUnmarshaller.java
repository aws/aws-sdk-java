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
package com.amazonaws.services.codegurusecurity.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codegurusecurity.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AccountFindingsMetric JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountFindingsMetricJsonUnmarshaller implements Unmarshaller<AccountFindingsMetric, JsonUnmarshallerContext> {

    public AccountFindingsMetric unmarshall(JsonUnmarshallerContext context) throws Exception {
        AccountFindingsMetric accountFindingsMetric = new AccountFindingsMetric();

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
                if (context.testExpression("closedFindings", targetDepth)) {
                    context.nextToken();
                    accountFindingsMetric.setClosedFindings(FindingMetricsValuePerSeverityJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("date", targetDepth)) {
                    context.nextToken();
                    accountFindingsMetric.setDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("meanTimeToClose", targetDepth)) {
                    context.nextToken();
                    accountFindingsMetric.setMeanTimeToClose(FindingMetricsValuePerSeverityJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("newFindings", targetDepth)) {
                    context.nextToken();
                    accountFindingsMetric.setNewFindings(FindingMetricsValuePerSeverityJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("openFindings", targetDepth)) {
                    context.nextToken();
                    accountFindingsMetric.setOpenFindings(FindingMetricsValuePerSeverityJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return accountFindingsMetric;
    }

    private static AccountFindingsMetricJsonUnmarshaller instance;

    public static AccountFindingsMetricJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AccountFindingsMetricJsonUnmarshaller();
        return instance;
    }
}
