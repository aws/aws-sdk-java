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
package com.amazonaws.services.lexmodelsv2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SearchAssociatedTranscriptsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SearchAssociatedTranscriptsRequestMarshaller {

    private static final MarshallingInfo<String> BOTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("botId").build();
    private static final MarshallingInfo<String> BOTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("botVersion").build();
    private static final MarshallingInfo<String> LOCALEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("localeId").build();
    private static final MarshallingInfo<String> BOTRECOMMENDATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("botRecommendationId").build();
    private static final MarshallingInfo<String> SEARCHORDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("searchOrder").build();
    private static final MarshallingInfo<List> FILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("filters").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxResults").build();
    private static final MarshallingInfo<Integer> NEXTINDEX_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nextIndex").build();

    private static final SearchAssociatedTranscriptsRequestMarshaller instance = new SearchAssociatedTranscriptsRequestMarshaller();

    public static SearchAssociatedTranscriptsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SearchAssociatedTranscriptsRequest searchAssociatedTranscriptsRequest, ProtocolMarshaller protocolMarshaller) {

        if (searchAssociatedTranscriptsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(searchAssociatedTranscriptsRequest.getBotId(), BOTID_BINDING);
            protocolMarshaller.marshall(searchAssociatedTranscriptsRequest.getBotVersion(), BOTVERSION_BINDING);
            protocolMarshaller.marshall(searchAssociatedTranscriptsRequest.getLocaleId(), LOCALEID_BINDING);
            protocolMarshaller.marshall(searchAssociatedTranscriptsRequest.getBotRecommendationId(), BOTRECOMMENDATIONID_BINDING);
            protocolMarshaller.marshall(searchAssociatedTranscriptsRequest.getSearchOrder(), SEARCHORDER_BINDING);
            protocolMarshaller.marshall(searchAssociatedTranscriptsRequest.getFilters(), FILTERS_BINDING);
            protocolMarshaller.marshall(searchAssociatedTranscriptsRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(searchAssociatedTranscriptsRequest.getNextIndex(), NEXTINDEX_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
