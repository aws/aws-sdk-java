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
package com.amazonaws.services.cloudsearchdomain.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudsearchdomain.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SearchRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SearchRequestMarshaller {

    private static final MarshallingInfo<String> CURSOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("cursor").build();
    private static final MarshallingInfo<String> EXPR_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("expr").build();
    private static final MarshallingInfo<String> FACET_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("facet").build();
    private static final MarshallingInfo<String> FILTERQUERY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("fq").build();
    private static final MarshallingInfo<String> HIGHLIGHT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("highlight").build();
    private static final MarshallingInfo<Boolean> PARTIAL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("partial").build();
    private static final MarshallingInfo<String> QUERY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("q").build();
    private static final MarshallingInfo<String> QUERYOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("q.options").build();
    private static final MarshallingInfo<String> QUERYPARSER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("q.parser").build();
    private static final MarshallingInfo<String> RETURN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("return").build();
    private static final MarshallingInfo<Long> SIZE_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("size").build();
    private static final MarshallingInfo<String> SORT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("sort").build();
    private static final MarshallingInfo<Long> START_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("start").build();
    private static final MarshallingInfo<String> STATS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("stats").build();

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
            protocolMarshaller.marshall(searchRequest.getCursor(), CURSOR_BINDING);
            protocolMarshaller.marshall(searchRequest.getExpr(), EXPR_BINDING);
            protocolMarshaller.marshall(searchRequest.getFacet(), FACET_BINDING);
            protocolMarshaller.marshall(searchRequest.getFilterQuery(), FILTERQUERY_BINDING);
            protocolMarshaller.marshall(searchRequest.getHighlight(), HIGHLIGHT_BINDING);
            protocolMarshaller.marshall(searchRequest.getPartial(), PARTIAL_BINDING);
            protocolMarshaller.marshall(searchRequest.getQuery(), QUERY_BINDING);
            protocolMarshaller.marshall(searchRequest.getQueryOptions(), QUERYOPTIONS_BINDING);
            protocolMarshaller.marshall(searchRequest.getQueryParser(), QUERYPARSER_BINDING);
            protocolMarshaller.marshall(searchRequest.getReturn(), RETURN_BINDING);
            protocolMarshaller.marshall(searchRequest.getSize(), SIZE_BINDING);
            protocolMarshaller.marshall(searchRequest.getSort(), SORT_BINDING);
            protocolMarshaller.marshall(searchRequest.getStart(), START_BINDING);
            protocolMarshaller.marshall(searchRequest.getStats(), STATS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
