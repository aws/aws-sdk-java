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
package com.amazonaws.services.elasticache.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ConfigureShard StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigureShardStaxUnmarshaller implements Unmarshaller<ConfigureShard, StaxUnmarshallerContext> {

    public ConfigureShard unmarshall(StaxUnmarshallerContext context) throws Exception {
        ConfigureShard configureShard = new ConfigureShard();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return configureShard;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("NodeGroupId", targetDepth)) {
                    configureShard.setNodeGroupId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NewReplicaCount", targetDepth)) {
                    configureShard.setNewReplicaCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PreferredAvailabilityZones", targetDepth)) {
                    configureShard.withPreferredAvailabilityZones(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("PreferredAvailabilityZones/PreferredAvailabilityZone", targetDepth)) {
                    configureShard.withPreferredAvailabilityZones(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return configureShard;
                }
            }
        }
    }

    private static ConfigureShardStaxUnmarshaller instance;

    public static ConfigureShardStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConfigureShardStaxUnmarshaller();
        return instance;
    }
}
