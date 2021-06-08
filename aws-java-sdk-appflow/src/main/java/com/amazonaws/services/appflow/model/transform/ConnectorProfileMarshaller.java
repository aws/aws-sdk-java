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
 * ConnectorProfileMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConnectorProfileMarshaller {

    private static final MarshallingInfo<String> CONNECTORPROFILEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorProfileArn").build();
    private static final MarshallingInfo<String> CONNECTORPROFILENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorProfileName").build();
    private static final MarshallingInfo<String> CONNECTORTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorType").build();
    private static final MarshallingInfo<String> CONNECTIONMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectionMode").build();
    private static final MarshallingInfo<String> CREDENTIALSARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("credentialsArn").build();
    private static final MarshallingInfo<StructuredPojo> CONNECTORPROFILEPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorProfileProperties").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdatedAt").timestampFormat("unixTimestamp").build();

    private static final ConnectorProfileMarshaller instance = new ConnectorProfileMarshaller();

    public static ConnectorProfileMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConnectorProfile connectorProfile, ProtocolMarshaller protocolMarshaller) {

        if (connectorProfile == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(connectorProfile.getConnectorProfileArn(), CONNECTORPROFILEARN_BINDING);
            protocolMarshaller.marshall(connectorProfile.getConnectorProfileName(), CONNECTORPROFILENAME_BINDING);
            protocolMarshaller.marshall(connectorProfile.getConnectorType(), CONNECTORTYPE_BINDING);
            protocolMarshaller.marshall(connectorProfile.getConnectionMode(), CONNECTIONMODE_BINDING);
            protocolMarshaller.marshall(connectorProfile.getCredentialsArn(), CREDENTIALSARN_BINDING);
            protocolMarshaller.marshall(connectorProfile.getConnectorProfileProperties(), CONNECTORPROFILEPROPERTIES_BINDING);
            protocolMarshaller.marshall(connectorProfile.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(connectorProfile.getLastUpdatedAt(), LASTUPDATEDAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
