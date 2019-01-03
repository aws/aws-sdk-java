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
package com.amazonaws.services.identitymanagement.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * GetContextKeysForPrincipalPolicyResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetContextKeysForPrincipalPolicyResultStaxUnmarshaller implements Unmarshaller<GetContextKeysForPrincipalPolicyResult, StaxUnmarshallerContext> {

    public GetContextKeysForPrincipalPolicyResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        GetContextKeysForPrincipalPolicyResult getContextKeysForPrincipalPolicyResult = new GetContextKeysForPrincipalPolicyResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return getContextKeysForPrincipalPolicyResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ContextKeyNames", targetDepth)) {
                    getContextKeysForPrincipalPolicyResult.withContextKeyNames(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("ContextKeyNames/member", targetDepth)) {
                    getContextKeysForPrincipalPolicyResult.withContextKeyNames(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return getContextKeysForPrincipalPolicyResult;
                }
            }
        }
    }

    private static GetContextKeysForPrincipalPolicyResultStaxUnmarshaller instance;

    public static GetContextKeysForPrincipalPolicyResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetContextKeysForPrincipalPolicyResultStaxUnmarshaller();
        return instance;
    }
}
