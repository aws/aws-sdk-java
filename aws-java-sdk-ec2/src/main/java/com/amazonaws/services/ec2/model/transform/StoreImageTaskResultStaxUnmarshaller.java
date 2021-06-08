/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * StoreImageTaskResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StoreImageTaskResultStaxUnmarshaller implements Unmarshaller<StoreImageTaskResult, StaxUnmarshallerContext> {

    public StoreImageTaskResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        StoreImageTaskResult storeImageTaskResult = new StoreImageTaskResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return storeImageTaskResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("amiId", targetDepth)) {
                    storeImageTaskResult.setAmiId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("taskStartTime", targetDepth)) {
                    storeImageTaskResult.setTaskStartTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("bucket", targetDepth)) {
                    storeImageTaskResult.setBucket(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("s3objectKey", targetDepth)) {
                    storeImageTaskResult.setS3objectKey(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("progressPercentage", targetDepth)) {
                    storeImageTaskResult.setProgressPercentage(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("storeTaskState", targetDepth)) {
                    storeImageTaskResult.setStoreTaskState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("storeTaskFailureReason", targetDepth)) {
                    storeImageTaskResult.setStoreTaskFailureReason(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return storeImageTaskResult;
                }
            }
        }
    }

    private static StoreImageTaskResultStaxUnmarshaller instance;

    public static StoreImageTaskResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new StoreImageTaskResultStaxUnmarshaller();
        return instance;
    }
}
