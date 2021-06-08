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
package com.amazonaws.services.workmail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.workmail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MobileDeviceAccessRule JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MobileDeviceAccessRuleJsonUnmarshaller implements Unmarshaller<MobileDeviceAccessRule, JsonUnmarshallerContext> {

    public MobileDeviceAccessRule unmarshall(JsonUnmarshallerContext context) throws Exception {
        MobileDeviceAccessRule mobileDeviceAccessRule = new MobileDeviceAccessRule();

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
                if (context.testExpression("MobileDeviceAccessRuleId", targetDepth)) {
                    context.nextToken();
                    mobileDeviceAccessRule.setMobileDeviceAccessRuleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    mobileDeviceAccessRule.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    mobileDeviceAccessRule.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Effect", targetDepth)) {
                    context.nextToken();
                    mobileDeviceAccessRule.setEffect(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceTypes", targetDepth)) {
                    context.nextToken();
                    mobileDeviceAccessRule.setDeviceTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("NotDeviceTypes", targetDepth)) {
                    context.nextToken();
                    mobileDeviceAccessRule.setNotDeviceTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("DeviceModels", targetDepth)) {
                    context.nextToken();
                    mobileDeviceAccessRule.setDeviceModels(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("NotDeviceModels", targetDepth)) {
                    context.nextToken();
                    mobileDeviceAccessRule.setNotDeviceModels(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("DeviceOperatingSystems", targetDepth)) {
                    context.nextToken();
                    mobileDeviceAccessRule.setDeviceOperatingSystems(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("NotDeviceOperatingSystems", targetDepth)) {
                    context.nextToken();
                    mobileDeviceAccessRule.setNotDeviceOperatingSystems(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("DeviceUserAgents", targetDepth)) {
                    context.nextToken();
                    mobileDeviceAccessRule.setDeviceUserAgents(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("NotDeviceUserAgents", targetDepth)) {
                    context.nextToken();
                    mobileDeviceAccessRule.setNotDeviceUserAgents(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("DateCreated", targetDepth)) {
                    context.nextToken();
                    mobileDeviceAccessRule.setDateCreated(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DateModified", targetDepth)) {
                    context.nextToken();
                    mobileDeviceAccessRule.setDateModified(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return mobileDeviceAccessRule;
    }

    private static MobileDeviceAccessRuleJsonUnmarshaller instance;

    public static MobileDeviceAccessRuleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MobileDeviceAccessRuleJsonUnmarshaller();
        return instance;
    }
}
