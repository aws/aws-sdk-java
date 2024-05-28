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
 * ServiceNetworkVpcAssociationSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ServiceNetworkVpcAssociationSummaryMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("createdBy").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdatedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> SERVICENETWORKARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceNetworkArn").build();
    private static final MarshallingInfo<String> SERVICENETWORKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceNetworkId").build();
    private static final MarshallingInfo<String> SERVICENETWORKNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceNetworkName").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> VPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("vpcId").build();

    private static final ServiceNetworkVpcAssociationSummaryMarshaller instance = new ServiceNetworkVpcAssociationSummaryMarshaller();

    public static ServiceNetworkVpcAssociationSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ServiceNetworkVpcAssociationSummary serviceNetworkVpcAssociationSummary, ProtocolMarshaller protocolMarshaller) {

        if (serviceNetworkVpcAssociationSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(serviceNetworkVpcAssociationSummary.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(serviceNetworkVpcAssociationSummary.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(serviceNetworkVpcAssociationSummary.getCreatedBy(), CREATEDBY_BINDING);
            protocolMarshaller.marshall(serviceNetworkVpcAssociationSummary.getId(), ID_BINDING);
            protocolMarshaller.marshall(serviceNetworkVpcAssociationSummary.getLastUpdatedAt(), LASTUPDATEDAT_BINDING);
            protocolMarshaller.marshall(serviceNetworkVpcAssociationSummary.getServiceNetworkArn(), SERVICENETWORKARN_BINDING);
            protocolMarshaller.marshall(serviceNetworkVpcAssociationSummary.getServiceNetworkId(), SERVICENETWORKID_BINDING);
            protocolMarshaller.marshall(serviceNetworkVpcAssociationSummary.getServiceNetworkName(), SERVICENETWORKNAME_BINDING);
            protocolMarshaller.marshall(serviceNetworkVpcAssociationSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(serviceNetworkVpcAssociationSummary.getVpcId(), VPCID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
