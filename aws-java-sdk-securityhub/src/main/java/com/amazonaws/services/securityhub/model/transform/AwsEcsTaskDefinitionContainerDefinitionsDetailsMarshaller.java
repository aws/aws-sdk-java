/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsEcsTaskDefinitionContainerDefinitionsDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEcsTaskDefinitionContainerDefinitionsDetailsMarshaller {

    private static final MarshallingInfo<List> COMMAND_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Command").build();
    private static final MarshallingInfo<Integer> CPU_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Cpu").build();
    private static final MarshallingInfo<List> DEPENDSON_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DependsOn").build();
    private static final MarshallingInfo<Boolean> DISABLENETWORKING_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisableNetworking").build();
    private static final MarshallingInfo<List> DNSSEARCHDOMAINS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DnsSearchDomains").build();
    private static final MarshallingInfo<List> DNSSERVERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DnsServers").build();
    private static final MarshallingInfo<Map> DOCKERLABELS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DockerLabels").build();
    private static final MarshallingInfo<List> DOCKERSECURITYOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DockerSecurityOptions").build();
    private static final MarshallingInfo<List> ENTRYPOINT_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("EntryPoint").build();
    private static final MarshallingInfo<List> ENVIRONMENT_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Environment").build();
    private static final MarshallingInfo<List> ENVIRONMENTFILES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnvironmentFiles").build();
    private static final MarshallingInfo<Boolean> ESSENTIAL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Essential").build();
    private static final MarshallingInfo<List> EXTRAHOSTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ExtraHosts").build();
    private static final MarshallingInfo<StructuredPojo> FIRELENSCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirelensConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> HEALTHCHECK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HealthCheck").build();
    private static final MarshallingInfo<String> HOSTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Hostname").build();
    private static final MarshallingInfo<String> IMAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Image").build();
    private static final MarshallingInfo<Boolean> INTERACTIVE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Interactive").build();
    private static final MarshallingInfo<List> LINKS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Links").build();
    private static final MarshallingInfo<StructuredPojo> LINUXPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LinuxParameters").build();
    private static final MarshallingInfo<StructuredPojo> LOGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LogConfiguration").build();
    private static final MarshallingInfo<Integer> MEMORY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Memory").build();
    private static final MarshallingInfo<Integer> MEMORYRESERVATION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MemoryReservation").build();
    private static final MarshallingInfo<List> MOUNTPOINTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MountPoints").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<List> PORTMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PortMappings").build();
    private static final MarshallingInfo<Boolean> PRIVILEGED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Privileged").build();
    private static final MarshallingInfo<Boolean> PSEUDOTERMINAL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PseudoTerminal").build();
    private static final MarshallingInfo<Boolean> READONLYROOTFILESYSTEM_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReadonlyRootFilesystem").build();
    private static final MarshallingInfo<StructuredPojo> REPOSITORYCREDENTIALS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RepositoryCredentials").build();
    private static final MarshallingInfo<List> RESOURCEREQUIREMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceRequirements").build();
    private static final MarshallingInfo<List> SECRETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Secrets").build();
    private static final MarshallingInfo<Integer> STARTTIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTimeout").build();
    private static final MarshallingInfo<Integer> STOPTIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StopTimeout").build();
    private static final MarshallingInfo<List> SYSTEMCONTROLS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SystemControls").build();
    private static final MarshallingInfo<List> ULIMITS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Ulimits").build();
    private static final MarshallingInfo<String> USER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("User").build();
    private static final MarshallingInfo<List> VOLUMESFROM_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VolumesFrom").build();
    private static final MarshallingInfo<String> WORKINGDIRECTORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkingDirectory").build();

    private static final AwsEcsTaskDefinitionContainerDefinitionsDetailsMarshaller instance = new AwsEcsTaskDefinitionContainerDefinitionsDetailsMarshaller();

    public static AwsEcsTaskDefinitionContainerDefinitionsDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEcsTaskDefinitionContainerDefinitionsDetails awsEcsTaskDefinitionContainerDefinitionsDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsEcsTaskDefinitionContainerDefinitionsDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getCommand(), COMMAND_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getCpu(), CPU_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getDependsOn(), DEPENDSON_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getDisableNetworking(), DISABLENETWORKING_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getDnsSearchDomains(), DNSSEARCHDOMAINS_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getDnsServers(), DNSSERVERS_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getDockerLabels(), DOCKERLABELS_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getDockerSecurityOptions(), DOCKERSECURITYOPTIONS_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getEntryPoint(), ENTRYPOINT_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getEnvironment(), ENVIRONMENT_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getEnvironmentFiles(), ENVIRONMENTFILES_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getEssential(), ESSENTIAL_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getExtraHosts(), EXTRAHOSTS_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getFirelensConfiguration(), FIRELENSCONFIGURATION_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getHealthCheck(), HEALTHCHECK_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getHostname(), HOSTNAME_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getImage(), IMAGE_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getInteractive(), INTERACTIVE_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getLinks(), LINKS_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getLinuxParameters(), LINUXPARAMETERS_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getLogConfiguration(), LOGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getMemory(), MEMORY_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getMemoryReservation(), MEMORYRESERVATION_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getMountPoints(), MOUNTPOINTS_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getName(), NAME_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getPortMappings(), PORTMAPPINGS_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getPrivileged(), PRIVILEGED_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getPseudoTerminal(), PSEUDOTERMINAL_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getReadonlyRootFilesystem(), READONLYROOTFILESYSTEM_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getRepositoryCredentials(), REPOSITORYCREDENTIALS_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getResourceRequirements(), RESOURCEREQUIREMENTS_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getSecrets(), SECRETS_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getStartTimeout(), STARTTIMEOUT_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getStopTimeout(), STOPTIMEOUT_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getSystemControls(), SYSTEMCONTROLS_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getUlimits(), ULIMITS_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getUser(), USER_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getVolumesFrom(), VOLUMESFROM_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsDetails.getWorkingDirectory(), WORKINGDIRECTORY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
