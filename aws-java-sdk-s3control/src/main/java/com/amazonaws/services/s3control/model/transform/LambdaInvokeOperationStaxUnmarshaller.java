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

import java.util.Map;

import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.s3control.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * LambdaInvokeOperation StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaInvokeOperationStaxUnmarshaller implements Unmarshaller<LambdaInvokeOperation, StaxUnmarshallerContext> {

    private static class UserArgumentsMapEntryUnmarshaller implements Unmarshaller<Map.Entry<String, String>, StaxUnmarshallerContext> {

        @Override
        public Entry<String, String> unmarshall(StaxUnmarshallerContext context) throws Exception {
            int originalDepth = context.getCurrentDepth();
            int targetDepth = originalDepth + 1;

            MapEntry<String, String> entry = new MapEntry<String, String>();

            while (true) {
                XMLEvent xmlEvent = context.nextEvent();
                if (xmlEvent.isEndDocument())
                    return entry;

                if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                    if (context.testExpression("key", targetDepth)) {
                        entry.setKey(StringStaxUnmarshaller.getInstance().unmarshall(context));
                        continue;
                    }
                    if (context.testExpression("value", targetDepth)) {
                        entry.setValue(StringStaxUnmarshaller.getInstance().unmarshall(context));
                        continue;
                    }
                } else if (xmlEvent.isEndElement()) {
                    if (context.getCurrentDepth() < originalDepth)
                        return entry;
                }
            }
        }

        private static UserArgumentsMapEntryUnmarshaller instance;

        public static UserArgumentsMapEntryUnmarshaller getInstance() {
            if (instance == null)
                instance = new UserArgumentsMapEntryUnmarshaller();
            return instance;
        }

    }

    public LambdaInvokeOperation unmarshall(StaxUnmarshallerContext context) throws Exception {
        LambdaInvokeOperation lambdaInvokeOperation = new LambdaInvokeOperation();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return lambdaInvokeOperation;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("FunctionArn", targetDepth)) {
                    lambdaInvokeOperation.setFunctionArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("InvocationSchemaVersion", targetDepth)) {
                    lambdaInvokeOperation.setInvocationSchemaVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("UserArguments/entry", targetDepth)) {
                    Entry<String, String> entry = UserArgumentsMapEntryUnmarshaller.getInstance().unmarshall(context);
                    lambdaInvokeOperation.addUserArgumentsEntry(entry.getKey(), entry.getValue());
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return lambdaInvokeOperation;
                }
            }
        }
    }

    private static LambdaInvokeOperationStaxUnmarshaller instance;

    public static LambdaInvokeOperationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new LambdaInvokeOperationStaxUnmarshaller();
        return instance;
    }
}
