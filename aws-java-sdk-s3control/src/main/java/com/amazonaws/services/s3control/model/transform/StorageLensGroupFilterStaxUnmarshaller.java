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
 * StorageLensGroupFilter StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StorageLensGroupFilterStaxUnmarshaller implements Unmarshaller<StorageLensGroupFilter, StaxUnmarshallerContext> {

    public StorageLensGroupFilter unmarshall(StaxUnmarshallerContext context) throws Exception {
        StorageLensGroupFilter storageLensGroupFilter = new StorageLensGroupFilter();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return storageLensGroupFilter;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("MatchAnyPrefix", targetDepth)) {
                    storageLensGroupFilter.withMatchAnyPrefix(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("MatchAnyPrefix/Prefix", targetDepth)) {
                    storageLensGroupFilter.withMatchAnyPrefix(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MatchAnySuffix", targetDepth)) {
                    storageLensGroupFilter.withMatchAnySuffix(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("MatchAnySuffix/Suffix", targetDepth)) {
                    storageLensGroupFilter.withMatchAnySuffix(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MatchAnyTag", targetDepth)) {
                    storageLensGroupFilter.withMatchAnyTag(new ArrayList<S3Tag>());
                    continue;
                }

                if (context.testExpression("MatchAnyTag/Tag", targetDepth)) {
                    storageLensGroupFilter.withMatchAnyTag(S3TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MatchObjectAge", targetDepth)) {
                    storageLensGroupFilter.setMatchObjectAge(MatchObjectAgeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MatchObjectSize", targetDepth)) {
                    storageLensGroupFilter.setMatchObjectSize(MatchObjectSizeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("And", targetDepth)) {
                    storageLensGroupFilter.setAnd(StorageLensGroupAndOperatorStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Or", targetDepth)) {
                    storageLensGroupFilter.setOr(StorageLensGroupOrOperatorStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return storageLensGroupFilter;
                }
            }
        }
    }

    private static StorageLensGroupFilterStaxUnmarshaller instance;

    public static StorageLensGroupFilterStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new StorageLensGroupFilterStaxUnmarshaller();
        return instance;
    }
}
