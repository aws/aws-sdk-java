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
package com.amazonaws.services.simpleemail.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DescribeActiveReceiptRuleSetResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeActiveReceiptRuleSetResultStaxUnmarshaller implements Unmarshaller<DescribeActiveReceiptRuleSetResult, StaxUnmarshallerContext> {

    public DescribeActiveReceiptRuleSetResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeActiveReceiptRuleSetResult describeActiveReceiptRuleSetResult = new DescribeActiveReceiptRuleSetResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeActiveReceiptRuleSetResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Metadata", targetDepth)) {
                    describeActiveReceiptRuleSetResult.setMetadata(ReceiptRuleSetMetadataStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Rules", targetDepth)) {
                    describeActiveReceiptRuleSetResult.withRules(new ArrayList<ReceiptRule>());
                    continue;
                }

                if (context.testExpression("Rules/member", targetDepth)) {
                    describeActiveReceiptRuleSetResult.withRules(ReceiptRuleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeActiveReceiptRuleSetResult;
                }
            }
        }
    }

    private static DescribeActiveReceiptRuleSetResultStaxUnmarshaller instance;

    public static DescribeActiveReceiptRuleSetResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeActiveReceiptRuleSetResultStaxUnmarshaller();
        return instance;
    }
}
