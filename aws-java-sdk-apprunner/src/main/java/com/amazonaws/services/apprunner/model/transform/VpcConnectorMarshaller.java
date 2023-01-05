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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apprunner.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * VpcConnectorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VpcConnectorMarshaller {

    private static final MarshallingInfo<String> VPCCONNECTORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcConnectorName").build();
    private static final MarshallingInfo<String> VPCCONNECTORARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcConnectorArn").build();
    private static final MarshallingInfo<Integer> VPCCONNECTORREVISION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcConnectorRevision").build();
    private static final MarshallingInfo<List> SUBNETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Subnets").build();
    private static final MarshallingInfo<List> SECURITYGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityGroups").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> DELETEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeletedAt").timestampFormat("unixTimestamp").build();

    private static final VpcConnectorMarshaller instance = new VpcConnectorMarshaller();

    public static VpcConnectorMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VpcConnector vpcConnector, ProtocolMarshaller protocolMarshaller) {

        if (vpcConnector == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(vpcConnector.getVpcConnectorName(), VPCCONNECTORNAME_BINDING);
            protocolMarshaller.marshall(vpcConnector.getVpcConnectorArn(), VPCCONNECTORARN_BINDING);
            protocolMarshaller.marshall(vpcConnector.getVpcConnectorRevision(), VPCCONNECTORREVISION_BINDING);
            protocolMarshaller.marshall(vpcConnector.getSubnets(), SUBNETS_BINDING);
            protocolMarshaller.marshall(vpcConnector.getSecurityGroups(), SECURITYGROUPS_BINDING);
            protocolMarshaller.marshall(vpcConnector.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(vpcConnector.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(vpcConnector.getDeletedAt(), DELETEDAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
