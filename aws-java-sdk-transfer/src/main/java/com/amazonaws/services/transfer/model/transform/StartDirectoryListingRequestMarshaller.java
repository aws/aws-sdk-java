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
package com.amazonaws.services.transfer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.transfer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartDirectoryListingRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartDirectoryListingRequestMarshaller {

    private static final MarshallingInfo<String> CONNECTORID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectorId").build();
    private static final MarshallingInfo<String> REMOTEDIRECTORYPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RemoteDirectoryPath").build();
    private static final MarshallingInfo<Integer> MAXITEMS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxItems").build();
    private static final MarshallingInfo<String> OUTPUTDIRECTORYPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputDirectoryPath").build();

    private static final StartDirectoryListingRequestMarshaller instance = new StartDirectoryListingRequestMarshaller();

    public static StartDirectoryListingRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartDirectoryListingRequest startDirectoryListingRequest, ProtocolMarshaller protocolMarshaller) {

        if (startDirectoryListingRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startDirectoryListingRequest.getConnectorId(), CONNECTORID_BINDING);
            protocolMarshaller.marshall(startDirectoryListingRequest.getRemoteDirectoryPath(), REMOTEDIRECTORYPATH_BINDING);
            protocolMarshaller.marshall(startDirectoryListingRequest.getMaxItems(), MAXITEMS_BINDING);
            protocolMarshaller.marshall(startDirectoryListingRequest.getOutputDirectoryPath(), OUTPUTDIRECTORYPATH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
