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
 * ActiveTrustedSigners StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActiveTrustedSignersStaxUnmarshaller implements Unmarshaller<ActiveTrustedSigners, StaxUnmarshallerContext> {

    public ActiveTrustedSigners unmarshall(StaxUnmarshallerContext context) throws Exception {
        ActiveTrustedSigners activeTrustedSigners = new ActiveTrustedSigners();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return activeTrustedSigners;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Enabled", targetDepth)) {
                    activeTrustedSigners.setEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Quantity", targetDepth)) {
                    activeTrustedSigners.setQuantity(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Items", targetDepth)) {
                    activeTrustedSigners.withItems(new ArrayList<Signer>());
                    continue;
                }

                if (context.testExpression("Items/Signer", targetDepth)) {
                    activeTrustedSigners.withItems(SignerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return activeTrustedSigners;
                }
            }
        }
    }

    private static ActiveTrustedSignersStaxUnmarshaller instance;

    public static ActiveTrustedSignersStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ActiveTrustedSignersStaxUnmarshaller();
        return instance;
    }
}
