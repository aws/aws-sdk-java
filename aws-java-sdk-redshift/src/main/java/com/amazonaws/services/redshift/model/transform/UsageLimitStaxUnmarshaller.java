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
package com.amazonaws.services.redshift.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * UsageLimit StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UsageLimitStaxUnmarshaller implements Unmarshaller<UsageLimit, StaxUnmarshallerContext> {

    public UsageLimit unmarshall(StaxUnmarshallerContext context) throws Exception {
        UsageLimit usageLimit = new UsageLimit();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return usageLimit;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("UsageLimitId", targetDepth)) {
                    usageLimit.setUsageLimitId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ClusterIdentifier", targetDepth)) {
                    usageLimit.setClusterIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("FeatureType", targetDepth)) {
                    usageLimit.setFeatureType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LimitType", targetDepth)) {
                    usageLimit.setLimitType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Amount", targetDepth)) {
                    usageLimit.setAmount(LongStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Period", targetDepth)) {
                    usageLimit.setPeriod(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("BreachAction", targetDepth)) {
                    usageLimit.setBreachAction(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Tags", targetDepth)) {
                    usageLimit.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("Tags/Tag", targetDepth)) {
                    usageLimit.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return usageLimit;
                }
            }
        }
    }

    private static UsageLimitStaxUnmarshaller instance;

    public static UsageLimitStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new UsageLimitStaxUnmarshaller();
        return instance;
    }
}
