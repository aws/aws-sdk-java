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
 * ClusterDbRevision StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterDbRevisionStaxUnmarshaller implements Unmarshaller<ClusterDbRevision, StaxUnmarshallerContext> {

    public ClusterDbRevision unmarshall(StaxUnmarshallerContext context) throws Exception {
        ClusterDbRevision clusterDbRevision = new ClusterDbRevision();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return clusterDbRevision;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ClusterIdentifier", targetDepth)) {
                    clusterDbRevision.setClusterIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CurrentDatabaseRevision", targetDepth)) {
                    clusterDbRevision.setCurrentDatabaseRevision(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DatabaseRevisionReleaseDate", targetDepth)) {
                    clusterDbRevision.setDatabaseRevisionReleaseDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("RevisionTargets", targetDepth)) {
                    clusterDbRevision.withRevisionTargets(new ArrayList<RevisionTarget>());
                    continue;
                }

                if (context.testExpression("RevisionTargets/RevisionTarget", targetDepth)) {
                    clusterDbRevision.withRevisionTargets(RevisionTargetStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return clusterDbRevision;
                }
            }
        }
    }

    private static ClusterDbRevisionStaxUnmarshaller instance;

    public static ClusterDbRevisionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ClusterDbRevisionStaxUnmarshaller();
        return instance;
    }
}
