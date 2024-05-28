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
package com.amazonaws.services.elasticloadbalancingv2.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticloadbalancingv2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DescribeTrustStoresResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTrustStoresResultStaxUnmarshaller implements Unmarshaller<DescribeTrustStoresResult, StaxUnmarshallerContext> {

    public DescribeTrustStoresResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeTrustStoresResult describeTrustStoresResult = new DescribeTrustStoresResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeTrustStoresResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("TrustStores", targetDepth)) {
                    describeTrustStoresResult.withTrustStores(new ArrayList<TrustStore>());
                    continue;
                }

                if (context.testExpression("TrustStores/member", targetDepth)) {
                    describeTrustStoresResult.withTrustStores(TrustStoreStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NextMarker", targetDepth)) {
                    describeTrustStoresResult.setNextMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeTrustStoresResult;
                }
            }
        }
    }

    private static DescribeTrustStoresResultStaxUnmarshaller instance;

    public static DescribeTrustStoresResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeTrustStoresResultStaxUnmarshaller();
        return instance;
    }
}
