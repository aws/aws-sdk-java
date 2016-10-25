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
package com.amazonaws.services.ecs.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ContainerDefinitionMarshaller
 */
public class ContainerDefinitionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ContainerDefinition containerDefinition, StructuredJsonGenerator jsonGenerator) {

        if (containerDefinition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (containerDefinition.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(containerDefinition.getName());
            }
            if (containerDefinition.getImage() != null) {
                jsonGenerator.writeFieldName("image").writeValue(containerDefinition.getImage());
            }
            if (containerDefinition.getCpu() != null) {
                jsonGenerator.writeFieldName("cpu").writeValue(containerDefinition.getCpu());
            }
            if (containerDefinition.getMemory() != null) {
                jsonGenerator.writeFieldName("memory").writeValue(containerDefinition.getMemory());
            }
            if (containerDefinition.getMemoryReservation() != null) {
                jsonGenerator.writeFieldName("memoryReservation").writeValue(containerDefinition.getMemoryReservation());
            }

            com.amazonaws.internal.SdkInternalList<String> linksList = (com.amazonaws.internal.SdkInternalList<String>) containerDefinition.getLinks();
            if (!linksList.isEmpty() || !linksList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("links");
                jsonGenerator.writeStartArray();
                for (String linksListValue : linksList) {
                    if (linksListValue != null) {
                        jsonGenerator.writeValue(linksListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<PortMapping> portMappingsList = (com.amazonaws.internal.SdkInternalList<PortMapping>) containerDefinition
                    .getPortMappings();
            if (!portMappingsList.isEmpty() || !portMappingsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("portMappings");
                jsonGenerator.writeStartArray();
                for (PortMapping portMappingsListValue : portMappingsList) {
                    if (portMappingsListValue != null) {

                        PortMappingJsonMarshaller.getInstance().marshall(portMappingsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (containerDefinition.getEssential() != null) {
                jsonGenerator.writeFieldName("essential").writeValue(containerDefinition.getEssential());
            }

            com.amazonaws.internal.SdkInternalList<String> entryPointList = (com.amazonaws.internal.SdkInternalList<String>) containerDefinition
                    .getEntryPoint();
            if (!entryPointList.isEmpty() || !entryPointList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("entryPoint");
                jsonGenerator.writeStartArray();
                for (String entryPointListValue : entryPointList) {
                    if (entryPointListValue != null) {
                        jsonGenerator.writeValue(entryPointListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<String> commandList = (com.amazonaws.internal.SdkInternalList<String>) containerDefinition.getCommand();
            if (!commandList.isEmpty() || !commandList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("command");
                jsonGenerator.writeStartArray();
                for (String commandListValue : commandList) {
                    if (commandListValue != null) {
                        jsonGenerator.writeValue(commandListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<KeyValuePair> environmentList = (com.amazonaws.internal.SdkInternalList<KeyValuePair>) containerDefinition
                    .getEnvironment();
            if (!environmentList.isEmpty() || !environmentList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("environment");
                jsonGenerator.writeStartArray();
                for (KeyValuePair environmentListValue : environmentList) {
                    if (environmentListValue != null) {

                        KeyValuePairJsonMarshaller.getInstance().marshall(environmentListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<MountPoint> mountPointsList = (com.amazonaws.internal.SdkInternalList<MountPoint>) containerDefinition
                    .getMountPoints();
            if (!mountPointsList.isEmpty() || !mountPointsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("mountPoints");
                jsonGenerator.writeStartArray();
                for (MountPoint mountPointsListValue : mountPointsList) {
                    if (mountPointsListValue != null) {

                        MountPointJsonMarshaller.getInstance().marshall(mountPointsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<VolumeFrom> volumesFromList = (com.amazonaws.internal.SdkInternalList<VolumeFrom>) containerDefinition
                    .getVolumesFrom();
            if (!volumesFromList.isEmpty() || !volumesFromList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("volumesFrom");
                jsonGenerator.writeStartArray();
                for (VolumeFrom volumesFromListValue : volumesFromList) {
                    if (volumesFromListValue != null) {

                        VolumeFromJsonMarshaller.getInstance().marshall(volumesFromListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (containerDefinition.getHostname() != null) {
                jsonGenerator.writeFieldName("hostname").writeValue(containerDefinition.getHostname());
            }
            if (containerDefinition.getUser() != null) {
                jsonGenerator.writeFieldName("user").writeValue(containerDefinition.getUser());
            }
            if (containerDefinition.getWorkingDirectory() != null) {
                jsonGenerator.writeFieldName("workingDirectory").writeValue(containerDefinition.getWorkingDirectory());
            }
            if (containerDefinition.getDisableNetworking() != null) {
                jsonGenerator.writeFieldName("disableNetworking").writeValue(containerDefinition.getDisableNetworking());
            }
            if (containerDefinition.getPrivileged() != null) {
                jsonGenerator.writeFieldName("privileged").writeValue(containerDefinition.getPrivileged());
            }
            if (containerDefinition.getReadonlyRootFilesystem() != null) {
                jsonGenerator.writeFieldName("readonlyRootFilesystem").writeValue(containerDefinition.getReadonlyRootFilesystem());
            }

            com.amazonaws.internal.SdkInternalList<String> dnsServersList = (com.amazonaws.internal.SdkInternalList<String>) containerDefinition
                    .getDnsServers();
            if (!dnsServersList.isEmpty() || !dnsServersList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("dnsServers");
                jsonGenerator.writeStartArray();
                for (String dnsServersListValue : dnsServersList) {
                    if (dnsServersListValue != null) {
                        jsonGenerator.writeValue(dnsServersListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<String> dnsSearchDomainsList = (com.amazonaws.internal.SdkInternalList<String>) containerDefinition
                    .getDnsSearchDomains();
            if (!dnsSearchDomainsList.isEmpty() || !dnsSearchDomainsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("dnsSearchDomains");
                jsonGenerator.writeStartArray();
                for (String dnsSearchDomainsListValue : dnsSearchDomainsList) {
                    if (dnsSearchDomainsListValue != null) {
                        jsonGenerator.writeValue(dnsSearchDomainsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<HostEntry> extraHostsList = (com.amazonaws.internal.SdkInternalList<HostEntry>) containerDefinition
                    .getExtraHosts();
            if (!extraHostsList.isEmpty() || !extraHostsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("extraHosts");
                jsonGenerator.writeStartArray();
                for (HostEntry extraHostsListValue : extraHostsList) {
                    if (extraHostsListValue != null) {

                        HostEntryJsonMarshaller.getInstance().marshall(extraHostsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<String> dockerSecurityOptionsList = (com.amazonaws.internal.SdkInternalList<String>) containerDefinition
                    .getDockerSecurityOptions();
            if (!dockerSecurityOptionsList.isEmpty() || !dockerSecurityOptionsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("dockerSecurityOptions");
                jsonGenerator.writeStartArray();
                for (String dockerSecurityOptionsListValue : dockerSecurityOptionsList) {
                    if (dockerSecurityOptionsListValue != null) {
                        jsonGenerator.writeValue(dockerSecurityOptionsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.Map<String, String> dockerLabelsMap = containerDefinition.getDockerLabels();
            if (dockerLabelsMap != null) {
                jsonGenerator.writeFieldName("dockerLabels");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> dockerLabelsMapValue : dockerLabelsMap.entrySet()) {
                    if (dockerLabelsMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(dockerLabelsMapValue.getKey());

                        jsonGenerator.writeValue(dockerLabelsMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            com.amazonaws.internal.SdkInternalList<Ulimit> ulimitsList = (com.amazonaws.internal.SdkInternalList<Ulimit>) containerDefinition.getUlimits();
            if (!ulimitsList.isEmpty() || !ulimitsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("ulimits");
                jsonGenerator.writeStartArray();
                for (Ulimit ulimitsListValue : ulimitsList) {
                    if (ulimitsListValue != null) {

                        UlimitJsonMarshaller.getInstance().marshall(ulimitsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (containerDefinition.getLogConfiguration() != null) {
                jsonGenerator.writeFieldName("logConfiguration");
                LogConfigurationJsonMarshaller.getInstance().marshall(containerDefinition.getLogConfiguration(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ContainerDefinitionJsonMarshaller instance;

    public static ContainerDefinitionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContainerDefinitionJsonMarshaller();
        return instance;
    }

}
