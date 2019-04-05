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
package com.amazonaws.services.glacier.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glacier.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InventoryRetrievalJobInputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InventoryRetrievalJobInputMarshaller {

    private static final MarshallingInfo<String> STARTDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StartDate").build();
    private static final MarshallingInfo<String> ENDDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("EndDate").build();
    private static final MarshallingInfo<String> LIMIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Limit").build();
    private static final MarshallingInfo<String> MARKER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Marker").build();

    private static final InventoryRetrievalJobInputMarshaller instance = new InventoryRetrievalJobInputMarshaller();

    public static InventoryRetrievalJobInputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InventoryRetrievalJobInput inventoryRetrievalJobInput, ProtocolMarshaller protocolMarshaller) {

        if (inventoryRetrievalJobInput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(inventoryRetrievalJobInput.getStartDate(), STARTDATE_BINDING);
            protocolMarshaller.marshall(inventoryRetrievalJobInput.getEndDate(), ENDDATE_BINDING);
            protocolMarshaller.marshall(inventoryRetrievalJobInput.getLimit(), LIMIT_BINDING);
            protocolMarshaller.marshall(inventoryRetrievalJobInput.getMarker(), MARKER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
