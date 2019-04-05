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
 * SendMessageBatchResultEntry StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendMessageBatchResultEntryStaxUnmarshaller implements Unmarshaller<SendMessageBatchResultEntry, StaxUnmarshallerContext> {

    public SendMessageBatchResultEntry unmarshall(StaxUnmarshallerContext context) throws Exception {
        SendMessageBatchResultEntry sendMessageBatchResultEntry = new SendMessageBatchResultEntry();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return sendMessageBatchResultEntry;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Id", targetDepth)) {
                    sendMessageBatchResultEntry.setId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MessageId", targetDepth)) {
                    sendMessageBatchResultEntry.setMessageId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MD5OfMessageBody", targetDepth)) {
                    sendMessageBatchResultEntry.setMD5OfMessageBody(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MD5OfMessageAttributes", targetDepth)) {
                    sendMessageBatchResultEntry.setMD5OfMessageAttributes(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SequenceNumber", targetDepth)) {
                    sendMessageBatchResultEntry.setSequenceNumber(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return sendMessageBatchResultEntry;
                }
            }
        }
    }

    private static SendMessageBatchResultEntryStaxUnmarshaller instance;

    public static SendMessageBatchResultEntryStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new SendMessageBatchResultEntryStaxUnmarshaller();
        return instance;
    }
}
