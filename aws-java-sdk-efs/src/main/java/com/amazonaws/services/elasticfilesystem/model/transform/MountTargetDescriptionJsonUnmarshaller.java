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
package com.amazonaws.services.elasticfilesystem.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.elasticfilesystem.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MountTargetDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MountTargetDescriptionJsonUnmarshaller implements Unmarshaller<MountTargetDescription, JsonUnmarshallerContext> {

    public MountTargetDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        MountTargetDescription mountTargetDescription = new MountTargetDescription();

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
                if (context.testExpression("OwnerId", targetDepth)) {
                    context.nextToken();
                    mountTargetDescription.setOwnerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MountTargetId", targetDepth)) {
                    context.nextToken();
                    mountTargetDescription.setMountTargetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FileSystemId", targetDepth)) {
                    context.nextToken();
                    mountTargetDescription.setFileSystemId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubnetId", targetDepth)) {
                    context.nextToken();
                    mountTargetDescription.setSubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LifeCycleState", targetDepth)) {
                    context.nextToken();
                    mountTargetDescription.setLifeCycleState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IpAddress", targetDepth)) {
                    context.nextToken();
                    mountTargetDescription.setIpAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NetworkInterfaceId", targetDepth)) {
                    context.nextToken();
                    mountTargetDescription.setNetworkInterfaceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return mountTargetDescription;
    }

    private static MountTargetDescriptionJsonUnmarshaller instance;

    public static MountTargetDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MountTargetDescriptionJsonUnmarshaller();
        return instance;
    }
}
