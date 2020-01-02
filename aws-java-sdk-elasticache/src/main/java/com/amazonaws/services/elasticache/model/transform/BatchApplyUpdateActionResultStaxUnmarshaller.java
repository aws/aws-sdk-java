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
package com.amazonaws.services.elasticache.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * BatchApplyUpdateActionResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchApplyUpdateActionResultStaxUnmarshaller implements Unmarshaller<BatchApplyUpdateActionResult, StaxUnmarshallerContext> {

    public BatchApplyUpdateActionResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        BatchApplyUpdateActionResult batchApplyUpdateActionResult = new BatchApplyUpdateActionResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return batchApplyUpdateActionResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ProcessedUpdateActions", targetDepth)) {
                    batchApplyUpdateActionResult.withProcessedUpdateActions(new ArrayList<ProcessedUpdateAction>());
                    continue;
                }

                if (context.testExpression("ProcessedUpdateActions/ProcessedUpdateAction", targetDepth)) {
                    batchApplyUpdateActionResult.withProcessedUpdateActions(ProcessedUpdateActionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("UnprocessedUpdateActions", targetDepth)) {
                    batchApplyUpdateActionResult.withUnprocessedUpdateActions(new ArrayList<UnprocessedUpdateAction>());
                    continue;
                }

                if (context.testExpression("UnprocessedUpdateActions/UnprocessedUpdateAction", targetDepth)) {
                    batchApplyUpdateActionResult.withUnprocessedUpdateActions(UnprocessedUpdateActionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return batchApplyUpdateActionResult;
                }
            }
        }
    }

    private static BatchApplyUpdateActionResultStaxUnmarshaller instance;

    public static BatchApplyUpdateActionResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchApplyUpdateActionResultStaxUnmarshaller();
        return instance;
    }
}
