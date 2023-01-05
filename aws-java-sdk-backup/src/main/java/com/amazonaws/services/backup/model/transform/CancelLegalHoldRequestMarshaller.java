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
package com.amazonaws.services.backup.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.backup.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CancelLegalHoldRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CancelLegalHoldRequestMarshaller {

    private static final MarshallingInfo<String> LEGALHOLDID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("legalHoldId").build();
    private static final MarshallingInfo<String> CANCELDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("cancelDescription").build();
    private static final MarshallingInfo<Long> RETAINRECORDINDAYS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("retainRecordInDays").build();

    private static final CancelLegalHoldRequestMarshaller instance = new CancelLegalHoldRequestMarshaller();

    public static CancelLegalHoldRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CancelLegalHoldRequest cancelLegalHoldRequest, ProtocolMarshaller protocolMarshaller) {

        if (cancelLegalHoldRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(cancelLegalHoldRequest.getLegalHoldId(), LEGALHOLDID_BINDING);
            protocolMarshaller.marshall(cancelLegalHoldRequest.getCancelDescription(), CANCELDESCRIPTION_BINDING);
            protocolMarshaller.marshall(cancelLegalHoldRequest.getRetainRecordInDays(), RETAINRECORDINDAYS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
