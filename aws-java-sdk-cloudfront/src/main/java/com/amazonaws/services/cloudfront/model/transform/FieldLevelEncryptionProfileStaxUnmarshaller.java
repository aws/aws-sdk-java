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
 * FieldLevelEncryptionProfile StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldLevelEncryptionProfileStaxUnmarshaller implements Unmarshaller<FieldLevelEncryptionProfile, StaxUnmarshallerContext> {

    public FieldLevelEncryptionProfile unmarshall(StaxUnmarshallerContext context) throws Exception {
        FieldLevelEncryptionProfile fieldLevelEncryptionProfile = new FieldLevelEncryptionProfile();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return fieldLevelEncryptionProfile;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Id", targetDepth)) {
                    fieldLevelEncryptionProfile.setId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    fieldLevelEncryptionProfile.setLastModifiedTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("FieldLevelEncryptionProfileConfig", targetDepth)) {
                    fieldLevelEncryptionProfile.setFieldLevelEncryptionProfileConfig(FieldLevelEncryptionProfileConfigStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return fieldLevelEncryptionProfile;
                }
            }
        }
    }

    private static FieldLevelEncryptionProfileStaxUnmarshaller instance;

    public static FieldLevelEncryptionProfileStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new FieldLevelEncryptionProfileStaxUnmarshaller();
        return instance;
    }
}
