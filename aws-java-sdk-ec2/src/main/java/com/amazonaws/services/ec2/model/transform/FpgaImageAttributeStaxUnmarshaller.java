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
package com.amazonaws.services.ec2.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * FpgaImageAttribute StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FpgaImageAttributeStaxUnmarshaller implements Unmarshaller<FpgaImageAttribute, StaxUnmarshallerContext> {

    public FpgaImageAttribute unmarshall(StaxUnmarshallerContext context) throws Exception {
        FpgaImageAttribute fpgaImageAttribute = new FpgaImageAttribute();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return fpgaImageAttribute;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("fpgaImageId", targetDepth)) {
                    fpgaImageAttribute.setFpgaImageId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("name", targetDepth)) {
                    fpgaImageAttribute.setName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("description", targetDepth)) {
                    fpgaImageAttribute.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("loadPermissions", targetDepth)) {
                    fpgaImageAttribute.withLoadPermissions(new ArrayList<LoadPermission>());
                    continue;
                }

                if (context.testExpression("loadPermissions/item", targetDepth)) {
                    fpgaImageAttribute.withLoadPermissions(LoadPermissionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("productCodes", targetDepth)) {
                    fpgaImageAttribute.withProductCodes(new ArrayList<ProductCode>());
                    continue;
                }

                if (context.testExpression("productCodes/item", targetDepth)) {
                    fpgaImageAttribute.withProductCodes(ProductCodeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return fpgaImageAttribute;
                }
            }
        }
    }

    private static FpgaImageAttributeStaxUnmarshaller instance;

    public static FpgaImageAttributeStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new FpgaImageAttributeStaxUnmarshaller();
        return instance;
    }
}
