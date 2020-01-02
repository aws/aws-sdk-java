/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatch.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DisableInsightRulesResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisableInsightRulesResultStaxUnmarshaller implements Unmarshaller<DisableInsightRulesResult, StaxUnmarshallerContext> {

    public DisableInsightRulesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DisableInsightRulesResult disableInsightRulesResult = new DisableInsightRulesResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return disableInsightRulesResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Failures", targetDepth)) {
                    disableInsightRulesResult.withFailures(new ArrayList<PartialFailure>());
                    continue;
                }

                if (context.testExpression("Failures/member", targetDepth)) {
                    disableInsightRulesResult.withFailures(PartialFailureStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return disableInsightRulesResult;
                }
            }
        }
    }

    private static DisableInsightRulesResultStaxUnmarshaller instance;

    public static DisableInsightRulesResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DisableInsightRulesResultStaxUnmarshaller();
        return instance;
    }
}
