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
package com.amazonaws.services.sqs.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.sqs.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ChangeMessageVisibilityBatchResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChangeMessageVisibilityBatchResultStaxUnmarshaller implements Unmarshaller<ChangeMessageVisibilityBatchResult, StaxUnmarshallerContext> {

    public ChangeMessageVisibilityBatchResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ChangeMessageVisibilityBatchResult changeMessageVisibilityBatchResult = new ChangeMessageVisibilityBatchResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return changeMessageVisibilityBatchResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ChangeMessageVisibilityBatchResultEntry", targetDepth)) {
                    changeMessageVisibilityBatchResult
                            .withSuccessful(ChangeMessageVisibilityBatchResultEntryStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("BatchResultErrorEntry", targetDepth)) {
                    changeMessageVisibilityBatchResult.withFailed(BatchResultErrorEntryStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return changeMessageVisibilityBatchResult;
                }
            }
        }
    }

    private static ChangeMessageVisibilityBatchResultStaxUnmarshaller instance;

    public static ChangeMessageVisibilityBatchResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ChangeMessageVisibilityBatchResultStaxUnmarshaller();
        return instance;
    }
}
