/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.vpclattice.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.vpclattice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ServiceNetworkServiceAssociationSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ServiceNetworkServiceAssociationSummaryMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("createdBy").build();
    private static final MarshallingInfo<String> CUSTOMDOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("customDomainName").build();
    private static final MarshallingInfo<StructuredPojo> DNSENTRY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dnsEntry").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> SERVICEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceArn").build();
    private static final MarshallingInfo<String> SERVICEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("serviceId").build();
    private static final MarshallingInfo<String> SERVICENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceName").build();
    private static final MarshallingInfo<String> SERVICENETWORKARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceNetworkArn").build();
    private static final MarshallingInfo<String> SERVICENETWORKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceNetworkId").build();
    private static final MarshallingInfo<String> SERVICENETWORKNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceNetworkName").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();

    private static final ServiceNetworkServiceAssociationSummaryMarshaller instance = new ServiceNetworkServiceAssociationSummaryMarshaller();

    public static ServiceNetworkServiceAssociationSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ServiceNetworkServiceAssociationSummary serviceNetworkServiceAssociationSummary, ProtocolMarshaller protocolMarshaller) {

        if (serviceNetworkServiceAssociationSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(serviceNetworkServiceAssociationSummary.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(serviceNetworkServiceAssociationSummary.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(serviceNetworkServiceAssociationSummary.getCreatedBy(), CREATEDBY_BINDING);
            protocolMarshaller.marshall(serviceNetworkServiceAssociationSummary.getCustomDomainName(), CUSTOMDOMAINNAME_BINDING);
            protocolMarshaller.marshall(serviceNetworkServiceAssociationSummary.getDnsEntry(), DNSENTRY_BINDING);
            protocolMarshaller.marshall(serviceNetworkServiceAssociationSummary.getId(), ID_BINDING);
            protocolMarshaller.marshall(serviceNetworkServiceAssociationSummary.getServiceArn(), SERVICEARN_BINDING);
            protocolMarshaller.marshall(serviceNetworkServiceAssociationSummary.getServiceId(), SERVICEID_BINDING);
            protocolMarshaller.marshall(serviceNetworkServiceAssociationSummary.getServiceName(), SERVICENAME_BINDING);
            protocolMarshaller.marshall(serviceNetworkServiceAssociationSummary.getServiceNetworkArn(), SERVICENETWORKARN_BINDING);
            protocolMarshaller.marshall(serviceNetworkServiceAssociationSummary.getServiceNetworkId(), SERVICENETWORKID_BINDING);
            protocolMarshaller.marshall(serviceNetworkServiceAssociationSummary.getServiceNetworkName(), SERVICENETWORKNAME_BINDING);
            protocolMarshaller.marshall(serviceNetworkServiceAssociationSummary.getStatus(), STATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
