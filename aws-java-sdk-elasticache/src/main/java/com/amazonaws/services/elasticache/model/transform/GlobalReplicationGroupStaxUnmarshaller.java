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
 * GlobalReplicationGroup StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GlobalReplicationGroupStaxUnmarshaller implements Unmarshaller<GlobalReplicationGroup, StaxUnmarshallerContext> {

    public GlobalReplicationGroup unmarshall(StaxUnmarshallerContext context) throws Exception {
        GlobalReplicationGroup globalReplicationGroup = new GlobalReplicationGroup();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 3;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return globalReplicationGroup;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("GlobalReplicationGroupId", targetDepth)) {
                    globalReplicationGroup.setGlobalReplicationGroupId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("GlobalReplicationGroupDescription", targetDepth)) {
                    globalReplicationGroup.setGlobalReplicationGroupDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    globalReplicationGroup.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CacheNodeType", targetDepth)) {
                    globalReplicationGroup.setCacheNodeType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Engine", targetDepth)) {
                    globalReplicationGroup.setEngine(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EngineVersion", targetDepth)) {
                    globalReplicationGroup.setEngineVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Members", targetDepth)) {
                    globalReplicationGroup.withMembers(new ArrayList<GlobalReplicationGroupMember>());
                    continue;
                }

                if (context.testExpression("Members/GlobalReplicationGroupMember", targetDepth)) {
                    globalReplicationGroup.withMembers(GlobalReplicationGroupMemberStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ClusterEnabled", targetDepth)) {
                    globalReplicationGroup.setClusterEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("GlobalNodeGroups", targetDepth)) {
                    globalReplicationGroup.withGlobalNodeGroups(new ArrayList<GlobalNodeGroup>());
                    continue;
                }

                if (context.testExpression("GlobalNodeGroups/GlobalNodeGroup", targetDepth)) {
                    globalReplicationGroup.withGlobalNodeGroups(GlobalNodeGroupStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AuthTokenEnabled", targetDepth)) {
                    globalReplicationGroup.setAuthTokenEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TransitEncryptionEnabled", targetDepth)) {
                    globalReplicationGroup.setTransitEncryptionEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AtRestEncryptionEnabled", targetDepth)) {
                    globalReplicationGroup.setAtRestEncryptionEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ARN", targetDepth)) {
                    globalReplicationGroup.setARN(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return globalReplicationGroup;
                }
            }
        }
    }

    private static GlobalReplicationGroupStaxUnmarshaller instance;

    public static GlobalReplicationGroupStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GlobalReplicationGroupStaxUnmarshaller();
        return instance;
    }
}
