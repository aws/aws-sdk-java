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
 * BatchResultErrorEntry StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchResultErrorEntryStaxUnmarshaller implements Unmarshaller<BatchResultErrorEntry, StaxUnmarshallerContext> {

    public BatchResultErrorEntry unmarshall(StaxUnmarshallerContext context) throws Exception {
        BatchResultErrorEntry batchResultErrorEntry = new BatchResultErrorEntry();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return batchResultErrorEntry;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Id", targetDepth)) {
                    batchResultErrorEntry.setId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SenderFault", targetDepth)) {
                    batchResultErrorEntry.setSenderFault(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Code", targetDepth)) {
                    batchResultErrorEntry.setCode(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Message", targetDepth)) {
                    batchResultErrorEntry.setMessage(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return batchResultErrorEntry;
                }
            }
        }
    }

    private static BatchResultErrorEntryStaxUnmarshaller instance;

    public static BatchResultErrorEntryStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchResultErrorEntryStaxUnmarshaller();
        return instance;
    }
}
