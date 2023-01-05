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
package com.amazonaws.services.iotfleetwise.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotfleetwise.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateDecoderManifestRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateDecoderManifestRequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<List> SIGNALDECODERSTOADD_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("signalDecodersToAdd").build();
    private static final MarshallingInfo<List> SIGNALDECODERSTOUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("signalDecodersToUpdate").build();
    private static final MarshallingInfo<List> SIGNALDECODERSTOREMOVE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("signalDecodersToRemove").build();
    private static final MarshallingInfo<List> NETWORKINTERFACESTOADD_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkInterfacesToAdd").build();
    private static final MarshallingInfo<List> NETWORKINTERFACESTOUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkInterfacesToUpdate").build();
    private static final MarshallingInfo<List> NETWORKINTERFACESTOREMOVE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkInterfacesToRemove").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();

    private static final UpdateDecoderManifestRequestMarshaller instance = new UpdateDecoderManifestRequestMarshaller();

    public static UpdateDecoderManifestRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateDecoderManifestRequest updateDecoderManifestRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateDecoderManifestRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateDecoderManifestRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateDecoderManifestRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateDecoderManifestRequest.getSignalDecodersToAdd(), SIGNALDECODERSTOADD_BINDING);
            protocolMarshaller.marshall(updateDecoderManifestRequest.getSignalDecodersToUpdate(), SIGNALDECODERSTOUPDATE_BINDING);
            protocolMarshaller.marshall(updateDecoderManifestRequest.getSignalDecodersToRemove(), SIGNALDECODERSTOREMOVE_BINDING);
            protocolMarshaller.marshall(updateDecoderManifestRequest.getNetworkInterfacesToAdd(), NETWORKINTERFACESTOADD_BINDING);
            protocolMarshaller.marshall(updateDecoderManifestRequest.getNetworkInterfacesToUpdate(), NETWORKINTERFACESTOUPDATE_BINDING);
            protocolMarshaller.marshall(updateDecoderManifestRequest.getNetworkInterfacesToRemove(), NETWORKINTERFACESTOREMOVE_BINDING);
            protocolMarshaller.marshall(updateDecoderManifestRequest.getStatus(), STATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
