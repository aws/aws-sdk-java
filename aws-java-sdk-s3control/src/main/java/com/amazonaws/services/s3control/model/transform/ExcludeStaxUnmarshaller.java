/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Exclude StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExcludeStaxUnmarshaller implements Unmarshaller<Exclude, StaxUnmarshallerContext> {

    public Exclude unmarshall(StaxUnmarshallerContext context) throws Exception {
        Exclude exclude = new Exclude();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return exclude;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Buckets", targetDepth)) {
                    exclude.withBuckets(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("Buckets/Arn", targetDepth)) {
                    exclude.withBuckets(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Regions", targetDepth)) {
                    exclude.withRegions(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("Regions/Region", targetDepth)) {
                    exclude.withRegions(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return exclude;
                }
            }
        }
    }

    private static ExcludeStaxUnmarshaller instance;

    public static ExcludeStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ExcludeStaxUnmarshaller();
        return instance;
    }
}
