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
package com.amazonaws.services.wellarchitected.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.wellarchitected.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateLensReviewRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateLensReviewRequestMarshaller {

    private static final MarshallingInfo<String> WORKLOADID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("WorkloadId").build();
    private static final MarshallingInfo<String> LENSALIAS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("LensAlias").build();
    private static final MarshallingInfo<String> LENSNOTES_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LensNotes").build();
    private static final MarshallingInfo<Map> PILLARNOTES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PillarNotes").build();

    private static final UpdateLensReviewRequestMarshaller instance = new UpdateLensReviewRequestMarshaller();

    public static UpdateLensReviewRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateLensReviewRequest updateLensReviewRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateLensReviewRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateLensReviewRequest.getWorkloadId(), WORKLOADID_BINDING);
            protocolMarshaller.marshall(updateLensReviewRequest.getLensAlias(), LENSALIAS_BINDING);
            protocolMarshaller.marshall(updateLensReviewRequest.getLensNotes(), LENSNOTES_BINDING);
            protocolMarshaller.marshall(updateLensReviewRequest.getPillarNotes(), PILLARNOTES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
