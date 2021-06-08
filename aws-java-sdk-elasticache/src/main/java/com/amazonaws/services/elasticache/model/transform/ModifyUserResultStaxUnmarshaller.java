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
package com.amazonaws.services.elasticache.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ModifyUserResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyUserResultStaxUnmarshaller implements Unmarshaller<ModifyUserResult, StaxUnmarshallerContext> {

    public ModifyUserResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ModifyUserResult modifyUserResult = new ModifyUserResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return modifyUserResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("UserId", targetDepth)) {
                    modifyUserResult.setUserId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("UserName", targetDepth)) {
                    modifyUserResult.setUserName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    modifyUserResult.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Engine", targetDepth)) {
                    modifyUserResult.setEngine(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AccessString", targetDepth)) {
                    modifyUserResult.setAccessString(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("UserGroupIds", targetDepth)) {
                    modifyUserResult.withUserGroupIds(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("UserGroupIds/member", targetDepth)) {
                    modifyUserResult.withUserGroupIds(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Authentication", targetDepth)) {
                    modifyUserResult.setAuthentication(AuthenticationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ARN", targetDepth)) {
                    modifyUserResult.setARN(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return modifyUserResult;
                }
            }
        }
    }

    private static ModifyUserResultStaxUnmarshaller instance;

    public static ModifyUserResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModifyUserResultStaxUnmarshaller();
        return instance;
    }
}
