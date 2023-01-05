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
 * S3ManifestOutputLocation StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3ManifestOutputLocationStaxUnmarshaller implements Unmarshaller<S3ManifestOutputLocation, StaxUnmarshallerContext> {

    public S3ManifestOutputLocation unmarshall(StaxUnmarshallerContext context) throws Exception {
        S3ManifestOutputLocation s3ManifestOutputLocation = new S3ManifestOutputLocation();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return s3ManifestOutputLocation;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ExpectedManifestBucketOwner", targetDepth)) {
                    s3ManifestOutputLocation.setExpectedManifestBucketOwner(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Bucket", targetDepth)) {
                    s3ManifestOutputLocation.setBucket(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ManifestPrefix", targetDepth)) {
                    s3ManifestOutputLocation.setManifestPrefix(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ManifestEncryption", targetDepth)) {
                    s3ManifestOutputLocation.setManifestEncryption(GeneratedManifestEncryptionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ManifestFormat", targetDepth)) {
                    s3ManifestOutputLocation.setManifestFormat(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return s3ManifestOutputLocation;
                }
            }
        }
    }

    private static S3ManifestOutputLocationStaxUnmarshaller instance;

    public static S3ManifestOutputLocationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new S3ManifestOutputLocationStaxUnmarshaller();
        return instance;
    }
}
