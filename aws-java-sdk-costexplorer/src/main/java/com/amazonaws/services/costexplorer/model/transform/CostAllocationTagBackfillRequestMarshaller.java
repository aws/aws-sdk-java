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
package com.amazonaws.services.costexplorer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costexplorer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CostAllocationTagBackfillRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CostAllocationTagBackfillRequestMarshaller {

    private static final MarshallingInfo<String> BACKFILLFROM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackfillFrom").build();
    private static final MarshallingInfo<String> REQUESTEDAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequestedAt").build();
    private static final MarshallingInfo<String> COMPLETEDAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompletedAt").build();
    private static final MarshallingInfo<String> BACKFILLSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackfillStatus").build();
    private static final MarshallingInfo<String> LASTUPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdatedAt").build();

    private static final CostAllocationTagBackfillRequestMarshaller instance = new CostAllocationTagBackfillRequestMarshaller();

    public static CostAllocationTagBackfillRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CostAllocationTagBackfillRequest costAllocationTagBackfillRequest, ProtocolMarshaller protocolMarshaller) {

        if (costAllocationTagBackfillRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(costAllocationTagBackfillRequest.getBackfillFrom(), BACKFILLFROM_BINDING);
            protocolMarshaller.marshall(costAllocationTagBackfillRequest.getRequestedAt(), REQUESTEDAT_BINDING);
            protocolMarshaller.marshall(costAllocationTagBackfillRequest.getCompletedAt(), COMPLETEDAT_BINDING);
            protocolMarshaller.marshall(costAllocationTagBackfillRequest.getBackfillStatus(), BACKFILLSTATUS_BINDING);
            protocolMarshaller.marshall(costAllocationTagBackfillRequest.getLastUpdatedAt(), LASTUPDATEDAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
