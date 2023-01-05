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
package com.amazonaws.services.migrationhubstrategyrecommendations.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.migrationhubstrategyrecommendations.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListApplicationComponentsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListApplicationComponentsRequestMarshaller {

    private static final MarshallingInfo<String> APPLICATIONCOMPONENTCRITERIA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("applicationComponentCriteria").build();
    private static final MarshallingInfo<String> FILTERVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("filterValue").build();
    private static final MarshallingInfo<List> GROUPIDFILTER_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("groupIdFilter").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nextToken").build();
    private static final MarshallingInfo<String> SORT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sort").build();

    private static final ListApplicationComponentsRequestMarshaller instance = new ListApplicationComponentsRequestMarshaller();

    public static ListApplicationComponentsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListApplicationComponentsRequest listApplicationComponentsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listApplicationComponentsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listApplicationComponentsRequest.getApplicationComponentCriteria(), APPLICATIONCOMPONENTCRITERIA_BINDING);
            protocolMarshaller.marshall(listApplicationComponentsRequest.getFilterValue(), FILTERVALUE_BINDING);
            protocolMarshaller.marshall(listApplicationComponentsRequest.getGroupIdFilter(), GROUPIDFILTER_BINDING);
            protocolMarshaller.marshall(listApplicationComponentsRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listApplicationComponentsRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listApplicationComponentsRequest.getSort(), SORT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
