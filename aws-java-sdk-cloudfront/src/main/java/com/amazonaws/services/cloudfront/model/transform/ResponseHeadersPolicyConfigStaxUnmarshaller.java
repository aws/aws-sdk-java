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
package com.amazonaws.services.cloudfront.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ResponseHeadersPolicyConfig StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponseHeadersPolicyConfigStaxUnmarshaller implements Unmarshaller<ResponseHeadersPolicyConfig, StaxUnmarshallerContext> {

    public ResponseHeadersPolicyConfig unmarshall(StaxUnmarshallerContext context) throws Exception {
        ResponseHeadersPolicyConfig responseHeadersPolicyConfig = new ResponseHeadersPolicyConfig();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return responseHeadersPolicyConfig;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Comment", targetDepth)) {
                    responseHeadersPolicyConfig.setComment(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Name", targetDepth)) {
                    responseHeadersPolicyConfig.setName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CorsConfig", targetDepth)) {
                    responseHeadersPolicyConfig.setCorsConfig(ResponseHeadersPolicyCorsConfigStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SecurityHeadersConfig", targetDepth)) {
                    responseHeadersPolicyConfig.setSecurityHeadersConfig(ResponseHeadersPolicySecurityHeadersConfigStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }

                if (context.testExpression("ServerTimingHeadersConfig", targetDepth)) {
                    responseHeadersPolicyConfig.setServerTimingHeadersConfig(ResponseHeadersPolicyServerTimingHeadersConfigStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("CustomHeadersConfig", targetDepth)) {
                    responseHeadersPolicyConfig.setCustomHeadersConfig(ResponseHeadersPolicyCustomHeadersConfigStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }

                if (context.testExpression("RemoveHeadersConfig", targetDepth)) {
                    responseHeadersPolicyConfig.setRemoveHeadersConfig(ResponseHeadersPolicyRemoveHeadersConfigStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return responseHeadersPolicyConfig;
                }
            }
        }
    }

    private static ResponseHeadersPolicyConfigStaxUnmarshaller instance;

    public static ResponseHeadersPolicyConfigStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResponseHeadersPolicyConfigStaxUnmarshaller();
        return instance;
    }
}
