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
package com.amazonaws.services.simpleemail.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * BouncedRecipientInfo StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BouncedRecipientInfoStaxUnmarshaller implements Unmarshaller<BouncedRecipientInfo, StaxUnmarshallerContext> {

    public BouncedRecipientInfo unmarshall(StaxUnmarshallerContext context) throws Exception {
        BouncedRecipientInfo bouncedRecipientInfo = new BouncedRecipientInfo();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return bouncedRecipientInfo;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Recipient", targetDepth)) {
                    bouncedRecipientInfo.setRecipient(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RecipientArn", targetDepth)) {
                    bouncedRecipientInfo.setRecipientArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("BounceType", targetDepth)) {
                    bouncedRecipientInfo.setBounceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RecipientDsnFields", targetDepth)) {
                    bouncedRecipientInfo.setRecipientDsnFields(RecipientDsnFieldsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return bouncedRecipientInfo;
                }
            }
        }
    }

    private static BouncedRecipientInfoStaxUnmarshaller instance;

    public static BouncedRecipientInfoStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new BouncedRecipientInfoStaxUnmarshaller();
        return instance;
    }
}
