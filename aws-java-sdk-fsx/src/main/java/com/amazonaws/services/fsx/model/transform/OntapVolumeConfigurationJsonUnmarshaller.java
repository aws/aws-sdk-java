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
package com.amazonaws.services.fsx.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.fsx.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * OntapVolumeConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OntapVolumeConfigurationJsonUnmarshaller implements Unmarshaller<OntapVolumeConfiguration, JsonUnmarshallerContext> {

    public OntapVolumeConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        OntapVolumeConfiguration ontapVolumeConfiguration = new OntapVolumeConfiguration();

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
                if (context.testExpression("FlexCacheEndpointType", targetDepth)) {
                    context.nextToken();
                    ontapVolumeConfiguration.setFlexCacheEndpointType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JunctionPath", targetDepth)) {
                    context.nextToken();
                    ontapVolumeConfiguration.setJunctionPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityStyle", targetDepth)) {
                    context.nextToken();
                    ontapVolumeConfiguration.setSecurityStyle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SizeInMegabytes", targetDepth)) {
                    context.nextToken();
                    ontapVolumeConfiguration.setSizeInMegabytes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("StorageEfficiencyEnabled", targetDepth)) {
                    context.nextToken();
                    ontapVolumeConfiguration.setStorageEfficiencyEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("StorageVirtualMachineId", targetDepth)) {
                    context.nextToken();
                    ontapVolumeConfiguration.setStorageVirtualMachineId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StorageVirtualMachineRoot", targetDepth)) {
                    context.nextToken();
                    ontapVolumeConfiguration.setStorageVirtualMachineRoot(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("TieringPolicy", targetDepth)) {
                    context.nextToken();
                    ontapVolumeConfiguration.setTieringPolicy(TieringPolicyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("UUID", targetDepth)) {
                    context.nextToken();
                    ontapVolumeConfiguration.setUUID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OntapVolumeType", targetDepth)) {
                    context.nextToken();
                    ontapVolumeConfiguration.setOntapVolumeType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnapshotPolicy", targetDepth)) {
                    context.nextToken();
                    ontapVolumeConfiguration.setSnapshotPolicy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CopyTagsToBackups", targetDepth)) {
                    context.nextToken();
                    ontapVolumeConfiguration.setCopyTagsToBackups(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return ontapVolumeConfiguration;
    }

    private static OntapVolumeConfigurationJsonUnmarshaller instance;

    public static OntapVolumeConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OntapVolumeConfigurationJsonUnmarshaller();
        return instance;
    }
}
