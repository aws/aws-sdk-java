/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * GetComplianceSummaryRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetComplianceSummaryRequestMarshaller {

    private static final MarshallingInfo<List> TARGETIDFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetIdFilters").build();
    private static final MarshallingInfo<List> REGIONFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RegionFilters").build();
    private static final MarshallingInfo<List> RESOURCETYPEFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceTypeFilters").build();
    private static final MarshallingInfo<List> TAGKEYFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TagKeyFilters").build();
    private static final MarshallingInfo<List> GROUPBY_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GroupBy").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();
    private static final MarshallingInfo<String> PAGINATIONTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PaginationToken").build();

    private static final GetComplianceSummaryRequestMarshaller instance = new GetComplianceSummaryRequestMarshaller();

    public static GetComplianceSummaryRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetComplianceSummaryRequest getComplianceSummaryRequest, ProtocolMarshaller protocolMarshaller) {

        if (getComplianceSummaryRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getComplianceSummaryRequest.getTargetIdFilters(), TARGETIDFILTERS_BINDING);
            protocolMarshaller.marshall(getComplianceSummaryRequest.getRegionFilters(), REGIONFILTERS_BINDING);
            protocolMarshaller.marshall(getComplianceSummaryRequest.getResourceTypeFilters(), RESOURCETYPEFILTERS_BINDING);
            protocolMarshaller.marshall(getComplianceSummaryRequest.getTagKeyFilters(), TAGKEYFILTERS_BINDING);
            protocolMarshaller.marshall(getComplianceSummaryRequest.getGroupBy(), GROUPBY_BINDING);
            protocolMarshaller.marshall(getComplianceSummaryRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(getComplianceSummaryRequest.getPaginationToken(), PAGINATIONTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
