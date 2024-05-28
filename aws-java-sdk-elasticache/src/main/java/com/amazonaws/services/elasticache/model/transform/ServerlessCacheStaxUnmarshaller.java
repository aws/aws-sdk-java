/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ServerlessCache StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServerlessCacheStaxUnmarshaller implements Unmarshaller<ServerlessCache, StaxUnmarshallerContext> {

    public ServerlessCache unmarshall(StaxUnmarshallerContext context) throws Exception {
        ServerlessCache serverlessCache = new ServerlessCache();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return serverlessCache;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ServerlessCacheName", targetDepth)) {
                    serverlessCache.setServerlessCacheName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Description", targetDepth)) {
                    serverlessCache.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CreateTime", targetDepth)) {
                    serverlessCache.setCreateTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    serverlessCache.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Engine", targetDepth)) {
                    serverlessCache.setEngine(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MajorEngineVersion", targetDepth)) {
                    serverlessCache.setMajorEngineVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("FullEngineVersion", targetDepth)) {
                    serverlessCache.setFullEngineVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CacheUsageLimits", targetDepth)) {
                    serverlessCache.setCacheUsageLimits(CacheUsageLimitsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("KmsKeyId", targetDepth)) {
                    serverlessCache.setKmsKeyId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SecurityGroupIds", targetDepth)) {
                    serverlessCache.withSecurityGroupIds(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("SecurityGroupIds/SecurityGroupId", targetDepth)) {
                    serverlessCache.withSecurityGroupIds(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Endpoint", targetDepth)) {
                    serverlessCache.setEndpoint(EndpointStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ReaderEndpoint", targetDepth)) {
                    serverlessCache.setReaderEndpoint(EndpointStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ARN", targetDepth)) {
                    serverlessCache.setARN(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("UserGroupId", targetDepth)) {
                    serverlessCache.setUserGroupId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SubnetIds", targetDepth)) {
                    serverlessCache.withSubnetIds(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("SubnetIds/SubnetId", targetDepth)) {
                    serverlessCache.withSubnetIds(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SnapshotRetentionLimit", targetDepth)) {
                    serverlessCache.setSnapshotRetentionLimit(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DailySnapshotTime", targetDepth)) {
                    serverlessCache.setDailySnapshotTime(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return serverlessCache;
                }
            }
        }
    }

    private static ServerlessCacheStaxUnmarshaller instance;

    public static ServerlessCacheStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ServerlessCacheStaxUnmarshaller();
        return instance;
    }
}
