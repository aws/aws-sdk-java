/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.s3control.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * S3AccessControlList StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3AccessControlListStaxUnmarshaller implements Unmarshaller<S3AccessControlList, StaxUnmarshallerContext> {

    public S3AccessControlList unmarshall(StaxUnmarshallerContext context) throws Exception {
        S3AccessControlList s3AccessControlList = new S3AccessControlList();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return s3AccessControlList;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Owner", targetDepth)) {
                    s3AccessControlList.setOwner(S3ObjectOwnerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Grants", targetDepth)) {
                    s3AccessControlList.withGrants(new ArrayList<S3Grant>());
                    continue;
                }

                if (context.testExpression("Grants/member", targetDepth)) {
                    s3AccessControlList.withGrants(S3GrantStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return s3AccessControlList;
                }
            }
        }
    }

    private static S3AccessControlListStaxUnmarshaller instance;

    public static S3AccessControlListStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new S3AccessControlListStaxUnmarshaller();
        return instance;
    }
}
