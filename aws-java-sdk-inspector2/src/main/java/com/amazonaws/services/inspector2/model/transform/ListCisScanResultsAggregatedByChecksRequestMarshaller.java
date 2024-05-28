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
package com.amazonaws.services.inspector2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListCisScanResultsAggregatedByChecksRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListCisScanResultsAggregatedByChecksRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> FILTERCRITERIA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("filterCriteria").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nextToken").build();
    private static final MarshallingInfo<String> SCANARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("scanArn").build();
    private static final MarshallingInfo<String> SORTBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sortBy").build();
    private static final MarshallingInfo<String> SORTORDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sortOrder").build();

    private static final ListCisScanResultsAggregatedByChecksRequestMarshaller instance = new ListCisScanResultsAggregatedByChecksRequestMarshaller();

    public static ListCisScanResultsAggregatedByChecksRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListCisScanResultsAggregatedByChecksRequest listCisScanResultsAggregatedByChecksRequest, ProtocolMarshaller protocolMarshaller) {

        if (listCisScanResultsAggregatedByChecksRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listCisScanResultsAggregatedByChecksRequest.getFilterCriteria(), FILTERCRITERIA_BINDING);
            protocolMarshaller.marshall(listCisScanResultsAggregatedByChecksRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listCisScanResultsAggregatedByChecksRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listCisScanResultsAggregatedByChecksRequest.getScanArn(), SCANARN_BINDING);
            protocolMarshaller.marshall(listCisScanResultsAggregatedByChecksRequest.getSortBy(), SORTBY_BINDING);
            protocolMarshaller.marshall(listCisScanResultsAggregatedByChecksRequest.getSortOrder(), SORTORDER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
