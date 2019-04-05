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

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * CancelSpotFleetRequestsSuccessItem StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelSpotFleetRequestsSuccessItemStaxUnmarshaller implements Unmarshaller<CancelSpotFleetRequestsSuccessItem, StaxUnmarshallerContext> {

    public CancelSpotFleetRequestsSuccessItem unmarshall(StaxUnmarshallerContext context) throws Exception {
        CancelSpotFleetRequestsSuccessItem cancelSpotFleetRequestsSuccessItem = new CancelSpotFleetRequestsSuccessItem();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return cancelSpotFleetRequestsSuccessItem;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("currentSpotFleetRequestState", targetDepth)) {
                    cancelSpotFleetRequestsSuccessItem.setCurrentSpotFleetRequestState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("previousSpotFleetRequestState", targetDepth)) {
                    cancelSpotFleetRequestsSuccessItem.setPreviousSpotFleetRequestState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("spotFleetRequestId", targetDepth)) {
                    cancelSpotFleetRequestsSuccessItem.setSpotFleetRequestId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return cancelSpotFleetRequestsSuccessItem;
                }
            }
        }
    }

    private static CancelSpotFleetRequestsSuccessItemStaxUnmarshaller instance;

    public static CancelSpotFleetRequestsSuccessItemStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CancelSpotFleetRequestsSuccessItemStaxUnmarshaller();
        return instance;
    }
}
