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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsRdsEventSubscriptionDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRdsEventSubscriptionDetailsJsonUnmarshaller implements Unmarshaller<AwsRdsEventSubscriptionDetails, JsonUnmarshallerContext> {

    public AwsRdsEventSubscriptionDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsRdsEventSubscriptionDetails awsRdsEventSubscriptionDetails = new AwsRdsEventSubscriptionDetails();

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
                if (context.testExpression("CustSubscriptionId", targetDepth)) {
                    context.nextToken();
                    awsRdsEventSubscriptionDetails.setCustSubscriptionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CustomerAwsId", targetDepth)) {
                    context.nextToken();
                    awsRdsEventSubscriptionDetails.setCustomerAwsId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Enabled", targetDepth)) {
                    context.nextToken();
                    awsRdsEventSubscriptionDetails.setEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("EventCategoriesList", targetDepth)) {
                    context.nextToken();
                    awsRdsEventSubscriptionDetails.setEventCategoriesList(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("EventSubscriptionArn", targetDepth)) {
                    context.nextToken();
                    awsRdsEventSubscriptionDetails.setEventSubscriptionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnsTopicArn", targetDepth)) {
                    context.nextToken();
                    awsRdsEventSubscriptionDetails.setSnsTopicArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceIdsList", targetDepth)) {
                    context.nextToken();
                    awsRdsEventSubscriptionDetails.setSourceIdsList(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("SourceType", targetDepth)) {
                    context.nextToken();
                    awsRdsEventSubscriptionDetails.setSourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    awsRdsEventSubscriptionDetails.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubscriptionCreationTime", targetDepth)) {
                    context.nextToken();
                    awsRdsEventSubscriptionDetails.setSubscriptionCreationTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsRdsEventSubscriptionDetails;
    }

    private static AwsRdsEventSubscriptionDetailsJsonUnmarshaller instance;

    public static AwsRdsEventSubscriptionDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsRdsEventSubscriptionDetailsJsonUnmarshaller();
        return instance;
    }
}
