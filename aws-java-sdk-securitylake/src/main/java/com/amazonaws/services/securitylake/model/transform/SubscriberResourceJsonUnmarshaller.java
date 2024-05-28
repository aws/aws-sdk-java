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
package com.amazonaws.services.securitylake.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securitylake.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SubscriberResource JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubscriberResourceJsonUnmarshaller implements Unmarshaller<SubscriberResource, JsonUnmarshallerContext> {

    public SubscriberResource unmarshall(JsonUnmarshallerContext context) throws Exception {
        SubscriberResource subscriberResource = new SubscriberResource();

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
                if (context.testExpression("accessTypes", targetDepth)) {
                    context.nextToken();
                    subscriberResource.setAccessTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    subscriberResource.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("resourceShareArn", targetDepth)) {
                    context.nextToken();
                    subscriberResource.setResourceShareArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceShareName", targetDepth)) {
                    context.nextToken();
                    subscriberResource.setResourceShareName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    context.nextToken();
                    subscriberResource.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("s3BucketArn", targetDepth)) {
                    context.nextToken();
                    subscriberResource.setS3BucketArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sources", targetDepth)) {
                    context.nextToken();
                    subscriberResource.setSources(new ListUnmarshaller<LogSourceResource>(LogSourceResourceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("subscriberArn", targetDepth)) {
                    context.nextToken();
                    subscriberResource.setSubscriberArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("subscriberDescription", targetDepth)) {
                    context.nextToken();
                    subscriberResource.setSubscriberDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("subscriberEndpoint", targetDepth)) {
                    context.nextToken();
                    subscriberResource.setSubscriberEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("subscriberId", targetDepth)) {
                    context.nextToken();
                    subscriberResource.setSubscriberId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("subscriberIdentity", targetDepth)) {
                    context.nextToken();
                    subscriberResource.setSubscriberIdentity(AwsIdentityJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("subscriberName", targetDepth)) {
                    context.nextToken();
                    subscriberResource.setSubscriberName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("subscriberStatus", targetDepth)) {
                    context.nextToken();
                    subscriberResource.setSubscriberStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    subscriberResource.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return subscriberResource;
    }

    private static SubscriberResourceJsonUnmarshaller instance;

    public static SubscriberResourceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SubscriberResourceJsonUnmarshaller();
        return instance;
    }
}
