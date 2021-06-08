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
package com.amazonaws.services.s3control.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.s3control.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * CreateBucketResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBucketResultStaxUnmarshaller implements Unmarshaller<CreateBucketResult, StaxUnmarshallerContext> {

    public CreateBucketResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        CreateBucketResult createBucketResult = new CreateBucketResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        if (context.isStartOfDocument()) {
            context.setCurrentHeader("Location");
            createBucketResult.setLocation(StringStaxUnmarshaller.getInstance().unmarshall(context));

        }

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return createBucketResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("BucketArn", targetDepth)) {
                    createBucketResult.setBucketArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return createBucketResult;
                }
            }
        }
    }

    private static CreateBucketResultStaxUnmarshaller instance;

    public static CreateBucketResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateBucketResultStaxUnmarshaller();
        return instance;
    }
}
