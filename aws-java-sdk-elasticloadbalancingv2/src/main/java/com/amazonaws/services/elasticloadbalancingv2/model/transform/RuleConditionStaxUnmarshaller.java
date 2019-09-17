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
package com.amazonaws.services.elasticloadbalancingv2.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticloadbalancingv2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * RuleCondition StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleConditionStaxUnmarshaller implements Unmarshaller<RuleCondition, StaxUnmarshallerContext> {

    public RuleCondition unmarshall(StaxUnmarshallerContext context) throws Exception {
        RuleCondition ruleCondition = new RuleCondition();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return ruleCondition;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Field", targetDepth)) {
                    ruleCondition.setField(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Values", targetDepth)) {
                    ruleCondition.withValues(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("Values/member", targetDepth)) {
                    ruleCondition.withValues(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("HostHeaderConfig", targetDepth)) {
                    ruleCondition.setHostHeaderConfig(HostHeaderConditionConfigStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PathPatternConfig", targetDepth)) {
                    ruleCondition.setPathPatternConfig(PathPatternConditionConfigStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("HttpHeaderConfig", targetDepth)) {
                    ruleCondition.setHttpHeaderConfig(HttpHeaderConditionConfigStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("QueryStringConfig", targetDepth)) {
                    ruleCondition.setQueryStringConfig(QueryStringConditionConfigStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("HttpRequestMethodConfig", targetDepth)) {
                    ruleCondition.setHttpRequestMethodConfig(HttpRequestMethodConditionConfigStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SourceIpConfig", targetDepth)) {
                    ruleCondition.setSourceIpConfig(SourceIpConditionConfigStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return ruleCondition;
                }
            }
        }
    }

    private static RuleConditionStaxUnmarshaller instance;

    public static RuleConditionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new RuleConditionStaxUnmarshaller();
        return instance;
    }
}
