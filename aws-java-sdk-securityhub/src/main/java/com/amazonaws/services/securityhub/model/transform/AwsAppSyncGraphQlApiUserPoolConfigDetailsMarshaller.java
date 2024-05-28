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
 * AwsAppSyncGraphQlApiUserPoolConfigDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsAppSyncGraphQlApiUserPoolConfigDetailsMarshaller {

    private static final MarshallingInfo<String> APPIDCLIENTREGEX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AppIdClientRegex").build();
    private static final MarshallingInfo<String> AWSREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AwsRegion").build();
    private static final MarshallingInfo<String> DEFAULTACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultAction").build();
    private static final MarshallingInfo<String> USERPOOLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserPoolId").build();

    private static final AwsAppSyncGraphQlApiUserPoolConfigDetailsMarshaller instance = new AwsAppSyncGraphQlApiUserPoolConfigDetailsMarshaller();

    public static AwsAppSyncGraphQlApiUserPoolConfigDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsAppSyncGraphQlApiUserPoolConfigDetails awsAppSyncGraphQlApiUserPoolConfigDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsAppSyncGraphQlApiUserPoolConfigDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsAppSyncGraphQlApiUserPoolConfigDetails.getAppIdClientRegex(), APPIDCLIENTREGEX_BINDING);
            protocolMarshaller.marshall(awsAppSyncGraphQlApiUserPoolConfigDetails.getAwsRegion(), AWSREGION_BINDING);
            protocolMarshaller.marshall(awsAppSyncGraphQlApiUserPoolConfigDetails.getDefaultAction(), DEFAULTACTION_BINDING);
            protocolMarshaller.marshall(awsAppSyncGraphQlApiUserPoolConfigDetails.getUserPoolId(), USERPOOLID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
