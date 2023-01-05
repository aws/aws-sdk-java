/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * SnapshotTierStatus StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnapshotTierStatusStaxUnmarshaller implements Unmarshaller<SnapshotTierStatus, StaxUnmarshallerContext> {

    public SnapshotTierStatus unmarshall(StaxUnmarshallerContext context) throws Exception {
        SnapshotTierStatus snapshotTierStatus = new SnapshotTierStatus();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return snapshotTierStatus;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("snapshotId", targetDepth)) {
                    snapshotTierStatus.setSnapshotId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("volumeId", targetDepth)) {
                    snapshotTierStatus.setVolumeId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("status", targetDepth)) {
                    snapshotTierStatus.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ownerId", targetDepth)) {
                    snapshotTierStatus.setOwnerId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSet", targetDepth)) {
                    snapshotTierStatus.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("tagSet/item", targetDepth)) {
                    snapshotTierStatus.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("storageTier", targetDepth)) {
                    snapshotTierStatus.setStorageTier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("lastTieringStartTime", targetDepth)) {
                    snapshotTierStatus.setLastTieringStartTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("lastTieringProgress", targetDepth)) {
                    snapshotTierStatus.setLastTieringProgress(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("lastTieringOperationStatus", targetDepth)) {
                    snapshotTierStatus.setLastTieringOperationStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("lastTieringOperationStatusDetail", targetDepth)) {
                    snapshotTierStatus.setLastTieringOperationStatusDetail(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("archivalCompleteTime", targetDepth)) {
                    snapshotTierStatus.setArchivalCompleteTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("restoreExpiryTime", targetDepth)) {
                    snapshotTierStatus.setRestoreExpiryTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return snapshotTierStatus;
                }
            }
        }
    }

    private static SnapshotTierStatusStaxUnmarshaller instance;

    public static SnapshotTierStatusStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new SnapshotTierStatusStaxUnmarshaller();
        return instance;
    }
}
