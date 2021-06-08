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
package com.amazonaws.services.kendra.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kendra.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateQuerySuggestionsConfigRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateQuerySuggestionsConfigRequestMarshaller {

    private static final MarshallingInfo<String> INDEXID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IndexId").build();
    private static final MarshallingInfo<String> MODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Mode").build();
    private static final MarshallingInfo<Integer> QUERYLOGLOOKBACKWINDOWINDAYS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QueryLogLookBackWindowInDays").build();
    private static final MarshallingInfo<Boolean> INCLUDEQUERIESWITHOUTUSERINFORMATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeQueriesWithoutUserInformation").build();
    private static final MarshallingInfo<Integer> MINIMUMNUMBEROFQUERYINGUSERS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinimumNumberOfQueryingUsers").build();
    private static final MarshallingInfo<Integer> MINIMUMQUERYCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinimumQueryCount").build();

    private static final UpdateQuerySuggestionsConfigRequestMarshaller instance = new UpdateQuerySuggestionsConfigRequestMarshaller();

    public static UpdateQuerySuggestionsConfigRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateQuerySuggestionsConfigRequest updateQuerySuggestionsConfigRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateQuerySuggestionsConfigRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateQuerySuggestionsConfigRequest.getIndexId(), INDEXID_BINDING);
            protocolMarshaller.marshall(updateQuerySuggestionsConfigRequest.getMode(), MODE_BINDING);
            protocolMarshaller.marshall(updateQuerySuggestionsConfigRequest.getQueryLogLookBackWindowInDays(), QUERYLOGLOOKBACKWINDOWINDAYS_BINDING);
            protocolMarshaller.marshall(updateQuerySuggestionsConfigRequest.getIncludeQueriesWithoutUserInformation(),
                    INCLUDEQUERIESWITHOUTUSERINFORMATION_BINDING);
            protocolMarshaller.marshall(updateQuerySuggestionsConfigRequest.getMinimumNumberOfQueryingUsers(), MINIMUMNUMBEROFQUERYINGUSERS_BINDING);
            protocolMarshaller.marshall(updateQuerySuggestionsConfigRequest.getMinimumQueryCount(), MINIMUMQUERYCOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
