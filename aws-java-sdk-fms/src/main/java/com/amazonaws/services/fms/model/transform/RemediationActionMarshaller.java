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
package com.amazonaws.services.fms.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RemediationActionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RemediationActionMarshaller {

    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<StructuredPojo> EC2CREATEROUTEACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EC2CreateRouteAction").build();
    private static final MarshallingInfo<StructuredPojo> EC2REPLACEROUTEACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EC2ReplaceRouteAction").build();
    private static final MarshallingInfo<StructuredPojo> EC2DELETEROUTEACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EC2DeleteRouteAction").build();
    private static final MarshallingInfo<StructuredPojo> EC2COPYROUTETABLEACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EC2CopyRouteTableAction").build();
    private static final MarshallingInfo<StructuredPojo> EC2REPLACEROUTETABLEASSOCIATIONACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EC2ReplaceRouteTableAssociationAction").build();
    private static final MarshallingInfo<StructuredPojo> EC2ASSOCIATEROUTETABLEACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EC2AssociateRouteTableAction").build();
    private static final MarshallingInfo<StructuredPojo> EC2CREATEROUTETABLEACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EC2CreateRouteTableAction").build();

    private static final RemediationActionMarshaller instance = new RemediationActionMarshaller();

    public static RemediationActionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RemediationAction remediationAction, ProtocolMarshaller protocolMarshaller) {

        if (remediationAction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(remediationAction.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(remediationAction.getEC2CreateRouteAction(), EC2CREATEROUTEACTION_BINDING);
            protocolMarshaller.marshall(remediationAction.getEC2ReplaceRouteAction(), EC2REPLACEROUTEACTION_BINDING);
            protocolMarshaller.marshall(remediationAction.getEC2DeleteRouteAction(), EC2DELETEROUTEACTION_BINDING);
            protocolMarshaller.marshall(remediationAction.getEC2CopyRouteTableAction(), EC2COPYROUTETABLEACTION_BINDING);
            protocolMarshaller.marshall(remediationAction.getEC2ReplaceRouteTableAssociationAction(), EC2REPLACEROUTETABLEASSOCIATIONACTION_BINDING);
            protocolMarshaller.marshall(remediationAction.getEC2AssociateRouteTableAction(), EC2ASSOCIATEROUTETABLEACTION_BINDING);
            protocolMarshaller.marshall(remediationAction.getEC2CreateRouteTableAction(), EC2CREATEROUTETABLEACTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
