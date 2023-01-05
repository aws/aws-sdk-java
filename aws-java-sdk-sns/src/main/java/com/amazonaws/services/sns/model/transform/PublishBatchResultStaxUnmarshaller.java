/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sns.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.sns.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * PublishBatchResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublishBatchResultStaxUnmarshaller implements Unmarshaller<PublishBatchResult, StaxUnmarshallerContext> {

    public PublishBatchResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        PublishBatchResult publishBatchResult = new PublishBatchResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return publishBatchResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Successful", targetDepth)) {
                    publishBatchResult.withSuccessful(new ArrayList<PublishBatchResultEntry>());
                    continue;
                }

                if (context.testExpression("Successful/member", targetDepth)) {
                    publishBatchResult.withSuccessful(PublishBatchResultEntryStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Failed", targetDepth)) {
                    publishBatchResult.withFailed(new ArrayList<BatchResultErrorEntry>());
                    continue;
                }

                if (context.testExpression("Failed/member", targetDepth)) {
                    publishBatchResult.withFailed(BatchResultErrorEntryStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return publishBatchResult;
                }
            }
        }
    }

    private static PublishBatchResultStaxUnmarshaller instance;

    public static PublishBatchResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new PublishBatchResultStaxUnmarshaller();
        return instance;
    }
}
