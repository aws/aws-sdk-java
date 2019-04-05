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
package com.amazonaws.services.identitymanagement.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * RoleUsageType StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RoleUsageTypeStaxUnmarshaller implements Unmarshaller<RoleUsageType, StaxUnmarshallerContext> {

    public RoleUsageType unmarshall(StaxUnmarshallerContext context) throws Exception {
        RoleUsageType roleUsageType = new RoleUsageType();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return roleUsageType;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Region", targetDepth)) {
                    roleUsageType.setRegion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Resources", targetDepth)) {
                    roleUsageType.withResources(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("Resources/member", targetDepth)) {
                    roleUsageType.withResources(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return roleUsageType;
                }
            }
        }
    }

    private static RoleUsageTypeStaxUnmarshaller instance;

    public static RoleUsageTypeStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new RoleUsageTypeStaxUnmarshaller();
        return instance;
    }
}
