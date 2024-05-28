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
package com.amazonaws.services.resiliencehub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.resiliencehub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BatchUpdateRecommendationStatusSuccessfulEntryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchUpdateRecommendationStatusSuccessfulEntryMarshaller {

    private static final MarshallingInfo<String> ENTRYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("entryId").build();
    private static final MarshallingInfo<String> EXCLUDEREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("excludeReason").build();
    private static final MarshallingInfo<Boolean> EXCLUDED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("excluded").build();
    private static final MarshallingInfo<StructuredPojo> ITEM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("item").build();
    private static final MarshallingInfo<String> REFERENCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("referenceId").build();

    private static final BatchUpdateRecommendationStatusSuccessfulEntryMarshaller instance = new BatchUpdateRecommendationStatusSuccessfulEntryMarshaller();

    public static BatchUpdateRecommendationStatusSuccessfulEntryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchUpdateRecommendationStatusSuccessfulEntry batchUpdateRecommendationStatusSuccessfulEntry, ProtocolMarshaller protocolMarshaller) {

        if (batchUpdateRecommendationStatusSuccessfulEntry == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchUpdateRecommendationStatusSuccessfulEntry.getEntryId(), ENTRYID_BINDING);
            protocolMarshaller.marshall(batchUpdateRecommendationStatusSuccessfulEntry.getExcludeReason(), EXCLUDEREASON_BINDING);
            protocolMarshaller.marshall(batchUpdateRecommendationStatusSuccessfulEntry.getExcluded(), EXCLUDED_BINDING);
            protocolMarshaller.marshall(batchUpdateRecommendationStatusSuccessfulEntry.getItem(), ITEM_BINDING);
            protocolMarshaller.marshall(batchUpdateRecommendationStatusSuccessfulEntry.getReferenceId(), REFERENCEID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
