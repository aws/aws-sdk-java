/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ImportInstallationMediaResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportInstallationMediaResultStaxUnmarshaller implements Unmarshaller<ImportInstallationMediaResult, StaxUnmarshallerContext> {

    public ImportInstallationMediaResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ImportInstallationMediaResult importInstallationMediaResult = new ImportInstallationMediaResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return importInstallationMediaResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("InstallationMediaId", targetDepth)) {
                    importInstallationMediaResult.setInstallationMediaId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CustomAvailabilityZoneId", targetDepth)) {
                    importInstallationMediaResult.setCustomAvailabilityZoneId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Engine", targetDepth)) {
                    importInstallationMediaResult.setEngine(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EngineVersion", targetDepth)) {
                    importInstallationMediaResult.setEngineVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EngineInstallationMediaPath", targetDepth)) {
                    importInstallationMediaResult.setEngineInstallationMediaPath(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("OSInstallationMediaPath", targetDepth)) {
                    importInstallationMediaResult.setOSInstallationMediaPath(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    importInstallationMediaResult.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("FailureCause", targetDepth)) {
                    importInstallationMediaResult.setFailureCause(InstallationMediaFailureCauseStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return importInstallationMediaResult;
                }
            }
        }
    }

    private static ImportInstallationMediaResultStaxUnmarshaller instance;

    public static ImportInstallationMediaResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImportInstallationMediaResultStaxUnmarshaller();
        return instance;
    }
}
