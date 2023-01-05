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
 * S3JobManifestGenerator StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3JobManifestGeneratorStaxUnmarshaller implements Unmarshaller<S3JobManifestGenerator, StaxUnmarshallerContext> {

    public S3JobManifestGenerator unmarshall(StaxUnmarshallerContext context) throws Exception {
        S3JobManifestGenerator s3JobManifestGenerator = new S3JobManifestGenerator();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return s3JobManifestGenerator;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ExpectedBucketOwner", targetDepth)) {
                    s3JobManifestGenerator.setExpectedBucketOwner(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SourceBucket", targetDepth)) {
                    s3JobManifestGenerator.setSourceBucket(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ManifestOutputLocation", targetDepth)) {
                    s3JobManifestGenerator.setManifestOutputLocation(S3ManifestOutputLocationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Filter", targetDepth)) {
                    s3JobManifestGenerator.setFilter(JobManifestGeneratorFilterStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EnableManifestOutput", targetDepth)) {
                    s3JobManifestGenerator.setEnableManifestOutput(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return s3JobManifestGenerator;
                }
            }
        }
    }

    private static S3JobManifestGeneratorStaxUnmarshaller instance;

    public static S3JobManifestGeneratorStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new S3JobManifestGeneratorStaxUnmarshaller();
        return instance;
    }
}
