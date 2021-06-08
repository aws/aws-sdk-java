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
package com.amazonaws.services.cloudfront.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * TestResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestResultStaxUnmarshaller implements Unmarshaller<TestResult, StaxUnmarshallerContext> {

    public TestResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        TestResult testResult = new TestResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return testResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("FunctionSummary", targetDepth)) {
                    testResult.setFunctionSummary(FunctionSummaryStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ComputeUtilization", targetDepth)) {
                    testResult.setComputeUtilization(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("FunctionExecutionLogs", targetDepth)) {
                    testResult.withFunctionExecutionLogs(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("FunctionExecutionLogs/member", targetDepth)) {
                    testResult.withFunctionExecutionLogs(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("FunctionErrorMessage", targetDepth)) {
                    testResult.setFunctionErrorMessage(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("FunctionOutput", targetDepth)) {
                    testResult.setFunctionOutput(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return testResult;
                }
            }
        }
    }

    private static TestResultStaxUnmarshaller instance;

    public static TestResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new TestResultStaxUnmarshaller();
        return instance;
    }
}
