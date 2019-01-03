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
 * ListServerCertificatesResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServerCertificatesResultStaxUnmarshaller implements Unmarshaller<ListServerCertificatesResult, StaxUnmarshallerContext> {

    public ListServerCertificatesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ListServerCertificatesResult listServerCertificatesResult = new ListServerCertificatesResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return listServerCertificatesResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ServerCertificateMetadataList", targetDepth)) {
                    listServerCertificatesResult.withServerCertificateMetadataList(new ArrayList<ServerCertificateMetadata>());
                    continue;
                }

                if (context.testExpression("ServerCertificateMetadataList/member", targetDepth)) {
                    listServerCertificatesResult.withServerCertificateMetadataList(ServerCertificateMetadataStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IsTruncated", targetDepth)) {
                    listServerCertificatesResult.setIsTruncated(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Marker", targetDepth)) {
                    listServerCertificatesResult.setMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return listServerCertificatesResult;
                }
            }
        }
    }

    private static ListServerCertificatesResultStaxUnmarshaller instance;

    public static ListServerCertificatesResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListServerCertificatesResultStaxUnmarshaller();
        return instance;
    }
}
