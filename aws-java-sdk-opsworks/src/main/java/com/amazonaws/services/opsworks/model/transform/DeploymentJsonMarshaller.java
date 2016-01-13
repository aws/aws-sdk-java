/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.opsworks.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * DeploymentMarshaller
 */
public class DeploymentJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Deployment deployment, JSONWriter jsonWriter) {
        if (deployment == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (deployment.getDeploymentId() != null) {
                jsonWriter.key("DeploymentId").value(
                        deployment.getDeploymentId());
            }

            if (deployment.getStackId() != null) {
                jsonWriter.key("StackId").value(deployment.getStackId());
            }

            if (deployment.getAppId() != null) {
                jsonWriter.key("AppId").value(deployment.getAppId());
            }

            if (deployment.getCreatedAt() != null) {
                jsonWriter.key("CreatedAt").value(deployment.getCreatedAt());
            }

            if (deployment.getCompletedAt() != null) {
                jsonWriter.key("CompletedAt")
                        .value(deployment.getCompletedAt());
            }

            if (deployment.getDuration() != null) {
                jsonWriter.key("Duration").value(deployment.getDuration());
            }

            if (deployment.getIamUserArn() != null) {
                jsonWriter.key("IamUserArn").value(deployment.getIamUserArn());
            }

            if (deployment.getComment() != null) {
                jsonWriter.key("Comment").value(deployment.getComment());
            }

            if (deployment.getCommand() != null) {
                jsonWriter.key("Command");
                DeploymentCommandJsonMarshaller.getInstance().marshall(
                        deployment.getCommand(), jsonWriter);
            }

            if (deployment.getStatus() != null) {
                jsonWriter.key("Status").value(deployment.getStatus());
            }

            if (deployment.getCustomJson() != null) {
                jsonWriter.key("CustomJson").value(deployment.getCustomJson());
            }

            com.amazonaws.internal.SdkInternalList<String> instanceIdsList = (com.amazonaws.internal.SdkInternalList<String>) deployment
                    .getInstanceIds();
            if (!instanceIdsList.isEmpty()
                    || !instanceIdsList.isAutoConstruct()) {
                jsonWriter.key("InstanceIds");
                jsonWriter.array();
                for (String instanceIdsListValue : instanceIdsList) {
                    if (instanceIdsListValue != null) {
                        jsonWriter.value(instanceIdsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DeploymentJsonMarshaller instance;

    public static DeploymentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentJsonMarshaller();
        return instance;
    }

}
