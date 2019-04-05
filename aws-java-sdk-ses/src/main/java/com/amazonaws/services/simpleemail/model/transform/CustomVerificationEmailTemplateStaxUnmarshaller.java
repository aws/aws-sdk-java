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
 * CustomVerificationEmailTemplate StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomVerificationEmailTemplateStaxUnmarshaller implements Unmarshaller<CustomVerificationEmailTemplate, StaxUnmarshallerContext> {

    public CustomVerificationEmailTemplate unmarshall(StaxUnmarshallerContext context) throws Exception {
        CustomVerificationEmailTemplate customVerificationEmailTemplate = new CustomVerificationEmailTemplate();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return customVerificationEmailTemplate;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("TemplateName", targetDepth)) {
                    customVerificationEmailTemplate.setTemplateName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("FromEmailAddress", targetDepth)) {
                    customVerificationEmailTemplate.setFromEmailAddress(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TemplateSubject", targetDepth)) {
                    customVerificationEmailTemplate.setTemplateSubject(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SuccessRedirectionURL", targetDepth)) {
                    customVerificationEmailTemplate.setSuccessRedirectionURL(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("FailureRedirectionURL", targetDepth)) {
                    customVerificationEmailTemplate.setFailureRedirectionURL(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return customVerificationEmailTemplate;
                }
            }
        }
    }

    private static CustomVerificationEmailTemplateStaxUnmarshaller instance;

    public static CustomVerificationEmailTemplateStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CustomVerificationEmailTemplateStaxUnmarshaller();
        return instance;
    }
}
