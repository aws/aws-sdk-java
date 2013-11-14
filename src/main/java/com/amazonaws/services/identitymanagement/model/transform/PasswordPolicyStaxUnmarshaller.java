/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.identitymanagement.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * Password Policy StAX Unmarshaller
 */
public class PasswordPolicyStaxUnmarshaller implements Unmarshaller<PasswordPolicy, StaxUnmarshallerContext> {

    public PasswordPolicy unmarshall(StaxUnmarshallerContext context) throws Exception {
        PasswordPolicy passwordPolicy = new PasswordPolicy();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        
        if (context.isStartOfDocument()) targetDepth += 2;
        

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return passwordPolicy;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("MinimumPasswordLength", targetDepth)) {
                    passwordPolicy.setMinimumPasswordLength(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("RequireSymbols", targetDepth)) {
                    passwordPolicy.setRequireSymbols(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("RequireNumbers", targetDepth)) {
                    passwordPolicy.setRequireNumbers(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("RequireUppercaseCharacters", targetDepth)) {
                    passwordPolicy.setRequireUppercaseCharacters(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("RequireLowercaseCharacters", targetDepth)) {
                    passwordPolicy.setRequireLowercaseCharacters(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("AllowUsersToChangePassword", targetDepth)) {
                    passwordPolicy.setAllowUsersToChangePassword(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ExpirePasswords", targetDepth)) {
                    passwordPolicy.setExpirePasswords(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("MaxPasswordAge", targetDepth)) {
                    passwordPolicy.setMaxPasswordAge(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return passwordPolicy;
                }
            }
        }
    }

    private static PasswordPolicyStaxUnmarshaller instance;
    public static PasswordPolicyStaxUnmarshaller getInstance() {
        if (instance == null) instance = new PasswordPolicyStaxUnmarshaller();
        return instance;
    }
}
    