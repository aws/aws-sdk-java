/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * KeyNameConstraint StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KeyNameConstraintStaxUnmarshaller implements Unmarshaller<KeyNameConstraint, StaxUnmarshallerContext> {

    public KeyNameConstraint unmarshall(StaxUnmarshallerContext context) throws Exception {
        KeyNameConstraint keyNameConstraint = new KeyNameConstraint();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return keyNameConstraint;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("MatchAnyPrefix", targetDepth)) {
                    keyNameConstraint.withMatchAnyPrefix(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("MatchAnyPrefix/member", targetDepth)) {
                    keyNameConstraint.withMatchAnyPrefix(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MatchAnySuffix", targetDepth)) {
                    keyNameConstraint.withMatchAnySuffix(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("MatchAnySuffix/member", targetDepth)) {
                    keyNameConstraint.withMatchAnySuffix(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MatchAnySubstring", targetDepth)) {
                    keyNameConstraint.withMatchAnySubstring(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("MatchAnySubstring/member", targetDepth)) {
                    keyNameConstraint.withMatchAnySubstring(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return keyNameConstraint;
                }
            }
        }
    }

    private static KeyNameConstraintStaxUnmarshaller instance;

    public static KeyNameConstraintStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new KeyNameConstraintStaxUnmarshaller();
        return instance;
    }
}
