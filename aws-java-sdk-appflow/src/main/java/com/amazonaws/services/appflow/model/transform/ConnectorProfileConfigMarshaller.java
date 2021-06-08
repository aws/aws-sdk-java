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
package com.amazonaws.services.appflow.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConnectorProfileConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConnectorProfileConfigMarshaller {

    private static final MarshallingInfo<StructuredPojo> CONNECTORPROFILEPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorProfileProperties").build();
    private static final MarshallingInfo<StructuredPojo> CONNECTORPROFILECREDENTIALS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorProfileCredentials").build();

    private static final ConnectorProfileConfigMarshaller instance = new ConnectorProfileConfigMarshaller();

    public static ConnectorProfileConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConnectorProfileConfig connectorProfileConfig, ProtocolMarshaller protocolMarshaller) {

        if (connectorProfileConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(connectorProfileConfig.getConnectorProfileProperties(), CONNECTORPROFILEPROPERTIES_BINDING);
            protocolMarshaller.marshall(connectorProfileConfig.getConnectorProfileCredentials(), CONNECTORPROFILECREDENTIALS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
