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

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ContainerDefinition JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerDefinitionJsonUnmarshaller implements Unmarshaller<ContainerDefinition, JsonUnmarshallerContext> {

    public ContainerDefinition unmarshall(JsonUnmarshallerContext context) throws Exception {
        ContainerDefinition containerDefinition = new ContainerDefinition();

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
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("image", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setImage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("repositoryCredentials", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setRepositoryCredentials(RepositoryCredentialsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("cpu", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setCpu(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("memory", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setMemory(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("memoryReservation", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setMemoryReservation(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("links", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setLinks(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("portMappings", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setPortMappings(new ListUnmarshaller<PortMapping>(PortMappingJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("essential", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setEssential(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("entryPoint", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setEntryPoint(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("command", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setCommand(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("environment", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setEnvironment(new ListUnmarshaller<KeyValuePair>(KeyValuePairJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("mountPoints", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setMountPoints(new ListUnmarshaller<MountPoint>(MountPointJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("volumesFrom", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setVolumesFrom(new ListUnmarshaller<VolumeFrom>(VolumeFromJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("linuxParameters", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setLinuxParameters(LinuxParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("secrets", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setSecrets(new ListUnmarshaller<Secret>(SecretJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("dependsOn", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setDependsOn(new ListUnmarshaller<ContainerDependency>(ContainerDependencyJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("startTimeout", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setStartTimeout(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("stopTimeout", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setStopTimeout(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("hostname", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setHostname(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("user", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setUser(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("workingDirectory", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setWorkingDirectory(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("disableNetworking", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setDisableNetworking(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("privileged", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setPrivileged(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("readonlyRootFilesystem", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setReadonlyRootFilesystem(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("dnsServers", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setDnsServers(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("dnsSearchDomains", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setDnsSearchDomains(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("extraHosts", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setExtraHosts(new ListUnmarshaller<HostEntry>(HostEntryJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("dockerSecurityOptions", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setDockerSecurityOptions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("interactive", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setInteractive(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("pseudoTerminal", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setPseudoTerminal(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("dockerLabels", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setDockerLabels(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("ulimits", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setUlimits(new ListUnmarshaller<Ulimit>(UlimitJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("logConfiguration", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setLogConfiguration(LogConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("healthCheck", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setHealthCheck(HealthCheckJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("systemControls", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setSystemControls(new ListUnmarshaller<SystemControl>(SystemControlJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("resourceRequirements", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setResourceRequirements(new ListUnmarshaller<ResourceRequirement>(ResourceRequirementJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return containerDefinition;
    }

    private static ContainerDefinitionJsonUnmarshaller instance;

    public static ContainerDefinitionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ContainerDefinitionJsonUnmarshaller();
        return instance;
    }
}
