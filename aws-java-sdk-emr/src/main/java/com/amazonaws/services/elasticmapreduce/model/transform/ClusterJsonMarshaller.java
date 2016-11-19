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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ClusterMarshaller
 */
public class ClusterJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Cluster cluster, StructuredJsonGenerator jsonGenerator) {

        if (cluster == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (cluster.getId() != null) {
                jsonGenerator.writeFieldName("Id").writeValue(cluster.getId());
            }
            if (cluster.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(cluster.getName());
            }
            if (cluster.getStatus() != null) {
                jsonGenerator.writeFieldName("Status");
                ClusterStatusJsonMarshaller.getInstance().marshall(cluster.getStatus(), jsonGenerator);
            }
            if (cluster.getEc2InstanceAttributes() != null) {
                jsonGenerator.writeFieldName("Ec2InstanceAttributes");
                Ec2InstanceAttributesJsonMarshaller.getInstance().marshall(cluster.getEc2InstanceAttributes(), jsonGenerator);
            }
            if (cluster.getLogUri() != null) {
                jsonGenerator.writeFieldName("LogUri").writeValue(cluster.getLogUri());
            }
            if (cluster.getRequestedAmiVersion() != null) {
                jsonGenerator.writeFieldName("RequestedAmiVersion").writeValue(cluster.getRequestedAmiVersion());
            }
            if (cluster.getRunningAmiVersion() != null) {
                jsonGenerator.writeFieldName("RunningAmiVersion").writeValue(cluster.getRunningAmiVersion());
            }
            if (cluster.getReleaseLabel() != null) {
                jsonGenerator.writeFieldName("ReleaseLabel").writeValue(cluster.getReleaseLabel());
            }
            if (cluster.getAutoTerminate() != null) {
                jsonGenerator.writeFieldName("AutoTerminate").writeValue(cluster.getAutoTerminate());
            }
            if (cluster.getTerminationProtected() != null) {
                jsonGenerator.writeFieldName("TerminationProtected").writeValue(cluster.getTerminationProtected());
            }
            if (cluster.getVisibleToAllUsers() != null) {
                jsonGenerator.writeFieldName("VisibleToAllUsers").writeValue(cluster.getVisibleToAllUsers());
            }

            com.amazonaws.internal.SdkInternalList<Application> applicationsList = (com.amazonaws.internal.SdkInternalList<Application>) cluster
                    .getApplications();
            if (!applicationsList.isEmpty() || !applicationsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Applications");
                jsonGenerator.writeStartArray();
                for (Application applicationsListValue : applicationsList) {
                    if (applicationsListValue != null) {

                        ApplicationJsonMarshaller.getInstance().marshall(applicationsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) cluster.getTags();
            if (!tagsList.isEmpty() || !tagsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Tags");
                jsonGenerator.writeStartArray();
                for (Tag tagsListValue : tagsList) {
                    if (tagsListValue != null) {

                        TagJsonMarshaller.getInstance().marshall(tagsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (cluster.getServiceRole() != null) {
                jsonGenerator.writeFieldName("ServiceRole").writeValue(cluster.getServiceRole());
            }
            if (cluster.getNormalizedInstanceHours() != null) {
                jsonGenerator.writeFieldName("NormalizedInstanceHours").writeValue(cluster.getNormalizedInstanceHours());
            }
            if (cluster.getMasterPublicDnsName() != null) {
                jsonGenerator.writeFieldName("MasterPublicDnsName").writeValue(cluster.getMasterPublicDnsName());
            }

            com.amazonaws.internal.SdkInternalList<Configuration> configurationsList = (com.amazonaws.internal.SdkInternalList<Configuration>) cluster
                    .getConfigurations();
            if (!configurationsList.isEmpty() || !configurationsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Configurations");
                jsonGenerator.writeStartArray();
                for (Configuration configurationsListValue : configurationsList) {
                    if (configurationsListValue != null) {

                        ConfigurationJsonMarshaller.getInstance().marshall(configurationsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (cluster.getSecurityConfiguration() != null) {
                jsonGenerator.writeFieldName("SecurityConfiguration").writeValue(cluster.getSecurityConfiguration());
            }
            if (cluster.getAutoScalingRole() != null) {
                jsonGenerator.writeFieldName("AutoScalingRole").writeValue(cluster.getAutoScalingRole());
            }
            if (cluster.getScaleDownBehavior() != null) {
                jsonGenerator.writeFieldName("ScaleDownBehavior").writeValue(cluster.getScaleDownBehavior());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ClusterJsonMarshaller instance;

    public static ClusterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ClusterJsonMarshaller();
        return instance;
    }

}
