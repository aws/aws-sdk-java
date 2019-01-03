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
 * DeleteVpcPeeringAuthorizationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeleteVpcPeeringAuthorizationRequestMarshaller {

    private static final MarshallingInfo<String> GAMELIFTAWSACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GameLiftAwsAccountId").build();
    private static final MarshallingInfo<String> PEERVPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PeerVpcId").build();

    private static final DeleteVpcPeeringAuthorizationRequestMarshaller instance = new DeleteVpcPeeringAuthorizationRequestMarshaller();

    public static DeleteVpcPeeringAuthorizationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeleteVpcPeeringAuthorizationRequest deleteVpcPeeringAuthorizationRequest, ProtocolMarshaller protocolMarshaller) {

        if (deleteVpcPeeringAuthorizationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deleteVpcPeeringAuthorizationRequest.getGameLiftAwsAccountId(), GAMELIFTAWSACCOUNTID_BINDING);
            protocolMarshaller.marshall(deleteVpcPeeringAuthorizationRequest.getPeerVpcId(), PEERVPCID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
