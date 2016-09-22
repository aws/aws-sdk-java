/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.identitymanagement.model.transform;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * UpdateAccountPasswordPolicyResult StAX Unmarshaller
 */
public class UpdateAccountPasswordPolicyResultStaxUnmarshaller implements Unmarshaller<UpdateAccountPasswordPolicyResult, StaxUnmarshallerContext> {

    public UpdateAccountPasswordPolicyResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        UpdateAccountPasswordPolicyResult updateAccountPasswordPolicyResult = new UpdateAccountPasswordPolicyResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return updateAccountPasswordPolicyResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return updateAccountPasswordPolicyResult;
                }
            }
        }
    }

    private static UpdateAccountPasswordPolicyResultStaxUnmarshaller instance;

    public static UpdateAccountPasswordPolicyResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateAccountPasswordPolicyResultStaxUnmarshaller();
        return instance;
    }
}
