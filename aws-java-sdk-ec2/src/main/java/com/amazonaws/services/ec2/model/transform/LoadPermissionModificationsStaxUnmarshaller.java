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
package com.amazonaws.services.ec2.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * LoadPermissionModifications StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoadPermissionModificationsStaxUnmarshaller implements Unmarshaller<LoadPermissionModifications, StaxUnmarshallerContext> {

    public LoadPermissionModifications unmarshall(StaxUnmarshallerContext context) throws Exception {
        LoadPermissionModifications loadPermissionModifications = new LoadPermissionModifications();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return loadPermissionModifications;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Add", targetDepth)) {
                    loadPermissionModifications.withAdd(new ArrayList<LoadPermissionRequest>());
                    continue;
                }

                if (context.testExpression("Add/item", targetDepth)) {
                    loadPermissionModifications.withAdd(LoadPermissionRequestStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Remove", targetDepth)) {
                    loadPermissionModifications.withRemove(new ArrayList<LoadPermissionRequest>());
                    continue;
                }

                if (context.testExpression("Remove/item", targetDepth)) {
                    loadPermissionModifications.withRemove(LoadPermissionRequestStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return loadPermissionModifications;
                }
            }
        }
    }

    private static LoadPermissionModificationsStaxUnmarshaller instance;

    public static LoadPermissionModificationsStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new LoadPermissionModificationsStaxUnmarshaller();
        return instance;
    }
}
