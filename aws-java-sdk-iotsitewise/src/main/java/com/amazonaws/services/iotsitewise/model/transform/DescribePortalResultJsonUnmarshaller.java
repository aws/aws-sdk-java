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
package com.amazonaws.services.iotsitewise.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotsitewise.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribePortalResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePortalResultJsonUnmarshaller implements Unmarshaller<DescribePortalResult, JsonUnmarshallerContext> {

    public DescribePortalResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribePortalResult describePortalResult = new DescribePortalResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describePortalResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("portalId", targetDepth)) {
                    context.nextToken();
                    describePortalResult.setPortalId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("portalArn", targetDepth)) {
                    context.nextToken();
                    describePortalResult.setPortalArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("portalName", targetDepth)) {
                    context.nextToken();
                    describePortalResult.setPortalName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("portalDescription", targetDepth)) {
                    context.nextToken();
                    describePortalResult.setPortalDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("portalClientId", targetDepth)) {
                    context.nextToken();
                    describePortalResult.setPortalClientId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("portalStartUrl", targetDepth)) {
                    context.nextToken();
                    describePortalResult.setPortalStartUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("portalContactEmail", targetDepth)) {
                    context.nextToken();
                    describePortalResult.setPortalContactEmail(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("portalStatus", targetDepth)) {
                    context.nextToken();
                    describePortalResult.setPortalStatus(PortalStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("portalCreationDate", targetDepth)) {
                    context.nextToken();
                    describePortalResult.setPortalCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("portalLastUpdateDate", targetDepth)) {
                    context.nextToken();
                    describePortalResult.setPortalLastUpdateDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("portalLogoImageLocation", targetDepth)) {
                    context.nextToken();
                    describePortalResult.setPortalLogoImageLocation(ImageLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    context.nextToken();
                    describePortalResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("portalAuthMode", targetDepth)) {
                    context.nextToken();
                    describePortalResult.setPortalAuthMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("notificationSenderEmail", targetDepth)) {
                    context.nextToken();
                    describePortalResult.setNotificationSenderEmail(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("alarms", targetDepth)) {
                    context.nextToken();
                    describePortalResult.setAlarms(AlarmsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describePortalResult;
    }

    private static DescribePortalResultJsonUnmarshaller instance;

    public static DescribePortalResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribePortalResultJsonUnmarshaller();
        return instance;
    }
}
