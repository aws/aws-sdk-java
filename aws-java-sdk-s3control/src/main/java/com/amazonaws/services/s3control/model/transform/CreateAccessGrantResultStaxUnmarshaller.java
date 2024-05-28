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
 * CreateAccessGrantResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAccessGrantResultStaxUnmarshaller implements Unmarshaller<CreateAccessGrantResult, StaxUnmarshallerContext> {

    public CreateAccessGrantResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        CreateAccessGrantResult createAccessGrantResult = new CreateAccessGrantResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return createAccessGrantResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("CreatedAt", targetDepth)) {
                    createAccessGrantResult.setCreatedAt(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("AccessGrantId", targetDepth)) {
                    createAccessGrantResult.setAccessGrantId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AccessGrantArn", targetDepth)) {
                    createAccessGrantResult.setAccessGrantArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Grantee", targetDepth)) {
                    createAccessGrantResult.setGrantee(GranteeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AccessGrantsLocationId", targetDepth)) {
                    createAccessGrantResult.setAccessGrantsLocationId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AccessGrantsLocationConfiguration", targetDepth)) {
                    createAccessGrantResult.setAccessGrantsLocationConfiguration(AccessGrantsLocationConfigurationStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }

                if (context.testExpression("Permission", targetDepth)) {
                    createAccessGrantResult.setPermission(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ApplicationArn", targetDepth)) {
                    createAccessGrantResult.setApplicationArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("GrantScope", targetDepth)) {
                    createAccessGrantResult.setGrantScope(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return createAccessGrantResult;
                }
            }
        }
    }

    private static CreateAccessGrantResultStaxUnmarshaller instance;

    public static CreateAccessGrantResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateAccessGrantResultStaxUnmarshaller();
        return instance;
    }
}
