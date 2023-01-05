/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * AddressTransfer StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddressTransferStaxUnmarshaller implements Unmarshaller<AddressTransfer, StaxUnmarshallerContext> {

    public AddressTransfer unmarshall(StaxUnmarshallerContext context) throws Exception {
        AddressTransfer addressTransfer = new AddressTransfer();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return addressTransfer;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("publicIp", targetDepth)) {
                    addressTransfer.setPublicIp(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("allocationId", targetDepth)) {
                    addressTransfer.setAllocationId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("transferAccountId", targetDepth)) {
                    addressTransfer.setTransferAccountId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("transferOfferExpirationTimestamp", targetDepth)) {
                    addressTransfer.setTransferOfferExpirationTimestamp(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("transferOfferAcceptedTimestamp", targetDepth)) {
                    addressTransfer.setTransferOfferAcceptedTimestamp(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("addressTransferStatus", targetDepth)) {
                    addressTransfer.setAddressTransferStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return addressTransfer;
                }
            }
        }
    }

    private static AddressTransferStaxUnmarshaller instance;

    public static AddressTransferStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new AddressTransferStaxUnmarshaller();
        return instance;
    }
}
