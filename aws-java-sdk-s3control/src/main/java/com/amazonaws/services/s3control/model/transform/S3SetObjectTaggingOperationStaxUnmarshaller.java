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
package com.amazonaws.services.s3control.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.s3control.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * S3SetObjectTaggingOperation StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3SetObjectTaggingOperationStaxUnmarshaller implements Unmarshaller<S3SetObjectTaggingOperation, StaxUnmarshallerContext> {

    public S3SetObjectTaggingOperation unmarshall(StaxUnmarshallerContext context) throws Exception {
        S3SetObjectTaggingOperation s3SetObjectTaggingOperation = new S3SetObjectTaggingOperation();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return s3SetObjectTaggingOperation;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("TagSet", targetDepth)) {
                    s3SetObjectTaggingOperation.withTagSet(new ArrayList<S3Tag>());
                    continue;
                }

                if (context.testExpression("TagSet/member", targetDepth)) {
                    s3SetObjectTaggingOperation.withTagSet(S3TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return s3SetObjectTaggingOperation;
                }
            }
        }
    }

    private static S3SetObjectTaggingOperationStaxUnmarshaller instance;

    public static S3SetObjectTaggingOperationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new S3SetObjectTaggingOperationStaxUnmarshaller();
        return instance;
    }
}
