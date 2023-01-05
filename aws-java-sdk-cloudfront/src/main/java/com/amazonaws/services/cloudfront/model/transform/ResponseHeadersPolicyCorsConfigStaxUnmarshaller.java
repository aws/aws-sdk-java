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
 * ResponseHeadersPolicyCorsConfig StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponseHeadersPolicyCorsConfigStaxUnmarshaller implements Unmarshaller<ResponseHeadersPolicyCorsConfig, StaxUnmarshallerContext> {

    public ResponseHeadersPolicyCorsConfig unmarshall(StaxUnmarshallerContext context) throws Exception {
        ResponseHeadersPolicyCorsConfig responseHeadersPolicyCorsConfig = new ResponseHeadersPolicyCorsConfig();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return responseHeadersPolicyCorsConfig;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("AccessControlAllowOrigins", targetDepth)) {
                    responseHeadersPolicyCorsConfig.setAccessControlAllowOrigins(ResponseHeadersPolicyAccessControlAllowOriginsStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("AccessControlAllowHeaders", targetDepth)) {
                    responseHeadersPolicyCorsConfig.setAccessControlAllowHeaders(ResponseHeadersPolicyAccessControlAllowHeadersStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("AccessControlAllowMethods", targetDepth)) {
                    responseHeadersPolicyCorsConfig.setAccessControlAllowMethods(ResponseHeadersPolicyAccessControlAllowMethodsStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("AccessControlAllowCredentials", targetDepth)) {
                    responseHeadersPolicyCorsConfig.setAccessControlAllowCredentials(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AccessControlExposeHeaders", targetDepth)) {
                    responseHeadersPolicyCorsConfig.setAccessControlExposeHeaders(ResponseHeadersPolicyAccessControlExposeHeadersStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("AccessControlMaxAgeSec", targetDepth)) {
                    responseHeadersPolicyCorsConfig.setAccessControlMaxAgeSec(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("OriginOverride", targetDepth)) {
                    responseHeadersPolicyCorsConfig.setOriginOverride(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return responseHeadersPolicyCorsConfig;
                }
            }
        }
    }

    private static ResponseHeadersPolicyCorsConfigStaxUnmarshaller instance;

    public static ResponseHeadersPolicyCorsConfigStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResponseHeadersPolicyCorsConfigStaxUnmarshaller();
        return instance;
    }
}
