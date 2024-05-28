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
package com.amazonaws.services.ecs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ServiceManagedEBSVolumeConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceManagedEBSVolumeConfigurationJsonUnmarshaller implements Unmarshaller<ServiceManagedEBSVolumeConfiguration, JsonUnmarshallerContext> {

    public ServiceManagedEBSVolumeConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        ServiceManagedEBSVolumeConfiguration serviceManagedEBSVolumeConfiguration = new ServiceManagedEBSVolumeConfiguration();

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
                if (context.testExpression("encrypted", targetDepth)) {
                    context.nextToken();
                    serviceManagedEBSVolumeConfiguration.setEncrypted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("kmsKeyId", targetDepth)) {
                    context.nextToken();
                    serviceManagedEBSVolumeConfiguration.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("volumeType", targetDepth)) {
                    context.nextToken();
                    serviceManagedEBSVolumeConfiguration.setVolumeType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sizeInGiB", targetDepth)) {
                    context.nextToken();
                    serviceManagedEBSVolumeConfiguration.setSizeInGiB(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("snapshotId", targetDepth)) {
                    context.nextToken();
                    serviceManagedEBSVolumeConfiguration.setSnapshotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("iops", targetDepth)) {
                    context.nextToken();
                    serviceManagedEBSVolumeConfiguration.setIops(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("throughput", targetDepth)) {
                    context.nextToken();
                    serviceManagedEBSVolumeConfiguration.setThroughput(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("tagSpecifications", targetDepth)) {
                    context.nextToken();
                    serviceManagedEBSVolumeConfiguration.setTagSpecifications(new ListUnmarshaller<EBSTagSpecification>(EBSTagSpecificationJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    context.nextToken();
                    serviceManagedEBSVolumeConfiguration.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("filesystemType", targetDepth)) {
                    context.nextToken();
                    serviceManagedEBSVolumeConfiguration.setFilesystemType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return serviceManagedEBSVolumeConfiguration;
    }

    private static ServiceManagedEBSVolumeConfigurationJsonUnmarshaller instance;

    public static ServiceManagedEBSVolumeConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ServiceManagedEBSVolumeConfigurationJsonUnmarshaller();
        return instance;
    }
}
