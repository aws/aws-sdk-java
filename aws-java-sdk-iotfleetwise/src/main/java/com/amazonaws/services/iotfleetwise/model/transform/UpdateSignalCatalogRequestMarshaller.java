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
 * UpdateSignalCatalogRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateSignalCatalogRequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<List> NODESTOADD_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nodesToAdd").build();
    private static final MarshallingInfo<List> NODESTOUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nodesToUpdate").build();
    private static final MarshallingInfo<List> NODESTOREMOVE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nodesToRemove").build();

    private static final UpdateSignalCatalogRequestMarshaller instance = new UpdateSignalCatalogRequestMarshaller();

    public static UpdateSignalCatalogRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateSignalCatalogRequest updateSignalCatalogRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateSignalCatalogRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateSignalCatalogRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateSignalCatalogRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateSignalCatalogRequest.getNodesToAdd(), NODESTOADD_BINDING);
            protocolMarshaller.marshall(updateSignalCatalogRequest.getNodesToUpdate(), NODESTOUPDATE_BINDING);
            protocolMarshaller.marshall(updateSignalCatalogRequest.getNodesToRemove(), NODESTOREMOVE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
