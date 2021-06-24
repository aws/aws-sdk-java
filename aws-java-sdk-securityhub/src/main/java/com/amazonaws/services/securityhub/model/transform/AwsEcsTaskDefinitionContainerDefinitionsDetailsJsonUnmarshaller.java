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

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsEcsTaskDefinitionContainerDefinitionsDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsTaskDefinitionContainerDefinitionsDetailsJsonUnmarshaller implements
        Unmarshaller<AwsEcsTaskDefinitionContainerDefinitionsDetails, JsonUnmarshallerContext> {

    public AwsEcsTaskDefinitionContainerDefinitionsDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsEcsTaskDefinitionContainerDefinitionsDetails awsEcsTaskDefinitionContainerDefinitionsDetails = new AwsEcsTaskDefinitionContainerDefinitionsDetails();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Command", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setCommand(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Cpu", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setCpu(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DependsOn", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails
                            .setDependsOn(new ListUnmarshaller<AwsEcsTaskDefinitionContainerDefinitionsDependsOnDetails>(
                                    AwsEcsTaskDefinitionContainerDefinitionsDependsOnDetailsJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("DisableNetworking", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setDisableNetworking(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("DnsSearchDomains", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setDnsSearchDomains(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("DnsServers", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setDnsServers(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("DockerLabels", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setDockerLabels(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class),
                            context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("DockerSecurityOptions", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails
                            .setDockerSecurityOptions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                            .unmarshall(context));
                }
                if (context.testExpression("EntryPoint", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setEntryPoint(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Environment", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails
                            .setEnvironment(new ListUnmarshaller<AwsEcsTaskDefinitionContainerDefinitionsEnvironmentDetails>(
                                    AwsEcsTaskDefinitionContainerDefinitionsEnvironmentDetailsJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("EnvironmentFiles", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails
                            .setEnvironmentFiles(new ListUnmarshaller<AwsEcsTaskDefinitionContainerDefinitionsEnvironmentFilesDetails>(
                                    AwsEcsTaskDefinitionContainerDefinitionsEnvironmentFilesDetailsJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("Essential", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setEssential(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ExtraHosts", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails
                            .setExtraHosts(new ListUnmarshaller<AwsEcsTaskDefinitionContainerDefinitionsExtraHostsDetails>(
                                    AwsEcsTaskDefinitionContainerDefinitionsExtraHostsDetailsJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("FirelensConfiguration", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails
                            .setFirelensConfiguration(AwsEcsTaskDefinitionContainerDefinitionsFirelensConfigurationDetailsJsonUnmarshaller.getInstance()
                                    .unmarshall(context));
                }
                if (context.testExpression("HealthCheck", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setHealthCheck(AwsEcsTaskDefinitionContainerDefinitionsHealthCheckDetailsJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("Hostname", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setHostname(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Image", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setImage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Interactive", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setInteractive(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Links", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setLinks(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("LinuxParameters", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails
                            .setLinuxParameters(AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetailsJsonUnmarshaller.getInstance()
                                    .unmarshall(context));
                }
                if (context.testExpression("LogConfiguration", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails
                            .setLogConfiguration(AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetailsJsonUnmarshaller.getInstance().unmarshall(
                                    context));
                }
                if (context.testExpression("Memory", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setMemory(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MemoryReservation", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setMemoryReservation(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MountPoints", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails
                            .setMountPoints(new ListUnmarshaller<AwsEcsTaskDefinitionContainerDefinitionsMountPointsDetails>(
                                    AwsEcsTaskDefinitionContainerDefinitionsMountPointsDetailsJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PortMappings", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails
                            .setPortMappings(new ListUnmarshaller<AwsEcsTaskDefinitionContainerDefinitionsPortMappingsDetails>(
                                    AwsEcsTaskDefinitionContainerDefinitionsPortMappingsDetailsJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("Privileged", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setPrivileged(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("PseudoTerminal", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setPseudoTerminal(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ReadonlyRootFilesystem", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setReadonlyRootFilesystem(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RepositoryCredentials", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails
                            .setRepositoryCredentials(AwsEcsTaskDefinitionContainerDefinitionsRepositoryCredentialsDetailsJsonUnmarshaller.getInstance()
                                    .unmarshall(context));
                }
                if (context.testExpression("ResourceRequirements", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails
                            .setResourceRequirements(new ListUnmarshaller<AwsEcsTaskDefinitionContainerDefinitionsResourceRequirementsDetails>(
                                    AwsEcsTaskDefinitionContainerDefinitionsResourceRequirementsDetailsJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("Secrets", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setSecrets(new ListUnmarshaller<AwsEcsTaskDefinitionContainerDefinitionsSecretsDetails>(
                            AwsEcsTaskDefinitionContainerDefinitionsSecretsDetailsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("StartTimeout", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setStartTimeout(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("StopTimeout", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setStopTimeout(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SystemControls", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails
                            .setSystemControls(new ListUnmarshaller<AwsEcsTaskDefinitionContainerDefinitionsSystemControlsDetails>(
                                    AwsEcsTaskDefinitionContainerDefinitionsSystemControlsDetailsJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("Ulimits", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setUlimits(new ListUnmarshaller<AwsEcsTaskDefinitionContainerDefinitionsUlimitsDetails>(
                            AwsEcsTaskDefinitionContainerDefinitionsUlimitsDetailsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("User", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setUser(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VolumesFrom", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails
                            .setVolumesFrom(new ListUnmarshaller<AwsEcsTaskDefinitionContainerDefinitionsVolumesFromDetails>(
                                    AwsEcsTaskDefinitionContainerDefinitionsVolumesFromDetailsJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("WorkingDirectory", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setWorkingDirectory(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsEcsTaskDefinitionContainerDefinitionsDetails;
    }

    private static AwsEcsTaskDefinitionContainerDefinitionsDetailsJsonUnmarshaller instance;

    public static AwsEcsTaskDefinitionContainerDefinitionsDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEcsTaskDefinitionContainerDefinitionsDetailsJsonUnmarshaller();
        return instance;
    }
}
