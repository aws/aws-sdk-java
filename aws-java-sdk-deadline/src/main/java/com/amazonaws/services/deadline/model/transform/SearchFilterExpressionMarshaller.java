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
package com.amazonaws.services.deadline.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.deadline.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SearchFilterExpressionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SearchFilterExpressionMarshaller {

    private static final MarshallingInfo<StructuredPojo> DATETIMEFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dateTimeFilter").build();
    private static final MarshallingInfo<StructuredPojo> GROUPFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("groupFilter").build();
    private static final MarshallingInfo<StructuredPojo> PARAMETERFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("parameterFilter").build();
    private static final MarshallingInfo<StructuredPojo> SEARCHTERMFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("searchTermFilter").build();
    private static final MarshallingInfo<StructuredPojo> STRINGFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stringFilter").build();

    private static final SearchFilterExpressionMarshaller instance = new SearchFilterExpressionMarshaller();

    public static SearchFilterExpressionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SearchFilterExpression searchFilterExpression, ProtocolMarshaller protocolMarshaller) {

        if (searchFilterExpression == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(searchFilterExpression.getDateTimeFilter(), DATETIMEFILTER_BINDING);
            protocolMarshaller.marshall(searchFilterExpression.getGroupFilter(), GROUPFILTER_BINDING);
            protocolMarshaller.marshall(searchFilterExpression.getParameterFilter(), PARAMETERFILTER_BINDING);
            protocolMarshaller.marshall(searchFilterExpression.getSearchTermFilter(), SEARCHTERMFILTER_BINDING);
            protocolMarshaller.marshall(searchFilterExpression.getStringFilter(), STRINGFILTER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
