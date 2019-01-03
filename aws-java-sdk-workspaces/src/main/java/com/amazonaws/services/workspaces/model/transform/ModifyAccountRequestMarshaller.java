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
package com.amazonaws.services.workspaces.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workspaces.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ModifyAccountRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ModifyAccountRequestMarshaller {

    private static final MarshallingInfo<String> DEDICATEDTENANCYSUPPORT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DedicatedTenancySupport").build();
    private static final MarshallingInfo<String> DEDICATEDTENANCYMANAGEMENTCIDRRANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DedicatedTenancyManagementCidrRange").build();

    private static final ModifyAccountRequestMarshaller instance = new ModifyAccountRequestMarshaller();

    public static ModifyAccountRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ModifyAccountRequest modifyAccountRequest, ProtocolMarshaller protocolMarshaller) {

        if (modifyAccountRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(modifyAccountRequest.getDedicatedTenancySupport(), DEDICATEDTENANCYSUPPORT_BINDING);
            protocolMarshaller.marshall(modifyAccountRequest.getDedicatedTenancyManagementCidrRange(), DEDICATEDTENANCYMANAGEMENTCIDRRANGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
