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
package com.amazonaws.services.customerprofiles.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.customerprofiles.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetAutoMergingPreviewRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetAutoMergingPreviewRequestMarshaller {

    private static final MarshallingInfo<String> DOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("DomainName").build();
    private static final MarshallingInfo<StructuredPojo> CONSOLIDATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Consolidation").build();
    private static final MarshallingInfo<StructuredPojo> CONFLICTRESOLUTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConflictResolution").build();
    private static final MarshallingInfo<Double> MINALLOWEDCONFIDENCESCOREFORMERGING_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinAllowedConfidenceScoreForMerging").build();

    private static final GetAutoMergingPreviewRequestMarshaller instance = new GetAutoMergingPreviewRequestMarshaller();

    public static GetAutoMergingPreviewRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetAutoMergingPreviewRequest getAutoMergingPreviewRequest, ProtocolMarshaller protocolMarshaller) {

        if (getAutoMergingPreviewRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getAutoMergingPreviewRequest.getDomainName(), DOMAINNAME_BINDING);
            protocolMarshaller.marshall(getAutoMergingPreviewRequest.getConsolidation(), CONSOLIDATION_BINDING);
            protocolMarshaller.marshall(getAutoMergingPreviewRequest.getConflictResolution(), CONFLICTRESOLUTION_BINDING);
            protocolMarshaller.marshall(getAutoMergingPreviewRequest.getMinAllowedConfidenceScoreForMerging(), MINALLOWEDCONFIDENCESCOREFORMERGING_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
