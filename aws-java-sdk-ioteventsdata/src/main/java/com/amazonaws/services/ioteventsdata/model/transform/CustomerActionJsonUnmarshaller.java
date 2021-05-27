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
package com.amazonaws.services.ioteventsdata.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ioteventsdata.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CustomerAction JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomerActionJsonUnmarshaller implements Unmarshaller<CustomerAction, JsonUnmarshallerContext> {

    public CustomerAction unmarshall(JsonUnmarshallerContext context) throws Exception {
        CustomerAction customerAction = new CustomerAction();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("actionName", targetDepth)) {
                    context.nextToken();
                    customerAction.setActionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("snoozeActionConfiguration", targetDepth)) {
                    context.nextToken();
                    customerAction.setSnoozeActionConfiguration(SnoozeActionConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("enableActionConfiguration", targetDepth)) {
                    context.nextToken();
                    customerAction.setEnableActionConfiguration(EnableActionConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("disableActionConfiguration", targetDepth)) {
                    context.nextToken();
                    customerAction.setDisableActionConfiguration(DisableActionConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("acknowledgeActionConfiguration", targetDepth)) {
                    context.nextToken();
                    customerAction.setAcknowledgeActionConfiguration(AcknowledgeActionConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("resetActionConfiguration", targetDepth)) {
                    context.nextToken();
                    customerAction.setResetActionConfiguration(ResetActionConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return customerAction;
    }

    private static CustomerActionJsonUnmarshaller instance;

    public static CustomerActionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CustomerActionJsonUnmarshaller();
        return instance;
    }
}
