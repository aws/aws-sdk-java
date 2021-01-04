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
package com.amazonaws.services.macie2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.macie2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UserIdentityMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UserIdentityMarshaller {

    private static final MarshallingInfo<StructuredPojo> ASSUMEDROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assumedRole").build();
    private static final MarshallingInfo<StructuredPojo> AWSACCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("awsAccount").build();
    private static final MarshallingInfo<StructuredPojo> AWSSERVICE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("awsService").build();
    private static final MarshallingInfo<StructuredPojo> FEDERATEDUSER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("federatedUser").build();
    private static final MarshallingInfo<StructuredPojo> IAMUSER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("iamUser").build();
    private static final MarshallingInfo<StructuredPojo> ROOT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("root").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();

    private static final UserIdentityMarshaller instance = new UserIdentityMarshaller();

    public static UserIdentityMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UserIdentity userIdentity, ProtocolMarshaller protocolMarshaller) {

        if (userIdentity == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(userIdentity.getAssumedRole(), ASSUMEDROLE_BINDING);
            protocolMarshaller.marshall(userIdentity.getAwsAccount(), AWSACCOUNT_BINDING);
            protocolMarshaller.marshall(userIdentity.getAwsService(), AWSSERVICE_BINDING);
            protocolMarshaller.marshall(userIdentity.getFederatedUser(), FEDERATEDUSER_BINDING);
            protocolMarshaller.marshall(userIdentity.getIamUser(), IAMUSER_BINDING);
            protocolMarshaller.marshall(userIdentity.getRoot(), ROOT_BINDING);
            protocolMarshaller.marshall(userIdentity.getType(), TYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
