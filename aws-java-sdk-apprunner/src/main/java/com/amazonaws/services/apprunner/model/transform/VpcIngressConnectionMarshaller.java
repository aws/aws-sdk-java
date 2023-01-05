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
package com.amazonaws.services.apprunner.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apprunner.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * VpcIngressConnectionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VpcIngressConnectionMarshaller {

    private static final MarshallingInfo<String> VPCINGRESSCONNECTIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcIngressConnectionArn").build();
    private static final MarshallingInfo<String> VPCINGRESSCONNECTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcIngressConnectionName").build();
    private static final MarshallingInfo<String> SERVICEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceArn").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AccountId").build();
    private static final MarshallingInfo<String> DOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DomainName").build();
    private static final MarshallingInfo<StructuredPojo> INGRESSVPCCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IngressVpcConfiguration").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> DELETEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeletedAt").timestampFormat("unixTimestamp").build();

    private static final VpcIngressConnectionMarshaller instance = new VpcIngressConnectionMarshaller();

    public static VpcIngressConnectionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VpcIngressConnection vpcIngressConnection, ProtocolMarshaller protocolMarshaller) {

        if (vpcIngressConnection == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(vpcIngressConnection.getVpcIngressConnectionArn(), VPCINGRESSCONNECTIONARN_BINDING);
            protocolMarshaller.marshall(vpcIngressConnection.getVpcIngressConnectionName(), VPCINGRESSCONNECTIONNAME_BINDING);
            protocolMarshaller.marshall(vpcIngressConnection.getServiceArn(), SERVICEARN_BINDING);
            protocolMarshaller.marshall(vpcIngressConnection.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(vpcIngressConnection.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(vpcIngressConnection.getDomainName(), DOMAINNAME_BINDING);
            protocolMarshaller.marshall(vpcIngressConnection.getIngressVpcConfiguration(), INGRESSVPCCONFIGURATION_BINDING);
            protocolMarshaller.marshall(vpcIngressConnection.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(vpcIngressConnection.getDeletedAt(), DELETEDAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
