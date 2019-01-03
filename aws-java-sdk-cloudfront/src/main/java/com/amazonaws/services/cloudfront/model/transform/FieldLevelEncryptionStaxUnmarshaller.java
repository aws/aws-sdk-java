/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * FieldLevelEncryption StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldLevelEncryptionStaxUnmarshaller implements Unmarshaller<FieldLevelEncryption, StaxUnmarshallerContext> {

    public FieldLevelEncryption unmarshall(StaxUnmarshallerContext context) throws Exception {
        FieldLevelEncryption fieldLevelEncryption = new FieldLevelEncryption();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return fieldLevelEncryption;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Id", targetDepth)) {
                    fieldLevelEncryption.setId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    fieldLevelEncryption.setLastModifiedTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("FieldLevelEncryptionConfig", targetDepth)) {
                    fieldLevelEncryption.setFieldLevelEncryptionConfig(FieldLevelEncryptionConfigStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return fieldLevelEncryption;
                }
            }
        }
    }

    private static FieldLevelEncryptionStaxUnmarshaller instance;

    public static FieldLevelEncryptionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new FieldLevelEncryptionStaxUnmarshaller();
        return instance;
    }
}
