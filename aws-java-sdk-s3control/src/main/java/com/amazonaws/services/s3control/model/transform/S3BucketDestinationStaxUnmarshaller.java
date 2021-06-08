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
 * S3BucketDestination StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3BucketDestinationStaxUnmarshaller implements Unmarshaller<S3BucketDestination, StaxUnmarshallerContext> {

    public S3BucketDestination unmarshall(StaxUnmarshallerContext context) throws Exception {
        S3BucketDestination s3BucketDestination = new S3BucketDestination();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return s3BucketDestination;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Format", targetDepth)) {
                    s3BucketDestination.setFormat(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("OutputSchemaVersion", targetDepth)) {
                    s3BucketDestination.setOutputSchemaVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AccountId", targetDepth)) {
                    s3BucketDestination.setAccountId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Arn", targetDepth)) {
                    s3BucketDestination.setArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Prefix", targetDepth)) {
                    s3BucketDestination.setPrefix(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Encryption", targetDepth)) {
                    s3BucketDestination.setEncryption(StorageLensDataExportEncryptionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return s3BucketDestination;
                }
            }
        }
    }

    private static S3BucketDestinationStaxUnmarshaller instance;

    public static S3BucketDestinationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new S3BucketDestinationStaxUnmarshaller();
        return instance;
    }
}
