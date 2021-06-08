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
package com.amazonaws.services.sns.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.sns.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ListSMSSandboxPhoneNumbersResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSMSSandboxPhoneNumbersResultStaxUnmarshaller implements Unmarshaller<ListSMSSandboxPhoneNumbersResult, StaxUnmarshallerContext> {

    public ListSMSSandboxPhoneNumbersResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ListSMSSandboxPhoneNumbersResult listSMSSandboxPhoneNumbersResult = new ListSMSSandboxPhoneNumbersResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return listSMSSandboxPhoneNumbersResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("PhoneNumbers", targetDepth)) {
                    listSMSSandboxPhoneNumbersResult.withPhoneNumbers(new ArrayList<SMSSandboxPhoneNumber>());
                    continue;
                }

                if (context.testExpression("PhoneNumbers/member", targetDepth)) {
                    listSMSSandboxPhoneNumbersResult.withPhoneNumbers(SMSSandboxPhoneNumberStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NextToken", targetDepth)) {
                    listSMSSandboxPhoneNumbersResult.setNextToken(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return listSMSSandboxPhoneNumbersResult;
                }
            }
        }
    }

    private static ListSMSSandboxPhoneNumbersResultStaxUnmarshaller instance;

    public static ListSMSSandboxPhoneNumbersResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListSMSSandboxPhoneNumbersResultStaxUnmarshaller();
        return instance;
    }
}
