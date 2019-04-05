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
package com.amazonaws.services.rds.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * PendingMaintenanceAction StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PendingMaintenanceActionStaxUnmarshaller implements Unmarshaller<PendingMaintenanceAction, StaxUnmarshallerContext> {

    public PendingMaintenanceAction unmarshall(StaxUnmarshallerContext context) throws Exception {
        PendingMaintenanceAction pendingMaintenanceAction = new PendingMaintenanceAction();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return pendingMaintenanceAction;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Action", targetDepth)) {
                    pendingMaintenanceAction.setAction(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AutoAppliedAfterDate", targetDepth)) {
                    pendingMaintenanceAction.setAutoAppliedAfterDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("ForcedApplyDate", targetDepth)) {
                    pendingMaintenanceAction.setForcedApplyDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("OptInStatus", targetDepth)) {
                    pendingMaintenanceAction.setOptInStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CurrentApplyDate", targetDepth)) {
                    pendingMaintenanceAction.setCurrentApplyDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("Description", targetDepth)) {
                    pendingMaintenanceAction.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return pendingMaintenanceAction;
                }
            }
        }
    }

    private static PendingMaintenanceActionStaxUnmarshaller instance;

    public static PendingMaintenanceActionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new PendingMaintenanceActionStaxUnmarshaller();
        return instance;
    }
}
