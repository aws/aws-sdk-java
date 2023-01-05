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
package com.amazonaws.services.securitylake.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securitylake.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateSubscriberResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSubscriberResultJsonUnmarshaller implements Unmarshaller<CreateSubscriberResult, JsonUnmarshallerContext> {

    public CreateSubscriberResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateSubscriberResult createSubscriberResult = new CreateSubscriberResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createSubscriberResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("roleArn", targetDepth)) {
                    context.nextToken();
                    createSubscriberResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("s3BucketArn", targetDepth)) {
                    context.nextToken();
                    createSubscriberResult.setS3BucketArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("snsArn", targetDepth)) {
                    context.nextToken();
                    createSubscriberResult.setSnsArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("subscriptionId", targetDepth)) {
                    context.nextToken();
                    createSubscriberResult.setSubscriptionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createSubscriberResult;
    }

    private static CreateSubscriberResultJsonUnmarshaller instance;

    public static CreateSubscriberResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateSubscriberResultJsonUnmarshaller();
        return instance;
    }
}
