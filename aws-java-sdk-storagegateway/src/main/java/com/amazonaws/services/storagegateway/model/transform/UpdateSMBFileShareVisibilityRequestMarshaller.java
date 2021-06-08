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
package com.amazonaws.services.storagegateway.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.storagegateway.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateSMBFileShareVisibilityRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateSMBFileShareVisibilityRequestMarshaller {

    private static final MarshallingInfo<String> GATEWAYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GatewayARN").build();
    private static final MarshallingInfo<Boolean> FILESHARESVISIBLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FileSharesVisible").build();

    private static final UpdateSMBFileShareVisibilityRequestMarshaller instance = new UpdateSMBFileShareVisibilityRequestMarshaller();

    public static UpdateSMBFileShareVisibilityRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateSMBFileShareVisibilityRequest updateSMBFileShareVisibilityRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateSMBFileShareVisibilityRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateSMBFileShareVisibilityRequest.getGatewayARN(), GATEWAYARN_BINDING);
            protocolMarshaller.marshall(updateSMBFileShareVisibilityRequest.getFileSharesVisible(), FILESHARESVISIBLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
