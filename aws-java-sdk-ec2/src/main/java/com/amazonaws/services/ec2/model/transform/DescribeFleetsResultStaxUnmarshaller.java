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
package com.amazonaws.services.ec2.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DescribeFleetsResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFleetsResultStaxUnmarshaller implements Unmarshaller<DescribeFleetsResult, StaxUnmarshallerContext> {

    public DescribeFleetsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeFleetsResult describeFleetsResult = new DescribeFleetsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeFleetsResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("nextToken", targetDepth)) {
                    describeFleetsResult.setNextToken(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("fleetSet", targetDepth)) {
                    describeFleetsResult.withFleets(new ArrayList<FleetData>());
                    continue;
                }

                if (context.testExpression("fleetSet/item", targetDepth)) {
                    describeFleetsResult.withFleets(FleetDataStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeFleetsResult;
                }
            }
        }
    }

    private static DescribeFleetsResultStaxUnmarshaller instance;

    public static DescribeFleetsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeFleetsResultStaxUnmarshaller();
        return instance;
    }
}
