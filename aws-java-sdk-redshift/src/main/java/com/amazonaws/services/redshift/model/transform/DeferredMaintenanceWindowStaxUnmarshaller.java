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
package com.amazonaws.services.redshift.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DeferredMaintenanceWindow StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeferredMaintenanceWindowStaxUnmarshaller implements Unmarshaller<DeferredMaintenanceWindow, StaxUnmarshallerContext> {

    public DeferredMaintenanceWindow unmarshall(StaxUnmarshallerContext context) throws Exception {
        DeferredMaintenanceWindow deferredMaintenanceWindow = new DeferredMaintenanceWindow();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return deferredMaintenanceWindow;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("DeferMaintenanceIdentifier", targetDepth)) {
                    deferredMaintenanceWindow.setDeferMaintenanceIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DeferMaintenanceStartTime", targetDepth)) {
                    deferredMaintenanceWindow.setDeferMaintenanceStartTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("DeferMaintenanceEndTime", targetDepth)) {
                    deferredMaintenanceWindow.setDeferMaintenanceEndTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return deferredMaintenanceWindow;
                }
            }
        }
    }

    private static DeferredMaintenanceWindowStaxUnmarshaller instance;

    public static DeferredMaintenanceWindowStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeferredMaintenanceWindowStaxUnmarshaller();
        return instance;
    }
}
