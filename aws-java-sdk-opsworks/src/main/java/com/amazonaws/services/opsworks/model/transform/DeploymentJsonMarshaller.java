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
package com.amazonaws.services.opsworks.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * DeploymentMarshaller
 */
public class DeploymentJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Deployment deployment, StructuredJsonGenerator jsonGenerator) {

        if (deployment == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (deployment.getDeploymentId() != null) {
                jsonGenerator.writeFieldName("DeploymentId").writeValue(deployment.getDeploymentId());
            }
            if (deployment.getStackId() != null) {
                jsonGenerator.writeFieldName("StackId").writeValue(deployment.getStackId());
            }
            if (deployment.getAppId() != null) {
                jsonGenerator.writeFieldName("AppId").writeValue(deployment.getAppId());
            }
            if (deployment.getCreatedAt() != null) {
                jsonGenerator.writeFieldName("CreatedAt").writeValue(deployment.getCreatedAt());
            }
            if (deployment.getCompletedAt() != null) {
                jsonGenerator.writeFieldName("CompletedAt").writeValue(deployment.getCompletedAt());
            }
            if (deployment.getDuration() != null) {
                jsonGenerator.writeFieldName("Duration").writeValue(deployment.getDuration());
            }
            if (deployment.getIamUserArn() != null) {
                jsonGenerator.writeFieldName("IamUserArn").writeValue(deployment.getIamUserArn());
            }
            if (deployment.getComment() != null) {
                jsonGenerator.writeFieldName("Comment").writeValue(deployment.getComment());
            }
            if (deployment.getCommand() != null) {
                jsonGenerator.writeFieldName("Command");
                DeploymentCommandJsonMarshaller.getInstance().marshall(deployment.getCommand(), jsonGenerator);
            }
            if (deployment.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(deployment.getStatus());
            }
            if (deployment.getCustomJson() != null) {
                jsonGenerator.writeFieldName("CustomJson").writeValue(deployment.getCustomJson());
            }

            com.amazonaws.internal.SdkInternalList<String> instanceIdsList = (com.amazonaws.internal.SdkInternalList<String>) deployment.getInstanceIds();
            if (!instanceIdsList.isEmpty() || !instanceIdsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("InstanceIds");
                jsonGenerator.writeStartArray();
                for (String instanceIdsListValue : instanceIdsList) {
                    if (instanceIdsListValue != null) {
                        jsonGenerator.writeValue(instanceIdsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DeploymentJsonMarshaller instance;

    public static DeploymentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentJsonMarshaller();
        return instance;
    }

}
