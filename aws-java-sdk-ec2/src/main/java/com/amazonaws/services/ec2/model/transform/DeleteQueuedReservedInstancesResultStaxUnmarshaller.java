/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DeleteQueuedReservedInstancesResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteQueuedReservedInstancesResultStaxUnmarshaller implements Unmarshaller<DeleteQueuedReservedInstancesResult, StaxUnmarshallerContext> {

    public DeleteQueuedReservedInstancesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DeleteQueuedReservedInstancesResult deleteQueuedReservedInstancesResult = new DeleteQueuedReservedInstancesResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return deleteQueuedReservedInstancesResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("successfulQueuedPurchaseDeletionSet", targetDepth)) {
                    deleteQueuedReservedInstancesResult.withSuccessfulQueuedPurchaseDeletions(new ArrayList<SuccessfulQueuedPurchaseDeletion>());
                    continue;
                }

                if (context.testExpression("successfulQueuedPurchaseDeletionSet/item", targetDepth)) {
                    deleteQueuedReservedInstancesResult.withSuccessfulQueuedPurchaseDeletions(SuccessfulQueuedPurchaseDeletionStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("failedQueuedPurchaseDeletionSet", targetDepth)) {
                    deleteQueuedReservedInstancesResult.withFailedQueuedPurchaseDeletions(new ArrayList<FailedQueuedPurchaseDeletion>());
                    continue;
                }

                if (context.testExpression("failedQueuedPurchaseDeletionSet/item", targetDepth)) {
                    deleteQueuedReservedInstancesResult.withFailedQueuedPurchaseDeletions(FailedQueuedPurchaseDeletionStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return deleteQueuedReservedInstancesResult;
                }
            }
        }
    }

    private static DeleteQueuedReservedInstancesResultStaxUnmarshaller instance;

    public static DeleteQueuedReservedInstancesResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteQueuedReservedInstancesResultStaxUnmarshaller();
        return instance;
    }
}
