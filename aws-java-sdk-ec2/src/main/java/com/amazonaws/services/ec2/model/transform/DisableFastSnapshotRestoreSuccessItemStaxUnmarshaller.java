/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DisableFastSnapshotRestoreSuccessItem StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisableFastSnapshotRestoreSuccessItemStaxUnmarshaller implements Unmarshaller<DisableFastSnapshotRestoreSuccessItem, StaxUnmarshallerContext> {

    public DisableFastSnapshotRestoreSuccessItem unmarshall(StaxUnmarshallerContext context) throws Exception {
        DisableFastSnapshotRestoreSuccessItem disableFastSnapshotRestoreSuccessItem = new DisableFastSnapshotRestoreSuccessItem();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return disableFastSnapshotRestoreSuccessItem;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("snapshotId", targetDepth)) {
                    disableFastSnapshotRestoreSuccessItem.setSnapshotId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("availabilityZone", targetDepth)) {
                    disableFastSnapshotRestoreSuccessItem.setAvailabilityZone(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("state", targetDepth)) {
                    disableFastSnapshotRestoreSuccessItem.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("stateTransitionReason", targetDepth)) {
                    disableFastSnapshotRestoreSuccessItem.setStateTransitionReason(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ownerId", targetDepth)) {
                    disableFastSnapshotRestoreSuccessItem.setOwnerId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ownerAlias", targetDepth)) {
                    disableFastSnapshotRestoreSuccessItem.setOwnerAlias(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("enablingTime", targetDepth)) {
                    disableFastSnapshotRestoreSuccessItem.setEnablingTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("optimizingTime", targetDepth)) {
                    disableFastSnapshotRestoreSuccessItem.setOptimizingTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("enabledTime", targetDepth)) {
                    disableFastSnapshotRestoreSuccessItem.setEnabledTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("disablingTime", targetDepth)) {
                    disableFastSnapshotRestoreSuccessItem.setDisablingTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("disabledTime", targetDepth)) {
                    disableFastSnapshotRestoreSuccessItem.setDisabledTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return disableFastSnapshotRestoreSuccessItem;
                }
            }
        }
    }

    private static DisableFastSnapshotRestoreSuccessItemStaxUnmarshaller instance;

    public static DisableFastSnapshotRestoreSuccessItemStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DisableFastSnapshotRestoreSuccessItemStaxUnmarshaller();
        return instance;
    }
}
