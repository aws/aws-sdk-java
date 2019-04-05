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
 * ListAccessKeysResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccessKeysResultStaxUnmarshaller implements Unmarshaller<ListAccessKeysResult, StaxUnmarshallerContext> {

    public ListAccessKeysResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ListAccessKeysResult listAccessKeysResult = new ListAccessKeysResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return listAccessKeysResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("AccessKeyMetadata", targetDepth)) {
                    listAccessKeysResult.withAccessKeyMetadata(new ArrayList<AccessKeyMetadata>());
                    continue;
                }

                if (context.testExpression("AccessKeyMetadata/member", targetDepth)) {
                    listAccessKeysResult.withAccessKeyMetadata(AccessKeyMetadataStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IsTruncated", targetDepth)) {
                    listAccessKeysResult.setIsTruncated(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Marker", targetDepth)) {
                    listAccessKeysResult.setMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return listAccessKeysResult;
                }
            }
        }
    }

    private static ListAccessKeysResultStaxUnmarshaller instance;

    public static ListAccessKeysResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListAccessKeysResultStaxUnmarshaller();
        return instance;
    }
}
