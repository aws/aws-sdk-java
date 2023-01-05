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
 * SAPODataConnectorProfilePropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SAPODataConnectorProfilePropertiesMarshaller {

    private static final MarshallingInfo<String> APPLICATIONHOSTURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("applicationHostUrl").build();
    private static final MarshallingInfo<String> APPLICATIONSERVICEPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("applicationServicePath").build();
    private static final MarshallingInfo<Integer> PORTNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("portNumber").build();
    private static final MarshallingInfo<String> CLIENTNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientNumber").build();
    private static final MarshallingInfo<String> LOGONLANGUAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logonLanguage").build();
    private static final MarshallingInfo<String> PRIVATELINKSERVICENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("privateLinkServiceName").build();
    private static final MarshallingInfo<StructuredPojo> OAUTHPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("oAuthProperties").build();

    private static final SAPODataConnectorProfilePropertiesMarshaller instance = new SAPODataConnectorProfilePropertiesMarshaller();

    public static SAPODataConnectorProfilePropertiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SAPODataConnectorProfileProperties sAPODataConnectorProfileProperties, ProtocolMarshaller protocolMarshaller) {

        if (sAPODataConnectorProfileProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sAPODataConnectorProfileProperties.getApplicationHostUrl(), APPLICATIONHOSTURL_BINDING);
            protocolMarshaller.marshall(sAPODataConnectorProfileProperties.getApplicationServicePath(), APPLICATIONSERVICEPATH_BINDING);
            protocolMarshaller.marshall(sAPODataConnectorProfileProperties.getPortNumber(), PORTNUMBER_BINDING);
            protocolMarshaller.marshall(sAPODataConnectorProfileProperties.getClientNumber(), CLIENTNUMBER_BINDING);
            protocolMarshaller.marshall(sAPODataConnectorProfileProperties.getLogonLanguage(), LOGONLANGUAGE_BINDING);
            protocolMarshaller.marshall(sAPODataConnectorProfileProperties.getPrivateLinkServiceName(), PRIVATELINKSERVICENAME_BINDING);
            protocolMarshaller.marshall(sAPODataConnectorProfileProperties.getOAuthProperties(), OAUTHPROPERTIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
