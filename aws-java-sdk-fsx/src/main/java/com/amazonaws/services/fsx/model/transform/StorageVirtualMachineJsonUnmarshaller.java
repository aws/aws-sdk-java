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
 * StorageVirtualMachine JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StorageVirtualMachineJsonUnmarshaller implements Unmarshaller<StorageVirtualMachine, JsonUnmarshallerContext> {

    public StorageVirtualMachine unmarshall(JsonUnmarshallerContext context) throws Exception {
        StorageVirtualMachine storageVirtualMachine = new StorageVirtualMachine();

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
                if (context.testExpression("ActiveDirectoryConfiguration", targetDepth)) {
                    context.nextToken();
                    storageVirtualMachine.setActiveDirectoryConfiguration(SvmActiveDirectoryConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    storageVirtualMachine.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Endpoints", targetDepth)) {
                    context.nextToken();
                    storageVirtualMachine.setEndpoints(SvmEndpointsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FileSystemId", targetDepth)) {
                    context.nextToken();
                    storageVirtualMachine.setFileSystemId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Lifecycle", targetDepth)) {
                    context.nextToken();
                    storageVirtualMachine.setLifecycle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    storageVirtualMachine.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceARN", targetDepth)) {
                    context.nextToken();
                    storageVirtualMachine.setResourceARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StorageVirtualMachineId", targetDepth)) {
                    context.nextToken();
                    storageVirtualMachine.setStorageVirtualMachineId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Subtype", targetDepth)) {
                    context.nextToken();
                    storageVirtualMachine.setSubtype(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UUID", targetDepth)) {
                    context.nextToken();
                    storageVirtualMachine.setUUID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    storageVirtualMachine.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("LifecycleTransitionReason", targetDepth)) {
                    context.nextToken();
                    storageVirtualMachine.setLifecycleTransitionReason(LifecycleTransitionReasonJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RootVolumeSecurityStyle", targetDepth)) {
                    context.nextToken();
                    storageVirtualMachine.setRootVolumeSecurityStyle(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return storageVirtualMachine;
    }

    private static StorageVirtualMachineJsonUnmarshaller instance;

    public static StorageVirtualMachineJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StorageVirtualMachineJsonUnmarshaller();
        return instance;
    }
}
