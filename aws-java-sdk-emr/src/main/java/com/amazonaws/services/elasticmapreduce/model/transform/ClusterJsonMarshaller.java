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

package com.amazonaws.services.elasticmapreduce.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ClusterMarshaller
 */
public class ClusterJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Cluster cluster, JSONWriter jsonWriter) {
        if (cluster == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (cluster.getId() != null) {
                jsonWriter.key("Id").value(cluster.getId());
            }

            if (cluster.getName() != null) {
                jsonWriter.key("Name").value(cluster.getName());
            }

            if (cluster.getStatus() != null) {
                jsonWriter.key("Status");
                ClusterStatusJsonMarshaller.getInstance().marshall(
                        cluster.getStatus(), jsonWriter);
            }

            if (cluster.getEc2InstanceAttributes() != null) {
                jsonWriter.key("Ec2InstanceAttributes");
                Ec2InstanceAttributesJsonMarshaller.getInstance().marshall(
                        cluster.getEc2InstanceAttributes(), jsonWriter);
            }

            if (cluster.getLogUri() != null) {
                jsonWriter.key("LogUri").value(cluster.getLogUri());
            }

            if (cluster.getRequestedAmiVersion() != null) {
                jsonWriter.key("RequestedAmiVersion").value(
                        cluster.getRequestedAmiVersion());
            }

            if (cluster.getRunningAmiVersion() != null) {
                jsonWriter.key("RunningAmiVersion").value(
                        cluster.getRunningAmiVersion());
            }

            if (cluster.getReleaseLabel() != null) {
                jsonWriter.key("ReleaseLabel").value(cluster.getReleaseLabel());
            }

            if (cluster.getAutoTerminate() != null) {
                jsonWriter.key("AutoTerminate").value(
                        cluster.getAutoTerminate());
            }

            if (cluster.getTerminationProtected() != null) {
                jsonWriter.key("TerminationProtected").value(
                        cluster.getTerminationProtected());
            }

            if (cluster.getVisibleToAllUsers() != null) {
                jsonWriter.key("VisibleToAllUsers").value(
                        cluster.getVisibleToAllUsers());
            }

            com.amazonaws.internal.SdkInternalList<Application> applicationsList = (com.amazonaws.internal.SdkInternalList<Application>) cluster
                    .getApplications();
            if (!applicationsList.isEmpty()
                    || !applicationsList.isAutoConstruct()) {
                jsonWriter.key("Applications");
                jsonWriter.array();
                for (Application applicationsListValue : applicationsList) {
                    if (applicationsListValue != null) {

                        ApplicationJsonMarshaller.getInstance().marshall(
                                applicationsListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) cluster
                    .getTags();
            if (!tagsList.isEmpty() || !tagsList.isAutoConstruct()) {
                jsonWriter.key("Tags");
                jsonWriter.array();
                for (Tag tagsListValue : tagsList) {
                    if (tagsListValue != null) {

                        TagJsonMarshaller.getInstance().marshall(tagsListValue,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (cluster.getServiceRole() != null) {
                jsonWriter.key("ServiceRole").value(cluster.getServiceRole());
            }

            if (cluster.getNormalizedInstanceHours() != null) {
                jsonWriter.key("NormalizedInstanceHours").value(
                        cluster.getNormalizedInstanceHours());
            }

            if (cluster.getMasterPublicDnsName() != null) {
                jsonWriter.key("MasterPublicDnsName").value(
                        cluster.getMasterPublicDnsName());
            }

            com.amazonaws.internal.SdkInternalList<Configuration> configurationsList = (com.amazonaws.internal.SdkInternalList<Configuration>) cluster
                    .getConfigurations();
            if (!configurationsList.isEmpty()
                    || !configurationsList.isAutoConstruct()) {
                jsonWriter.key("Configurations");
                jsonWriter.array();
                for (Configuration configurationsListValue : configurationsList) {
                    if (configurationsListValue != null) {

                        ConfigurationJsonMarshaller.getInstance().marshall(
                                configurationsListValue, jsonWriter);
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

    private static ClusterJsonMarshaller instance;

    public static ClusterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ClusterJsonMarshaller();
        return instance;
    }

}
