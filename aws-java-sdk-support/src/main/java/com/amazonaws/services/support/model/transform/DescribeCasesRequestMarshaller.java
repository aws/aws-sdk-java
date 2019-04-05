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
package com.amazonaws.services.support.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.support.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DescribeCasesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DescribeCasesRequestMarshaller {

    private static final MarshallingInfo<List> CASEIDLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("caseIdList").build();
    private static final MarshallingInfo<String> DISPLAYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("displayId").build();
    private static final MarshallingInfo<String> AFTERTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("afterTime").build();
    private static final MarshallingInfo<String> BEFORETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("beforeTime").build();
    private static final MarshallingInfo<Boolean> INCLUDERESOLVEDCASES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("includeResolvedCases").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxResults").build();
    private static final MarshallingInfo<String> LANGUAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("language").build();
    private static final MarshallingInfo<Boolean> INCLUDECOMMUNICATIONS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("includeCommunications").build();

    private static final DescribeCasesRequestMarshaller instance = new DescribeCasesRequestMarshaller();

    public static DescribeCasesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DescribeCasesRequest describeCasesRequest, ProtocolMarshaller protocolMarshaller) {

        if (describeCasesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(describeCasesRequest.getCaseIdList(), CASEIDLIST_BINDING);
            protocolMarshaller.marshall(describeCasesRequest.getDisplayId(), DISPLAYID_BINDING);
            protocolMarshaller.marshall(describeCasesRequest.getAfterTime(), AFTERTIME_BINDING);
            protocolMarshaller.marshall(describeCasesRequest.getBeforeTime(), BEFORETIME_BINDING);
            protocolMarshaller.marshall(describeCasesRequest.getIncludeResolvedCases(), INCLUDERESOLVEDCASES_BINDING);
            protocolMarshaller.marshall(describeCasesRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(describeCasesRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(describeCasesRequest.getLanguage(), LANGUAGE_BINDING);
            protocolMarshaller.marshall(describeCasesRequest.getIncludeCommunications(), INCLUDECOMMUNICATIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
