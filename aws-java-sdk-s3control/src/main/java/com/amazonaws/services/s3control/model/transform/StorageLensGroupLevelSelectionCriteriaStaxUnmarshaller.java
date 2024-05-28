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
 * StorageLensGroupLevelSelectionCriteria StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StorageLensGroupLevelSelectionCriteriaStaxUnmarshaller implements Unmarshaller<StorageLensGroupLevelSelectionCriteria, StaxUnmarshallerContext> {

    public StorageLensGroupLevelSelectionCriteria unmarshall(StaxUnmarshallerContext context) throws Exception {
        StorageLensGroupLevelSelectionCriteria storageLensGroupLevelSelectionCriteria = new StorageLensGroupLevelSelectionCriteria();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return storageLensGroupLevelSelectionCriteria;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Include", targetDepth)) {
                    storageLensGroupLevelSelectionCriteria.withInclude(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("Include/Arn", targetDepth)) {
                    storageLensGroupLevelSelectionCriteria.withInclude(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Exclude", targetDepth)) {
                    storageLensGroupLevelSelectionCriteria.withExclude(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("Exclude/Arn", targetDepth)) {
                    storageLensGroupLevelSelectionCriteria.withExclude(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return storageLensGroupLevelSelectionCriteria;
                }
            }
        }
    }

    private static StorageLensGroupLevelSelectionCriteriaStaxUnmarshaller instance;

    public static StorageLensGroupLevelSelectionCriteriaStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new StorageLensGroupLevelSelectionCriteriaStaxUnmarshaller();
        return instance;
    }
}
