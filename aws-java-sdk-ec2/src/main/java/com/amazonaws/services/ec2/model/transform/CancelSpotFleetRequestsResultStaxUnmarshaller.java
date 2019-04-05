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
 * CancelSpotFleetRequestsResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelSpotFleetRequestsResultStaxUnmarshaller implements Unmarshaller<CancelSpotFleetRequestsResult, StaxUnmarshallerContext> {

    public CancelSpotFleetRequestsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        CancelSpotFleetRequestsResult cancelSpotFleetRequestsResult = new CancelSpotFleetRequestsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return cancelSpotFleetRequestsResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("successfulFleetRequestSet", targetDepth)) {
                    cancelSpotFleetRequestsResult.withSuccessfulFleetRequests(new ArrayList<CancelSpotFleetRequestsSuccessItem>());
                    continue;
                }

                if (context.testExpression("successfulFleetRequestSet/item", targetDepth)) {
                    cancelSpotFleetRequestsResult.withSuccessfulFleetRequests(CancelSpotFleetRequestsSuccessItemStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }

                if (context.testExpression("unsuccessfulFleetRequestSet", targetDepth)) {
                    cancelSpotFleetRequestsResult.withUnsuccessfulFleetRequests(new ArrayList<CancelSpotFleetRequestsErrorItem>());
                    continue;
                }

                if (context.testExpression("unsuccessfulFleetRequestSet/item", targetDepth)) {
                    cancelSpotFleetRequestsResult.withUnsuccessfulFleetRequests(CancelSpotFleetRequestsErrorItemStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return cancelSpotFleetRequestsResult;
                }
            }
        }
    }

    private static CancelSpotFleetRequestsResultStaxUnmarshaller instance;

    public static CancelSpotFleetRequestsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CancelSpotFleetRequestsResultStaxUnmarshaller();
        return instance;
    }
}
