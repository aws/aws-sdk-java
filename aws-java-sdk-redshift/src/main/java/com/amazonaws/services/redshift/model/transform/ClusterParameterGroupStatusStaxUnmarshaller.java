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
 * ClusterParameterGroupStatus StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterParameterGroupStatusStaxUnmarshaller implements Unmarshaller<ClusterParameterGroupStatus, StaxUnmarshallerContext> {

    public ClusterParameterGroupStatus unmarshall(StaxUnmarshallerContext context) throws Exception {
        ClusterParameterGroupStatus clusterParameterGroupStatus = new ClusterParameterGroupStatus();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return clusterParameterGroupStatus;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ParameterGroupName", targetDepth)) {
                    clusterParameterGroupStatus.setParameterGroupName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ParameterApplyStatus", targetDepth)) {
                    clusterParameterGroupStatus.setParameterApplyStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ClusterParameterStatusList", targetDepth)) {
                    clusterParameterGroupStatus.withClusterParameterStatusList(new ArrayList<ClusterParameterStatus>());
                    continue;
                }

                if (context.testExpression("ClusterParameterStatusList/member", targetDepth)) {
                    clusterParameterGroupStatus.withClusterParameterStatusList(ClusterParameterStatusStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return clusterParameterGroupStatus;
                }
            }
        }
    }

    private static ClusterParameterGroupStatusStaxUnmarshaller instance;

    public static ClusterParameterGroupStatusStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ClusterParameterGroupStatusStaxUnmarshaller();
        return instance;
    }
}
