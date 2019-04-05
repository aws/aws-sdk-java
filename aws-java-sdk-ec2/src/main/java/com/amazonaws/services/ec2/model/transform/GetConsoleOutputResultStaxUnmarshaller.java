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
package com.amazonaws.services.ec2.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * GetConsoleOutputResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetConsoleOutputResultStaxUnmarshaller implements Unmarshaller<GetConsoleOutputResult, StaxUnmarshallerContext> {

    public GetConsoleOutputResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        GetConsoleOutputResult getConsoleOutputResult = new GetConsoleOutputResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return getConsoleOutputResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("instanceId", targetDepth)) {
                    getConsoleOutputResult.setInstanceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("output", targetDepth)) {
                    getConsoleOutputResult.setOutput(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("timestamp", targetDepth)) {
                    getConsoleOutputResult.setTimestamp(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return getConsoleOutputResult;
                }
            }
        }
    }

    private static GetConsoleOutputResultStaxUnmarshaller instance;

    public static GetConsoleOutputResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetConsoleOutputResultStaxUnmarshaller();
        return instance;
    }
}
