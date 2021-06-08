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

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.s3control.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StorageLensConfiguration StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StorageLensConfigurationStaxUnmarshaller implements Unmarshaller<StorageLensConfiguration, StaxUnmarshallerContext> {

    public StorageLensConfiguration unmarshall(StaxUnmarshallerContext context) throws Exception {
        StorageLensConfiguration storageLensConfiguration = new StorageLensConfiguration();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return storageLensConfiguration;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Id", targetDepth)) {
                    storageLensConfiguration.setId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AccountLevel", targetDepth)) {
                    storageLensConfiguration.setAccountLevel(AccountLevelStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Include", targetDepth)) {
                    storageLensConfiguration.setInclude(IncludeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Exclude", targetDepth)) {
                    storageLensConfiguration.setExclude(ExcludeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DataExport", targetDepth)) {
                    storageLensConfiguration.setDataExport(StorageLensDataExportStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IsEnabled", targetDepth)) {
                    storageLensConfiguration.setIsEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AwsOrg", targetDepth)) {
                    storageLensConfiguration.setAwsOrg(StorageLensAwsOrgStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StorageLensArn", targetDepth)) {
                    storageLensConfiguration.setStorageLensArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return storageLensConfiguration;
                }
            }
        }
    }

    private static StorageLensConfigurationStaxUnmarshaller instance;

    public static StorageLensConfigurationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new StorageLensConfigurationStaxUnmarshaller();
        return instance;
    }
}
