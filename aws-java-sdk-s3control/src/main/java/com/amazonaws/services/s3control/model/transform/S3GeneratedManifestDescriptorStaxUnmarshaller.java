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
package com.amazonaws.services.s3control.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.s3control.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * S3GeneratedManifestDescriptor StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3GeneratedManifestDescriptorStaxUnmarshaller implements Unmarshaller<S3GeneratedManifestDescriptor, StaxUnmarshallerContext> {

    public S3GeneratedManifestDescriptor unmarshall(StaxUnmarshallerContext context) throws Exception {
        S3GeneratedManifestDescriptor s3GeneratedManifestDescriptor = new S3GeneratedManifestDescriptor();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return s3GeneratedManifestDescriptor;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Format", targetDepth)) {
                    s3GeneratedManifestDescriptor.setFormat(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Location", targetDepth)) {
                    s3GeneratedManifestDescriptor.setLocation(JobManifestLocationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return s3GeneratedManifestDescriptor;
                }
            }
        }
    }

    private static S3GeneratedManifestDescriptorStaxUnmarshaller instance;

    public static S3GeneratedManifestDescriptorStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new S3GeneratedManifestDescriptorStaxUnmarshaller();
        return instance;
    }
}
