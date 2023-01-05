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
 * NetworkInsightsAccessScope StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkInsightsAccessScopeStaxUnmarshaller implements Unmarshaller<NetworkInsightsAccessScope, StaxUnmarshallerContext> {

    public NetworkInsightsAccessScope unmarshall(StaxUnmarshallerContext context) throws Exception {
        NetworkInsightsAccessScope networkInsightsAccessScope = new NetworkInsightsAccessScope();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return networkInsightsAccessScope;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("networkInsightsAccessScopeId", targetDepth)) {
                    networkInsightsAccessScope.setNetworkInsightsAccessScopeId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("networkInsightsAccessScopeArn", targetDepth)) {
                    networkInsightsAccessScope.setNetworkInsightsAccessScopeArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("createdDate", targetDepth)) {
                    networkInsightsAccessScope.setCreatedDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("updatedDate", targetDepth)) {
                    networkInsightsAccessScope.setUpdatedDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSet", targetDepth)) {
                    networkInsightsAccessScope.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("tagSet/item", targetDepth)) {
                    networkInsightsAccessScope.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return networkInsightsAccessScope;
                }
            }
        }
    }

    private static NetworkInsightsAccessScopeStaxUnmarshaller instance;

    public static NetworkInsightsAccessScopeStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new NetworkInsightsAccessScopeStaxUnmarshaller();
        return instance;
    }
}
