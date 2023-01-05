/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.sns.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * GetDataProtectionPolicyResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataProtectionPolicyResultStaxUnmarshaller implements Unmarshaller<GetDataProtectionPolicyResult, StaxUnmarshallerContext> {

    public GetDataProtectionPolicyResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        GetDataProtectionPolicyResult getDataProtectionPolicyResult = new GetDataProtectionPolicyResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return getDataProtectionPolicyResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("DataProtectionPolicy", targetDepth)) {
                    getDataProtectionPolicyResult.setDataProtectionPolicy(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return getDataProtectionPolicyResult;
                }
            }
        }
    }

    private static GetDataProtectionPolicyResultStaxUnmarshaller instance;

    public static GetDataProtectionPolicyResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetDataProtectionPolicyResultStaxUnmarshaller();
        return instance;
    }
}
