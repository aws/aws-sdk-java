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
 * ModifyClientVpnEndpointRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyClientVpnEndpointRequestMarshaller implements Marshaller<Request<ModifyClientVpnEndpointRequest>, ModifyClientVpnEndpointRequest> {

    public Request<ModifyClientVpnEndpointRequest> marshall(ModifyClientVpnEndpointRequest modifyClientVpnEndpointRequest) {

        if (modifyClientVpnEndpointRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyClientVpnEndpointRequest> request = new DefaultRequest<ModifyClientVpnEndpointRequest>(modifyClientVpnEndpointRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyClientVpnEndpoint");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyClientVpnEndpointRequest.getClientVpnEndpointId() != null) {
            request.addParameter("ClientVpnEndpointId", StringUtils.fromString(modifyClientVpnEndpointRequest.getClientVpnEndpointId()));
        }

        if (modifyClientVpnEndpointRequest.getServerCertificateArn() != null) {
            request.addParameter("ServerCertificateArn", StringUtils.fromString(modifyClientVpnEndpointRequest.getServerCertificateArn()));
        }

        ConnectionLogOptions connectionLogOptions = modifyClientVpnEndpointRequest.getConnectionLogOptions();
        if (connectionLogOptions != null) {

            if (connectionLogOptions.getEnabled() != null) {
                request.addParameter("ConnectionLogOptions.Enabled", StringUtils.fromBoolean(connectionLogOptions.getEnabled()));
            }

            if (connectionLogOptions.getCloudwatchLogGroup() != null) {
                request.addParameter("ConnectionLogOptions.CloudwatchLogGroup", StringUtils.fromString(connectionLogOptions.getCloudwatchLogGroup()));
            }

            if (connectionLogOptions.getCloudwatchLogStream() != null) {
                request.addParameter("ConnectionLogOptions.CloudwatchLogStream", StringUtils.fromString(connectionLogOptions.getCloudwatchLogStream()));
            }
        }

        DnsServersOptionsModifyStructure dnsServers = modifyClientVpnEndpointRequest.getDnsServers();
        if (dnsServers != null) {

            com.amazonaws.internal.SdkInternalList<String> dnsServersOptionsModifyStructureCustomDnsServersList = (com.amazonaws.internal.SdkInternalList<String>) dnsServers
                    .getCustomDnsServers();
            if (!dnsServersOptionsModifyStructureCustomDnsServersList.isEmpty() || !dnsServersOptionsModifyStructureCustomDnsServersList.isAutoConstruct()) {
                int customDnsServersListIndex = 1;

                for (String dnsServersOptionsModifyStructureCustomDnsServersListValue : dnsServersOptionsModifyStructureCustomDnsServersList) {
                    if (dnsServersOptionsModifyStructureCustomDnsServersListValue != null) {
                        request.addParameter("DnsServers.CustomDnsServers." + customDnsServersListIndex,
                                StringUtils.fromString(dnsServersOptionsModifyStructureCustomDnsServersListValue));
                    }
                    customDnsServersListIndex++;
                }
            }

            if (dnsServers.getEnabled() != null) {
                request.addParameter("DnsServers.Enabled", StringUtils.fromBoolean(dnsServers.getEnabled()));
            }
        }

        if (modifyClientVpnEndpointRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(modifyClientVpnEndpointRequest.getDescription()));
        }

        return request;
    }

}
