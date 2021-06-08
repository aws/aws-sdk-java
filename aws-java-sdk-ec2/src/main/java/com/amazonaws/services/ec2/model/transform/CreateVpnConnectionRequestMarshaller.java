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
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CreateVpnConnectionRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVpnConnectionRequestMarshaller implements Marshaller<Request<CreateVpnConnectionRequest>, CreateVpnConnectionRequest> {

    public Request<CreateVpnConnectionRequest> marshall(CreateVpnConnectionRequest createVpnConnectionRequest) {

        if (createVpnConnectionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateVpnConnectionRequest> request = new DefaultRequest<CreateVpnConnectionRequest>(createVpnConnectionRequest, "AmazonEC2");
        request.addParameter("Action", "CreateVpnConnection");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createVpnConnectionRequest.getCustomerGatewayId() != null) {
            request.addParameter("CustomerGatewayId", StringUtils.fromString(createVpnConnectionRequest.getCustomerGatewayId()));
        }

        if (createVpnConnectionRequest.getType() != null) {
            request.addParameter("Type", StringUtils.fromString(createVpnConnectionRequest.getType()));
        }

        if (createVpnConnectionRequest.getVpnGatewayId() != null) {
            request.addParameter("VpnGatewayId", StringUtils.fromString(createVpnConnectionRequest.getVpnGatewayId()));
        }

        if (createVpnConnectionRequest.getTransitGatewayId() != null) {
            request.addParameter("TransitGatewayId", StringUtils.fromString(createVpnConnectionRequest.getTransitGatewayId()));
        }

        VpnConnectionOptionsSpecification options = createVpnConnectionRequest.getOptions();
        if (options != null) {

            if (options.getEnableAcceleration() != null) {
                request.addParameter("Options.EnableAcceleration", StringUtils.fromBoolean(options.getEnableAcceleration()));
            }

            if (options.getStaticRoutesOnly() != null) {
                request.addParameter("Options.StaticRoutesOnly", StringUtils.fromBoolean(options.getStaticRoutesOnly()));
            }

            if (options.getTunnelInsideIpVersion() != null) {
                request.addParameter("Options.TunnelInsideIpVersion", StringUtils.fromString(options.getTunnelInsideIpVersion()));
            }

            com.amazonaws.internal.SdkInternalList<VpnTunnelOptionsSpecification> vpnConnectionOptionsSpecificationTunnelOptionsList = (com.amazonaws.internal.SdkInternalList<VpnTunnelOptionsSpecification>) options
                    .getTunnelOptions();
            if (!vpnConnectionOptionsSpecificationTunnelOptionsList.isEmpty() || !vpnConnectionOptionsSpecificationTunnelOptionsList.isAutoConstruct()) {
                int tunnelOptionsListIndex = 1;

                for (VpnTunnelOptionsSpecification vpnConnectionOptionsSpecificationTunnelOptionsListValue : vpnConnectionOptionsSpecificationTunnelOptionsList) {

                    if (vpnConnectionOptionsSpecificationTunnelOptionsListValue.getTunnelInsideCidr() != null) {
                        request.addParameter("Options.TunnelOptions." + tunnelOptionsListIndex + ".TunnelInsideCidr",
                                StringUtils.fromString(vpnConnectionOptionsSpecificationTunnelOptionsListValue.getTunnelInsideCidr()));
                    }

                    if (vpnConnectionOptionsSpecificationTunnelOptionsListValue.getTunnelInsideIpv6Cidr() != null) {
                        request.addParameter("Options.TunnelOptions." + tunnelOptionsListIndex + ".TunnelInsideIpv6Cidr",
                                StringUtils.fromString(vpnConnectionOptionsSpecificationTunnelOptionsListValue.getTunnelInsideIpv6Cidr()));
                    }

                    if (vpnConnectionOptionsSpecificationTunnelOptionsListValue.getPreSharedKey() != null) {
                        request.addParameter("Options.TunnelOptions." + tunnelOptionsListIndex + ".PreSharedKey",
                                StringUtils.fromString(vpnConnectionOptionsSpecificationTunnelOptionsListValue.getPreSharedKey()));
                    }

                    if (vpnConnectionOptionsSpecificationTunnelOptionsListValue.getPhase1LifetimeSeconds() != null) {
                        request.addParameter("Options.TunnelOptions." + tunnelOptionsListIndex + ".Phase1LifetimeSeconds",
                                StringUtils.fromInteger(vpnConnectionOptionsSpecificationTunnelOptionsListValue.getPhase1LifetimeSeconds()));
                    }

                    if (vpnConnectionOptionsSpecificationTunnelOptionsListValue.getPhase2LifetimeSeconds() != null) {
                        request.addParameter("Options.TunnelOptions." + tunnelOptionsListIndex + ".Phase2LifetimeSeconds",
                                StringUtils.fromInteger(vpnConnectionOptionsSpecificationTunnelOptionsListValue.getPhase2LifetimeSeconds()));
                    }

                    if (vpnConnectionOptionsSpecificationTunnelOptionsListValue.getRekeyMarginTimeSeconds() != null) {
                        request.addParameter("Options.TunnelOptions." + tunnelOptionsListIndex + ".RekeyMarginTimeSeconds",
                                StringUtils.fromInteger(vpnConnectionOptionsSpecificationTunnelOptionsListValue.getRekeyMarginTimeSeconds()));
                    }

                    if (vpnConnectionOptionsSpecificationTunnelOptionsListValue.getRekeyFuzzPercentage() != null) {
                        request.addParameter("Options.TunnelOptions." + tunnelOptionsListIndex + ".RekeyFuzzPercentage",
                                StringUtils.fromInteger(vpnConnectionOptionsSpecificationTunnelOptionsListValue.getRekeyFuzzPercentage()));
                    }

                    if (vpnConnectionOptionsSpecificationTunnelOptionsListValue.getReplayWindowSize() != null) {
                        request.addParameter("Options.TunnelOptions." + tunnelOptionsListIndex + ".ReplayWindowSize",
                                StringUtils.fromInteger(vpnConnectionOptionsSpecificationTunnelOptionsListValue.getReplayWindowSize()));
                    }

                    if (vpnConnectionOptionsSpecificationTunnelOptionsListValue.getDPDTimeoutSeconds() != null) {
                        request.addParameter("Options.TunnelOptions." + tunnelOptionsListIndex + ".DPDTimeoutSeconds",
                                StringUtils.fromInteger(vpnConnectionOptionsSpecificationTunnelOptionsListValue.getDPDTimeoutSeconds()));
                    }

                    if (vpnConnectionOptionsSpecificationTunnelOptionsListValue.getDPDTimeoutAction() != null) {
                        request.addParameter("Options.TunnelOptions." + tunnelOptionsListIndex + ".DPDTimeoutAction",
                                StringUtils.fromString(vpnConnectionOptionsSpecificationTunnelOptionsListValue.getDPDTimeoutAction()));
                    }

                    com.amazonaws.internal.SdkInternalList<Phase1EncryptionAlgorithmsRequestListValue> vpnTunnelOptionsSpecificationPhase1EncryptionAlgorithmsList = (com.amazonaws.internal.SdkInternalList<Phase1EncryptionAlgorithmsRequestListValue>) vpnConnectionOptionsSpecificationTunnelOptionsListValue
                            .getPhase1EncryptionAlgorithms();
                    if (!vpnTunnelOptionsSpecificationPhase1EncryptionAlgorithmsList.isEmpty()
                            || !vpnTunnelOptionsSpecificationPhase1EncryptionAlgorithmsList.isAutoConstruct()) {
                        int phase1EncryptionAlgorithmsListIndex = 1;

                        for (Phase1EncryptionAlgorithmsRequestListValue vpnTunnelOptionsSpecificationPhase1EncryptionAlgorithmsListValue : vpnTunnelOptionsSpecificationPhase1EncryptionAlgorithmsList) {

                            if (vpnTunnelOptionsSpecificationPhase1EncryptionAlgorithmsListValue.getValue() != null) {
                                request.addParameter("Options.TunnelOptions." + tunnelOptionsListIndex + ".Phase1EncryptionAlgorithm."
                                        + phase1EncryptionAlgorithmsListIndex + ".Value",
                                        StringUtils.fromString(vpnTunnelOptionsSpecificationPhase1EncryptionAlgorithmsListValue.getValue()));
                            }
                            phase1EncryptionAlgorithmsListIndex++;
                        }
                    }

                    com.amazonaws.internal.SdkInternalList<Phase2EncryptionAlgorithmsRequestListValue> vpnTunnelOptionsSpecificationPhase2EncryptionAlgorithmsList = (com.amazonaws.internal.SdkInternalList<Phase2EncryptionAlgorithmsRequestListValue>) vpnConnectionOptionsSpecificationTunnelOptionsListValue
                            .getPhase2EncryptionAlgorithms();
                    if (!vpnTunnelOptionsSpecificationPhase2EncryptionAlgorithmsList.isEmpty()
                            || !vpnTunnelOptionsSpecificationPhase2EncryptionAlgorithmsList.isAutoConstruct()) {
                        int phase2EncryptionAlgorithmsListIndex = 1;

                        for (Phase2EncryptionAlgorithmsRequestListValue vpnTunnelOptionsSpecificationPhase2EncryptionAlgorithmsListValue : vpnTunnelOptionsSpecificationPhase2EncryptionAlgorithmsList) {

                            if (vpnTunnelOptionsSpecificationPhase2EncryptionAlgorithmsListValue.getValue() != null) {
                                request.addParameter("Options.TunnelOptions." + tunnelOptionsListIndex + ".Phase2EncryptionAlgorithm."
                                        + phase2EncryptionAlgorithmsListIndex + ".Value",
                                        StringUtils.fromString(vpnTunnelOptionsSpecificationPhase2EncryptionAlgorithmsListValue.getValue()));
                            }
                            phase2EncryptionAlgorithmsListIndex++;
                        }
                    }

                    com.amazonaws.internal.SdkInternalList<Phase1IntegrityAlgorithmsRequestListValue> vpnTunnelOptionsSpecificationPhase1IntegrityAlgorithmsList = (com.amazonaws.internal.SdkInternalList<Phase1IntegrityAlgorithmsRequestListValue>) vpnConnectionOptionsSpecificationTunnelOptionsListValue
                            .getPhase1IntegrityAlgorithms();
                    if (!vpnTunnelOptionsSpecificationPhase1IntegrityAlgorithmsList.isEmpty()
                            || !vpnTunnelOptionsSpecificationPhase1IntegrityAlgorithmsList.isAutoConstruct()) {
                        int phase1IntegrityAlgorithmsListIndex = 1;

                        for (Phase1IntegrityAlgorithmsRequestListValue vpnTunnelOptionsSpecificationPhase1IntegrityAlgorithmsListValue : vpnTunnelOptionsSpecificationPhase1IntegrityAlgorithmsList) {

                            if (vpnTunnelOptionsSpecificationPhase1IntegrityAlgorithmsListValue.getValue() != null) {
                                request.addParameter("Options.TunnelOptions." + tunnelOptionsListIndex + ".Phase1IntegrityAlgorithm."
                                        + phase1IntegrityAlgorithmsListIndex + ".Value",
                                        StringUtils.fromString(vpnTunnelOptionsSpecificationPhase1IntegrityAlgorithmsListValue.getValue()));
                            }
                            phase1IntegrityAlgorithmsListIndex++;
                        }
                    }

                    com.amazonaws.internal.SdkInternalList<Phase2IntegrityAlgorithmsRequestListValue> vpnTunnelOptionsSpecificationPhase2IntegrityAlgorithmsList = (com.amazonaws.internal.SdkInternalList<Phase2IntegrityAlgorithmsRequestListValue>) vpnConnectionOptionsSpecificationTunnelOptionsListValue
                            .getPhase2IntegrityAlgorithms();
                    if (!vpnTunnelOptionsSpecificationPhase2IntegrityAlgorithmsList.isEmpty()
                            || !vpnTunnelOptionsSpecificationPhase2IntegrityAlgorithmsList.isAutoConstruct()) {
                        int phase2IntegrityAlgorithmsListIndex = 1;

                        for (Phase2IntegrityAlgorithmsRequestListValue vpnTunnelOptionsSpecificationPhase2IntegrityAlgorithmsListValue : vpnTunnelOptionsSpecificationPhase2IntegrityAlgorithmsList) {

                            if (vpnTunnelOptionsSpecificationPhase2IntegrityAlgorithmsListValue.getValue() != null) {
                                request.addParameter("Options.TunnelOptions." + tunnelOptionsListIndex + ".Phase2IntegrityAlgorithm."
                                        + phase2IntegrityAlgorithmsListIndex + ".Value",
                                        StringUtils.fromString(vpnTunnelOptionsSpecificationPhase2IntegrityAlgorithmsListValue.getValue()));
                            }
                            phase2IntegrityAlgorithmsListIndex++;
                        }
                    }

                    com.amazonaws.internal.SdkInternalList<Phase1DHGroupNumbersRequestListValue> vpnTunnelOptionsSpecificationPhase1DHGroupNumbersList = (com.amazonaws.internal.SdkInternalList<Phase1DHGroupNumbersRequestListValue>) vpnConnectionOptionsSpecificationTunnelOptionsListValue
                            .getPhase1DHGroupNumbers();
                    if (!vpnTunnelOptionsSpecificationPhase1DHGroupNumbersList.isEmpty()
                            || !vpnTunnelOptionsSpecificationPhase1DHGroupNumbersList.isAutoConstruct()) {
                        int phase1DHGroupNumbersListIndex = 1;

                        for (Phase1DHGroupNumbersRequestListValue vpnTunnelOptionsSpecificationPhase1DHGroupNumbersListValue : vpnTunnelOptionsSpecificationPhase1DHGroupNumbersList) {

                            if (vpnTunnelOptionsSpecificationPhase1DHGroupNumbersListValue.getValue() != null) {
                                request.addParameter("Options.TunnelOptions." + tunnelOptionsListIndex + ".Phase1DHGroupNumber."
                                        + phase1DHGroupNumbersListIndex + ".Value",
                                        StringUtils.fromInteger(vpnTunnelOptionsSpecificationPhase1DHGroupNumbersListValue.getValue()));
                            }
                            phase1DHGroupNumbersListIndex++;
                        }
                    }

                    com.amazonaws.internal.SdkInternalList<Phase2DHGroupNumbersRequestListValue> vpnTunnelOptionsSpecificationPhase2DHGroupNumbersList = (com.amazonaws.internal.SdkInternalList<Phase2DHGroupNumbersRequestListValue>) vpnConnectionOptionsSpecificationTunnelOptionsListValue
                            .getPhase2DHGroupNumbers();
                    if (!vpnTunnelOptionsSpecificationPhase2DHGroupNumbersList.isEmpty()
                            || !vpnTunnelOptionsSpecificationPhase2DHGroupNumbersList.isAutoConstruct()) {
                        int phase2DHGroupNumbersListIndex = 1;

                        for (Phase2DHGroupNumbersRequestListValue vpnTunnelOptionsSpecificationPhase2DHGroupNumbersListValue : vpnTunnelOptionsSpecificationPhase2DHGroupNumbersList) {

                            if (vpnTunnelOptionsSpecificationPhase2DHGroupNumbersListValue.getValue() != null) {
                                request.addParameter("Options.TunnelOptions." + tunnelOptionsListIndex + ".Phase2DHGroupNumber."
                                        + phase2DHGroupNumbersListIndex + ".Value",
                                        StringUtils.fromInteger(vpnTunnelOptionsSpecificationPhase2DHGroupNumbersListValue.getValue()));
                            }
                            phase2DHGroupNumbersListIndex++;
                        }
                    }

                    com.amazonaws.internal.SdkInternalList<IKEVersionsRequestListValue> vpnTunnelOptionsSpecificationIKEVersionsList = (com.amazonaws.internal.SdkInternalList<IKEVersionsRequestListValue>) vpnConnectionOptionsSpecificationTunnelOptionsListValue
                            .getIKEVersions();
                    if (!vpnTunnelOptionsSpecificationIKEVersionsList.isEmpty() || !vpnTunnelOptionsSpecificationIKEVersionsList.isAutoConstruct()) {
                        int iKEVersionsListIndex = 1;

                        for (IKEVersionsRequestListValue vpnTunnelOptionsSpecificationIKEVersionsListValue : vpnTunnelOptionsSpecificationIKEVersionsList) {

                            if (vpnTunnelOptionsSpecificationIKEVersionsListValue.getValue() != null) {
                                request.addParameter("Options.TunnelOptions." + tunnelOptionsListIndex + ".IKEVersion." + iKEVersionsListIndex + ".Value",
                                        StringUtils.fromString(vpnTunnelOptionsSpecificationIKEVersionsListValue.getValue()));
                            }
                            iKEVersionsListIndex++;
                        }
                    }

                    if (vpnConnectionOptionsSpecificationTunnelOptionsListValue.getStartupAction() != null) {
                        request.addParameter("Options.TunnelOptions." + tunnelOptionsListIndex + ".StartupAction",
                                StringUtils.fromString(vpnConnectionOptionsSpecificationTunnelOptionsListValue.getStartupAction()));
                    }
                    tunnelOptionsListIndex++;
                }
            }

            if (options.getLocalIpv4NetworkCidr() != null) {
                request.addParameter("Options.LocalIpv4NetworkCidr", StringUtils.fromString(options.getLocalIpv4NetworkCidr()));
            }

            if (options.getRemoteIpv4NetworkCidr() != null) {
                request.addParameter("Options.RemoteIpv4NetworkCidr", StringUtils.fromString(options.getRemoteIpv4NetworkCidr()));
            }

            if (options.getLocalIpv6NetworkCidr() != null) {
                request.addParameter("Options.LocalIpv6NetworkCidr", StringUtils.fromString(options.getLocalIpv6NetworkCidr()));
            }

            if (options.getRemoteIpv6NetworkCidr() != null) {
                request.addParameter("Options.RemoteIpv6NetworkCidr", StringUtils.fromString(options.getRemoteIpv6NetworkCidr()));
            }
        }

        com.amazonaws.internal.SdkInternalList<TagSpecification> createVpnConnectionRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) createVpnConnectionRequest
                .getTagSpecifications();
        if (!createVpnConnectionRequestTagSpecificationsList.isEmpty() || !createVpnConnectionRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification createVpnConnectionRequestTagSpecificationsListValue : createVpnConnectionRequestTagSpecificationsList) {

                if (createVpnConnectionRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(createVpnConnectionRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createVpnConnectionRequestTagSpecificationsListValue
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
