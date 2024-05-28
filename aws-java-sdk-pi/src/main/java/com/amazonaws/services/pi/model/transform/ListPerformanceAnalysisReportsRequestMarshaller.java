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
package com.amazonaws.services.pi.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pi.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListPerformanceAnalysisReportsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListPerformanceAnalysisReportsRequestMarshaller {

    private static final MarshallingInfo<String> SERVICETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceType").build();
    private static final MarshallingInfo<String> IDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Identifier").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();
    private static final MarshallingInfo<Boolean> LISTTAGS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ListTags").build();

    private static final ListPerformanceAnalysisReportsRequestMarshaller instance = new ListPerformanceAnalysisReportsRequestMarshaller();

    public static ListPerformanceAnalysisReportsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListPerformanceAnalysisReportsRequest listPerformanceAnalysisReportsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listPerformanceAnalysisReportsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listPerformanceAnalysisReportsRequest.getServiceType(), SERVICETYPE_BINDING);
            protocolMarshaller.marshall(listPerformanceAnalysisReportsRequest.getIdentifier(), IDENTIFIER_BINDING);
            protocolMarshaller.marshall(listPerformanceAnalysisReportsRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listPerformanceAnalysisReportsRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listPerformanceAnalysisReportsRequest.getListTags(), LISTTAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
