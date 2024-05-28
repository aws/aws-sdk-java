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
 * CreateAccessGrantsLocationResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAccessGrantsLocationResultStaxUnmarshaller implements Unmarshaller<CreateAccessGrantsLocationResult, StaxUnmarshallerContext> {

    public CreateAccessGrantsLocationResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        CreateAccessGrantsLocationResult createAccessGrantsLocationResult = new CreateAccessGrantsLocationResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return createAccessGrantsLocationResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("CreatedAt", targetDepth)) {
                    createAccessGrantsLocationResult.setCreatedAt(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("AccessGrantsLocationId", targetDepth)) {
                    createAccessGrantsLocationResult.setAccessGrantsLocationId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AccessGrantsLocationArn", targetDepth)) {
                    createAccessGrantsLocationResult.setAccessGrantsLocationArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LocationScope", targetDepth)) {
                    createAccessGrantsLocationResult.setLocationScope(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IAMRoleArn", targetDepth)) {
                    createAccessGrantsLocationResult.setIAMRoleArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return createAccessGrantsLocationResult;
                }
            }
        }
    }

    private static CreateAccessGrantsLocationResultStaxUnmarshaller instance;

    public static CreateAccessGrantsLocationResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateAccessGrantsLocationResultStaxUnmarshaller();
        return instance;
    }
}
