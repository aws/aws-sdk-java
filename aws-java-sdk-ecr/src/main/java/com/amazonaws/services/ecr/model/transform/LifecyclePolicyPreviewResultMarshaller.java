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
package com.amazonaws.services.ecr.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ecr.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LifecyclePolicyPreviewResultMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LifecyclePolicyPreviewResultMarshaller {

    private static final MarshallingInfo<List> IMAGETAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("imageTags").build();
    private static final MarshallingInfo<String> IMAGEDIGEST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("imageDigest").build();
    private static final MarshallingInfo<java.util.Date> IMAGEPUSHEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("imagePushedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> ACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("action").build();
    private static final MarshallingInfo<Integer> APPLIEDRULEPRIORITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("appliedRulePriority").build();

    private static final LifecyclePolicyPreviewResultMarshaller instance = new LifecyclePolicyPreviewResultMarshaller();

    public static LifecyclePolicyPreviewResultMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LifecyclePolicyPreviewResult lifecyclePolicyPreviewResult, ProtocolMarshaller protocolMarshaller) {

        if (lifecyclePolicyPreviewResult == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(lifecyclePolicyPreviewResult.getImageTags(), IMAGETAGS_BINDING);
            protocolMarshaller.marshall(lifecyclePolicyPreviewResult.getImageDigest(), IMAGEDIGEST_BINDING);
            protocolMarshaller.marshall(lifecyclePolicyPreviewResult.getImagePushedAt(), IMAGEPUSHEDAT_BINDING);
            protocolMarshaller.marshall(lifecyclePolicyPreviewResult.getAction(), ACTION_BINDING);
            protocolMarshaller.marshall(lifecyclePolicyPreviewResult.getAppliedRulePriority(), APPLIEDRULEPRIORITY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
