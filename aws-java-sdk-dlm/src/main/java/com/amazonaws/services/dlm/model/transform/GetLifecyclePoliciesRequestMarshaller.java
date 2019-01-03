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
package com.amazonaws.services.dlm.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dlm.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetLifecyclePoliciesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetLifecyclePoliciesRequestMarshaller {

    private static final MarshallingInfo<List> POLICYIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("policyIds").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("state").build();
    private static final MarshallingInfo<List> RESOURCETYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("resourceTypes").build();
    private static final MarshallingInfo<List> TARGETTAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("targetTags").build();
    private static final MarshallingInfo<List> TAGSTOADD_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("tagsToAdd").build();

    private static final GetLifecyclePoliciesRequestMarshaller instance = new GetLifecyclePoliciesRequestMarshaller();

    public static GetLifecyclePoliciesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetLifecyclePoliciesRequest getLifecyclePoliciesRequest, ProtocolMarshaller protocolMarshaller) {

        if (getLifecyclePoliciesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getLifecyclePoliciesRequest.getPolicyIds(), POLICYIDS_BINDING);
            protocolMarshaller.marshall(getLifecyclePoliciesRequest.getState(), STATE_BINDING);
            protocolMarshaller.marshall(getLifecyclePoliciesRequest.getResourceTypes(), RESOURCETYPES_BINDING);
            protocolMarshaller.marshall(getLifecyclePoliciesRequest.getTargetTags(), TARGETTAGS_BINDING);
            protocolMarshaller.marshall(getLifecyclePoliciesRequest.getTagsToAdd(), TAGSTOADD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
