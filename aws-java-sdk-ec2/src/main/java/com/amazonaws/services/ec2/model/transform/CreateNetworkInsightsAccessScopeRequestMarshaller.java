/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * CreateNetworkInsightsAccessScopeRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateNetworkInsightsAccessScopeRequestMarshaller implements
        Marshaller<Request<CreateNetworkInsightsAccessScopeRequest>, CreateNetworkInsightsAccessScopeRequest> {

    public Request<CreateNetworkInsightsAccessScopeRequest> marshall(CreateNetworkInsightsAccessScopeRequest createNetworkInsightsAccessScopeRequest) {

        if (createNetworkInsightsAccessScopeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateNetworkInsightsAccessScopeRequest> request = new DefaultRequest<CreateNetworkInsightsAccessScopeRequest>(
                createNetworkInsightsAccessScopeRequest, "AmazonEC2");
        request.addParameter("Action", "CreateNetworkInsightsAccessScope");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<AccessScopePathRequest> createNetworkInsightsAccessScopeRequestMatchPathsList = (com.amazonaws.internal.SdkInternalList<AccessScopePathRequest>) createNetworkInsightsAccessScopeRequest
                .getMatchPaths();
        if (!createNetworkInsightsAccessScopeRequestMatchPathsList.isEmpty() || !createNetworkInsightsAccessScopeRequestMatchPathsList.isAutoConstruct()) {
            int matchPathsListIndex = 1;

            for (AccessScopePathRequest createNetworkInsightsAccessScopeRequestMatchPathsListValue : createNetworkInsightsAccessScopeRequestMatchPathsList) {

                PathStatementRequest source = createNetworkInsightsAccessScopeRequestMatchPathsListValue.getSource();
                if (source != null) {

                    PacketHeaderStatementRequest packetHeaderStatement = source.getPacketHeaderStatement();
                    if (packetHeaderStatement != null) {

                        com.amazonaws.internal.SdkInternalList<String> packetHeaderStatementRequestSourceAddressesList = (com.amazonaws.internal.SdkInternalList<String>) packetHeaderStatement
                                .getSourceAddresses();
                        if (!packetHeaderStatementRequestSourceAddressesList.isEmpty() || !packetHeaderStatementRequestSourceAddressesList.isAutoConstruct()) {
                            int sourceAddressesListIndex = 1;

                            for (String packetHeaderStatementRequestSourceAddressesListValue : packetHeaderStatementRequestSourceAddressesList) {
                                if (packetHeaderStatementRequestSourceAddressesListValue != null) {
                                    request.addParameter("MatchPath." + matchPathsListIndex + ".Source.PacketHeaderStatement.SourceAddress."
                                            + sourceAddressesListIndex, StringUtils.fromString(packetHeaderStatementRequestSourceAddressesListValue));
                                }
                                sourceAddressesListIndex++;
                            }
                        }

                        com.amazonaws.internal.SdkInternalList<String> packetHeaderStatementRequestDestinationAddressesList = (com.amazonaws.internal.SdkInternalList<String>) packetHeaderStatement
                                .getDestinationAddresses();
                        if (!packetHeaderStatementRequestDestinationAddressesList.isEmpty()
                                || !packetHeaderStatementRequestDestinationAddressesList.isAutoConstruct()) {
                            int destinationAddressesListIndex = 1;

                            for (String packetHeaderStatementRequestDestinationAddressesListValue : packetHeaderStatementRequestDestinationAddressesList) {
                                if (packetHeaderStatementRequestDestinationAddressesListValue != null) {
                                    request.addParameter("MatchPath." + matchPathsListIndex + ".Source.PacketHeaderStatement.DestinationAddress."
                                            + destinationAddressesListIndex, StringUtils.fromString(packetHeaderStatementRequestDestinationAddressesListValue));
                                }
                                destinationAddressesListIndex++;
                            }
                        }

                        com.amazonaws.internal.SdkInternalList<String> packetHeaderStatementRequestSourcePortsList = (com.amazonaws.internal.SdkInternalList<String>) packetHeaderStatement
                                .getSourcePorts();
                        if (!packetHeaderStatementRequestSourcePortsList.isEmpty() || !packetHeaderStatementRequestSourcePortsList.isAutoConstruct()) {
                            int sourcePortsListIndex = 1;

                            for (String packetHeaderStatementRequestSourcePortsListValue : packetHeaderStatementRequestSourcePortsList) {
                                if (packetHeaderStatementRequestSourcePortsListValue != null) {
                                    request.addParameter("MatchPath." + matchPathsListIndex + ".Source.PacketHeaderStatement.SourcePort."
                                            + sourcePortsListIndex, StringUtils.fromString(packetHeaderStatementRequestSourcePortsListValue));
                                }
                                sourcePortsListIndex++;
                            }
                        }

                        com.amazonaws.internal.SdkInternalList<String> packetHeaderStatementRequestDestinationPortsList = (com.amazonaws.internal.SdkInternalList<String>) packetHeaderStatement
                                .getDestinationPorts();
                        if (!packetHeaderStatementRequestDestinationPortsList.isEmpty() || !packetHeaderStatementRequestDestinationPortsList.isAutoConstruct()) {
                            int destinationPortsListIndex = 1;

                            for (String packetHeaderStatementRequestDestinationPortsListValue : packetHeaderStatementRequestDestinationPortsList) {
                                if (packetHeaderStatementRequestDestinationPortsListValue != null) {
                                    request.addParameter("MatchPath." + matchPathsListIndex + ".Source.PacketHeaderStatement.DestinationPort."
                                            + destinationPortsListIndex, StringUtils.fromString(packetHeaderStatementRequestDestinationPortsListValue));
                                }
                                destinationPortsListIndex++;
                            }
                        }

                        com.amazonaws.internal.SdkInternalList<String> packetHeaderStatementRequestSourcePrefixListsList = (com.amazonaws.internal.SdkInternalList<String>) packetHeaderStatement
                                .getSourcePrefixLists();
                        if (!packetHeaderStatementRequestSourcePrefixListsList.isEmpty()
                                || !packetHeaderStatementRequestSourcePrefixListsList.isAutoConstruct()) {
                            int sourcePrefixListsListIndex = 1;

                            for (String packetHeaderStatementRequestSourcePrefixListsListValue : packetHeaderStatementRequestSourcePrefixListsList) {
                                if (packetHeaderStatementRequestSourcePrefixListsListValue != null) {
                                    request.addParameter("MatchPath." + matchPathsListIndex + ".Source.PacketHeaderStatement.SourcePrefixList."
                                            + sourcePrefixListsListIndex, StringUtils.fromString(packetHeaderStatementRequestSourcePrefixListsListValue));
                                }
                                sourcePrefixListsListIndex++;
                            }
                        }

                        com.amazonaws.internal.SdkInternalList<String> packetHeaderStatementRequestDestinationPrefixListsList = (com.amazonaws.internal.SdkInternalList<String>) packetHeaderStatement
                                .getDestinationPrefixLists();
                        if (!packetHeaderStatementRequestDestinationPrefixListsList.isEmpty()
                                || !packetHeaderStatementRequestDestinationPrefixListsList.isAutoConstruct()) {
                            int destinationPrefixListsListIndex = 1;

                            for (String packetHeaderStatementRequestDestinationPrefixListsListValue : packetHeaderStatementRequestDestinationPrefixListsList) {
                                if (packetHeaderStatementRequestDestinationPrefixListsListValue != null) {
                                    request.addParameter("MatchPath." + matchPathsListIndex + ".Source.PacketHeaderStatement.DestinationPrefixList."
                                            + destinationPrefixListsListIndex,
                                            StringUtils.fromString(packetHeaderStatementRequestDestinationPrefixListsListValue));
                                }
                                destinationPrefixListsListIndex++;
                            }
                        }

                        com.amazonaws.internal.SdkInternalList<String> packetHeaderStatementRequestProtocolsList = (com.amazonaws.internal.SdkInternalList<String>) packetHeaderStatement
                                .getProtocols();
                        if (!packetHeaderStatementRequestProtocolsList.isEmpty() || !packetHeaderStatementRequestProtocolsList.isAutoConstruct()) {
                            int protocolsListIndex = 1;

                            for (String packetHeaderStatementRequestProtocolsListValue : packetHeaderStatementRequestProtocolsList) {
                                if (packetHeaderStatementRequestProtocolsListValue != null) {
                                    request.addParameter("MatchPath." + matchPathsListIndex + ".Source.PacketHeaderStatement.Protocol." + protocolsListIndex,
                                            StringUtils.fromString(packetHeaderStatementRequestProtocolsListValue));
                                }
                                protocolsListIndex++;
                            }
                        }
                    }

                    ResourceStatementRequest resourceStatement = source.getResourceStatement();
                    if (resourceStatement != null) {

                        com.amazonaws.internal.SdkInternalList<String> resourceStatementRequestResourcesList = (com.amazonaws.internal.SdkInternalList<String>) resourceStatement
                                .getResources();
                        if (!resourceStatementRequestResourcesList.isEmpty() || !resourceStatementRequestResourcesList.isAutoConstruct()) {
                            int resourcesListIndex = 1;

                            for (String resourceStatementRequestResourcesListValue : resourceStatementRequestResourcesList) {
                                if (resourceStatementRequestResourcesListValue != null) {
                                    request.addParameter("MatchPath." + matchPathsListIndex + ".Source.ResourceStatement.Resource." + resourcesListIndex,
                                            StringUtils.fromString(resourceStatementRequestResourcesListValue));
                                }
                                resourcesListIndex++;
                            }
                        }

                        com.amazonaws.internal.SdkInternalList<String> resourceStatementRequestResourceTypesList = (com.amazonaws.internal.SdkInternalList<String>) resourceStatement
                                .getResourceTypes();
                        if (!resourceStatementRequestResourceTypesList.isEmpty() || !resourceStatementRequestResourceTypesList.isAutoConstruct()) {
                            int resourceTypesListIndex = 1;

                            for (String resourceStatementRequestResourceTypesListValue : resourceStatementRequestResourceTypesList) {
                                if (resourceStatementRequestResourceTypesListValue != null) {
                                    request.addParameter("MatchPath." + matchPathsListIndex + ".Source.ResourceStatement.ResourceType."
                                            + resourceTypesListIndex, StringUtils.fromString(resourceStatementRequestResourceTypesListValue));
                                }
                                resourceTypesListIndex++;
                            }
                        }
                    }
                }

                PathStatementRequest destination = createNetworkInsightsAccessScopeRequestMatchPathsListValue.getDestination();
                if (destination != null) {

                    PacketHeaderStatementRequest packetHeaderStatement = destination.getPacketHeaderStatement();
                    if (packetHeaderStatement != null) {

                        com.amazonaws.internal.SdkInternalList<String> packetHeaderStatementRequestSourceAddressesList = (com.amazonaws.internal.SdkInternalList<String>) packetHeaderStatement
                                .getSourceAddresses();
                        if (!packetHeaderStatementRequestSourceAddressesList.isEmpty() || !packetHeaderStatementRequestSourceAddressesList.isAutoConstruct()) {
                            int sourceAddressesListIndex = 1;

                            for (String packetHeaderStatementRequestSourceAddressesListValue : packetHeaderStatementRequestSourceAddressesList) {
                                if (packetHeaderStatementRequestSourceAddressesListValue != null) {
                                    request.addParameter("MatchPath." + matchPathsListIndex + ".Destination.PacketHeaderStatement.SourceAddress."
                                            + sourceAddressesListIndex, StringUtils.fromString(packetHeaderStatementRequestSourceAddressesListValue));
                                }
                                sourceAddressesListIndex++;
                            }
                        }

                        com.amazonaws.internal.SdkInternalList<String> packetHeaderStatementRequestDestinationAddressesList = (com.amazonaws.internal.SdkInternalList<String>) packetHeaderStatement
                                .getDestinationAddresses();
                        if (!packetHeaderStatementRequestDestinationAddressesList.isEmpty()
                                || !packetHeaderStatementRequestDestinationAddressesList.isAutoConstruct()) {
                            int destinationAddressesListIndex = 1;

                            for (String packetHeaderStatementRequestDestinationAddressesListValue : packetHeaderStatementRequestDestinationAddressesList) {
                                if (packetHeaderStatementRequestDestinationAddressesListValue != null) {
                                    request.addParameter("MatchPath." + matchPathsListIndex + ".Destination.PacketHeaderStatement.DestinationAddress."
                                            + destinationAddressesListIndex, StringUtils.fromString(packetHeaderStatementRequestDestinationAddressesListValue));
                                }
                                destinationAddressesListIndex++;
                            }
                        }

                        com.amazonaws.internal.SdkInternalList<String> packetHeaderStatementRequestSourcePortsList = (com.amazonaws.internal.SdkInternalList<String>) packetHeaderStatement
                                .getSourcePorts();
                        if (!packetHeaderStatementRequestSourcePortsList.isEmpty() || !packetHeaderStatementRequestSourcePortsList.isAutoConstruct()) {
                            int sourcePortsListIndex = 1;

                            for (String packetHeaderStatementRequestSourcePortsListValue : packetHeaderStatementRequestSourcePortsList) {
                                if (packetHeaderStatementRequestSourcePortsListValue != null) {
                                    request.addParameter("MatchPath." + matchPathsListIndex + ".Destination.PacketHeaderStatement.SourcePort."
                                            + sourcePortsListIndex, StringUtils.fromString(packetHeaderStatementRequestSourcePortsListValue));
                                }
                                sourcePortsListIndex++;
                            }
                        }

                        com.amazonaws.internal.SdkInternalList<String> packetHeaderStatementRequestDestinationPortsList = (com.amazonaws.internal.SdkInternalList<String>) packetHeaderStatement
                                .getDestinationPorts();
                        if (!packetHeaderStatementRequestDestinationPortsList.isEmpty() || !packetHeaderStatementRequestDestinationPortsList.isAutoConstruct()) {
                            int destinationPortsListIndex = 1;

                            for (String packetHeaderStatementRequestDestinationPortsListValue : packetHeaderStatementRequestDestinationPortsList) {
                                if (packetHeaderStatementRequestDestinationPortsListValue != null) {
                                    request.addParameter("MatchPath." + matchPathsListIndex + ".Destination.PacketHeaderStatement.DestinationPort."
                                            + destinationPortsListIndex, StringUtils.fromString(packetHeaderStatementRequestDestinationPortsListValue));
                                }
                                destinationPortsListIndex++;
                            }
                        }

                        com.amazonaws.internal.SdkInternalList<String> packetHeaderStatementRequestSourcePrefixListsList = (com.amazonaws.internal.SdkInternalList<String>) packetHeaderStatement
                                .getSourcePrefixLists();
                        if (!packetHeaderStatementRequestSourcePrefixListsList.isEmpty()
                                || !packetHeaderStatementRequestSourcePrefixListsList.isAutoConstruct()) {
                            int sourcePrefixListsListIndex = 1;

                            for (String packetHeaderStatementRequestSourcePrefixListsListValue : packetHeaderStatementRequestSourcePrefixListsList) {
                                if (packetHeaderStatementRequestSourcePrefixListsListValue != null) {
                                    request.addParameter("MatchPath." + matchPathsListIndex + ".Destination.PacketHeaderStatement.SourcePrefixList."
                                            + sourcePrefixListsListIndex, StringUtils.fromString(packetHeaderStatementRequestSourcePrefixListsListValue));
                                }
                                sourcePrefixListsListIndex++;
                            }
                        }

                        com.amazonaws.internal.SdkInternalList<String> packetHeaderStatementRequestDestinationPrefixListsList = (com.amazonaws.internal.SdkInternalList<String>) packetHeaderStatement
                                .getDestinationPrefixLists();
                        if (!packetHeaderStatementRequestDestinationPrefixListsList.isEmpty()
                                || !packetHeaderStatementRequestDestinationPrefixListsList.isAutoConstruct()) {
                            int destinationPrefixListsListIndex = 1;

                            for (String packetHeaderStatementRequestDestinationPrefixListsListValue : packetHeaderStatementRequestDestinationPrefixListsList) {
                                if (packetHeaderStatementRequestDestinationPrefixListsListValue != null) {
                                    request.addParameter("MatchPath." + matchPathsListIndex + ".Destination.PacketHeaderStatement.DestinationPrefixList."
                                            + destinationPrefixListsListIndex,
                                            StringUtils.fromString(packetHeaderStatementRequestDestinationPrefixListsListValue));
                                }
                                destinationPrefixListsListIndex++;
                            }
                        }

                        com.amazonaws.internal.SdkInternalList<String> packetHeaderStatementRequestProtocolsList = (com.amazonaws.internal.SdkInternalList<String>) packetHeaderStatement
                                .getProtocols();
                        if (!packetHeaderStatementRequestProtocolsList.isEmpty() || !packetHeaderStatementRequestProtocolsList.isAutoConstruct()) {
                            int protocolsListIndex = 1;

                            for (String packetHeaderStatementRequestProtocolsListValue : packetHeaderStatementRequestProtocolsList) {
                                if (packetHeaderStatementRequestProtocolsListValue != null) {
                                    request.addParameter("MatchPath." + matchPathsListIndex + ".Destination.PacketHeaderStatement.Protocol."
                                            + protocolsListIndex, StringUtils.fromString(packetHeaderStatementRequestProtocolsListValue));
                                }
                                protocolsListIndex++;
                            }
                        }
                    }

                    ResourceStatementRequest resourceStatement = destination.getResourceStatement();
                    if (resourceStatement != null) {

                        com.amazonaws.internal.SdkInternalList<String> resourceStatementRequestResourcesList = (com.amazonaws.internal.SdkInternalList<String>) resourceStatement
                                .getResources();
                        if (!resourceStatementRequestResourcesList.isEmpty() || !resourceStatementRequestResourcesList.isAutoConstruct()) {
                            int resourcesListIndex = 1;

                            for (String resourceStatementRequestResourcesListValue : resourceStatementRequestResourcesList) {
                                if (resourceStatementRequestResourcesListValue != null) {
                                    request.addParameter("MatchPath." + matchPathsListIndex + ".Destination.ResourceStatement.Resource." + resourcesListIndex,
                                            StringUtils.fromString(resourceStatementRequestResourcesListValue));
                                }
                                resourcesListIndex++;
                            }
                        }

                        com.amazonaws.internal.SdkInternalList<String> resourceStatementRequestResourceTypesList = (com.amazonaws.internal.SdkInternalList<String>) resourceStatement
                                .getResourceTypes();
                        if (!resourceStatementRequestResourceTypesList.isEmpty() || !resourceStatementRequestResourceTypesList.isAutoConstruct()) {
                            int resourceTypesListIndex = 1;

                            for (String resourceStatementRequestResourceTypesListValue : resourceStatementRequestResourceTypesList) {
                                if (resourceStatementRequestResourceTypesListValue != null) {
                                    request.addParameter("MatchPath." + matchPathsListIndex + ".Destination.ResourceStatement.ResourceType."
                                            + resourceTypesListIndex, StringUtils.fromString(resourceStatementRequestResourceTypesListValue));
                                }
                                resourceTypesListIndex++;
                            }
                        }
                    }
                }

                com.amazonaws.internal.SdkInternalList<ThroughResourcesStatementRequest> accessScopePathRequestThroughResourcesList = (com.amazonaws.internal.SdkInternalList<ThroughResourcesStatementRequest>) createNetworkInsightsAccessScopeRequestMatchPathsListValue
                        .getThroughResources();
                if (!accessScopePathRequestThroughResourcesList.isEmpty() || !accessScopePathRequestThroughResourcesList.isAutoConstruct()) {
                    int throughResourcesListIndex = 1;

                    for (ThroughResourcesStatementRequest accessScopePathRequestThroughResourcesListValue : accessScopePathRequestThroughResourcesList) {

                        ResourceStatementRequest resourceStatement = accessScopePathRequestThroughResourcesListValue.getResourceStatement();
                        if (resourceStatement != null) {

                            com.amazonaws.internal.SdkInternalList<String> resourceStatementRequestResourcesList = (com.amazonaws.internal.SdkInternalList<String>) resourceStatement
                                    .getResources();
                            if (!resourceStatementRequestResourcesList.isEmpty() || !resourceStatementRequestResourcesList.isAutoConstruct()) {
                                int resourcesListIndex = 1;

                                for (String resourceStatementRequestResourcesListValue : resourceStatementRequestResourcesList) {
                                    if (resourceStatementRequestResourcesListValue != null) {
                                        request.addParameter("MatchPath." + matchPathsListIndex + ".ThroughResource." + throughResourcesListIndex
                                                + ".ResourceStatement.Resource." + resourcesListIndex,
                                                StringUtils.fromString(resourceStatementRequestResourcesListValue));
                                    }
                                    resourcesListIndex++;
                                }
                            }

                            com.amazonaws.internal.SdkInternalList<String> resourceStatementRequestResourceTypesList = (com.amazonaws.internal.SdkInternalList<String>) resourceStatement
                                    .getResourceTypes();
                            if (!resourceStatementRequestResourceTypesList.isEmpty() || !resourceStatementRequestResourceTypesList.isAutoConstruct()) {
                                int resourceTypesListIndex = 1;

                                for (String resourceStatementRequestResourceTypesListValue : resourceStatementRequestResourceTypesList) {
                                    if (resourceStatementRequestResourceTypesListValue != null) {
                                        request.addParameter("MatchPath." + matchPathsListIndex + ".ThroughResource." + throughResourcesListIndex
                                                + ".ResourceStatement.ResourceType." + resourceTypesListIndex,
                                                StringUtils.fromString(resourceStatementRequestResourceTypesListValue));
                                    }
                                    resourceTypesListIndex++;
                                }
                            }
                        }
                        throughResourcesListIndex++;
                    }
                }
                matchPathsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<AccessScopePathRequest> createNetworkInsightsAccessScopeRequestExcludePathsList = (com.amazonaws.internal.SdkInternalList<AccessScopePathRequest>) createNetworkInsightsAccessScopeRequest
                .getExcludePaths();
        if (!createNetworkInsightsAccessScopeRequestExcludePathsList.isEmpty() || !createNetworkInsightsAccessScopeRequestExcludePathsList.isAutoConstruct()) {
            int excludePathsListIndex = 1;

            for (AccessScopePathRequest createNetworkInsightsAccessScopeRequestExcludePathsListValue : createNetworkInsightsAccessScopeRequestExcludePathsList) {

                PathStatementRequest source = createNetworkInsightsAccessScopeRequestExcludePathsListValue.getSource();
                if (source != null) {

                    PacketHeaderStatementRequest packetHeaderStatement = source.getPacketHeaderStatement();
                    if (packetHeaderStatement != null) {

                        com.amazonaws.internal.SdkInternalList<String> packetHeaderStatementRequestSourceAddressesList = (com.amazonaws.internal.SdkInternalList<String>) packetHeaderStatement
                                .getSourceAddresses();
                        if (!packetHeaderStatementRequestSourceAddressesList.isEmpty() || !packetHeaderStatementRequestSourceAddressesList.isAutoConstruct()) {
                            int sourceAddressesListIndex = 1;

                            for (String packetHeaderStatementRequestSourceAddressesListValue : packetHeaderStatementRequestSourceAddressesList) {
                                if (packetHeaderStatementRequestSourceAddressesListValue != null) {
                                    request.addParameter("ExcludePath." + excludePathsListIndex + ".Source.PacketHeaderStatement.SourceAddress."
                                            + sourceAddressesListIndex, StringUtils.fromString(packetHeaderStatementRequestSourceAddressesListValue));
                                }
                                sourceAddressesListIndex++;
                            }
                        }

                        com.amazonaws.internal.SdkInternalList<String> packetHeaderStatementRequestDestinationAddressesList = (com.amazonaws.internal.SdkInternalList<String>) packetHeaderStatement
                                .getDestinationAddresses();
                        if (!packetHeaderStatementRequestDestinationAddressesList.isEmpty()
                                || !packetHeaderStatementRequestDestinationAddressesList.isAutoConstruct()) {
                            int destinationAddressesListIndex = 1;

                            for (String packetHeaderStatementRequestDestinationAddressesListValue : packetHeaderStatementRequestDestinationAddressesList) {
                                if (packetHeaderStatementRequestDestinationAddressesListValue != null) {
                                    request.addParameter("ExcludePath." + excludePathsListIndex + ".Source.PacketHeaderStatement.DestinationAddress."
                                            + destinationAddressesListIndex, StringUtils.fromString(packetHeaderStatementRequestDestinationAddressesListValue));
                                }
                                destinationAddressesListIndex++;
                            }
                        }

                        com.amazonaws.internal.SdkInternalList<String> packetHeaderStatementRequestSourcePortsList = (com.amazonaws.internal.SdkInternalList<String>) packetHeaderStatement
                                .getSourcePorts();
                        if (!packetHeaderStatementRequestSourcePortsList.isEmpty() || !packetHeaderStatementRequestSourcePortsList.isAutoConstruct()) {
                            int sourcePortsListIndex = 1;

                            for (String packetHeaderStatementRequestSourcePortsListValue : packetHeaderStatementRequestSourcePortsList) {
                                if (packetHeaderStatementRequestSourcePortsListValue != null) {
                                    request.addParameter("ExcludePath." + excludePathsListIndex + ".Source.PacketHeaderStatement.SourcePort."
                                            + sourcePortsListIndex, StringUtils.fromString(packetHeaderStatementRequestSourcePortsListValue));
                                }
                                sourcePortsListIndex++;
                            }
                        }

                        com.amazonaws.internal.SdkInternalList<String> packetHeaderStatementRequestDestinationPortsList = (com.amazonaws.internal.SdkInternalList<String>) packetHeaderStatement
                                .getDestinationPorts();
                        if (!packetHeaderStatementRequestDestinationPortsList.isEmpty() || !packetHeaderStatementRequestDestinationPortsList.isAutoConstruct()) {
                            int destinationPortsListIndex = 1;

                            for (String packetHeaderStatementRequestDestinationPortsListValue : packetHeaderStatementRequestDestinationPortsList) {
                                if (packetHeaderStatementRequestDestinationPortsListValue != null) {
                                    request.addParameter("ExcludePath." + excludePathsListIndex + ".Source.PacketHeaderStatement.DestinationPort."
                                            + destinationPortsListIndex, StringUtils.fromString(packetHeaderStatementRequestDestinationPortsListValue));
                                }
                                destinationPortsListIndex++;
                            }
                        }

                        com.amazonaws.internal.SdkInternalList<String> packetHeaderStatementRequestSourcePrefixListsList = (com.amazonaws.internal.SdkInternalList<String>) packetHeaderStatement
                                .getSourcePrefixLists();
                        if (!packetHeaderStatementRequestSourcePrefixListsList.isEmpty()
                                || !packetHeaderStatementRequestSourcePrefixListsList.isAutoConstruct()) {
                            int sourcePrefixListsListIndex = 1;

                            for (String packetHeaderStatementRequestSourcePrefixListsListValue : packetHeaderStatementRequestSourcePrefixListsList) {
                                if (packetHeaderStatementRequestSourcePrefixListsListValue != null) {
                                    request.addParameter("ExcludePath." + excludePathsListIndex + ".Source.PacketHeaderStatement.SourcePrefixList."
                                            + sourcePrefixListsListIndex, StringUtils.fromString(packetHeaderStatementRequestSourcePrefixListsListValue));
                                }
                                sourcePrefixListsListIndex++;
                            }
                        }

                        com.amazonaws.internal.SdkInternalList<String> packetHeaderStatementRequestDestinationPrefixListsList = (com.amazonaws.internal.SdkInternalList<String>) packetHeaderStatement
                                .getDestinationPrefixLists();
                        if (!packetHeaderStatementRequestDestinationPrefixListsList.isEmpty()
                                || !packetHeaderStatementRequestDestinationPrefixListsList.isAutoConstruct()) {
                            int destinationPrefixListsListIndex = 1;

                            for (String packetHeaderStatementRequestDestinationPrefixListsListValue : packetHeaderStatementRequestDestinationPrefixListsList) {
                                if (packetHeaderStatementRequestDestinationPrefixListsListValue != null) {
                                    request.addParameter("ExcludePath." + excludePathsListIndex + ".Source.PacketHeaderStatement.DestinationPrefixList."
                                            + destinationPrefixListsListIndex,
                                            StringUtils.fromString(packetHeaderStatementRequestDestinationPrefixListsListValue));
                                }
                                destinationPrefixListsListIndex++;
                            }
                        }

                        com.amazonaws.internal.SdkInternalList<String> packetHeaderStatementRequestProtocolsList = (com.amazonaws.internal.SdkInternalList<String>) packetHeaderStatement
                                .getProtocols();
                        if (!packetHeaderStatementRequestProtocolsList.isEmpty() || !packetHeaderStatementRequestProtocolsList.isAutoConstruct()) {
                            int protocolsListIndex = 1;

                            for (String packetHeaderStatementRequestProtocolsListValue : packetHeaderStatementRequestProtocolsList) {
                                if (packetHeaderStatementRequestProtocolsListValue != null) {
                                    request.addParameter("ExcludePath." + excludePathsListIndex + ".Source.PacketHeaderStatement.Protocol."
                                            + protocolsListIndex, StringUtils.fromString(packetHeaderStatementRequestProtocolsListValue));
                                }
                                protocolsListIndex++;
                            }
                        }
                    }

                    ResourceStatementRequest resourceStatement = source.getResourceStatement();
                    if (resourceStatement != null) {

                        com.amazonaws.internal.SdkInternalList<String> resourceStatementRequestResourcesList = (com.amazonaws.internal.SdkInternalList<String>) resourceStatement
                                .getResources();
                        if (!resourceStatementRequestResourcesList.isEmpty() || !resourceStatementRequestResourcesList.isAutoConstruct()) {
                            int resourcesListIndex = 1;

                            for (String resourceStatementRequestResourcesListValue : resourceStatementRequestResourcesList) {
                                if (resourceStatementRequestResourcesListValue != null) {
                                    request.addParameter("ExcludePath." + excludePathsListIndex + ".Source.ResourceStatement.Resource." + resourcesListIndex,
                                            StringUtils.fromString(resourceStatementRequestResourcesListValue));
                                }
                                resourcesListIndex++;
                            }
                        }

                        com.amazonaws.internal.SdkInternalList<String> resourceStatementRequestResourceTypesList = (com.amazonaws.internal.SdkInternalList<String>) resourceStatement
                                .getResourceTypes();
                        if (!resourceStatementRequestResourceTypesList.isEmpty() || !resourceStatementRequestResourceTypesList.isAutoConstruct()) {
                            int resourceTypesListIndex = 1;

                            for (String resourceStatementRequestResourceTypesListValue : resourceStatementRequestResourceTypesList) {
                                if (resourceStatementRequestResourceTypesListValue != null) {
                                    request.addParameter("ExcludePath." + excludePathsListIndex + ".Source.ResourceStatement.ResourceType."
                                            + resourceTypesListIndex, StringUtils.fromString(resourceStatementRequestResourceTypesListValue));
                                }
                                resourceTypesListIndex++;
                            }
                        }
                    }
                }

                PathStatementRequest destination = createNetworkInsightsAccessScopeRequestExcludePathsListValue.getDestination();
                if (destination != null) {

                    PacketHeaderStatementRequest packetHeaderStatement = destination.getPacketHeaderStatement();
                    if (packetHeaderStatement != null) {

                        com.amazonaws.internal.SdkInternalList<String> packetHeaderStatementRequestSourceAddressesList = (com.amazonaws.internal.SdkInternalList<String>) packetHeaderStatement
                                .getSourceAddresses();
                        if (!packetHeaderStatementRequestSourceAddressesList.isEmpty() || !packetHeaderStatementRequestSourceAddressesList.isAutoConstruct()) {
                            int sourceAddressesListIndex = 1;

                            for (String packetHeaderStatementRequestSourceAddressesListValue : packetHeaderStatementRequestSourceAddressesList) {
                                if (packetHeaderStatementRequestSourceAddressesListValue != null) {
                                    request.addParameter("ExcludePath." + excludePathsListIndex + ".Destination.PacketHeaderStatement.SourceAddress."
                                            + sourceAddressesListIndex, StringUtils.fromString(packetHeaderStatementRequestSourceAddressesListValue));
                                }
                                sourceAddressesListIndex++;
                            }
                        }

                        com.amazonaws.internal.SdkInternalList<String> packetHeaderStatementRequestDestinationAddressesList = (com.amazonaws.internal.SdkInternalList<String>) packetHeaderStatement
                                .getDestinationAddresses();
                        if (!packetHeaderStatementRequestDestinationAddressesList.isEmpty()
                                || !packetHeaderStatementRequestDestinationAddressesList.isAutoConstruct()) {
                            int destinationAddressesListIndex = 1;

                            for (String packetHeaderStatementRequestDestinationAddressesListValue : packetHeaderStatementRequestDestinationAddressesList) {
                                if (packetHeaderStatementRequestDestinationAddressesListValue != null) {
                                    request.addParameter("ExcludePath." + excludePathsListIndex + ".Destination.PacketHeaderStatement.DestinationAddress."
                                            + destinationAddressesListIndex, StringUtils.fromString(packetHeaderStatementRequestDestinationAddressesListValue));
                                }
                                destinationAddressesListIndex++;
                            }
                        }

                        com.amazonaws.internal.SdkInternalList<String> packetHeaderStatementRequestSourcePortsList = (com.amazonaws.internal.SdkInternalList<String>) packetHeaderStatement
                                .getSourcePorts();
                        if (!packetHeaderStatementRequestSourcePortsList.isEmpty() || !packetHeaderStatementRequestSourcePortsList.isAutoConstruct()) {
                            int sourcePortsListIndex = 1;

                            for (String packetHeaderStatementRequestSourcePortsListValue : packetHeaderStatementRequestSourcePortsList) {
                                if (packetHeaderStatementRequestSourcePortsListValue != null) {
                                    request.addParameter("ExcludePath." + excludePathsListIndex + ".Destination.PacketHeaderStatement.SourcePort."
                                            + sourcePortsListIndex, StringUtils.fromString(packetHeaderStatementRequestSourcePortsListValue));
                                }
                                sourcePortsListIndex++;
                            }
                        }

                        com.amazonaws.internal.SdkInternalList<String> packetHeaderStatementRequestDestinationPortsList = (com.amazonaws.internal.SdkInternalList<String>) packetHeaderStatement
                                .getDestinationPorts();
                        if (!packetHeaderStatementRequestDestinationPortsList.isEmpty() || !packetHeaderStatementRequestDestinationPortsList.isAutoConstruct()) {
                            int destinationPortsListIndex = 1;

                            for (String packetHeaderStatementRequestDestinationPortsListValue : packetHeaderStatementRequestDestinationPortsList) {
                                if (packetHeaderStatementRequestDestinationPortsListValue != null) {
                                    request.addParameter("ExcludePath." + excludePathsListIndex + ".Destination.PacketHeaderStatement.DestinationPort."
                                            + destinationPortsListIndex, StringUtils.fromString(packetHeaderStatementRequestDestinationPortsListValue));
                                }
                                destinationPortsListIndex++;
                            }
                        }

                        com.amazonaws.internal.SdkInternalList<String> packetHeaderStatementRequestSourcePrefixListsList = (com.amazonaws.internal.SdkInternalList<String>) packetHeaderStatement
                                .getSourcePrefixLists();
                        if (!packetHeaderStatementRequestSourcePrefixListsList.isEmpty()
                                || !packetHeaderStatementRequestSourcePrefixListsList.isAutoConstruct()) {
                            int sourcePrefixListsListIndex = 1;

                            for (String packetHeaderStatementRequestSourcePrefixListsListValue : packetHeaderStatementRequestSourcePrefixListsList) {
                                if (packetHeaderStatementRequestSourcePrefixListsListValue != null) {
                                    request.addParameter("ExcludePath." + excludePathsListIndex + ".Destination.PacketHeaderStatement.SourcePrefixList."
                                            + sourcePrefixListsListIndex, StringUtils.fromString(packetHeaderStatementRequestSourcePrefixListsListValue));
                                }
                                sourcePrefixListsListIndex++;
                            }
                        }

                        com.amazonaws.internal.SdkInternalList<String> packetHeaderStatementRequestDestinationPrefixListsList = (com.amazonaws.internal.SdkInternalList<String>) packetHeaderStatement
                                .getDestinationPrefixLists();
                        if (!packetHeaderStatementRequestDestinationPrefixListsList.isEmpty()
                                || !packetHeaderStatementRequestDestinationPrefixListsList.isAutoConstruct()) {
                            int destinationPrefixListsListIndex = 1;

                            for (String packetHeaderStatementRequestDestinationPrefixListsListValue : packetHeaderStatementRequestDestinationPrefixListsList) {
                                if (packetHeaderStatementRequestDestinationPrefixListsListValue != null) {
                                    request.addParameter("ExcludePath." + excludePathsListIndex + ".Destination.PacketHeaderStatement.DestinationPrefixList."
                                            + destinationPrefixListsListIndex,
                                            StringUtils.fromString(packetHeaderStatementRequestDestinationPrefixListsListValue));
                                }
                                destinationPrefixListsListIndex++;
                            }
                        }

                        com.amazonaws.internal.SdkInternalList<String> packetHeaderStatementRequestProtocolsList = (com.amazonaws.internal.SdkInternalList<String>) packetHeaderStatement
                                .getProtocols();
                        if (!packetHeaderStatementRequestProtocolsList.isEmpty() || !packetHeaderStatementRequestProtocolsList.isAutoConstruct()) {
                            int protocolsListIndex = 1;

                            for (String packetHeaderStatementRequestProtocolsListValue : packetHeaderStatementRequestProtocolsList) {
                                if (packetHeaderStatementRequestProtocolsListValue != null) {
                                    request.addParameter("ExcludePath." + excludePathsListIndex + ".Destination.PacketHeaderStatement.Protocol."
                                            + protocolsListIndex, StringUtils.fromString(packetHeaderStatementRequestProtocolsListValue));
                                }
                                protocolsListIndex++;
                            }
                        }
                    }

                    ResourceStatementRequest resourceStatement = destination.getResourceStatement();
                    if (resourceStatement != null) {

                        com.amazonaws.internal.SdkInternalList<String> resourceStatementRequestResourcesList = (com.amazonaws.internal.SdkInternalList<String>) resourceStatement
                                .getResources();
                        if (!resourceStatementRequestResourcesList.isEmpty() || !resourceStatementRequestResourcesList.isAutoConstruct()) {
                            int resourcesListIndex = 1;

                            for (String resourceStatementRequestResourcesListValue : resourceStatementRequestResourcesList) {
                                if (resourceStatementRequestResourcesListValue != null) {
                                    request.addParameter("ExcludePath." + excludePathsListIndex + ".Destination.ResourceStatement.Resource."
                                            + resourcesListIndex, StringUtils.fromString(resourceStatementRequestResourcesListValue));
                                }
                                resourcesListIndex++;
                            }
                        }

                        com.amazonaws.internal.SdkInternalList<String> resourceStatementRequestResourceTypesList = (com.amazonaws.internal.SdkInternalList<String>) resourceStatement
                                .getResourceTypes();
                        if (!resourceStatementRequestResourceTypesList.isEmpty() || !resourceStatementRequestResourceTypesList.isAutoConstruct()) {
                            int resourceTypesListIndex = 1;

                            for (String resourceStatementRequestResourceTypesListValue : resourceStatementRequestResourceTypesList) {
                                if (resourceStatementRequestResourceTypesListValue != null) {
                                    request.addParameter("ExcludePath." + excludePathsListIndex + ".Destination.ResourceStatement.ResourceType."
                                            + resourceTypesListIndex, StringUtils.fromString(resourceStatementRequestResourceTypesListValue));
                                }
                                resourceTypesListIndex++;
                            }
                        }
                    }
                }

                com.amazonaws.internal.SdkInternalList<ThroughResourcesStatementRequest> accessScopePathRequestThroughResourcesList = (com.amazonaws.internal.SdkInternalList<ThroughResourcesStatementRequest>) createNetworkInsightsAccessScopeRequestExcludePathsListValue
                        .getThroughResources();
                if (!accessScopePathRequestThroughResourcesList.isEmpty() || !accessScopePathRequestThroughResourcesList.isAutoConstruct()) {
                    int throughResourcesListIndex = 1;

                    for (ThroughResourcesStatementRequest accessScopePathRequestThroughResourcesListValue : accessScopePathRequestThroughResourcesList) {

                        ResourceStatementRequest resourceStatement = accessScopePathRequestThroughResourcesListValue.getResourceStatement();
                        if (resourceStatement != null) {

                            com.amazonaws.internal.SdkInternalList<String> resourceStatementRequestResourcesList = (com.amazonaws.internal.SdkInternalList<String>) resourceStatement
                                    .getResources();
                            if (!resourceStatementRequestResourcesList.isEmpty() || !resourceStatementRequestResourcesList.isAutoConstruct()) {
                                int resourcesListIndex = 1;

                                for (String resourceStatementRequestResourcesListValue : resourceStatementRequestResourcesList) {
                                    if (resourceStatementRequestResourcesListValue != null) {
                                        request.addParameter("ExcludePath." + excludePathsListIndex + ".ThroughResource." + throughResourcesListIndex
                                                + ".ResourceStatement.Resource." + resourcesListIndex,
                                                StringUtils.fromString(resourceStatementRequestResourcesListValue));
                                    }
                                    resourcesListIndex++;
                                }
                            }

                            com.amazonaws.internal.SdkInternalList<String> resourceStatementRequestResourceTypesList = (com.amazonaws.internal.SdkInternalList<String>) resourceStatement
                                    .getResourceTypes();
                            if (!resourceStatementRequestResourceTypesList.isEmpty() || !resourceStatementRequestResourceTypesList.isAutoConstruct()) {
                                int resourceTypesListIndex = 1;

                                for (String resourceStatementRequestResourceTypesListValue : resourceStatementRequestResourceTypesList) {
                                    if (resourceStatementRequestResourceTypesListValue != null) {
                                        request.addParameter("ExcludePath." + excludePathsListIndex + ".ThroughResource." + throughResourcesListIndex
                                                + ".ResourceStatement.ResourceType." + resourceTypesListIndex,
                                                StringUtils.fromString(resourceStatementRequestResourceTypesListValue));
                                    }
                                    resourceTypesListIndex++;
                                }
                            }
                        }
                        throughResourcesListIndex++;
                    }
                }
                excludePathsListIndex++;
            }
        }

        request.addParameter("ClientToken", IdempotentUtils.resolveString(createNetworkInsightsAccessScopeRequest.getClientToken()));

        com.amazonaws.internal.SdkInternalList<TagSpecification> createNetworkInsightsAccessScopeRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) createNetworkInsightsAccessScopeRequest
                .getTagSpecifications();
        if (!createNetworkInsightsAccessScopeRequestTagSpecificationsList.isEmpty()
                || !createNetworkInsightsAccessScopeRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification createNetworkInsightsAccessScopeRequestTagSpecificationsListValue : createNetworkInsightsAccessScopeRequestTagSpecificationsList) {

                if (createNetworkInsightsAccessScopeRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(createNetworkInsightsAccessScopeRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createNetworkInsightsAccessScopeRequestTagSpecificationsListValue
                        .getTags();
                if (!tagSpecificationTagsList.isEmpty() || !tagSpecificationTagsList.isAutoConstruct()) {
                    int tagsListIndex = 1;

                    for (Tag tagSpecificationTagsListValue : tagSpecificationTagsList) {

                        if (tagSpecificationTagsListValue.getKey() != null) {
                            request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".Tag." + tagsListIndex + ".Key",
                                    StringUtils.fromString(tagSpecificationTagsListValue.getKey()));
                        }

                        if (tagSpecificationTagsListValue.getValue() != null) {
                            request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".Tag." + tagsListIndex + ".Value",
                                    StringUtils.fromString(tagSpecificationTagsListValue.getValue()));
                        }
                        tagsListIndex++;
                    }
                }
                tagSpecificationsListIndex++;
            }
        }

        return request;
    }

}
