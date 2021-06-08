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
 * User StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserStaxUnmarshaller implements Unmarshaller<User, StaxUnmarshallerContext> {

    public User unmarshall(StaxUnmarshallerContext context) throws Exception {
        User user = new User();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return user;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("UserId", targetDepth)) {
                    user.setUserId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("UserName", targetDepth)) {
                    user.setUserName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    user.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Engine", targetDepth)) {
                    user.setEngine(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AccessString", targetDepth)) {
                    user.setAccessString(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("UserGroupIds", targetDepth)) {
                    user.withUserGroupIds(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("UserGroupIds/member", targetDepth)) {
                    user.withUserGroupIds(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Authentication", targetDepth)) {
                    user.setAuthentication(AuthenticationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ARN", targetDepth)) {
                    user.setARN(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return user;
                }
            }
        }
    }

    private static UserStaxUnmarshaller instance;

    public static UserStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new UserStaxUnmarshaller();
        return instance;
    }
}
