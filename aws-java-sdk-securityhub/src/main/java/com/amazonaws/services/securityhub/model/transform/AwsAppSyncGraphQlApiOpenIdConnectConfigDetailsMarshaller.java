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
package com.amazonaws.services.securityhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsAppSyncGraphQlApiOpenIdConnectConfigDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsAppSyncGraphQlApiOpenIdConnectConfigDetailsMarshaller {

    private static final MarshallingInfo<Long> AUTHTTL_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AuthTtL").build();
    private static final MarshallingInfo<String> CLIENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ClientId").build();
    private static final MarshallingInfo<Long> IATTTL_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IatTtL").build();
    private static final MarshallingInfo<String> ISSUER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Issuer").build();

    private static final AwsAppSyncGraphQlApiOpenIdConnectConfigDetailsMarshaller instance = new AwsAppSyncGraphQlApiOpenIdConnectConfigDetailsMarshaller();

    public static AwsAppSyncGraphQlApiOpenIdConnectConfigDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsAppSyncGraphQlApiOpenIdConnectConfigDetails awsAppSyncGraphQlApiOpenIdConnectConfigDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsAppSyncGraphQlApiOpenIdConnectConfigDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsAppSyncGraphQlApiOpenIdConnectConfigDetails.getAuthTtL(), AUTHTTL_BINDING);
            protocolMarshaller.marshall(awsAppSyncGraphQlApiOpenIdConnectConfigDetails.getClientId(), CLIENTID_BINDING);
            protocolMarshaller.marshall(awsAppSyncGraphQlApiOpenIdConnectConfigDetails.getIatTtL(), IATTTL_BINDING);
            protocolMarshaller.marshall(awsAppSyncGraphQlApiOpenIdConnectConfigDetails.getIssuer(), ISSUER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
