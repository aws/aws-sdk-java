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
package com.amazonaws.services.elasticbeanstalk.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ApplyEnvironmentManagedActionResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplyEnvironmentManagedActionResultStaxUnmarshaller implements Unmarshaller<ApplyEnvironmentManagedActionResult, StaxUnmarshallerContext> {

    public ApplyEnvironmentManagedActionResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ApplyEnvironmentManagedActionResult applyEnvironmentManagedActionResult = new ApplyEnvironmentManagedActionResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return applyEnvironmentManagedActionResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ActionId", targetDepth)) {
                    applyEnvironmentManagedActionResult.setActionId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ActionDescription", targetDepth)) {
                    applyEnvironmentManagedActionResult.setActionDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ActionType", targetDepth)) {
                    applyEnvironmentManagedActionResult.setActionType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    applyEnvironmentManagedActionResult.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return applyEnvironmentManagedActionResult;
                }
            }
        }
    }

    private static ApplyEnvironmentManagedActionResultStaxUnmarshaller instance;

    public static ApplyEnvironmentManagedActionResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ApplyEnvironmentManagedActionResultStaxUnmarshaller();
        return instance;
    }
}
