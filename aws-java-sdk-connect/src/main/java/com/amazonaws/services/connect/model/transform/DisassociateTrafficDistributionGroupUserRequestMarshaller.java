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
package com.amazonaws.services.connect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DisassociateTrafficDistributionGroupUserRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DisassociateTrafficDistributionGroupUserRequestMarshaller {

    private static final MarshallingInfo<String> TRAFFICDISTRIBUTIONGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("TrafficDistributionGroupId").build();
    private static final MarshallingInfo<String> USERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("UserId").build();
    private static final MarshallingInfo<String> INSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("InstanceId").build();

    private static final DisassociateTrafficDistributionGroupUserRequestMarshaller instance = new DisassociateTrafficDistributionGroupUserRequestMarshaller();

    public static DisassociateTrafficDistributionGroupUserRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DisassociateTrafficDistributionGroupUserRequest disassociateTrafficDistributionGroupUserRequest, ProtocolMarshaller protocolMarshaller) {

        if (disassociateTrafficDistributionGroupUserRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(disassociateTrafficDistributionGroupUserRequest.getTrafficDistributionGroupId(), TRAFFICDISTRIBUTIONGROUPID_BINDING);
            protocolMarshaller.marshall(disassociateTrafficDistributionGroupUserRequest.getUserId(), USERID_BINDING);
            protocolMarshaller.marshall(disassociateTrafficDistributionGroupUserRequest.getInstanceId(), INSTANCEID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
