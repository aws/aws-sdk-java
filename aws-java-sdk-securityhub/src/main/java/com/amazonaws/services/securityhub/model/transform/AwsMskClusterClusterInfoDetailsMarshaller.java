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
 * AwsMskClusterClusterInfoDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsMskClusterClusterInfoDetailsMarshaller {

    private static final MarshallingInfo<StructuredPojo> ENCRYPTIONINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncryptionInfo").build();
    private static final MarshallingInfo<String> CURRENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentVersion").build();
    private static final MarshallingInfo<Integer> NUMBEROFBROKERNODES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfBrokerNodes").build();
    private static final MarshallingInfo<String> CLUSTERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterName").build();
    private static final MarshallingInfo<StructuredPojo> CLIENTAUTHENTICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientAuthentication").build();
    private static final MarshallingInfo<String> ENHANCEDMONITORING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnhancedMonitoring").build();

    private static final AwsMskClusterClusterInfoDetailsMarshaller instance = new AwsMskClusterClusterInfoDetailsMarshaller();

    public static AwsMskClusterClusterInfoDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsMskClusterClusterInfoDetails awsMskClusterClusterInfoDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsMskClusterClusterInfoDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsMskClusterClusterInfoDetails.getEncryptionInfo(), ENCRYPTIONINFO_BINDING);
            protocolMarshaller.marshall(awsMskClusterClusterInfoDetails.getCurrentVersion(), CURRENTVERSION_BINDING);
            protocolMarshaller.marshall(awsMskClusterClusterInfoDetails.getNumberOfBrokerNodes(), NUMBEROFBROKERNODES_BINDING);
            protocolMarshaller.marshall(awsMskClusterClusterInfoDetails.getClusterName(), CLUSTERNAME_BINDING);
            protocolMarshaller.marshall(awsMskClusterClusterInfoDetails.getClientAuthentication(), CLIENTAUTHENTICATION_BINDING);
            protocolMarshaller.marshall(awsMskClusterClusterInfoDetails.getEnhancedMonitoring(), ENHANCEDMONITORING_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
