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

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ResponseHeadersPolicyAccessControlAllowOrigins StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponseHeadersPolicyAccessControlAllowOriginsStaxUnmarshaller implements
        Unmarshaller<ResponseHeadersPolicyAccessControlAllowOrigins, StaxUnmarshallerContext> {

    public ResponseHeadersPolicyAccessControlAllowOrigins unmarshall(StaxUnmarshallerContext context) throws Exception {
        ResponseHeadersPolicyAccessControlAllowOrigins responseHeadersPolicyAccessControlAllowOrigins = new ResponseHeadersPolicyAccessControlAllowOrigins();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return responseHeadersPolicyAccessControlAllowOrigins;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Quantity", targetDepth)) {
                    responseHeadersPolicyAccessControlAllowOrigins.setQuantity(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Items", targetDepth)) {
                    responseHeadersPolicyAccessControlAllowOrigins.withItems(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("Items/Origin", targetDepth)) {
                    responseHeadersPolicyAccessControlAllowOrigins.withItems(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return responseHeadersPolicyAccessControlAllowOrigins;
                }
            }
        }
    }

    private static ResponseHeadersPolicyAccessControlAllowOriginsStaxUnmarshaller instance;

    public static ResponseHeadersPolicyAccessControlAllowOriginsStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResponseHeadersPolicyAccessControlAllowOriginsStaxUnmarshaller();
        return instance;
    }
}
