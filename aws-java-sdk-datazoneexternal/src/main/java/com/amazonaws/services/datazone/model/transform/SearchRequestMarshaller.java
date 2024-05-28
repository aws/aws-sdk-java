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
package com.amazonaws.services.datazone.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.datazone.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SearchRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SearchRequestMarshaller {

    private static final MarshallingInfo<List> ADDITIONALATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("additionalAttributes").build();
    private static final MarshallingInfo<String> DOMAINIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("domainIdentifier").build();
    private static final MarshallingInfo<StructuredPojo> FILTERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("filters").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nextToken").build();
    private static final MarshallingInfo<String> OWNINGPROJECTIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("owningProjectIdentifier").build();
    private static final MarshallingInfo<List> SEARCHIN_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("searchIn").build();
    private static final MarshallingInfo<String> SEARCHSCOPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("searchScope").build();
    private static final MarshallingInfo<String> SEARCHTEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("searchText").build();
    private static final MarshallingInfo<StructuredPojo> SORT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sort").build();

    private static final SearchRequestMarshaller instance = new SearchRequestMarshaller();

    public static SearchRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SearchRequest searchRequest, ProtocolMarshaller protocolMarshaller) {

        if (searchRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(searchRequest.getAdditionalAttributes(), ADDITIONALATTRIBUTES_BINDING);
            protocolMarshaller.marshall(searchRequest.getDomainIdentifier(), DOMAINIDENTIFIER_BINDING);
            protocolMarshaller.marshall(searchRequest.getFilters(), FILTERS_BINDING);
            protocolMarshaller.marshall(searchRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(searchRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(searchRequest.getOwningProjectIdentifier(), OWNINGPROJECTIDENTIFIER_BINDING);
            protocolMarshaller.marshall(searchRequest.getSearchIn(), SEARCHIN_BINDING);
            protocolMarshaller.marshall(searchRequest.getSearchScope(), SEARCHSCOPE_BINDING);
            protocolMarshaller.marshall(searchRequest.getSearchText(), SEARCHTEXT_BINDING);
            protocolMarshaller.marshall(searchRequest.getSort(), SORT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
