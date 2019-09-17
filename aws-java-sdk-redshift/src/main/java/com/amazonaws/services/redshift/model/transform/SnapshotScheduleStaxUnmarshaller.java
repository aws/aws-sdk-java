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

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * SnapshotSchedule StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnapshotScheduleStaxUnmarshaller implements Unmarshaller<SnapshotSchedule, StaxUnmarshallerContext> {

    public SnapshotSchedule unmarshall(StaxUnmarshallerContext context) throws Exception {
        SnapshotSchedule snapshotSchedule = new SnapshotSchedule();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return snapshotSchedule;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ScheduleDefinitions", targetDepth)) {
                    snapshotSchedule.withScheduleDefinitions(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("ScheduleDefinitions/ScheduleDefinition", targetDepth)) {
                    snapshotSchedule.withScheduleDefinitions(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ScheduleIdentifier", targetDepth)) {
                    snapshotSchedule.setScheduleIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ScheduleDescription", targetDepth)) {
                    snapshotSchedule.setScheduleDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Tags", targetDepth)) {
                    snapshotSchedule.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("Tags/Tag", targetDepth)) {
                    snapshotSchedule.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NextInvocations", targetDepth)) {
                    snapshotSchedule.withNextInvocations(new ArrayList<java.util.Date>());
                    continue;
                }

                if (context.testExpression("NextInvocations/SnapshotTime", targetDepth)) {
                    snapshotSchedule.withNextInvocations(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("AssociatedClusterCount", targetDepth)) {
                    snapshotSchedule.setAssociatedClusterCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AssociatedClusters", targetDepth)) {
                    snapshotSchedule.withAssociatedClusters(new ArrayList<ClusterAssociatedToSchedule>());
                    continue;
                }

                if (context.testExpression("AssociatedClusters/ClusterAssociatedToSchedule", targetDepth)) {
                    snapshotSchedule.withAssociatedClusters(ClusterAssociatedToScheduleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return snapshotSchedule;
                }
            }
        }
    }

    private static SnapshotScheduleStaxUnmarshaller instance;

    public static SnapshotScheduleStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new SnapshotScheduleStaxUnmarshaller();
        return instance;
    }
}
