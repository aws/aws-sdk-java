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
package com.amazonaws.services.verifiedpermissions.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.verifiedpermissions.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BatchIsAuthorizedWithTokenRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchIsAuthorizedWithTokenRequestMarshaller {

    private static final MarshallingInfo<String> POLICYSTOREID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("policyStoreId").build();
    private static final MarshallingInfo<String> IDENTITYTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("identityToken").build();
    private static final MarshallingInfo<String> ACCESSTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("accessToken").build();
    private static final MarshallingInfo<StructuredPojo> ENTITIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("entities").build();
    private static final MarshallingInfo<List> REQUESTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("requests").build();

    private static final BatchIsAuthorizedWithTokenRequestMarshaller instance = new BatchIsAuthorizedWithTokenRequestMarshaller();

    public static BatchIsAuthorizedWithTokenRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchIsAuthorizedWithTokenRequest batchIsAuthorizedWithTokenRequest, ProtocolMarshaller protocolMarshaller) {

        if (batchIsAuthorizedWithTokenRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchIsAuthorizedWithTokenRequest.getPolicyStoreId(), POLICYSTOREID_BINDING);
            protocolMarshaller.marshall(batchIsAuthorizedWithTokenRequest.getIdentityToken(), IDENTITYTOKEN_BINDING);
            protocolMarshaller.marshall(batchIsAuthorizedWithTokenRequest.getAccessToken(), ACCESSTOKEN_BINDING);
            protocolMarshaller.marshall(batchIsAuthorizedWithTokenRequest.getEntities(), ENTITIES_BINDING);
            protocolMarshaller.marshall(batchIsAuthorizedWithTokenRequest.getRequests(), REQUESTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
