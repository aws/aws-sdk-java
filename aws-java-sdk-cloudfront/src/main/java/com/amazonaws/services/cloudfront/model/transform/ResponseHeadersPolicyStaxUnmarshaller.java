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
 * ResponseHeadersPolicy StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponseHeadersPolicyStaxUnmarshaller implements Unmarshaller<ResponseHeadersPolicy, StaxUnmarshallerContext> {

    public ResponseHeadersPolicy unmarshall(StaxUnmarshallerContext context) throws Exception {
        ResponseHeadersPolicy responseHeadersPolicy = new ResponseHeadersPolicy();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return responseHeadersPolicy;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Id", targetDepth)) {
                    responseHeadersPolicy.setId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    responseHeadersPolicy.setLastModifiedTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("ResponseHeadersPolicyConfig", targetDepth)) {
                    responseHeadersPolicy.setResponseHeadersPolicyConfig(ResponseHeadersPolicyConfigStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return responseHeadersPolicy;
                }
            }
        }
    }

    private static ResponseHeadersPolicyStaxUnmarshaller instance;

    public static ResponseHeadersPolicyStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResponseHeadersPolicyStaxUnmarshaller();
        return instance;
    }
}
