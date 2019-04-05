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
package com.amazonaws.services.simpleemail.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ReceiptAction StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReceiptActionStaxUnmarshaller implements Unmarshaller<ReceiptAction, StaxUnmarshallerContext> {

    public ReceiptAction unmarshall(StaxUnmarshallerContext context) throws Exception {
        ReceiptAction receiptAction = new ReceiptAction();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return receiptAction;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("S3Action", targetDepth)) {
                    receiptAction.setS3Action(S3ActionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("BounceAction", targetDepth)) {
                    receiptAction.setBounceAction(BounceActionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("WorkmailAction", targetDepth)) {
                    receiptAction.setWorkmailAction(WorkmailActionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LambdaAction", targetDepth)) {
                    receiptAction.setLambdaAction(LambdaActionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StopAction", targetDepth)) {
                    receiptAction.setStopAction(StopActionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AddHeaderAction", targetDepth)) {
                    receiptAction.setAddHeaderAction(AddHeaderActionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SNSAction", targetDepth)) {
                    receiptAction.setSNSAction(SNSActionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return receiptAction;
                }
            }
        }
    }

    private static ReceiptActionStaxUnmarshaller instance;

    public static ReceiptActionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReceiptActionStaxUnmarshaller();
        return instance;
    }
}
