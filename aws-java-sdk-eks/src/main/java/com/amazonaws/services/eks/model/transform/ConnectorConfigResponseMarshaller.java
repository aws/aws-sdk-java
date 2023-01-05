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
package com.amazonaws.services.eks.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.eks.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConnectorConfigResponseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConnectorConfigResponseMarshaller {

    private static final MarshallingInfo<String> ACTIVATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activationId").build();
    private static final MarshallingInfo<String> ACTIVATIONCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activationCode").build();
    private static final MarshallingInfo<java.util.Date> ACTIVATIONEXPIRY_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activationExpiry").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> PROVIDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("provider").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();

    private static final ConnectorConfigResponseMarshaller instance = new ConnectorConfigResponseMarshaller();

    public static ConnectorConfigResponseMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConnectorConfigResponse connectorConfigResponse, ProtocolMarshaller protocolMarshaller) {

        if (connectorConfigResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(connectorConfigResponse.getActivationId(), ACTIVATIONID_BINDING);
            protocolMarshaller.marshall(connectorConfigResponse.getActivationCode(), ACTIVATIONCODE_BINDING);
            protocolMarshaller.marshall(connectorConfigResponse.getActivationExpiry(), ACTIVATIONEXPIRY_BINDING);
            protocolMarshaller.marshall(connectorConfigResponse.getProvider(), PROVIDER_BINDING);
            protocolMarshaller.marshall(connectorConfigResponse.getRoleArn(), ROLEARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
