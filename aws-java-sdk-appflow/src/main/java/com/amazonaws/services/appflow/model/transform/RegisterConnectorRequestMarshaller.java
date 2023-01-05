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
package com.amazonaws.services.appflow.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RegisterConnectorRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RegisterConnectorRequestMarshaller {

    private static final MarshallingInfo<String> CONNECTORLABEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorLabel").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> CONNECTORPROVISIONINGTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorProvisioningType").build();
    private static final MarshallingInfo<StructuredPojo> CONNECTORPROVISIONINGCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorProvisioningConfig").build();

    private static final RegisterConnectorRequestMarshaller instance = new RegisterConnectorRequestMarshaller();

    public static RegisterConnectorRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RegisterConnectorRequest registerConnectorRequest, ProtocolMarshaller protocolMarshaller) {

        if (registerConnectorRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(registerConnectorRequest.getConnectorLabel(), CONNECTORLABEL_BINDING);
            protocolMarshaller.marshall(registerConnectorRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(registerConnectorRequest.getConnectorProvisioningType(), CONNECTORPROVISIONINGTYPE_BINDING);
            protocolMarshaller.marshall(registerConnectorRequest.getConnectorProvisioningConfig(), CONNECTORPROVISIONINGCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
