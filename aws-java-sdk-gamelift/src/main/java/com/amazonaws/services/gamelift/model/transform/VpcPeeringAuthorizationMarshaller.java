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
package com.amazonaws.services.gamelift.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.gamelift.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * VpcPeeringAuthorizationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VpcPeeringAuthorizationMarshaller {

    private static final MarshallingInfo<String> GAMELIFTAWSACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GameLiftAwsAccountId").build();
    private static final MarshallingInfo<String> PEERVPCAWSACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PeerVpcAwsAccountId").build();
    private static final MarshallingInfo<String> PEERVPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PeerVpcId").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> EXPIRATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExpirationTime").timestampFormat("unixTimestamp").build();

    private static final VpcPeeringAuthorizationMarshaller instance = new VpcPeeringAuthorizationMarshaller();

    public static VpcPeeringAuthorizationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VpcPeeringAuthorization vpcPeeringAuthorization, ProtocolMarshaller protocolMarshaller) {

        if (vpcPeeringAuthorization == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(vpcPeeringAuthorization.getGameLiftAwsAccountId(), GAMELIFTAWSACCOUNTID_BINDING);
            protocolMarshaller.marshall(vpcPeeringAuthorization.getPeerVpcAwsAccountId(), PEERVPCAWSACCOUNTID_BINDING);
            protocolMarshaller.marshall(vpcPeeringAuthorization.getPeerVpcId(), PEERVPCID_BINDING);
            protocolMarshaller.marshall(vpcPeeringAuthorization.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(vpcPeeringAuthorization.getExpirationTime(), EXPIRATIONTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
