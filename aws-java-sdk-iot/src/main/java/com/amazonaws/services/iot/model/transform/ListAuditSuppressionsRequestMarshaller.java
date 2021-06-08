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
package com.amazonaws.services.iot.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListAuditSuppressionsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListAuditSuppressionsRequestMarshaller {

    private static final MarshallingInfo<String> CHECKNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("checkName").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceIdentifier").build();
    private static final MarshallingInfo<Boolean> ASCENDINGORDER_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ascendingOrder").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxResults").build();

    private static final ListAuditSuppressionsRequestMarshaller instance = new ListAuditSuppressionsRequestMarshaller();

    public static ListAuditSuppressionsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListAuditSuppressionsRequest listAuditSuppressionsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listAuditSuppressionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listAuditSuppressionsRequest.getCheckName(), CHECKNAME_BINDING);
            protocolMarshaller.marshall(listAuditSuppressionsRequest.getResourceIdentifier(), RESOURCEIDENTIFIER_BINDING);
            protocolMarshaller.marshall(listAuditSuppressionsRequest.getAscendingOrder(), ASCENDINGORDER_BINDING);
            protocolMarshaller.marshall(listAuditSuppressionsRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listAuditSuppressionsRequest.getMaxResults(), MAXRESULTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
