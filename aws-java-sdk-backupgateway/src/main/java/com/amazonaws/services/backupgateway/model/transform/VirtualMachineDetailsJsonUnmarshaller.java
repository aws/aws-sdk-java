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
package com.amazonaws.services.backupgateway.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.backupgateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * VirtualMachineDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VirtualMachineDetailsJsonUnmarshaller implements Unmarshaller<VirtualMachineDetails, JsonUnmarshallerContext> {

    public VirtualMachineDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        VirtualMachineDetails virtualMachineDetails = new VirtualMachineDetails();

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
                if (context.testExpression("HostName", targetDepth)) {
                    context.nextToken();
                    virtualMachineDetails.setHostName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HypervisorId", targetDepth)) {
                    context.nextToken();
                    virtualMachineDetails.setHypervisorId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastBackupDate", targetDepth)) {
                    context.nextToken();
                    virtualMachineDetails.setLastBackupDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    virtualMachineDetails.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Path", targetDepth)) {
                    context.nextToken();
                    virtualMachineDetails.setPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceArn", targetDepth)) {
                    context.nextToken();
                    virtualMachineDetails.setResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VmwareTags", targetDepth)) {
                    context.nextToken();
                    virtualMachineDetails.setVmwareTags(new ListUnmarshaller<VmwareTag>(VmwareTagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return virtualMachineDetails;
    }

    private static VirtualMachineDetailsJsonUnmarshaller instance;

    public static VirtualMachineDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VirtualMachineDetailsJsonUnmarshaller();
        return instance;
    }
}
