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
package com.amazonaws.services.s3control.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.s3control.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StorageLensGroupOrOperator StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StorageLensGroupOrOperatorStaxUnmarshaller implements Unmarshaller<StorageLensGroupOrOperator, StaxUnmarshallerContext> {

    public StorageLensGroupOrOperator unmarshall(StaxUnmarshallerContext context) throws Exception {
        StorageLensGroupOrOperator storageLensGroupOrOperator = new StorageLensGroupOrOperator();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return storageLensGroupOrOperator;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("MatchAnyPrefix", targetDepth)) {
                    storageLensGroupOrOperator.withMatchAnyPrefix(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("MatchAnyPrefix/Prefix", targetDepth)) {
                    storageLensGroupOrOperator.withMatchAnyPrefix(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MatchAnySuffix", targetDepth)) {
                    storageLensGroupOrOperator.withMatchAnySuffix(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("MatchAnySuffix/Suffix", targetDepth)) {
                    storageLensGroupOrOperator.withMatchAnySuffix(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MatchAnyTag", targetDepth)) {
                    storageLensGroupOrOperator.withMatchAnyTag(new ArrayList<S3Tag>());
                    continue;
                }

                if (context.testExpression("MatchAnyTag/Tag", targetDepth)) {
                    storageLensGroupOrOperator.withMatchAnyTag(S3TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MatchObjectAge", targetDepth)) {
                    storageLensGroupOrOperator.setMatchObjectAge(MatchObjectAgeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MatchObjectSize", targetDepth)) {
                    storageLensGroupOrOperator.setMatchObjectSize(MatchObjectSizeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return storageLensGroupOrOperator;
                }
            }
        }
    }

    private static StorageLensGroupOrOperatorStaxUnmarshaller instance;

    public static StorageLensGroupOrOperatorStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new StorageLensGroupOrOperatorStaxUnmarshaller();
        return instance;
    }
}
