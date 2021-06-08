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
package com.amazonaws.services.route53.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * KeySigningKey StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KeySigningKeyStaxUnmarshaller implements Unmarshaller<KeySigningKey, StaxUnmarshallerContext> {

    public KeySigningKey unmarshall(StaxUnmarshallerContext context) throws Exception {
        KeySigningKey keySigningKey = new KeySigningKey();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return keySigningKey;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Name", targetDepth)) {
                    keySigningKey.setName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("KmsArn", targetDepth)) {
                    keySigningKey.setKmsArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Flag", targetDepth)) {
                    keySigningKey.setFlag(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SigningAlgorithmMnemonic", targetDepth)) {
                    keySigningKey.setSigningAlgorithmMnemonic(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SigningAlgorithmType", targetDepth)) {
                    keySigningKey.setSigningAlgorithmType(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DigestAlgorithmMnemonic", targetDepth)) {
                    keySigningKey.setDigestAlgorithmMnemonic(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DigestAlgorithmType", targetDepth)) {
                    keySigningKey.setDigestAlgorithmType(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("KeyTag", targetDepth)) {
                    keySigningKey.setKeyTag(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DigestValue", targetDepth)) {
                    keySigningKey.setDigestValue(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PublicKey", targetDepth)) {
                    keySigningKey.setPublicKey(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DSRecord", targetDepth)) {
                    keySigningKey.setDSRecord(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DNSKEYRecord", targetDepth)) {
                    keySigningKey.setDNSKEYRecord(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    keySigningKey.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StatusMessage", targetDepth)) {
                    keySigningKey.setStatusMessage(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CreatedDate", targetDepth)) {
                    keySigningKey.setCreatedDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("LastModifiedDate", targetDepth)) {
                    keySigningKey.setLastModifiedDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return keySigningKey;
                }
            }
        }
    }

    private static KeySigningKeyStaxUnmarshaller instance;

    public static KeySigningKeyStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new KeySigningKeyStaxUnmarshaller();
        return instance;
    }
}
