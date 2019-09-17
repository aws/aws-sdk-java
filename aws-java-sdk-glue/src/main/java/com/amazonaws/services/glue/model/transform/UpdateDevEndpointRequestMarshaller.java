/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateDevEndpointRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateDevEndpointRequestMarshaller {

    private static final MarshallingInfo<String> ENDPOINTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointName").build();
    private static final MarshallingInfo<String> PUBLICKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PublicKey").build();
    private static final MarshallingInfo<List> ADDPUBLICKEYS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AddPublicKeys").build();
    private static final MarshallingInfo<List> DELETEPUBLICKEYS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeletePublicKeys").build();
    private static final MarshallingInfo<StructuredPojo> CUSTOMLIBRARIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomLibraries").build();
    private static final MarshallingInfo<Boolean> UPDATEETLLIBRARIES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdateEtlLibraries").build();
    private static final MarshallingInfo<List> DELETEARGUMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeleteArguments").build();
    private static final MarshallingInfo<Map> ADDARGUMENTS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AddArguments").build();

    private static final UpdateDevEndpointRequestMarshaller instance = new UpdateDevEndpointRequestMarshaller();

    public static UpdateDevEndpointRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateDevEndpointRequest updateDevEndpointRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateDevEndpointRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateDevEndpointRequest.getEndpointName(), ENDPOINTNAME_BINDING);
            protocolMarshaller.marshall(updateDevEndpointRequest.getPublicKey(), PUBLICKEY_BINDING);
            protocolMarshaller.marshall(updateDevEndpointRequest.getAddPublicKeys(), ADDPUBLICKEYS_BINDING);
            protocolMarshaller.marshall(updateDevEndpointRequest.getDeletePublicKeys(), DELETEPUBLICKEYS_BINDING);
            protocolMarshaller.marshall(updateDevEndpointRequest.getCustomLibraries(), CUSTOMLIBRARIES_BINDING);
            protocolMarshaller.marshall(updateDevEndpointRequest.getUpdateEtlLibraries(), UPDATEETLLIBRARIES_BINDING);
            protocolMarshaller.marshall(updateDevEndpointRequest.getDeleteArguments(), DELETEARGUMENTS_BINDING);
            protocolMarshaller.marshall(updateDevEndpointRequest.getAddArguments(), ADDARGUMENTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
