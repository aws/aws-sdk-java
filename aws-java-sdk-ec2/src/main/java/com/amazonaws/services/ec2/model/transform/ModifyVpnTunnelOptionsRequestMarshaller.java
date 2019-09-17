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
 * ModifyVpnTunnelOptionsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyVpnTunnelOptionsRequestMarshaller implements Marshaller<Request<ModifyVpnTunnelOptionsRequest>, ModifyVpnTunnelOptionsRequest> {

    public Request<ModifyVpnTunnelOptionsRequest> marshall(ModifyVpnTunnelOptionsRequest modifyVpnTunnelOptionsRequest) {

        if (modifyVpnTunnelOptionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyVpnTunnelOptionsRequest> request = new DefaultRequest<ModifyVpnTunnelOptionsRequest>(modifyVpnTunnelOptionsRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyVpnTunnelOptions");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyVpnTunnelOptionsRequest.getVpnConnectionId() != null) {
            request.addParameter("VpnConnectionId", StringUtils.fromString(modifyVpnTunnelOptionsRequest.getVpnConnectionId()));
        }

        if (modifyVpnTunnelOptionsRequest.getVpnTunnelOutsideIpAddress() != null) {
            request.addParameter("VpnTunnelOutsideIpAddress", StringUtils.fromString(modifyVpnTunnelOptionsRequest.getVpnTunnelOutsideIpAddress()));
        }

        ModifyVpnTunnelOptionsSpecification tunnelOptions = modifyVpnTunnelOptionsRequest.getTunnelOptions();
        if (tunnelOptions != null) {

            if (tunnelOptions.getTunnelInsideCidr() != null) {
                request.addParameter("TunnelOptions.TunnelInsideCidr", StringUtils.fromString(tunnelOptions.getTunnelInsideCidr()));
            }

            if (tunnelOptions.getPreSharedKey() != null) {
                request.addParameter("TunnelOptions.PreSharedKey", StringUtils.fromString(tunnelOptions.getPreSharedKey()));
            }

            if (tunnelOptions.getPhase1LifetimeSeconds() != null) {
                request.addParameter("TunnelOptions.Phase1LifetimeSeconds", StringUtils.fromInteger(tunnelOptions.getPhase1LifetimeSeconds()));
            }

            if (tunnelOptions.getPhase2LifetimeSeconds() != null) {
                request.addParameter("TunnelOptions.Phase2LifetimeSeconds", StringUtils.fromInteger(tunnelOptions.getPhase2LifetimeSeconds()));
            }

            if (tunnelOptions.getRekeyMarginTimeSeconds() != null) {
                request.addParameter("TunnelOptions.RekeyMarginTimeSeconds", StringUtils.fromInteger(tunnelOptions.getRekeyMarginTimeSeconds()));
            }

            if (tunnelOptions.getRekeyFuzzPercentage() != null) {
                request.addParameter("TunnelOptions.RekeyFuzzPercentage", StringUtils.fromInteger(tunnelOptions.getRekeyFuzzPercentage()));
            }

            if (tunnelOptions.getReplayWindowSize() != null) {
                request.addParameter("TunnelOptions.ReplayWindowSize", StringUtils.fromInteger(tunnelOptions.getReplayWindowSize()));
            }

            if (tunnelOptions.getDPDTimeoutSeconds() != null) {
                request.addParameter("TunnelOptions.DPDTimeoutSeconds", StringUtils.fromInteger(tunnelOptions.getDPDTimeoutSeconds()));
            }

            com.amazonaws.internal.SdkInternalList<Phase1EncryptionAlgorithmsRequestListValue> modifyVpnTunnelOptionsSpecificationPhase1EncryptionAlgorithmsList = (com.amazonaws.internal.SdkInternalList<Phase1EncryptionAlgorithmsRequestListValue>) tunnelOptions
                    .getPhase1EncryptionAlgorithms();
            if (!modifyVpnTunnelOptionsSpecificationPhase1EncryptionAlgorithmsList.isEmpty()
                    || !modifyVpnTunnelOptionsSpecificationPhase1EncryptionAlgorithmsList.isAutoConstruct()) {
                int phase1EncryptionAlgorithmsListIndex = 1;

                for (Phase1EncryptionAlgorithmsRequestListValue modifyVpnTunnelOptionsSpecificationPhase1EncryptionAlgorithmsListValue : modifyVpnTunnelOptionsSpecificationPhase1EncryptionAlgorithmsList) {

                    if (modifyVpnTunnelOptionsSpecificationPhase1EncryptionAlgorithmsListValue.getValue() != null) {
                        request.addParameter("TunnelOptions.Phase1EncryptionAlgorithm." + phase1EncryptionAlgorithmsListIndex + ".Value",
                                StringUtils.fromString(modifyVpnTunnelOptionsSpecificationPhase1EncryptionAlgorithmsListValue.getValue()));
                    }
                    phase1EncryptionAlgorithmsListIndex++;
                }
            }

            com.amazonaws.internal.SdkInternalList<Phase2EncryptionAlgorithmsRequestListValue> modifyVpnTunnelOptionsSpecificationPhase2EncryptionAlgorithmsList = (com.amazonaws.internal.SdkInternalList<Phase2EncryptionAlgorithmsRequestListValue>) tunnelOptions
                    .getPhase2EncryptionAlgorithms();
            if (!modifyVpnTunnelOptionsSpecificationPhase2EncryptionAlgorithmsList.isEmpty()
                    || !modifyVpnTunnelOptionsSpecificationPhase2EncryptionAlgorithmsList.isAutoConstruct()) {
                int phase2EncryptionAlgorithmsListIndex = 1;

                for (Phase2EncryptionAlgorithmsRequestListValue modifyVpnTunnelOptionsSpecificationPhase2EncryptionAlgorithmsListValue : modifyVpnTunnelOptionsSpecificationPhase2EncryptionAlgorithmsList) {

                    if (modifyVpnTunnelOptionsSpecificationPhase2EncryptionAlgorithmsListValue.getValue() != null) {
                        request.addParameter("TunnelOptions.Phase2EncryptionAlgorithm." + phase2EncryptionAlgorithmsListIndex + ".Value",
                                StringUtils.fromString(modifyVpnTunnelOptionsSpecificationPhase2EncryptionAlgorithmsListValue.getValue()));
                    }
                    phase2EncryptionAlgorithmsListIndex++;
                }
            }

            com.amazonaws.internal.SdkInternalList<Phase1IntegrityAlgorithmsRequestListValue> modifyVpnTunnelOptionsSpecificationPhase1IntegrityAlgorithmsList = (com.amazonaws.internal.SdkInternalList<Phase1IntegrityAlgorithmsRequestListValue>) tunnelOptions
                    .getPhase1IntegrityAlgorithms();
            if (!modifyVpnTunnelOptionsSpecificationPhase1IntegrityAlgorithmsList.isEmpty()
                    || !modifyVpnTunnelOptionsSpecificationPhase1IntegrityAlgorithmsList.isAutoConstruct()) {
                int phase1IntegrityAlgorithmsListIndex = 1;

                for (Phase1IntegrityAlgorithmsRequestListValue modifyVpnTunnelOptionsSpecificationPhase1IntegrityAlgorithmsListValue : modifyVpnTunnelOptionsSpecificationPhase1IntegrityAlgorithmsList) {

                    if (modifyVpnTunnelOptionsSpecificationPhase1IntegrityAlgorithmsListValue.getValue() != null) {
                        request.addParameter("TunnelOptions.Phase1IntegrityAlgorithm." + phase1IntegrityAlgorithmsListIndex + ".Value",
                                StringUtils.fromString(modifyVpnTunnelOptionsSpecificationPhase1IntegrityAlgorithmsListValue.getValue()));
                    }
                    phase1IntegrityAlgorithmsListIndex++;
                }
            }

            com.amazonaws.internal.SdkInternalList<Phase2IntegrityAlgorithmsRequestListValue> modifyVpnTunnelOptionsSpecificationPhase2IntegrityAlgorithmsList = (com.amazonaws.internal.SdkInternalList<Phase2IntegrityAlgorithmsRequestListValue>) tunnelOptions
                    .getPhase2IntegrityAlgorithms();
            if (!modifyVpnTunnelOptionsSpecificationPhase2IntegrityAlgorithmsList.isEmpty()
                    || !modifyVpnTunnelOptionsSpecificationPhase2IntegrityAlgorithmsList.isAutoConstruct()) {
                int phase2IntegrityAlgorithmsListIndex = 1;

                for (Phase2IntegrityAlgorithmsRequestListValue modifyVpnTunnelOptionsSpecificationPhase2IntegrityAlgorithmsListValue : modifyVpnTunnelOptionsSpecificationPhase2IntegrityAlgorithmsList) {

                    if (modifyVpnTunnelOptionsSpecificationPhase2IntegrityAlgorithmsListValue.getValue() != null) {
                        request.addParameter("TunnelOptions.Phase2IntegrityAlgorithm." + phase2IntegrityAlgorithmsListIndex + ".Value",
                                StringUtils.fromString(modifyVpnTunnelOptionsSpecificationPhase2IntegrityAlgorithmsListValue.getValue()));
                    }
                    phase2IntegrityAlgorithmsListIndex++;
                }
            }

            com.amazonaws.internal.SdkInternalList<Phase1DHGroupNumbersRequestListValue> modifyVpnTunnelOptionsSpecificationPhase1DHGroupNumbersList = (com.amazonaws.internal.SdkInternalList<Phase1DHGroupNumbersRequestListValue>) tunnelOptions
                    .getPhase1DHGroupNumbers();
            if (!modifyVpnTunnelOptionsSpecificationPhase1DHGroupNumbersList.isEmpty()
                    || !modifyVpnTunnelOptionsSpecificationPhase1DHGroupNumbersList.isAutoConstruct()) {
                int phase1DHGroupNumbersListIndex = 1;

                for (Phase1DHGroupNumbersRequestListValue modifyVpnTunnelOptionsSpecificationPhase1DHGroupNumbersListValue : modifyVpnTunnelOptionsSpecificationPhase1DHGroupNumbersList) {

                    if (modifyVpnTunnelOptionsSpecificationPhase1DHGroupNumbersListValue.getValue() != null) {
                        request.addParameter("TunnelOptions.Phase1DHGroupNumber." + phase1DHGroupNumbersListIndex + ".Value",
                                StringUtils.fromInteger(modifyVpnTunnelOptionsSpecificationPhase1DHGroupNumbersListValue.getValue()));
                    }
                    phase1DHGroupNumbersListIndex++;
                }
            }

            com.amazonaws.internal.SdkInternalList<Phase2DHGroupNumbersRequestListValue> modifyVpnTunnelOptionsSpecificationPhase2DHGroupNumbersList = (com.amazonaws.internal.SdkInternalList<Phase2DHGroupNumbersRequestListValue>) tunnelOptions
                    .getPhase2DHGroupNumbers();
            if (!modifyVpnTunnelOptionsSpecificationPhase2DHGroupNumbersList.isEmpty()
                    || !modifyVpnTunnelOptionsSpecificationPhase2DHGroupNumbersList.isAutoConstruct()) {
                int phase2DHGroupNumbersListIndex = 1;

                for (Phase2DHGroupNumbersRequestListValue modifyVpnTunnelOptionsSpecificationPhase2DHGroupNumbersListValue : modifyVpnTunnelOptionsSpecificationPhase2DHGroupNumbersList) {

                    if (modifyVpnTunnelOptionsSpecificationPhase2DHGroupNumbersListValue.getValue() != null) {
                        request.addParameter("TunnelOptions.Phase2DHGroupNumber." + phase2DHGroupNumbersListIndex + ".Value",
                                StringUtils.fromInteger(modifyVpnTunnelOptionsSpecificationPhase2DHGroupNumbersListValue.getValue()));
                    }
                    phase2DHGroupNumbersListIndex++;
                }
            }

            com.amazonaws.internal.SdkInternalList<IKEVersionsRequestListValue> modifyVpnTunnelOptionsSpecificationIKEVersionsList = (com.amazonaws.internal.SdkInternalList<IKEVersionsRequestListValue>) tunnelOptions
                    .getIKEVersions();
            if (!modifyVpnTunnelOptionsSpecificationIKEVersionsList.isEmpty() || !modifyVpnTunnelOptionsSpecificationIKEVersionsList.isAutoConstruct()) {
                int iKEVersionsListIndex = 1;

                for (IKEVersionsRequestListValue modifyVpnTunnelOptionsSpecificationIKEVersionsListValue : modifyVpnTunnelOptionsSpecificationIKEVersionsList) {

                    if (modifyVpnTunnelOptionsSpecificationIKEVersionsListValue.getValue() != null) {
                        request.addParameter("TunnelOptions.IKEVersion." + iKEVersionsListIndex + ".Value",
                                StringUtils.fromString(modifyVpnTunnelOptionsSpecificationIKEVersionsListValue.getValue()));
                    }
                    iKEVersionsListIndex++;
                }
            }
        }

        return request;
    }

}
