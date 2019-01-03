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
package com.amazonaws.services.identitymanagement.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ListInstanceProfilesResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInstanceProfilesResultStaxUnmarshaller implements Unmarshaller<ListInstanceProfilesResult, StaxUnmarshallerContext> {

    public ListInstanceProfilesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ListInstanceProfilesResult listInstanceProfilesResult = new ListInstanceProfilesResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return listInstanceProfilesResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("InstanceProfiles", targetDepth)) {
                    listInstanceProfilesResult.withInstanceProfiles(new ArrayList<InstanceProfile>());
                    continue;
                }

                if (context.testExpression("InstanceProfiles/member", targetDepth)) {
                    listInstanceProfilesResult.withInstanceProfiles(InstanceProfileStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IsTruncated", targetDepth)) {
                    listInstanceProfilesResult.setIsTruncated(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Marker", targetDepth)) {
                    listInstanceProfilesResult.setMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return listInstanceProfilesResult;
                }
            }
        }
    }

    private static ListInstanceProfilesResultStaxUnmarshaller instance;

    public static ListInstanceProfilesResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListInstanceProfilesResultStaxUnmarshaller();
        return instance;
    }
}
