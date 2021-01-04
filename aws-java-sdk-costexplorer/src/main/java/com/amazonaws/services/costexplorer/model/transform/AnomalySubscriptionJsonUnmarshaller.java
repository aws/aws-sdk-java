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
package com.amazonaws.services.costexplorer.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.costexplorer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AnomalySubscription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnomalySubscriptionJsonUnmarshaller implements Unmarshaller<AnomalySubscription, JsonUnmarshallerContext> {

    public AnomalySubscription unmarshall(JsonUnmarshallerContext context) throws Exception {
        AnomalySubscription anomalySubscription = new AnomalySubscription();

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
                if (context.testExpression("SubscriptionArn", targetDepth)) {
                    context.nextToken();
                    anomalySubscription.setSubscriptionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AccountId", targetDepth)) {
                    context.nextToken();
                    anomalySubscription.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MonitorArnList", targetDepth)) {
                    context.nextToken();
                    anomalySubscription.setMonitorArnList(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Subscribers", targetDepth)) {
                    context.nextToken();
                    anomalySubscription.setSubscribers(new ListUnmarshaller<Subscriber>(SubscriberJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Threshold", targetDepth)) {
                    context.nextToken();
                    anomalySubscription.setThreshold(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("Frequency", targetDepth)) {
                    context.nextToken();
                    anomalySubscription.setFrequency(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubscriptionName", targetDepth)) {
                    context.nextToken();
                    anomalySubscription.setSubscriptionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return anomalySubscription;
    }

    private static AnomalySubscriptionJsonUnmarshaller instance;

    public static AnomalySubscriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AnomalySubscriptionJsonUnmarshaller();
        return instance;
    }
}
