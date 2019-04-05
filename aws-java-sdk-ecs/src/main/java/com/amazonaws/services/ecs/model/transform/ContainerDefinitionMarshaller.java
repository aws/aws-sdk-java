/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ecs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ContainerDefinitionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ContainerDefinitionMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> IMAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("image").build();
    private static final MarshallingInfo<StructuredPojo> REPOSITORYCREDENTIALS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("repositoryCredentials").build();
    private static final MarshallingInfo<Integer> CPU_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("cpu").build();
    private static final MarshallingInfo<Integer> MEMORY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("memory").build();
    private static final MarshallingInfo<Integer> MEMORYRESERVATION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("memoryReservation").build();
    private static final MarshallingInfo<List> LINKS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("links").build();
    private static final MarshallingInfo<List> PORTMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("portMappings").build();
    private static final MarshallingInfo<Boolean> ESSENTIAL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("essential").build();
    private static final MarshallingInfo<List> ENTRYPOINT_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("entryPoint").build();
    private static final MarshallingInfo<List> COMMAND_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("command").build();
    private static final MarshallingInfo<List> ENVIRONMENT_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("environment").build();
    private static final MarshallingInfo<List> MOUNTPOINTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("mountPoints").build();
    private static final MarshallingInfo<List> VOLUMESFROM_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("volumesFrom").build();
    private static final MarshallingInfo<StructuredPojo> LINUXPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("linuxParameters").build();
    private static final MarshallingInfo<List> SECRETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("secrets").build();
    private static final MarshallingInfo<List> DEPENDSON_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("dependsOn").build();
    private static final MarshallingInfo<Integer> STARTTIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTimeout").build();
    private static final MarshallingInfo<Integer> STOPTIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stopTimeout").build();
    private static final MarshallingInfo<String> HOSTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("hostname").build();
    private static final MarshallingInfo<String> USER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("user").build();
    private static final MarshallingInfo<String> WORKINGDIRECTORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workingDirectory").build();
    private static final MarshallingInfo<Boolean> DISABLENETWORKING_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("disableNetworking").build();
    private static final MarshallingInfo<Boolean> PRIVILEGED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("privileged").build();
    private static final MarshallingInfo<Boolean> READONLYROOTFILESYSTEM_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("readonlyRootFilesystem").build();
    private static final MarshallingInfo<List> DNSSERVERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("dnsServers").build();
    private static final MarshallingInfo<List> DNSSEARCHDOMAINS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dnsSearchDomains").build();
    private static final MarshallingInfo<List> EXTRAHOSTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("extraHosts").build();
    private static final MarshallingInfo<List> DOCKERSECURITYOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dockerSecurityOptions").build();
    private static final MarshallingInfo<Boolean> INTERACTIVE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("interactive").build();
    private static final MarshallingInfo<Boolean> PSEUDOTERMINAL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pseudoTerminal").build();
    private static final MarshallingInfo<Map> DOCKERLABELS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("dockerLabels").build();
    private static final MarshallingInfo<List> ULIMITS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ulimits").build();
    private static final MarshallingInfo<StructuredPojo> LOGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> HEALTHCHECK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("healthCheck").build();
    private static final MarshallingInfo<List> SYSTEMCONTROLS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("systemControls").build();
    private static final MarshallingInfo<List> RESOURCEREQUIREMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceRequirements").build();

    private static final ContainerDefinitionMarshaller instance = new ContainerDefinitionMarshaller();

    public static ContainerDefinitionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ContainerDefinition containerDefinition, ProtocolMarshaller protocolMarshaller) {

        if (containerDefinition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(containerDefinition.getName(), NAME_BINDING);
            protocolMarshaller.marshall(containerDefinition.getImage(), IMAGE_BINDING);
            protocolMarshaller.marshall(containerDefinition.getRepositoryCredentials(), REPOSITORYCREDENTIALS_BINDING);
            protocolMarshaller.marshall(containerDefinition.getCpu(), CPU_BINDING);
            protocolMarshaller.marshall(containerDefinition.getMemory(), MEMORY_BINDING);
            protocolMarshaller.marshall(containerDefinition.getMemoryReservation(), MEMORYRESERVATION_BINDING);
            protocolMarshaller.marshall(containerDefinition.getLinks(), LINKS_BINDING);
            protocolMarshaller.marshall(containerDefinition.getPortMappings(), PORTMAPPINGS_BINDING);
            protocolMarshaller.marshall(containerDefinition.getEssential(), ESSENTIAL_BINDING);
            protocolMarshaller.marshall(containerDefinition.getEntryPoint(), ENTRYPOINT_BINDING);
            protocolMarshaller.marshall(containerDefinition.getCommand(), COMMAND_BINDING);
            protocolMarshaller.marshall(containerDefinition.getEnvironment(), ENVIRONMENT_BINDING);
            protocolMarshaller.marshall(containerDefinition.getMountPoints(), MOUNTPOINTS_BINDING);
            protocolMarshaller.marshall(containerDefinition.getVolumesFrom(), VOLUMESFROM_BINDING);
            protocolMarshaller.marshall(containerDefinition.getLinuxParameters(), LINUXPARAMETERS_BINDING);
            protocolMarshaller.marshall(containerDefinition.getSecrets(), SECRETS_BINDING);
            protocolMarshaller.marshall(containerDefinition.getDependsOn(), DEPENDSON_BINDING);
            protocolMarshaller.marshall(containerDefinition.getStartTimeout(), STARTTIMEOUT_BINDING);
            protocolMarshaller.marshall(containerDefinition.getStopTimeout(), STOPTIMEOUT_BINDING);
            protocolMarshaller.marshall(containerDefinition.getHostname(), HOSTNAME_BINDING);
            protocolMarshaller.marshall(containerDefinition.getUser(), USER_BINDING);
            protocolMarshaller.marshall(containerDefinition.getWorkingDirectory(), WORKINGDIRECTORY_BINDING);
            protocolMarshaller.marshall(containerDefinition.getDisableNetworking(), DISABLENETWORKING_BINDING);
            protocolMarshaller.marshall(containerDefinition.getPrivileged(), PRIVILEGED_BINDING);
            protocolMarshaller.marshall(containerDefinition.getReadonlyRootFilesystem(), READONLYROOTFILESYSTEM_BINDING);
            protocolMarshaller.marshall(containerDefinition.getDnsServers(), DNSSERVERS_BINDING);
            protocolMarshaller.marshall(containerDefinition.getDnsSearchDomains(), DNSSEARCHDOMAINS_BINDING);
            protocolMarshaller.marshall(containerDefinition.getExtraHosts(), EXTRAHOSTS_BINDING);
            protocolMarshaller.marshall(containerDefinition.getDockerSecurityOptions(), DOCKERSECURITYOPTIONS_BINDING);
            protocolMarshaller.marshall(containerDefinition.getInteractive(), INTERACTIVE_BINDING);
            protocolMarshaller.marshall(containerDefinition.getPseudoTerminal(), PSEUDOTERMINAL_BINDING);
            protocolMarshaller.marshall(containerDefinition.getDockerLabels(), DOCKERLABELS_BINDING);
            protocolMarshaller.marshall(containerDefinition.getUlimits(), ULIMITS_BINDING);
            protocolMarshaller.marshall(containerDefinition.getLogConfiguration(), LOGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(containerDefinition.getHealthCheck(), HEALTHCHECK_BINDING);
            protocolMarshaller.marshall(containerDefinition.getSystemControls(), SYSTEMCONTROLS_BINDING);
            protocolMarshaller.marshall(containerDefinition.getResourceRequirements(), RESOURCEREQUIREMENTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
