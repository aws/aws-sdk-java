/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.elasticache.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * Cache Cluster StAX Unmarshaller
 */
public class CacheClusterStaxUnmarshaller implements Unmarshaller<CacheCluster, StaxUnmarshallerContext> {

    public CacheCluster unmarshall(StaxUnmarshallerContext context) throws Exception {
        CacheCluster cacheCluster = new CacheCluster();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        
        if (context.isStartOfDocument()) targetDepth += 2;
        

        if (context.isStartOfDocument()) targetDepth++;
        

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return cacheCluster;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("CacheClusterId", targetDepth)) {
                    cacheCluster.setCacheClusterId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CacheNodeType", targetDepth)) {
                    cacheCluster.setCacheNodeType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Engine", targetDepth)) {
                    cacheCluster.setEngine(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("EngineVersion", targetDepth)) {
                    cacheCluster.setEngineVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CacheClusterStatus", targetDepth)) {
                    cacheCluster.setCacheClusterStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("NumCacheNodes", targetDepth)) {
                    cacheCluster.setNumCacheNodes(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("PreferredAvailabilityZone", targetDepth)) {
                    cacheCluster.setPreferredAvailabilityZone(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CacheClusterCreateTime", targetDepth)) {
                    cacheCluster.setCacheClusterCreateTime(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("PreferredMaintenanceWindow", targetDepth)) {
                    cacheCluster.setPreferredMaintenanceWindow(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("PendingModifiedValues", targetDepth)) {
                    cacheCluster.setPendingModifiedValues(PendingModifiedValuesStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("NotificationConfiguration", targetDepth)) {
                    cacheCluster.setNotificationConfiguration(NotificationConfigurationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CacheSecurityGroups/CacheSecurityGroup", targetDepth)) {
                    cacheCluster.getCacheSecurityGroups().add(CacheSecurityGroupMembershipStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CacheParameterGroup", targetDepth)) {
                    cacheCluster.setCacheParameterGroup(CacheParameterGroupStatusStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CacheNodes/CacheNode", targetDepth)) {
                    cacheCluster.getCacheNodes().add(CacheNodeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("AutoMinorVersionUpgrade", targetDepth)) {
                    cacheCluster.setAutoMinorVersionUpgrade(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return cacheCluster;
                }
            }
        }
    }

    private static CacheClusterStaxUnmarshaller instance;
    public static CacheClusterStaxUnmarshaller getInstance() {
        if (instance == null) instance = new CacheClusterStaxUnmarshaller();
        return instance;
    }
}
    