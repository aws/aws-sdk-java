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

package com.amazonaws.services.codedeploy.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * DeploymentInfoMarshaller
 */
public class DeploymentInfoJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(DeploymentInfo deploymentInfo, JSONWriter jsonWriter) {
        if (deploymentInfo == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (deploymentInfo.getApplicationName() != null) {
                jsonWriter.key("applicationName").value(
                        deploymentInfo.getApplicationName());
            }

            if (deploymentInfo.getDeploymentGroupName() != null) {
                jsonWriter.key("deploymentGroupName").value(
                        deploymentInfo.getDeploymentGroupName());
            }

            if (deploymentInfo.getDeploymentConfigName() != null) {
                jsonWriter.key("deploymentConfigName").value(
                        deploymentInfo.getDeploymentConfigName());
            }

            if (deploymentInfo.getDeploymentId() != null) {
                jsonWriter.key("deploymentId").value(
                        deploymentInfo.getDeploymentId());
            }

            if (deploymentInfo.getRevision() != null) {
                jsonWriter.key("revision");
                RevisionLocationJsonMarshaller.getInstance().marshall(
                        deploymentInfo.getRevision(), jsonWriter);
            }

            if (deploymentInfo.getStatus() != null) {
                jsonWriter.key("status").value(deploymentInfo.getStatus());
            }

            if (deploymentInfo.getErrorInformation() != null) {
                jsonWriter.key("errorInformation");
                ErrorInformationJsonMarshaller.getInstance().marshall(
                        deploymentInfo.getErrorInformation(), jsonWriter);
            }

            if (deploymentInfo.getCreateTime() != null) {
                jsonWriter.key("createTime").value(
                        deploymentInfo.getCreateTime());
            }

            if (deploymentInfo.getStartTime() != null) {
                jsonWriter.key("startTime")
                        .value(deploymentInfo.getStartTime());
            }

            if (deploymentInfo.getCompleteTime() != null) {
                jsonWriter.key("completeTime").value(
                        deploymentInfo.getCompleteTime());
            }

            if (deploymentInfo.getDeploymentOverview() != null) {
                jsonWriter.key("deploymentOverview");
                DeploymentOverviewJsonMarshaller.getInstance().marshall(
                        deploymentInfo.getDeploymentOverview(), jsonWriter);
            }

            if (deploymentInfo.getDescription() != null) {
                jsonWriter.key("description").value(
                        deploymentInfo.getDescription());
            }

            if (deploymentInfo.getCreator() != null) {
                jsonWriter.key("creator").value(deploymentInfo.getCreator());
            }

            if (deploymentInfo.getIgnoreApplicationStopFailures() != null) {
                jsonWriter.key("ignoreApplicationStopFailures").value(
                        deploymentInfo.getIgnoreApplicationStopFailures());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DeploymentInfoJsonMarshaller instance;

    public static DeploymentInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentInfoJsonMarshaller();
        return instance;
    }

}
