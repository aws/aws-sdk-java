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

package com.amazonaws.services.ecs.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ContainerDefinitionMarshaller
 */
public class ContainerDefinitionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(ContainerDefinition containerDefinition,
            JSONWriter jsonWriter) {
        if (containerDefinition == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (containerDefinition.getName() != null) {
                jsonWriter.key("name").value(containerDefinition.getName());
            }

            if (containerDefinition.getImage() != null) {
                jsonWriter.key("image").value(containerDefinition.getImage());
            }

            if (containerDefinition.getCpu() != null) {
                jsonWriter.key("cpu").value(containerDefinition.getCpu());
            }

            if (containerDefinition.getMemory() != null) {
                jsonWriter.key("memory").value(containerDefinition.getMemory());
            }

            com.amazonaws.internal.SdkInternalList<String> linksList = (com.amazonaws.internal.SdkInternalList<String>) containerDefinition
                    .getLinks();
            if (!linksList.isEmpty() || !linksList.isAutoConstruct()) {
                jsonWriter.key("links");
                jsonWriter.array();
                for (String linksListValue : linksList) {
                    if (linksListValue != null) {
                        jsonWriter.value(linksListValue);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<PortMapping> portMappingsList = (com.amazonaws.internal.SdkInternalList<PortMapping>) containerDefinition
                    .getPortMappings();
            if (!portMappingsList.isEmpty()
                    || !portMappingsList.isAutoConstruct()) {
                jsonWriter.key("portMappings");
                jsonWriter.array();
                for (PortMapping portMappingsListValue : portMappingsList) {
                    if (portMappingsListValue != null) {

                        PortMappingJsonMarshaller.getInstance().marshall(
                                portMappingsListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (containerDefinition.getEssential() != null) {
                jsonWriter.key("essential").value(
                        containerDefinition.getEssential());
            }

            com.amazonaws.internal.SdkInternalList<String> entryPointList = (com.amazonaws.internal.SdkInternalList<String>) containerDefinition
                    .getEntryPoint();
            if (!entryPointList.isEmpty() || !entryPointList.isAutoConstruct()) {
                jsonWriter.key("entryPoint");
                jsonWriter.array();
                for (String entryPointListValue : entryPointList) {
                    if (entryPointListValue != null) {
                        jsonWriter.value(entryPointListValue);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<String> commandList = (com.amazonaws.internal.SdkInternalList<String>) containerDefinition
                    .getCommand();
            if (!commandList.isEmpty() || !commandList.isAutoConstruct()) {
                jsonWriter.key("command");
                jsonWriter.array();
                for (String commandListValue : commandList) {
                    if (commandListValue != null) {
                        jsonWriter.value(commandListValue);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<KeyValuePair> environmentList = (com.amazonaws.internal.SdkInternalList<KeyValuePair>) containerDefinition
                    .getEnvironment();
            if (!environmentList.isEmpty()
                    || !environmentList.isAutoConstruct()) {
                jsonWriter.key("environment");
                jsonWriter.array();
                for (KeyValuePair environmentListValue : environmentList) {
                    if (environmentListValue != null) {

                        KeyValuePairJsonMarshaller.getInstance().marshall(
                                environmentListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<MountPoint> mountPointsList = (com.amazonaws.internal.SdkInternalList<MountPoint>) containerDefinition
                    .getMountPoints();
            if (!mountPointsList.isEmpty()
                    || !mountPointsList.isAutoConstruct()) {
                jsonWriter.key("mountPoints");
                jsonWriter.array();
                for (MountPoint mountPointsListValue : mountPointsList) {
                    if (mountPointsListValue != null) {

                        MountPointJsonMarshaller.getInstance().marshall(
                                mountPointsListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<VolumeFrom> volumesFromList = (com.amazonaws.internal.SdkInternalList<VolumeFrom>) containerDefinition
                    .getVolumesFrom();
            if (!volumesFromList.isEmpty()
                    || !volumesFromList.isAutoConstruct()) {
                jsonWriter.key("volumesFrom");
                jsonWriter.array();
                for (VolumeFrom volumesFromListValue : volumesFromList) {
                    if (volumesFromListValue != null) {

                        VolumeFromJsonMarshaller.getInstance().marshall(
                                volumesFromListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (containerDefinition.getHostname() != null) {
                jsonWriter.key("hostname").value(
                        containerDefinition.getHostname());
            }

            if (containerDefinition.getUser() != null) {
                jsonWriter.key("user").value(containerDefinition.getUser());
            }

            if (containerDefinition.getWorkingDirectory() != null) {
                jsonWriter.key("workingDirectory").value(
                        containerDefinition.getWorkingDirectory());
            }

            if (containerDefinition.getDisableNetworking() != null) {
                jsonWriter.key("disableNetworking").value(
                        containerDefinition.getDisableNetworking());
            }

            if (containerDefinition.getPrivileged() != null) {
                jsonWriter.key("privileged").value(
                        containerDefinition.getPrivileged());
            }

            if (containerDefinition.getReadonlyRootFilesystem() != null) {
                jsonWriter.key("readonlyRootFilesystem").value(
                        containerDefinition.getReadonlyRootFilesystem());
            }

            com.amazonaws.internal.SdkInternalList<String> dnsServersList = (com.amazonaws.internal.SdkInternalList<String>) containerDefinition
                    .getDnsServers();
            if (!dnsServersList.isEmpty() || !dnsServersList.isAutoConstruct()) {
                jsonWriter.key("dnsServers");
                jsonWriter.array();
                for (String dnsServersListValue : dnsServersList) {
                    if (dnsServersListValue != null) {
                        jsonWriter.value(dnsServersListValue);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<String> dnsSearchDomainsList = (com.amazonaws.internal.SdkInternalList<String>) containerDefinition
                    .getDnsSearchDomains();
            if (!dnsSearchDomainsList.isEmpty()
                    || !dnsSearchDomainsList.isAutoConstruct()) {
                jsonWriter.key("dnsSearchDomains");
                jsonWriter.array();
                for (String dnsSearchDomainsListValue : dnsSearchDomainsList) {
                    if (dnsSearchDomainsListValue != null) {
                        jsonWriter.value(dnsSearchDomainsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<HostEntry> extraHostsList = (com.amazonaws.internal.SdkInternalList<HostEntry>) containerDefinition
                    .getExtraHosts();
            if (!extraHostsList.isEmpty() || !extraHostsList.isAutoConstruct()) {
                jsonWriter.key("extraHosts");
                jsonWriter.array();
                for (HostEntry extraHostsListValue : extraHostsList) {
                    if (extraHostsListValue != null) {

                        HostEntryJsonMarshaller.getInstance().marshall(
                                extraHostsListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<String> dockerSecurityOptionsList = (com.amazonaws.internal.SdkInternalList<String>) containerDefinition
                    .getDockerSecurityOptions();
            if (!dockerSecurityOptionsList.isEmpty()
                    || !dockerSecurityOptionsList.isAutoConstruct()) {
                jsonWriter.key("dockerSecurityOptions");
                jsonWriter.array();
                for (String dockerSecurityOptionsListValue : dockerSecurityOptionsList) {
                    if (dockerSecurityOptionsListValue != null) {
                        jsonWriter.value(dockerSecurityOptionsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            java.util.Map<String, String> dockerLabelsMap = containerDefinition
                    .getDockerLabels();
            if (dockerLabelsMap != null) {
                jsonWriter.key("dockerLabels");
                jsonWriter.object();

                for (Map.Entry<String, String> dockerLabelsMapValue : dockerLabelsMap
                        .entrySet()) {
                    if (dockerLabelsMapValue.getValue() != null) {
                        jsonWriter.key(dockerLabelsMapValue.getKey());

                        jsonWriter.value(dockerLabelsMapValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }

            com.amazonaws.internal.SdkInternalList<Ulimit> ulimitsList = (com.amazonaws.internal.SdkInternalList<Ulimit>) containerDefinition
                    .getUlimits();
            if (!ulimitsList.isEmpty() || !ulimitsList.isAutoConstruct()) {
                jsonWriter.key("ulimits");
                jsonWriter.array();
                for (Ulimit ulimitsListValue : ulimitsList) {
                    if (ulimitsListValue != null) {

                        UlimitJsonMarshaller.getInstance().marshall(
                                ulimitsListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (containerDefinition.getLogConfiguration() != null) {
                jsonWriter.key("logConfiguration");
                LogConfigurationJsonMarshaller.getInstance().marshall(
                        containerDefinition.getLogConfiguration(), jsonWriter);
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ContainerDefinitionJsonMarshaller instance;

    public static ContainerDefinitionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContainerDefinitionJsonMarshaller();
        return instance;
    }

}
