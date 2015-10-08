/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Register Task Definition Request Marshaller
 */
public class RegisterTaskDefinitionRequestMarshaller implements Marshaller<Request<RegisterTaskDefinitionRequest>, RegisterTaskDefinitionRequest> {

    public Request<RegisterTaskDefinitionRequest> marshall(RegisterTaskDefinitionRequest registerTaskDefinitionRequest) {
        if (registerTaskDefinitionRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<RegisterTaskDefinitionRequest> request = new DefaultRequest<RegisterTaskDefinitionRequest>(registerTaskDefinitionRequest, "AmazonECS");
        String target = "AmazonEC2ContainerServiceV20141113.RegisterTaskDefinition";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          jsonWriter.object();
          
            if (registerTaskDefinitionRequest.getFamily() != null) {
                jsonWriter.key("family").value(registerTaskDefinitionRequest.getFamily());
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<ContainerDefinition> containerDefinitionsList = (com.amazonaws.internal.ListWithAutoConstructFlag<ContainerDefinition>)(registerTaskDefinitionRequest.getContainerDefinitions());
            if (containerDefinitionsList != null && !(containerDefinitionsList.isAutoConstruct() && containerDefinitionsList.isEmpty())) {

                jsonWriter.key("containerDefinitions");
                jsonWriter.array();

                for (ContainerDefinition containerDefinitionsListValue : containerDefinitionsList) {
                    if (containerDefinitionsListValue != null) {
                        jsonWriter.object();
                        if (containerDefinitionsListValue.getName() != null) {
                            jsonWriter.key("name").value(containerDefinitionsListValue.getName());
                        }
                        if (containerDefinitionsListValue.getImage() != null) {
                            jsonWriter.key("image").value(containerDefinitionsListValue.getImage());
                        }
                        if (containerDefinitionsListValue.getCpu() != null) {
                            jsonWriter.key("cpu").value(containerDefinitionsListValue.getCpu());
                        }
                        if (containerDefinitionsListValue.getMemory() != null) {
                            jsonWriter.key("memory").value(containerDefinitionsListValue.getMemory());
                        }

                        com.amazonaws.internal.ListWithAutoConstructFlag<String> linksList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(containerDefinitionsListValue.getLinks());
                        if (linksList != null && !(linksList.isAutoConstruct() && linksList.isEmpty())) {

                            jsonWriter.key("links");
                            jsonWriter.array();

                            for (String linksListValue : linksList) {
                                if (linksListValue != null) {
                                    jsonWriter.value(linksListValue);
                                }
                            }
                            jsonWriter.endArray();
                        }

                        com.amazonaws.internal.ListWithAutoConstructFlag<PortMapping> portMappingsList = (com.amazonaws.internal.ListWithAutoConstructFlag<PortMapping>)(containerDefinitionsListValue.getPortMappings());
                        if (portMappingsList != null && !(portMappingsList.isAutoConstruct() && portMappingsList.isEmpty())) {

                            jsonWriter.key("portMappings");
                            jsonWriter.array();

                            for (PortMapping portMappingsListValue : portMappingsList) {
                                if (portMappingsListValue != null) {
                                    jsonWriter.object();
                                    if (portMappingsListValue.getContainerPort() != null) {
                                        jsonWriter.key("containerPort").value(portMappingsListValue.getContainerPort());
                                    }
                                    if (portMappingsListValue.getHostPort() != null) {
                                        jsonWriter.key("hostPort").value(portMappingsListValue.getHostPort());
                                    }
                                    if (portMappingsListValue.getProtocol() != null) {
                                        jsonWriter.key("protocol").value(portMappingsListValue.getProtocol());
                                    }
                                    jsonWriter.endObject();
                                }
                            }
                            jsonWriter.endArray();
                        }
                        if (containerDefinitionsListValue.isEssential() != null) {
                            jsonWriter.key("essential").value(containerDefinitionsListValue.isEssential());
                        }

                        com.amazonaws.internal.ListWithAutoConstructFlag<String> entryPointList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(containerDefinitionsListValue.getEntryPoint());
                        if (entryPointList != null && !(entryPointList.isAutoConstruct() && entryPointList.isEmpty())) {

                            jsonWriter.key("entryPoint");
                            jsonWriter.array();

                            for (String entryPointListValue : entryPointList) {
                                if (entryPointListValue != null) {
                                    jsonWriter.value(entryPointListValue);
                                }
                            }
                            jsonWriter.endArray();
                        }

                        com.amazonaws.internal.ListWithAutoConstructFlag<String> commandList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(containerDefinitionsListValue.getCommand());
                        if (commandList != null && !(commandList.isAutoConstruct() && commandList.isEmpty())) {

                            jsonWriter.key("command");
                            jsonWriter.array();

                            for (String commandListValue : commandList) {
                                if (commandListValue != null) {
                                    jsonWriter.value(commandListValue);
                                }
                            }
                            jsonWriter.endArray();
                        }

                        com.amazonaws.internal.ListWithAutoConstructFlag<KeyValuePair> environmentList = (com.amazonaws.internal.ListWithAutoConstructFlag<KeyValuePair>)(containerDefinitionsListValue.getEnvironment());
                        if (environmentList != null && !(environmentList.isAutoConstruct() && environmentList.isEmpty())) {

                            jsonWriter.key("environment");
                            jsonWriter.array();

                            for (KeyValuePair environmentListValue : environmentList) {
                                if (environmentListValue != null) {
                                    jsonWriter.object();
                                    if (environmentListValue.getName() != null) {
                                        jsonWriter.key("name").value(environmentListValue.getName());
                                    }
                                    if (environmentListValue.getValue() != null) {
                                        jsonWriter.key("value").value(environmentListValue.getValue());
                                    }
                                    jsonWriter.endObject();
                                }
                            }
                            jsonWriter.endArray();
                        }

                        com.amazonaws.internal.ListWithAutoConstructFlag<MountPoint> mountPointsList = (com.amazonaws.internal.ListWithAutoConstructFlag<MountPoint>)(containerDefinitionsListValue.getMountPoints());
                        if (mountPointsList != null && !(mountPointsList.isAutoConstruct() && mountPointsList.isEmpty())) {

                            jsonWriter.key("mountPoints");
                            jsonWriter.array();

                            for (MountPoint mountPointsListValue : mountPointsList) {
                                if (mountPointsListValue != null) {
                                    jsonWriter.object();
                                    if (mountPointsListValue.getSourceVolume() != null) {
                                        jsonWriter.key("sourceVolume").value(mountPointsListValue.getSourceVolume());
                                    }
                                    if (mountPointsListValue.getContainerPath() != null) {
                                        jsonWriter.key("containerPath").value(mountPointsListValue.getContainerPath());
                                    }
                                    if (mountPointsListValue.isReadOnly() != null) {
                                        jsonWriter.key("readOnly").value(mountPointsListValue.isReadOnly());
                                    }
                                    jsonWriter.endObject();
                                }
                            }
                            jsonWriter.endArray();
                        }

                        com.amazonaws.internal.ListWithAutoConstructFlag<VolumeFrom> volumesFromList = (com.amazonaws.internal.ListWithAutoConstructFlag<VolumeFrom>)(containerDefinitionsListValue.getVolumesFrom());
                        if (volumesFromList != null && !(volumesFromList.isAutoConstruct() && volumesFromList.isEmpty())) {

                            jsonWriter.key("volumesFrom");
                            jsonWriter.array();

                            for (VolumeFrom volumesFromListValue : volumesFromList) {
                                if (volumesFromListValue != null) {
                                    jsonWriter.object();
                                    if (volumesFromListValue.getSourceContainer() != null) {
                                        jsonWriter.key("sourceContainer").value(volumesFromListValue.getSourceContainer());
                                    }
                                    if (volumesFromListValue.isReadOnly() != null) {
                                        jsonWriter.key("readOnly").value(volumesFromListValue.isReadOnly());
                                    }
                                    jsonWriter.endObject();
                                }
                            }
                            jsonWriter.endArray();
                        }
                        if (containerDefinitionsListValue.getHostname() != null) {
                            jsonWriter.key("hostname").value(containerDefinitionsListValue.getHostname());
                        }
                        if (containerDefinitionsListValue.getUser() != null) {
                            jsonWriter.key("user").value(containerDefinitionsListValue.getUser());
                        }
                        if (containerDefinitionsListValue.getWorkingDirectory() != null) {
                            jsonWriter.key("workingDirectory").value(containerDefinitionsListValue.getWorkingDirectory());
                        }
                        if (containerDefinitionsListValue.isDisableNetworking() != null) {
                            jsonWriter.key("disableNetworking").value(containerDefinitionsListValue.isDisableNetworking());
                        }
                        if (containerDefinitionsListValue.isPrivileged() != null) {
                            jsonWriter.key("privileged").value(containerDefinitionsListValue.isPrivileged());
                        }
                        if (containerDefinitionsListValue.isReadonlyRootFilesystem() != null) {
                            jsonWriter.key("readonlyRootFilesystem").value(containerDefinitionsListValue.isReadonlyRootFilesystem());
                        }

                        com.amazonaws.internal.ListWithAutoConstructFlag<String> dnsServersList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(containerDefinitionsListValue.getDnsServers());
                        if (dnsServersList != null && !(dnsServersList.isAutoConstruct() && dnsServersList.isEmpty())) {

                            jsonWriter.key("dnsServers");
                            jsonWriter.array();

                            for (String dnsServersListValue : dnsServersList) {
                                if (dnsServersListValue != null) {
                                    jsonWriter.value(dnsServersListValue);
                                }
                            }
                            jsonWriter.endArray();
                        }

                        com.amazonaws.internal.ListWithAutoConstructFlag<String> dnsSearchDomainsList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(containerDefinitionsListValue.getDnsSearchDomains());
                        if (dnsSearchDomainsList != null && !(dnsSearchDomainsList.isAutoConstruct() && dnsSearchDomainsList.isEmpty())) {

                            jsonWriter.key("dnsSearchDomains");
                            jsonWriter.array();

                            for (String dnsSearchDomainsListValue : dnsSearchDomainsList) {
                                if (dnsSearchDomainsListValue != null) {
                                    jsonWriter.value(dnsSearchDomainsListValue);
                                }
                            }
                            jsonWriter.endArray();
                        }

                        com.amazonaws.internal.ListWithAutoConstructFlag<HostEntry> extraHostsList = (com.amazonaws.internal.ListWithAutoConstructFlag<HostEntry>)(containerDefinitionsListValue.getExtraHosts());
                        if (extraHostsList != null && !(extraHostsList.isAutoConstruct() && extraHostsList.isEmpty())) {

                            jsonWriter.key("extraHosts");
                            jsonWriter.array();

                            for (HostEntry extraHostsListValue : extraHostsList) {
                                if (extraHostsListValue != null) {
                                    jsonWriter.object();
                                    if (extraHostsListValue.getHostname() != null) {
                                        jsonWriter.key("hostname").value(extraHostsListValue.getHostname());
                                    }
                                    if (extraHostsListValue.getIpAddress() != null) {
                                        jsonWriter.key("ipAddress").value(extraHostsListValue.getIpAddress());
                                    }
                                    jsonWriter.endObject();
                                }
                            }
                            jsonWriter.endArray();
                        }

                        com.amazonaws.internal.ListWithAutoConstructFlag<String> dockerSecurityOptionsList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(containerDefinitionsListValue.getDockerSecurityOptions());
                        if (dockerSecurityOptionsList != null && !(dockerSecurityOptionsList.isAutoConstruct() && dockerSecurityOptionsList.isEmpty())) {

                            jsonWriter.key("dockerSecurityOptions");
                            jsonWriter.array();

                            for (String dockerSecurityOptionsListValue : dockerSecurityOptionsList) {
                                if (dockerSecurityOptionsListValue != null) {
                                    jsonWriter.value(dockerSecurityOptionsListValue);
                                }
                            }
                            jsonWriter.endArray();
                        }
                        if (containerDefinitionsListValue.getDockerLabels() != null) {
                            jsonWriter.key("dockerLabels");
                            jsonWriter.object();
                            for (Map.Entry<String, String> dockerLabelsListValue : containerDefinitionsListValue.getDockerLabels().entrySet()) {
                                if (dockerLabelsListValue.getValue() != null) {
                                    jsonWriter.key(dockerLabelsListValue.getKey());

                                    jsonWriter.value(dockerLabelsListValue.getValue());
                                }
                            }
                            jsonWriter.endObject();
                        }

                        com.amazonaws.internal.ListWithAutoConstructFlag<Ulimit> ulimitsList = (com.amazonaws.internal.ListWithAutoConstructFlag<Ulimit>)(containerDefinitionsListValue.getUlimits());
                        if (ulimitsList != null && !(ulimitsList.isAutoConstruct() && ulimitsList.isEmpty())) {

                            jsonWriter.key("ulimits");
                            jsonWriter.array();

                            for (Ulimit ulimitsListValue : ulimitsList) {
                                if (ulimitsListValue != null) {
                                    jsonWriter.object();
                                    if (ulimitsListValue.getName() != null) {
                                        jsonWriter.key("name").value(ulimitsListValue.getName());
                                    }
                                    if (ulimitsListValue.getSoftLimit() != null) {
                                        jsonWriter.key("softLimit").value(ulimitsListValue.getSoftLimit());
                                    }
                                    if (ulimitsListValue.getHardLimit() != null) {
                                        jsonWriter.key("hardLimit").value(ulimitsListValue.getHardLimit());
                                    }
                                    jsonWriter.endObject();
                                }
                            }
                            jsonWriter.endArray();
                        }
                        LogConfiguration logConfiguration = containerDefinitionsListValue.getLogConfiguration();
                        if (logConfiguration != null) {

                            jsonWriter.key("logConfiguration");
                            jsonWriter.object();

                            if (logConfiguration.getLogDriver() != null) {
                                jsonWriter.key("logDriver").value(logConfiguration.getLogDriver());
                            }
                            if (logConfiguration.getOptions() != null) {
                                jsonWriter.key("options");
                                jsonWriter.object();
                                for (Map.Entry<String, String> optionsListValue : logConfiguration.getOptions().entrySet()) {
                                    if (optionsListValue.getValue() != null) {
                                        jsonWriter.key(optionsListValue.getKey());

                                        jsonWriter.value(optionsListValue.getValue());
                                    }
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endObject();
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<Volume> volumesList = (com.amazonaws.internal.ListWithAutoConstructFlag<Volume>)(registerTaskDefinitionRequest.getVolumes());
            if (volumesList != null && !(volumesList.isAutoConstruct() && volumesList.isEmpty())) {

                jsonWriter.key("volumes");
                jsonWriter.array();

                for (Volume volumesListValue : volumesList) {
                    if (volumesListValue != null) {
                        jsonWriter.object();
                        if (volumesListValue.getName() != null) {
                            jsonWriter.key("name").value(volumesListValue.getName());
                        }
                        HostVolumeProperties host = volumesListValue.getHost();
                        if (host != null) {

                            jsonWriter.key("host");
                            jsonWriter.object();

                            if (host.getSourcePath() != null) {
                                jsonWriter.key("sourcePath").value(host.getSourcePath());
                            }
                            jsonWriter.endObject();
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endArray();
            }

          jsonWriter.endObject();

          String snippet = stringWriter.toString();
          byte[] content = snippet.getBytes(UTF8);
          request.setContent(new StringInputStream(snippet));
          request.addHeader("Content-Length", Integer.toString(content.length));
          request.addHeader("Content-Type", "application/x-amz-json-1.1");
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }
}
