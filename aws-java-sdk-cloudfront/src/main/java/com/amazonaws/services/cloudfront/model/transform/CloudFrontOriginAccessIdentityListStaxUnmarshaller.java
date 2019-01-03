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
package com.amazonaws.services.cloudfront.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * CloudFrontOriginAccessIdentityList StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudFrontOriginAccessIdentityListStaxUnmarshaller implements Unmarshaller<CloudFrontOriginAccessIdentityList, StaxUnmarshallerContext> {

    public CloudFrontOriginAccessIdentityList unmarshall(StaxUnmarshallerContext context) throws Exception {
        CloudFrontOriginAccessIdentityList cloudFrontOriginAccessIdentityList = new CloudFrontOriginAccessIdentityList();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return cloudFrontOriginAccessIdentityList;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Marker", targetDepth)) {
                    cloudFrontOriginAccessIdentityList.setMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NextMarker", targetDepth)) {
                    cloudFrontOriginAccessIdentityList.setNextMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MaxItems", targetDepth)) {
                    cloudFrontOriginAccessIdentityList.setMaxItems(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IsTruncated", targetDepth)) {
                    cloudFrontOriginAccessIdentityList.setIsTruncated(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Quantity", targetDepth)) {
                    cloudFrontOriginAccessIdentityList.setQuantity(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Items", targetDepth)) {
                    cloudFrontOriginAccessIdentityList.withItems(new ArrayList<CloudFrontOriginAccessIdentitySummary>());
                    continue;
                }

                if (context.testExpression("Items/CloudFrontOriginAccessIdentitySummary", targetDepth)) {
                    cloudFrontOriginAccessIdentityList.withItems(CloudFrontOriginAccessIdentitySummaryStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return cloudFrontOriginAccessIdentityList;
                }
            }
        }
    }

    private static CloudFrontOriginAccessIdentityListStaxUnmarshaller instance;

    public static CloudFrontOriginAccessIdentityListStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CloudFrontOriginAccessIdentityListStaxUnmarshaller();
        return instance;
    }
}
