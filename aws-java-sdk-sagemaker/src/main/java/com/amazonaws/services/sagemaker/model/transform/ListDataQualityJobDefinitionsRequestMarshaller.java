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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListDataQualityJobDefinitionsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListDataQualityJobDefinitionsRequestMarshaller {

    private static final MarshallingInfo<String> ENDPOINTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointName").build();
    private static final MarshallingInfo<String> SORTBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SortBy").build();
    private static final MarshallingInfo<String> SORTORDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SortOrder").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();
    private static final MarshallingInfo<String> NAMECONTAINS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NameContains").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIMEBEFORE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTimeBefore").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIMEAFTER_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTimeAfter").timestampFormat("unixTimestamp").build();

    private static final ListDataQualityJobDefinitionsRequestMarshaller instance = new ListDataQualityJobDefinitionsRequestMarshaller();

    public static ListDataQualityJobDefinitionsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListDataQualityJobDefinitionsRequest listDataQualityJobDefinitionsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listDataQualityJobDefinitionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listDataQualityJobDefinitionsRequest.getEndpointName(), ENDPOINTNAME_BINDING);
            protocolMarshaller.marshall(listDataQualityJobDefinitionsRequest.getSortBy(), SORTBY_BINDING);
            protocolMarshaller.marshall(listDataQualityJobDefinitionsRequest.getSortOrder(), SORTORDER_BINDING);
            protocolMarshaller.marshall(listDataQualityJobDefinitionsRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listDataQualityJobDefinitionsRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listDataQualityJobDefinitionsRequest.getNameContains(), NAMECONTAINS_BINDING);
            protocolMarshaller.marshall(listDataQualityJobDefinitionsRequest.getCreationTimeBefore(), CREATIONTIMEBEFORE_BINDING);
            protocolMarshaller.marshall(listDataQualityJobDefinitionsRequest.getCreationTimeAfter(), CREATIONTIMEAFTER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
