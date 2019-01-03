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
package com.amazonaws.services.rds.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DescribeDBClusterParametersResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBClusterParametersResultStaxUnmarshaller implements Unmarshaller<DescribeDBClusterParametersResult, StaxUnmarshallerContext> {

    public DescribeDBClusterParametersResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeDBClusterParametersResult describeDBClusterParametersResult = new DescribeDBClusterParametersResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeDBClusterParametersResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Parameters", targetDepth)) {
                    describeDBClusterParametersResult.withParameters(new ArrayList<Parameter>());
                    continue;
                }

                if (context.testExpression("Parameters/Parameter", targetDepth)) {
                    describeDBClusterParametersResult.withParameters(ParameterStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Marker", targetDepth)) {
                    describeDBClusterParametersResult.setMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeDBClusterParametersResult;
                }
            }
        }
    }

    private static DescribeDBClusterParametersResultStaxUnmarshaller instance;

    public static DescribeDBClusterParametersResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeDBClusterParametersResultStaxUnmarshaller();
        return instance;
    }
}
