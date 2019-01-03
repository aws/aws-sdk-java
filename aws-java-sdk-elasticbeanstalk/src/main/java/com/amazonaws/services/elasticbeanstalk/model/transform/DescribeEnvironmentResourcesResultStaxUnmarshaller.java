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
package com.amazonaws.services.elasticbeanstalk.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DescribeEnvironmentResourcesResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEnvironmentResourcesResultStaxUnmarshaller implements Unmarshaller<DescribeEnvironmentResourcesResult, StaxUnmarshallerContext> {

    public DescribeEnvironmentResourcesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeEnvironmentResourcesResult describeEnvironmentResourcesResult = new DescribeEnvironmentResourcesResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeEnvironmentResourcesResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("EnvironmentResources", targetDepth)) {
                    describeEnvironmentResourcesResult
                            .setEnvironmentResources(EnvironmentResourceDescriptionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeEnvironmentResourcesResult;
                }
            }
        }
    }

    private static DescribeEnvironmentResourcesResultStaxUnmarshaller instance;

    public static DescribeEnvironmentResourcesResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeEnvironmentResourcesResultStaxUnmarshaller();
        return instance;
    }
}
