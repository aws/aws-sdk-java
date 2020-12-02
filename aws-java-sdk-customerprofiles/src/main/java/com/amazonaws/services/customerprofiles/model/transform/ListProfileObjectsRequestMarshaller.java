/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.customerprofiles.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.customerprofiles.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListProfileObjectsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListProfileObjectsRequestMarshaller {

    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("next-token").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("max-results").build();
    private static final MarshallingInfo<String> DOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("DomainName").build();
    private static final MarshallingInfo<String> OBJECTTYPENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ObjectTypeName").build();
    private static final MarshallingInfo<String> PROFILEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ProfileId").build();

    private static final ListProfileObjectsRequestMarshaller instance = new ListProfileObjectsRequestMarshaller();

    public static ListProfileObjectsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListProfileObjectsRequest listProfileObjectsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listProfileObjectsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listProfileObjectsRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listProfileObjectsRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listProfileObjectsRequest.getDomainName(), DOMAINNAME_BINDING);
            protocolMarshaller.marshall(listProfileObjectsRequest.getObjectTypeName(), OBJECTTYPENAME_BINDING);
            protocolMarshaller.marshall(listProfileObjectsRequest.getProfileId(), PROFILEID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
