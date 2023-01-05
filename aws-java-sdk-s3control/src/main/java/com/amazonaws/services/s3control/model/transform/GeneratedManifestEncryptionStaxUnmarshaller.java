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
 * GeneratedManifestEncryption StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GeneratedManifestEncryptionStaxUnmarshaller implements Unmarshaller<GeneratedManifestEncryption, StaxUnmarshallerContext> {

    public GeneratedManifestEncryption unmarshall(StaxUnmarshallerContext context) throws Exception {
        GeneratedManifestEncryption generatedManifestEncryption = new GeneratedManifestEncryption();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return generatedManifestEncryption;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("SSE-S3", targetDepth)) {
                    generatedManifestEncryption.setSSES3(SSES3EncryptionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SSE-KMS", targetDepth)) {
                    generatedManifestEncryption.setSSEKMS(SSEKMSEncryptionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return generatedManifestEncryption;
                }
            }
        }
    }

    private static GeneratedManifestEncryptionStaxUnmarshaller instance;

    public static GeneratedManifestEncryptionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GeneratedManifestEncryptionStaxUnmarshaller();
        return instance;
    }
}
