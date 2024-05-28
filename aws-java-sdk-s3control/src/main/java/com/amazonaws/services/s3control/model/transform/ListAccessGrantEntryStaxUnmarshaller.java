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
 * ListAccessGrantEntry StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccessGrantEntryStaxUnmarshaller implements Unmarshaller<ListAccessGrantEntry, StaxUnmarshallerContext> {

    public ListAccessGrantEntry unmarshall(StaxUnmarshallerContext context) throws Exception {
        ListAccessGrantEntry listAccessGrantEntry = new ListAccessGrantEntry();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return listAccessGrantEntry;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("CreatedAt", targetDepth)) {
                    listAccessGrantEntry.setCreatedAt(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("AccessGrantId", targetDepth)) {
                    listAccessGrantEntry.setAccessGrantId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AccessGrantArn", targetDepth)) {
                    listAccessGrantEntry.setAccessGrantArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Grantee", targetDepth)) {
                    listAccessGrantEntry.setGrantee(GranteeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Permission", targetDepth)) {
                    listAccessGrantEntry.setPermission(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AccessGrantsLocationId", targetDepth)) {
                    listAccessGrantEntry.setAccessGrantsLocationId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AccessGrantsLocationConfiguration", targetDepth)) {
                    listAccessGrantEntry.setAccessGrantsLocationConfiguration(AccessGrantsLocationConfigurationStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }

                if (context.testExpression("GrantScope", targetDepth)) {
                    listAccessGrantEntry.setGrantScope(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ApplicationArn", targetDepth)) {
                    listAccessGrantEntry.setApplicationArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return listAccessGrantEntry;
                }
            }
        }
    }

    private static ListAccessGrantEntryStaxUnmarshaller instance;

    public static ListAccessGrantEntryStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListAccessGrantEntryStaxUnmarshaller();
        return instance;
    }
}
