/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opensearch.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opensearch.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InstanceTypeDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InstanceTypeDetailsMarshaller {

    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceType").build();
    private static final MarshallingInfo<Boolean> ENCRYPTIONENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncryptionEnabled").build();
    private static final MarshallingInfo<Boolean> COGNITOENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CognitoEnabled").build();
    private static final MarshallingInfo<Boolean> APPLOGSENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AppLogsEnabled").build();
    private static final MarshallingInfo<Boolean> ADVANCEDSECURITYENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdvancedSecurityEnabled").build();
    private static final MarshallingInfo<Boolean> WARMENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WarmEnabled").build();
    private static final MarshallingInfo<List> INSTANCEROLE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("InstanceRole").build();

    private static final InstanceTypeDetailsMarshaller instance = new InstanceTypeDetailsMarshaller();

    public static InstanceTypeDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InstanceTypeDetails instanceTypeDetails, ProtocolMarshaller protocolMarshaller) {

        if (instanceTypeDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(instanceTypeDetails.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(instanceTypeDetails.getEncryptionEnabled(), ENCRYPTIONENABLED_BINDING);
            protocolMarshaller.marshall(instanceTypeDetails.getCognitoEnabled(), COGNITOENABLED_BINDING);
            protocolMarshaller.marshall(instanceTypeDetails.getAppLogsEnabled(), APPLOGSENABLED_BINDING);
            protocolMarshaller.marshall(instanceTypeDetails.getAdvancedSecurityEnabled(), ADVANCEDSECURITYENABLED_BINDING);
            protocolMarshaller.marshall(instanceTypeDetails.getWarmEnabled(), WARMENABLED_BINDING);
            protocolMarshaller.marshall(instanceTypeDetails.getInstanceRole(), INSTANCEROLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
