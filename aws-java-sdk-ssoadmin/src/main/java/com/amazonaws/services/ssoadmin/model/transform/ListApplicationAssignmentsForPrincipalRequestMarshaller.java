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
package com.amazonaws.services.ssoadmin.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ssoadmin.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListApplicationAssignmentsForPrincipalRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListApplicationAssignmentsForPrincipalRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> FILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Filter").build();
    private static final MarshallingInfo<String> INSTANCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceArn").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();
    private static final MarshallingInfo<String> PRINCIPALID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrincipalId").build();
    private static final MarshallingInfo<String> PRINCIPALTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrincipalType").build();

    private static final ListApplicationAssignmentsForPrincipalRequestMarshaller instance = new ListApplicationAssignmentsForPrincipalRequestMarshaller();

    public static ListApplicationAssignmentsForPrincipalRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListApplicationAssignmentsForPrincipalRequest listApplicationAssignmentsForPrincipalRequest, ProtocolMarshaller protocolMarshaller) {

        if (listApplicationAssignmentsForPrincipalRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listApplicationAssignmentsForPrincipalRequest.getFilter(), FILTER_BINDING);
            protocolMarshaller.marshall(listApplicationAssignmentsForPrincipalRequest.getInstanceArn(), INSTANCEARN_BINDING);
            protocolMarshaller.marshall(listApplicationAssignmentsForPrincipalRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listApplicationAssignmentsForPrincipalRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listApplicationAssignmentsForPrincipalRequest.getPrincipalId(), PRINCIPALID_BINDING);
            protocolMarshaller.marshall(listApplicationAssignmentsForPrincipalRequest.getPrincipalType(), PRINCIPALTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
