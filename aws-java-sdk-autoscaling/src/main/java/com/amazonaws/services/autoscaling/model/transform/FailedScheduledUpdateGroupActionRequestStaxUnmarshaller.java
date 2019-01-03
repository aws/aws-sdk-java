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
package com.amazonaws.services.autoscaling.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * FailedScheduledUpdateGroupActionRequest StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailedScheduledUpdateGroupActionRequestStaxUnmarshaller implements Unmarshaller<FailedScheduledUpdateGroupActionRequest, StaxUnmarshallerContext> {

    public FailedScheduledUpdateGroupActionRequest unmarshall(StaxUnmarshallerContext context) throws Exception {
        FailedScheduledUpdateGroupActionRequest failedScheduledUpdateGroupActionRequest = new FailedScheduledUpdateGroupActionRequest();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return failedScheduledUpdateGroupActionRequest;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ScheduledActionName", targetDepth)) {
                    failedScheduledUpdateGroupActionRequest.setScheduledActionName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ErrorCode", targetDepth)) {
                    failedScheduledUpdateGroupActionRequest.setErrorCode(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ErrorMessage", targetDepth)) {
                    failedScheduledUpdateGroupActionRequest.setErrorMessage(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return failedScheduledUpdateGroupActionRequest;
                }
            }
        }
    }

    private static FailedScheduledUpdateGroupActionRequestStaxUnmarshaller instance;

    public static FailedScheduledUpdateGroupActionRequestStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new FailedScheduledUpdateGroupActionRequestStaxUnmarshaller();
        return instance;
    }
}
