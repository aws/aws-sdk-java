/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workspaces.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workspaces.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * WorkspaceBundleMarshaller
 */
public class WorkspaceBundleJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(WorkspaceBundle workspaceBundle, StructuredJsonGenerator jsonGenerator) {

        if (workspaceBundle == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (workspaceBundle.getBundleId() != null) {
                jsonGenerator.writeFieldName("BundleId").writeValue(workspaceBundle.getBundleId());
            }
            if (workspaceBundle.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(workspaceBundle.getName());
            }
            if (workspaceBundle.getOwner() != null) {
                jsonGenerator.writeFieldName("Owner").writeValue(workspaceBundle.getOwner());
            }
            if (workspaceBundle.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(workspaceBundle.getDescription());
            }
            if (workspaceBundle.getUserStorage() != null) {
                jsonGenerator.writeFieldName("UserStorage");
                UserStorageJsonMarshaller.getInstance().marshall(workspaceBundle.getUserStorage(), jsonGenerator);
            }
            if (workspaceBundle.getComputeType() != null) {
                jsonGenerator.writeFieldName("ComputeType");
                ComputeTypeJsonMarshaller.getInstance().marshall(workspaceBundle.getComputeType(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static WorkspaceBundleJsonMarshaller instance;

    public static WorkspaceBundleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WorkspaceBundleJsonMarshaller();
        return instance;
    }

}
