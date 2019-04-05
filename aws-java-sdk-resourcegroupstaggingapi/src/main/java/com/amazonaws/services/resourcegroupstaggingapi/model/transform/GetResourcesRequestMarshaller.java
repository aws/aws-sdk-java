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
package com.amazonaws.services.resourcegroupstaggingapi.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.resourcegroupstaggingapi.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetResourcesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetResourcesRequestMarshaller {

    private static final MarshallingInfo<String> PAGINATIONTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PaginationToken").build();
    private static final MarshallingInfo<List> TAGFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TagFilters").build();
    private static final MarshallingInfo<Integer> RESOURCESPERPAGE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourcesPerPage").build();
    private static final MarshallingInfo<Integer> TAGSPERPAGE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TagsPerPage").build();
    private static final MarshallingInfo<List> RESOURCETYPEFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceTypeFilters").build();

    private static final GetResourcesRequestMarshaller instance = new GetResourcesRequestMarshaller();

    public static GetResourcesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetResourcesRequest getResourcesRequest, ProtocolMarshaller protocolMarshaller) {

        if (getResourcesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getResourcesRequest.getPaginationToken(), PAGINATIONTOKEN_BINDING);
            protocolMarshaller.marshall(getResourcesRequest.getTagFilters(), TAGFILTERS_BINDING);
            protocolMarshaller.marshall(getResourcesRequest.getResourcesPerPage(), RESOURCESPERPAGE_BINDING);
            protocolMarshaller.marshall(getResourcesRequest.getTagsPerPage(), TAGSPERPAGE_BINDING);
            protocolMarshaller.marshall(getResourcesRequest.getResourceTypeFilters(), RESOURCETYPEFILTERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
