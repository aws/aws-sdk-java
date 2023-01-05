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
package com.amazonaws.services.drs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.drs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RecoveryInstanceProperties JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecoveryInstancePropertiesJsonUnmarshaller implements Unmarshaller<RecoveryInstanceProperties, JsonUnmarshallerContext> {

    public RecoveryInstanceProperties unmarshall(JsonUnmarshallerContext context) throws Exception {
        RecoveryInstanceProperties recoveryInstanceProperties = new RecoveryInstanceProperties();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("cpus", targetDepth)) {
                    context.nextToken();
                    recoveryInstanceProperties.setCpus(new ListUnmarshaller<CPU>(CPUJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("disks", targetDepth)) {
                    context.nextToken();
                    recoveryInstanceProperties.setDisks(new ListUnmarshaller<RecoveryInstanceDisk>(RecoveryInstanceDiskJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("identificationHints", targetDepth)) {
                    context.nextToken();
                    recoveryInstanceProperties.setIdentificationHints(IdentificationHintsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDateTime", targetDepth)) {
                    context.nextToken();
                    recoveryInstanceProperties.setLastUpdatedDateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("networkInterfaces", targetDepth)) {
                    context.nextToken();
                    recoveryInstanceProperties.setNetworkInterfaces(new ListUnmarshaller<NetworkInterface>(NetworkInterfaceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("os", targetDepth)) {
                    context.nextToken();
                    recoveryInstanceProperties.setOs(OSJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ramBytes", targetDepth)) {
                    context.nextToken();
                    recoveryInstanceProperties.setRamBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return recoveryInstanceProperties;
    }

    private static RecoveryInstancePropertiesJsonUnmarshaller instance;

    public static RecoveryInstancePropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RecoveryInstancePropertiesJsonUnmarshaller();
        return instance;
    }
}
