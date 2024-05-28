/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3control.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.s3control.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * GetAccessGrantResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAccessGrantResultStaxUnmarshaller implements Unmarshaller<GetAccessGrantResult, StaxUnmarshallerContext> {

    public GetAccessGrantResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        GetAccessGrantResult getAccessGrantResult = new GetAccessGrantResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return getAccessGrantResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("CreatedAt", targetDepth)) {
                    getAccessGrantResult.setCreatedAt(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("AccessGrantId", targetDepth)) {
                    getAccessGrantResult.setAccessGrantId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AccessGrantArn", targetDepth)) {
                    getAccessGrantResult.setAccessGrantArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Grantee", targetDepth)) {
                    getAccessGrantResult.setGrantee(GranteeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Permission", targetDepth)) {
                    getAccessGrantResult.setPermission(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AccessGrantsLocationId", targetDepth)) {
                    getAccessGrantResult.setAccessGrantsLocationId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AccessGrantsLocationConfiguration", targetDepth)) {
                    getAccessGrantResult.setAccessGrantsLocationConfiguration(AccessGrantsLocationConfigurationStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }

                if (context.testExpression("GrantScope", targetDepth)) {
                    getAccessGrantResult.setGrantScope(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ApplicationArn", targetDepth)) {
                    getAccessGrantResult.setApplicationArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return getAccessGrantResult;
                }
            }
        }
    }

    private static GetAccessGrantResultStaxUnmarshaller instance;

    public static GetAccessGrantResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetAccessGrantResultStaxUnmarshaller();
        return instance;
    }
}
