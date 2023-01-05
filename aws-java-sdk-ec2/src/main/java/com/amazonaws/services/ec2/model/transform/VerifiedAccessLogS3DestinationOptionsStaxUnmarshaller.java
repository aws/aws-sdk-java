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
package com.amazonaws.services.ec2.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * VerifiedAccessLogS3DestinationOptions StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerifiedAccessLogS3DestinationOptionsStaxUnmarshaller implements Unmarshaller<VerifiedAccessLogS3DestinationOptions, StaxUnmarshallerContext> {

    public VerifiedAccessLogS3DestinationOptions unmarshall(StaxUnmarshallerContext context) throws Exception {
        VerifiedAccessLogS3DestinationOptions verifiedAccessLogS3DestinationOptions = new VerifiedAccessLogS3DestinationOptions();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return verifiedAccessLogS3DestinationOptions;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Enabled", targetDepth)) {
                    verifiedAccessLogS3DestinationOptions.setEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("BucketName", targetDepth)) {
                    verifiedAccessLogS3DestinationOptions.setBucketName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Prefix", targetDepth)) {
                    verifiedAccessLogS3DestinationOptions.setPrefix(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("BucketOwner", targetDepth)) {
                    verifiedAccessLogS3DestinationOptions.setBucketOwner(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return verifiedAccessLogS3DestinationOptions;
                }
            }
        }
    }

    private static VerifiedAccessLogS3DestinationOptionsStaxUnmarshaller instance;

    public static VerifiedAccessLogS3DestinationOptionsStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new VerifiedAccessLogS3DestinationOptionsStaxUnmarshaller();
        return instance;
    }
}
