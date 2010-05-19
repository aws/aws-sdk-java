/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.sqs.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.sqs.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * Change Message Visibility Request StAX Unmarshaller
 */
public class ChangeMessageVisibilityRequestStaxUnmarshaller implements Unmarshaller<ChangeMessageVisibilityRequest, StaxUnmarshallerContext> {

    

    public ChangeMessageVisibilityRequest unmarshall(StaxUnmarshallerContext context) throws Exception {
        ChangeMessageVisibilityRequest changeMessageVisibilityRequest = new ChangeMessageVisibilityRequest();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        
        if (context.isStartOfDocument()) targetDepth += 2;

        while (true) {
            XMLEvent event = context.nextEvent();
            if (event.isEndDocument()) return changeMessageVisibilityRequest;

            if (event.isAttribute() || event.isStartElement()) {
                if (context.testExpression("QueueUrl", targetDepth)) {
                    changeMessageVisibilityRequest.setQueueUrl(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ReceiptHandle", targetDepth)) {
                    changeMessageVisibilityRequest.setReceiptHandle(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("VisibilityTimeout", targetDepth)) {
                    changeMessageVisibilityRequest.setVisibilityTimeout(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (event.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return changeMessageVisibilityRequest;
                }
            }
        }
    }

    private static ChangeMessageVisibilityRequestStaxUnmarshaller instance;
    public static ChangeMessageVisibilityRequestStaxUnmarshaller getInstance() {
        if (instance == null) instance = new ChangeMessageVisibilityRequestStaxUnmarshaller();
        return instance;
    }
}
    